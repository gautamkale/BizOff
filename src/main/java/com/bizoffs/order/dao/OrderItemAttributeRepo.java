package com.bizoffs.order.dao;

import com.bizoffs.order.entities.OrderItemAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemAttributeRepo extends JpaRepository<OrderItemAttribute,String> {
    public List<OrderItemAttribute> findByOrderId(String OrderId);
}
