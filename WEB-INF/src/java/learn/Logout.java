package learn;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class Logout implements SessionAware{

    private SessionMap<String,Object> sessionMap;  
  
    
    @Override  
    public void setSession(Map<String, Object> map) {  
        sessionMap = (SessionMap)map;  
    }  
    
    public String execute() {
        if(sessionMap != null) {
            sessionMap.invalidate();
        }       
        return "success";
    }
}
