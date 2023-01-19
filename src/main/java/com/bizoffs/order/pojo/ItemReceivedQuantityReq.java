package com.bizoffs.order.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ItemReceivedQuantityReq {
    private String orderId;
    private ConditionExpression exp;
    private String orderItemSeqId;
  }
