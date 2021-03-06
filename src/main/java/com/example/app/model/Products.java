package com.example.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Products {

    private final UUID id;
    private final String name;
    private final int price;
    private final String color;
    private final String size;
    private final String category;

    public Products(@JsonProperty("id") UUID id,
                    @JsonProperty("name") String name,
                    @JsonProperty("price") int price,
                    @JsonProperty("color") String color,
                    @JsonProperty("size") String size,
                    @JsonProperty("category") String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.size = size;
        this.category = category;
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

    public String getCategory() {return category;}
}
