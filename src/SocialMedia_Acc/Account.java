package SocialMedia_Acc;

import java.io.Serializable;
import java.util.ArrayList;
public class Account implements Serializable{
    protected String login;
    protected String password;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Account [login=" + login + ", password=" + password + "]";
    }
    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }
    
    
    
}
