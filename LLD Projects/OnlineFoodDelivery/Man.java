public class User{
    private int userId;
    private String name;
    private String email;
    private String password;
    private long phone;

    public User(){

    }

    public User(int userId, String name, String email, String password, long phone){
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public long getPhone(){
        return phone;
    }

    public void setPhone(long phone){
        this.phone = phone;
    }

    public boolean login(String email, String password){
        if (this.email.equals(email) && this.password.equals(password)){
            return true;
        }
        return false;
    }

    public void logout() {
        System.out.println("Logged out successfully");
    }

    public void register() {
        System.out.println("User registered successfully");
    }

    public void updateProfile() {
        System.out.println("Profile updated successfully");
    }
}