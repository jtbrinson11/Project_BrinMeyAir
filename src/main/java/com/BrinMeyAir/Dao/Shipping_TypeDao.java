package com.BrinMeyAir.Dao;

import com.BrinMeyAir.Entity.Shipping_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Shipping_TypeDao extends JpaRepository<Shipping_Type, Integer> {
}
