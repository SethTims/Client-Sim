package com.example.springboot;

public class TvUserFine {

    private String email;
    private String password;

    public TvUserFine(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPasword(String password) {
        this.password = password;
    }

}
