package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class PaymentApplication implements Serializable {
    private static final long serialVersionUID = 1L;
    private String paymentApplicationId;
    private BigDecimal amountApplied;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String invoiceItemSeqId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private BillingAccount billingAccount;
   /* private Geo geo;
    private GlAccount glAccount;*/
    private Invoice invoice;
    private Payment payment;

}