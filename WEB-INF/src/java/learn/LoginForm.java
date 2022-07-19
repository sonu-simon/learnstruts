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
            
        }
        DatabaseAccess dAccess = new DatabaseAccess();
        try {
            String status = dAccess.validateLogin(username, password);
            if(status == "valid"){
                sessionMap.put("login","true");  
                sessionMap.put("username",username);          
                return "success";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "fail";
    }
}  