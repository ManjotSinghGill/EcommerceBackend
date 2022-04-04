package com.example.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    private final UUID id;
    private final String email;
    private final String name;

    public User(@JsonProperty("id") UUID id,
                @JsonProperty("email") String email,
                @JsonProperty("name") String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
