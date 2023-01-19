package com.bizoffs.order.dao;

import com.bizoffs.order.entities.OrderItemAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderItemAttributeRepo extends JpaRepository<OrderItemAttribute,String> {
    @Query("from OrderItemAttribute o where o.id.orderId=:orderId")
    public List<OrderItemAttribute> findByOrderId(@Param("orderId") String OrderId);
}
