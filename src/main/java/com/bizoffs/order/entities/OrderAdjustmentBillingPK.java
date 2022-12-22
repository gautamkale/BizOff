package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ADJUSTMENT_BILLING database table.
 * 
 */
@Embeddable
public class OrderAdjustmentBillingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ADJUSTMENT_ID", insertable=false, updatable=false)
	private String orderAdjustmentId;

	@Column(name="INVOICE_ID", insertable=false, updatable=false)
	private String invoiceId;

	@Column(name="INVOICE_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String invoiceItemSeqId;

	public OrderAdjustmentBillingPK() {
	}
	public String getOrderAdjustmentId() {
		return this.orderAdjustmentId;
	}
	public void setOrderAdjustmentId(String orderAdjustmentId) {
		this.orderAdjustmentId = orderAdjustmentId;
	}
	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getInvoiceItemSeqId() {
		return this.invoiceItemSeqId;
	}
	public void setInvoiceItemSeqId(String invoiceItemSeqId) {
		this.invoiceItemSeqId = invoiceItemSeqId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderAdjustmentBillingPK)) {
			return false;
		}
		OrderAdjustmentBillingPK castOther = (OrderAdjustmentBillingPK)other;
		return 
			this.orderAdjustmentId.equals(castOther.orderAdjustmentId)
			&& this.invoiceId.equals(castOther.invoiceId)
			&& this.invoiceItemSeqId.equals(castOther.invoiceItemSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderAdjustmentId.hashCode();
		hash = hash * prime + this.invoiceId.hashCode();
		hash = hash * prime + this.invoiceItemSeqId.hashCode();
		
		return hash;
	}
}