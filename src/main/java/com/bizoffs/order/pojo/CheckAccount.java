package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

;

@Data
public class CheckAccount implements Serializable {	private static final long serialVersionUID = 1L;	private String paymentMethodId;	private String accountNumber;	private String accountType;	private String bankName;	private String branchCode;	private String companyNameOnAccount;	private Timestamp createdStamp;	private Timestamp createdTxStamp;	private Timestamp lastUpdatedStamp;	private Timestamp lastUpdatedTxStamp;	private String nameOnAccount;	private String routingNumber;	private ContactMech contactMech;	private PaymentMethod paymentMethod;	private PostalAddress postalAddress;}