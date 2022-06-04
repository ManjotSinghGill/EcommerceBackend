package com.example.app.api;

import com.example.app.model.Orders;
import com.example.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/controller/order")
@RestController
public class OrdersController {

    private final OrderService orderService;

    @Autowired
    public OrdersController(OrderService orderService){this.orderService = orderService;}

    @PostMapping
    public void addOrder(@RequestBody Orders order) {orderService.addOrder(order);}

    @GetMapping
    public List<Orders> getAllOrder(){return orderService.getAllOrders();}

    @GetMapping(path = "{userid}")
    public Orders getOrderByUserID(@PathVariable("userid") UUID userid) {return orderService.selectOrderByUserId(userid).orElse(null);}

    @DeleteMapping(path = "{id}")
    public void removeOrderByID(@PathVariable("id") UUID id){ orderService.removeOrderById(id);}
}
