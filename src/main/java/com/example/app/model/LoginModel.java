package com.example.app.model;

import org.springframework.web.bind.annotation.RequestBody;

public class LoginModel {

    private final String email;
    private final String password;

    public LoginModel(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
