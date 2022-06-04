package com.example.app.model;

import java.util.UUID;

public class Products {

    private final UUID id;
    private final String name;
    private final int price;
    private final String color;
    private final String size;

    public Products(UUID id, String name, int price, String color, String size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
