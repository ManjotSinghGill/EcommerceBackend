package com.example.app.dao;

import com.example.app.model.Orders;
import com.example.app.model.Products;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("OrderDao")
public class OrderAccessService implements OrderDao{

    private final static List<Orders> DB = new ArrayList<>();

    @Override
    public int insertOrder(UUID id, Orders order) {
        DB.add(new Orders(id, order.getUserid(), order.getListOfItems(), order.getTotal_price()));
        return 1;
    }

    @Override
    public int removeOrder(UUID id) {
        Optional<Orders> orderToDelete = DB.stream()
                .filter(order -> order.getId().equals(id))
                .findFirst();;
        if(orderToDelete.isEmpty()){
            return 0;
        }
        DB.remove(orderToDelete.get());
        return 1;
    }

    @Override
    public Optional<Orders> selectOrderByID(UUID id) {
        return DB.stream()
                .filter(order -> order.getUserid().equals(id))
                .findFirst();
    }

    @Override
    public List<Orders> selectAllOrder() {
        return DB;
    }
}
