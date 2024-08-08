import java.sql.*;
public class DatabaseConnection{
    protected static Connection initializeDatabase() throws SQLException.ClassNotFoundException{
        String dbDriver="com.mysql.jdbc.Driver";
        String url="jdbc.mysql://localhost:3307/";
        String dbname="praveen";
        String dbUsername="root";
        String dbPassword="";
        Class.forName(dbDriver);
        Connection con=DriverManager.getConnection(url+dbUsername+dbPassword);
        return con;

    }
}
