package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class CreditCard implements Serializable {
    private static final long serialVersionUID = 1L;
    private String paymentMethodId;
    private String cardNumber;
    private String cardType;
    private String companyNameOnCard;
    private BigDecimal consecutiveFailedAuths;
    private BigDecimal consecutiveFailedNsf;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String expireDate;
    private String firstNameOnCard;
    private String issueNumber;
    private Timestamp lastFailedAuthDate;
    private Timestamp lastFailedNsfDate;
    private String lastNameOnCard;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private String middleNameOnCard;
    private String suffixOnCard;
    private String titleOnCard;
    private String validFromDate;
    private ContactMech contactMech;
    private PaymentMethod paymentMethod;
    private PostalAddress postalAddress;
}