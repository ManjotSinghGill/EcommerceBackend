package com.example.app.model;

import java.util.UUID;

public class Products {

    private final UUID pid;
    private final UUID catid;
    private final UUID partid;
    private final String name;
    private final int price;
    private final int stock;

    public Products(UUID pid, UUID catid, UUID partid, String name, int price, int stock) {
        this.pid = pid;
        this.catid = catid;
        this.partid = partid;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public UUID getId() {
        return pid;
    }

    public UUID getCatid() {
        return catid;
    }

    public UUID getPartid() {
        return partid;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
