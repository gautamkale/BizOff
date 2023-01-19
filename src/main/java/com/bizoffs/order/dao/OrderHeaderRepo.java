package com.bizoffs.order.dao;

import com.bizoffs.order.entities.OrderHeader;
import com.bizoffs.order.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderHeaderRepo extends JpaRepository<OrderHeader,String> {

    @Query("From OrderItem o where o.orderHeader.orderType.orderTypeId = \"PURCHASE_ORDER\" and o.statusItem.statusId not in ( \"ITEM_CANCELLED\", \"ITEM_REJECTED\", \"ITEM_COMPLETED\") and o.productId =:productId" )
    public List<OrderItem> getOrderHeaderAndItems(@Param("productId") String productId);


}
