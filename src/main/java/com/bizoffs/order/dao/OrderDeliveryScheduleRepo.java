package com.bizoffs.order.dao;

import com.bizoffs.order.entities.OrderDeliverySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderDeliveryScheduleRepo extends JpaRepository<OrderDeliverySchedule,String> {

    @Query("from OrderDeliverySchedule  os where os.id.orderId =:orderId and os.id.orderItemSeqId =:orderItemSeqId")
    List<OrderDeliverySchedule> findByOrderIdAndOrderItemSeqId(@Param("orderId") String orderId, @Param("orderItemSeqId") String orderItemSeqId) ;


}
