import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.Annotation.WebServlet;
import javax.servlet.https.HttpServlet;
import javax.servlet.https.HttpServletRequest;
import javax.servlet.https.HttpServletResponse;

import code.DatabaseConnection;
@WebServlet("/App")
public class App extends HttpServlet{
    private static final long serialVersionUID=1L;
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException.IOException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //String url = "jdbc:mysql://localhost:3307/manibahrathi";
            //String username = "root";
            //String password = "";
            //String query = "select * from praveen";
            //Connection con = DriverManager.getConnection(url,username,password);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/manibharathi","root","");
            //Statement st = con.createStatement();
            PreparedStatement ps = con.prepareStatement("insert into praveen values(?,?,?,?)");
            ps.setString(1,request.getParameter("string"));
            ps.setString(2,request.getParameter("string"));
            ps.setString(3,request.getParameter("string"));
            ps.setString(4,request.getParameter("string"));
            st.executeUpdate();
            st.close();
            con.close();

            PrintWriter out = response.getWriter();
    
            //ResultSet rs=st.executeQuery(query);
            //ResultSet rs=st.executeQuery("select * from praveen");
           //int rs=ps.executeUpdate();
            //if(rs>0) {
              //  System.out.println("Success");
            //}
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
