package com.BrinMeyAir.Service;

import com.BrinMeyAir.Dao.OrderDao;
import com.BrinMeyAir.Entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServImpl implements OrderService{
    @Autowired
    private OrderDao dao;


    @Override
    public List<Order> getAllOrders() {
        return this.dao.findAll();
    }

    @Override
    public Order getOrderById(int id) {
        Optional<Order> optional = this.dao.findById(id);
        Order order = null;
        if (optional.isPresent()) {
            order = optional.get();
        } else {
            throw new RuntimeException("Couldn't find order by Tracking ID");
        }
        return order;
    }

    @Override
    public Order addOrder(Order order) {
        return this.dao.save(order);
    }

    @Override
    public Order updateOrder(Order order) {
        return this.dao.save(order);
    }

    @Override
    public void deleteOrder(int id) {
        this.dao.deleteById(id);
    }
}
