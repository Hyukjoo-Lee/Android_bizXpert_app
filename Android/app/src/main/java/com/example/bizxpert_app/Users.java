package com.example.bizxpert_app;

/**
 * This is a database class ('Users' is a database name)
 */
public class Users {
    private String Email;
    private String Password;

    public Users() {

    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

}
