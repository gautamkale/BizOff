package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class BillingAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    private String billingAccountId;
    private BigDecimal accountLimit;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String description;
    private String externalAccountId;
    private Timestamp fromDate;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp thruDate;
    private ContactMech contactMech;
    private PostalAddress postalAddress;
   // private Uom uom;
    //private List<BillingAccountRole> billingAccountRoles;
  //  private List<BillingAccountTerm> billingAccountTerms;
  //  private List<Invoice> invoices;
   // private List<OrderHeader> orderHeaders;
   // private List<PaymentApplication> paymentApplications;
    //private List<ReturnHeader> returnHeaders;
    //private List<ReturnItemResponse> returnItemResponses;
}