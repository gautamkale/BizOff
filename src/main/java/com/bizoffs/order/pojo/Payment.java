package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    private String paymentId;
    private BigDecimal actualCurrencyAmount;
    private BigDecimal amount;
    private String comments;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp effectiveDate;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private String paymentRefNum;
  /*  private List<AcctgTran> acctgTrans;
    private List<Deduction> deductions;
    private List<FinAccountTran> finAccountTrans;
    private FinAccountTran finAccountTran;
    private GlAccount glAccount;
    private OrderPaymentPreference orderPaymentPreference;
    private Party party1;
    private Party party2;
    private PaymentGatewayResponse paymentGatewayResponse;
    private PaymentMethod paymentMethod;
    private PaymentMethodType paymentMethodType;
    private PaymentType paymentType;
    private RoleType roleType;
    private StatusItem statusItem;
    private Uom uom1;
    private Uom uom2;
    private List<PaymentApplication> paymentApplications1;
    private List<PaymentApplication> paymentApplications2;
    private List<PaymentAttribute> paymentAttributes;
    private List<PaymentBudgetAllocation> paymentBudgetAllocations;
    private List<PaymentContent> paymentContents;
    private List<PaymentGroupMember> paymentGroupMembers;
    private List<PerfReview> perfReviews;
    private List<ReturnItemResponse> returnItemResponses;*/
}