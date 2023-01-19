package com.bizoffs.order.pojo;

import lombok.Data;

import java.util.Set;

@Data
public class PaymentAndApplicationReq {
    private String statusId;
    private Set<String> invoiceId;
    private String paymentMethodTypeId;
}
