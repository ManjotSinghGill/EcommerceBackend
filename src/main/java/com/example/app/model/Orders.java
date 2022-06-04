package com.example.app.model;

import java.util.List;
import java.util.UUID;

public class Orders {

    private final UUID id;
    private final UUID userid;
    private final List<String> listOfItems;
    private final int total_price;

    public Orders(UUID id, UUID userid, List<String> listOfItems, int total_price) {
        this.id = id;
        this.userid = userid;
        this.listOfItems = listOfItems;
        this.total_price = total_price;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserid() {
        return userid;
    }

    public List<String> getListOfItems() {return listOfItems;}

    public int getTotal_price() {
        return total_price;
    }
}
