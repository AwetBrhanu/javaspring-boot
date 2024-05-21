package Registration.admin_user.dto;

public class UserDto {
    private String fullname;
    private String password;
    private String email;
    private String role;

    public UserDto(String fullname, String password, String email, String role) {
        this.fullname = fullname;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
