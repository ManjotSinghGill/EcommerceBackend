package com.example.app.service;

import com.example.app.dao.OrderDao;
import com.example.app.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

    private final OrderDao orderDao;

    @Autowired
    private OrderService(@Qualifier("OrderDao") OrderDao orderDao) {this.orderDao = orderDao;}

    public int addOrder(Orders order){ return orderDao.insertOrder(order);}

    public List<Orders> getAllOrders() { return orderDao.selectAllOrder();}

    public Optional<Orders> selectOrderByUserId(UUID userid) {return orderDao.selectOrderByID(userid);}

    public int removeOrderById(UUID id) {return orderDao.removeOrder(id);}
}
