package learn;
import java.util.Map;

import java.sql.*;
import org.apache.struts2.dispatcher.SessionMap;  
import org.apache.struts2.interceptor.SessionAware;  

public class LoginForm implements SessionAware{  
    private String username;
    private String password;
    
    private SessionMap<String,Object> sessionMap;  
  
    
    @Override  
    public void setSession(Map<String, Object> map) {  
        sessionMap=(SessionMap)map;  
    }  

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() {

        if(username.equals("admin") && password.equals("123")) {
            sessionMap.put("login","true");  
            sessionMap.put("username",username);  
            
            try {
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/testdb?characterEncoding=utf8","root","password");  
                Statement stmt = con.createStatement();  
                ResultSet rs = stmt.executeQuery("select * from users"); 
                while(rs.next()){
                    System.out.println(rs.getString(1));
                    sessionMap.put("result",rs.getString(1));  

            }
            con.close();
            } catch (Exception e) {
                
            }
        
            
            return "success";
        }
        return "fail";
    }
}  