package com.example.crmoriginalshop.repository;

import com.example.crmoriginalshop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
