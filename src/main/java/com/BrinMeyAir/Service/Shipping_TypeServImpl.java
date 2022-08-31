package com.BrinMeyAir.Service;

import com.BrinMeyAir.Dao.Shipping_TypeDao;
import com.BrinMeyAir.Entity.Shipping_Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Shipping_TypeServImpl implements Shipping_TypeService{

    @Autowired
    private Shipping_TypeDao dao;

    @Override
    public List<Shipping_Type> getAllShippingTypes() {
        return this.dao.findAll();
    }

    @Override
    public Shipping_Type getShippingTypeById(int id) {
        Optional<Shipping_Type> optional = this.dao.findById(id);
        Shipping_Type ship = null;
        if (optional.isPresent()) {
            ship = optional.get();
        } else {
            throw new RuntimeException("Couldn't find a service with that ID");
        }
        return ship;
    }

    @Override
    public Shipping_Type getShippingTypeByName(String name) {
        List<Shipping_Type> list = this.dao.findAll();
        Shipping_Type ship = null;
        for (Shipping_Type serv : list) {
            if (serv.getName() == name) {
                ship = serv;
            }
        }
        if (ship == null) {
            throw new RuntimeException("Couldn't find a service with that name");
        }
        return ship;
    }

    @Override
    public Shipping_Type addShippingType(Shipping_Type ship) {
        return this.dao.save(ship);
    }
}
