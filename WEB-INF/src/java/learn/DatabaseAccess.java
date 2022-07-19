package learn;
import java.sql.*;

public class DatabaseAccess {

    Connection connection;

    DatabaseAccess() {
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            connection = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/testdb?characterEncoding=utf8","root","password");  

        } catch (Exception e) { 
            System.out.println(e);
        }
    }

    public int createAccount(String username, String password) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users VALUES (?,?)");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        int result = preparedStatement.executeUpdate();
        connection.close();  

        return result;
    }

    public String validateLogin(String username, String password) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM users WHERE username = ? AND password = ?");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.first();
        if(resultSet.getInt(1) == 1){
            return "valid";
        } 
        return "invalid";
    }
    public static void main(String[] args) {
    }
}
