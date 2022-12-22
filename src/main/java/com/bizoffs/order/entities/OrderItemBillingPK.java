package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ITEM_BILLING database table.
 * 
 */
@Embeddable
public class OrderItemBillingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String orderItemSeqId;

	@Column(name="INVOICE_ID", insertable=false, updatable=false)
	private String invoiceId;

	@Column(name="INVOICE_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String invoiceItemSeqId;

	public OrderItemBillingPK() {
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderItemSeqId() {
		return this.orderItemSeqId;
	}
	public void setOrderItemSeqId(String orderItemSeqId) {
		this.orderItemSeqId = orderItemSeqId;
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
		if (!(other instanceof OrderItemBillingPK)) {
			return false;
		}
		OrderItemBillingPK castOther = (OrderItemBillingPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId)
			&& this.invoiceId.equals(castOther.invoiceId)
			&& this.invoiceItemSeqId.equals(castOther.invoiceItemSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		hash = hash * prime + this.invoiceId.hashCode();
		hash = hash * prime + this.invoiceItemSeqId.hashCode();
		
		return hash;
	}
}