package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class EftAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    private String paymentMethodId;
    private String accountNumber;
    private String accountType;
    private String bankName;
    private String companyNameOnAccount;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private String nameOnAccount;
    private String routingNumber;
    private BigDecimal yearsAtBank;
    private ContactMech contactMech;
    private PaymentMethod paymentMethod;
    private PostalAddress postalAddress;
}