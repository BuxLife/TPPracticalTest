package Domains;

/**
 * Created by Bux_Life on 2017/05/09.
 */
public class User {
    private String email, screenName, password, status;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString(){
        String details = "\nEmployee Details:\nName:\t" + getScreenName() + "\nEmail:\t" + getEmail() + "\nStatus:\t" + getStatus();
        return details;
    }
}
