package com.bizoffs.order.utils;


import com.bizoffs.order.pojo.ConditionExpression;
import com.bizoffs.order.pojo.ItemReceivedQuantityReq;

public class JsonRequestBuilder {



    public static ItemReceivedQuantityReq getItemReceivedQuantityReq(String orderId, ConditionExpression quantityAccepted, String orderItemSeqId) {
        return new ItemReceivedQuantityReq( orderId,  quantityAccepted,  orderItemSeqId);
    }
}
