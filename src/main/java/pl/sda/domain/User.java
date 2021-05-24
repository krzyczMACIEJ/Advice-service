package pl.sda.domain;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String login; //user name
    private String password; // user password
    private String email; //user email adress
    @CreationTimestamp
    public LocalDateTime userAddTime;

    public User() {
    }

    public User(String login, String password, String email, LocalDateTime userAddTime) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.userAddTime = userAddTime;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
