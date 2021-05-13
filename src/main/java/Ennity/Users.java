package Ennity;

/**
 * @author 12076
 */
public class Users {

    private String userName;
    private String email;
    private String password;

    public Users(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Users{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
