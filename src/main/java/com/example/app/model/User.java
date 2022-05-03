package com.example.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    private final UUID userid;
    private final String email;
    private final String name;

    public User(@JsonProperty("userid") UUID userid,
                @JsonProperty("email") String email,
                @JsonProperty("name") String name) {
        this.userid = userid;
        this.email = email;
        this.name = name;
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
}
