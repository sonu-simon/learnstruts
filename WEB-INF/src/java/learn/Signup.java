package learn;


public class Signup {  
    private String username;
    private String password;
    
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
        DatabaseAccess dAccess = new DatabaseAccess();
        int status = 0;

        try {
            status = dAccess.createAccount(username, password);
        } catch (Exception e) {}
        
        if(status == 1){

            return "login";
        }

        return "fail";
    }
}