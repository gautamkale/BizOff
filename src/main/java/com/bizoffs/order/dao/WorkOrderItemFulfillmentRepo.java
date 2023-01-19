package com.bizoffs.order.dao;

import com.bizoffs.order.entities.WorkOrderItemFulfillment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkOrderItemFulfillmentRepo  extends JpaRepository<WorkOrderItemFulfillment,String> {
    @Query("from WorkOrderItemFulfillment wo where wo.id.orderId=: orderId and wo.id.orderItemSeqId=: orderItemSeqId ")
    List<WorkOrderItemFulfillment> findByOrderIdAndOrderSeqId(String orderId, String orderItemSeqId);
}
