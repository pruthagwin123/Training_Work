public class User {

    private String username;
    private String password;

    public User(){

    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void login() {
        System.out.println("Login Successful");
    }

    public boolean login(String username, String password){
        if(this.username.equals(username)) {
        if(this.password.equals(password)) {
            return true;
        }
    }
    return false;
    }
}