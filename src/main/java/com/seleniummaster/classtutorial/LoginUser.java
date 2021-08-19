package com.seleniummaster.classtutorial;

public class LoginUser {
    //cubecart mahara magento amazon
    private String userName;
    private String password;
    private String email;

    public LoginUser() {
    }
    public LoginUser(String userName, String password) {
        this.userName =userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
