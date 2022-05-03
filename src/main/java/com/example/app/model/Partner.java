package com.example.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Partner {

    private final UUID partid;
    private final String email;
    private final String name;
    private final String password;

    public Partner(@JsonProperty("partid") UUID partid,
                   @JsonProperty("email") String email,
                   @JsonProperty("name") String name,
                   @JsonProperty("password") String password) {
        this.partid = partid;
        this.email = email;
        this.name = name;
        this.password = password;
    }


    public UUID getId() {return partid;}

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}
