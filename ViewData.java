import java.io.*;
import java.lang.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(/InsertingData);
public class InsertingData extends HttpServlet{
  public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
        try{
      String donorname = request.getParameter("donorname");
      String Age = request.getParameter("Age");
      String Address = request.getParameter("Address");
      String Email = request.getParameter("Email");
      String PhoneNumber = request.getParameter("PhoneNumber");
      String BloodGroup = request.getParameter("BloodGroup");
      String Gender = request.getParameter("Gender");

      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConection("jdbc:oracle:thin:@localhost:3306:xe","scott","tiger");
      PreparedStatement pst = con.prepareStatement("insert into donor values(,)");
      pst.setString(1,username);
      pst.setString(2,password);
      int i = pst.executeUpdate();
      if(i!=0)
        out.println("<br>Donor Data has been inserted");
      else
        out.println("failed to insert the data");
    
    }

    catch (Exception e){
      out.println(e);
    }

    }
}
