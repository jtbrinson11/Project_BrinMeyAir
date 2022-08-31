package com.BrinMeyAir.Controller;

import com.BrinMeyAir.Entity.Shipping_Type;
import com.BrinMeyAir.Service.Shipping_TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Shipping_TypeController {

    @Autowired
    private Shipping_TypeService serv;

    @GetMapping("/shipping")
    public List<Shipping_Type> getAllServices() {
        return this.serv.getAllShippingTypes();
    }

    @GetMapping("/shipping/{id}")
    public Shipping_Type getServiceById(@PathVariable String id) {
        return this.serv.getShippingTypeById(Integer.parseInt(id));
    }

    @GetMapping("/shipping/{name}")
    public Shipping_Type getServiceByName(@PathVariable String name) {
        return this.serv.getShippingTypeByName(name);
    }

    @PostMapping("/shipping")
    public Shipping_Type addShippingType(@RequestBody Shipping_Type ship) {
        return this.serv.addShippingType(ship);
    }
}
