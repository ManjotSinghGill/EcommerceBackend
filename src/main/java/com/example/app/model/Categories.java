package com.example.app.model;

import java.util.UUID;

public class Categories {

    private final UUID catid;
    private final String name;

    public Categories(UUID catid, String name) {
        this.catid = catid;
        this.name = name;
    }

    public UUID getCatid() {
        return catid;
    }

    public String getName() {
        return name;
    }
}
