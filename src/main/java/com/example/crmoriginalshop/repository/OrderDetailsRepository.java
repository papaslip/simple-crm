package com.example.crmoriginalshop.repository;

import com.example.crmoriginalshop.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}
