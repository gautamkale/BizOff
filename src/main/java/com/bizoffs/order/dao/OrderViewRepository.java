package com.bizoffs.order.dao;

import com.bizoffs.order.entities.OrderPaymentPreference;

import java.util.List;


public interface OrderViewRepository  {


    public List<OrderPaymentPreference> OrderPurchasePaymentSummary(String billingAccountId,String paymentMethodType, List<String> orderStatus, List<String> paymentStatus);
}
