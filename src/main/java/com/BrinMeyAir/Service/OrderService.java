package com.BrinMeyAir.Service;

import com.BrinMeyAir.Entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order getOrderById(int id);

    Order addOrder(Order order);

    Order updateOrder(Order order);

    void deleteOrder(int id);
}
