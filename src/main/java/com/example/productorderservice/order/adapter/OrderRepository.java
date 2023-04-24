package com.example.productorderservice.order.adapter;

import com.example.productorderservice.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
