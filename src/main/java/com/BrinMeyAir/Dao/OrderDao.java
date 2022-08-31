package com.BrinMeyAir.Dao;

import com.BrinMeyAir.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {
}
