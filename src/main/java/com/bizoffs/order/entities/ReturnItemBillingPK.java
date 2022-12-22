package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the RETURN_ITEM_BILLING database table.
 * 
 */
@Embeddable
public class ReturnItemBillingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="RETURN_ID", insertable=false, updatable=false)
	private String returnId;

	@Column(name="RETURN_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String returnItemSeqId;

	@Column(name="INVOICE_ID", insertable=false, updatable=false)
	private String invoiceId;

	@Column(name="INVOICE_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String invoiceItemSeqId;

	public ReturnItemBillingPK() {
	}
	public String getReturnId() {
		return this.returnId;
	}
	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}
	public String getReturnItemSeqId() {
		return this.returnItemSeqId;
	}
	public void setReturnItemSeqId(String returnItemSeqId) {
		this.returnItemSeqId = returnItemSeqId;
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
		if (!(other instanceof ReturnItemBillingPK)) {
			return false;
		}
		ReturnItemBillingPK castOther = (ReturnItemBillingPK)other;
		return 
			this.returnId.equals(castOther.returnId)
			&& this.returnItemSeqId.equals(castOther.returnItemSeqId)
			&& this.invoiceId.equals(castOther.invoiceId)
			&& this.invoiceItemSeqId.equals(castOther.invoiceItemSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.returnId.hashCode();
		hash = hash * prime + this.returnItemSeqId.hashCode();
		hash = hash * prime + this.invoiceId.hashCode();
		hash = hash * prime + this.invoiceItemSeqId.hashCode();
		
		return hash;
	}
}