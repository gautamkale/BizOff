package com.bizoffs.order.dao;

import com.bizoffs.order.entities.OrderContactMech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderContactMechRepo extends JpaRepository<OrderContactMech,String> {

    @Query("from OrderContactMech oc where oc.id.orderId =:orderId and oc.id.contactMechPurposeTypeId=:contactMechPurposeTypeId")
    List<OrderContactMech> findByOrderIdAndContactMechPurposeTypeId(String orderId,String contactMechPurposeTypeId);
}
