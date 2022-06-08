package com.example.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    private final UUID userid;
    private final String email;
    private final String name;
    private final String password;
    private final String phone;

    public User(@JsonProperty("userid") UUID userid,
                @JsonProperty("email") String email,
                @JsonProperty("name") String name,
                @JsonProperty("password") String password,
                @JsonProperty("phone") String phone) {
        this.userid = userid;
        this.email = email;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public UUID getId() {
        return userid;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }
}
