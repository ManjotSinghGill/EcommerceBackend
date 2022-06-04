package com.example.app.dao;

import com.example.app.model.Orders;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderDao {

    int insertOrder(UUID id, Orders order);

    default int insertOrder(Orders order){
        UUID id = UUID.randomUUID();
        return insertOrder(id, order);
    }

    int removeOrder(UUID id);

    Optional<Orders> selectOrderByID(UUID id);

    List<Orders> selectAllOrder();
}
