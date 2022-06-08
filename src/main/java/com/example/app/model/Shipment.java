package com.example.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Shipment {
    private final UUID sid;
    private final UUID oid;
    private final String address;
    private final String status;

    public Shipment(@JsonProperty("id") UUID sid,
                    @JsonProperty() UUID oid, String address, String status) {
        this.sid = sid;
        this.oid = oid;
        this.address = address;
        this.status = status;
    }

    public UUID getSid() {
        return sid;
    }

    public UUID getOid() {
        return oid;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }
}
