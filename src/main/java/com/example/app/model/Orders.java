package com.example.app.model;

import java.util.Date;
import java.util.UUID;

public class Orders {

    private final UUID oid;
    private final UUID userid;
    private final UUID partid;
    private final UUID pid;
    private final Date date;
    private final int total_price;

    public Orders(UUID oid, UUID userid, UUID partid, UUID pid, Date date, int total_price) {
        this.oid = oid;
        this.userid = userid;
        this.partid = partid;
        this.pid = pid;
        this.date = date;
        this.total_price = total_price;
    }

    public Date getDate() {
        return date;
    }

    public UUID getOid() {
        return oid;
    }

    public UUID getUserid() {
        return userid;
    }

    public UUID getPartid() {
        return partid;
    }

    public UUID getPid() {
        return pid;
    }

    public int getTotal_price() {
        return total_price;
    }
}
