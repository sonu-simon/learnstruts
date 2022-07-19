package learn;
import java.sql.*;

public class DatabaseAccess {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        try {
            // Class.forName("com.mysql.jdbc.Driver");  
            // Connection con = DriverManager.getConnection(  
            // "jdbc:mysql://localhost:3306/testdb?characterEncoding=utf8","root","password");  
            // Statement stmt = con.createStatement();  
            // ResultSet rs = stmt.executeQuery("select * from users"); 
            // while(rs.next()){
            //     System.out.println(rs.getString(1));
            // }
            // con.close();  

        } catch (Exception e) { 
            System.out.println(e);
        }
    }
}
