package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

;

@Data
public class Invoice implements Serializable {
    private static final long serialVersionUID = 1L;
    private String invoiceId;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String description;
    private Timestamp dueDate;
    private Timestamp invoiceDate;
    private String invoiceMessage;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp paidDate;
    private String referenceNumber;
   /* private List<AcctgTran> acctgTrans;
    private BillingAccount billingAccount;
    private ContactMech contactMech;
    private InvoiceType invoiceType;
    private Party party1;
    private Party party2;
    private RecurrenceInfo recurrenceInfo;
    private RoleType roleType;
    private StatusItem statusItem;
    private Uom uom;
    private List<InvoiceAttribute> invoiceAttributes;
    private List<InvoiceContactMech> invoiceContactMeches;
    private List<InvoiceContent> invoiceContents;
    private List<InvoiceItem> invoiceItems;
    private List<InvoiceNote> invoiceNotes;
    private List<InvoiceRole> invoiceRoles;
    private List<InvoiceStatus> invoiceStatuses;
    private List<InvoiceTerm> invoiceTerms;
    private List<PaymentApplication> paymentApplications;*/
}