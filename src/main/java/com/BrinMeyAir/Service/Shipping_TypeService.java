package com.BrinMeyAir.Service;

import com.BrinMeyAir.Entity.Shipping_Type;

import java.util.List;

public interface Shipping_TypeService {

    List<Shipping_Type> getAllShippingTypes();

    Shipping_Type getShippingTypeById(int id);

    Shipping_Type getShippingTypeByName(String name);

    Shipping_Type addShippingType(Shipping_Type ship);
}
