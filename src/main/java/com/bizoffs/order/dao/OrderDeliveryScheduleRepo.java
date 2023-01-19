package com.bizoffs.order.dao;

import com.bizoffs.order.entities.OrderDeliverySchedule;
import com.bizoffs.order.entities.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDeliveryScheduleRepo extends JpaRepository<OrderDeliverySchedule,String> {

    @Query("from OrderDeliverySchedule  os where os.id.orderId =:orderId and os.id.orderItemSeqId= : orderItemSeqId")
    List<OrderDeliverySchedule> findByOrderIdAndOrderItemSeqId(String orderId, String orderItemSeqId) ;


}
