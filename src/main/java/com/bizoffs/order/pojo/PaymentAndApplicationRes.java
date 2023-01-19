package com.bizoffs.order.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentAndApplicationRes {
    private String roleTypeId;
    private String finAccountTransId;
    private String partyIdFrom;
    private String amount;
    private String comments;
    private String actualCurrencyAmount;
    private String paymentMethodTypeId;
    private String actualCurrencyUomId;
    private String currencyUomId;
    private String statusId;
    private String paymentId;
    private String paymentMethodId;
    private String paymentGatewayResponseId;
    private String paymentRefNum;
    private String partyIdTo;
    private String effectiveDate;
    private String toPaymentId;
    private BigDecimal amountApplied;
    private String overrideGlAccountId;
    private String invoiceItemSeqId;
    private String billingAccountId;
    private String paymentApplicationId;
    private String taxAuthGeoId;
    private String invoiceId;
}
