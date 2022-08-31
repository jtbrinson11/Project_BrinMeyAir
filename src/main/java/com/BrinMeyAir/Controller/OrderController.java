package com.BrinMeyAir.Controller;

import com.BrinMeyAir.Entity.Order;
import com.BrinMeyAir.Service.OrderServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {

    @Autowired
    private OrderServImpl serv;

    @GetMapping("/order")
    public List<Order> getAllOrders() {
        return this.serv.getAllOrders();
    }

    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable String id) {
        return this.serv.getOrderById(Integer.parseInt(id));
    }

    @PostMapping("/order")
    public Order addOrder(@RequestBody Order order) {
        return this.serv.addOrder(order);
    }

    @PutMapping("/order")
    public Order updateOrder(@RequestBody Order order) {
        return this.serv.updateOrder(order);
    }

    @DeleteMapping("/order/{id}")
    public void deleteOrder(@PathVariable String id) {
        this.serv.deleteOrder(Integer.parseInt(id));
    }
}
