package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_TERM database table.
 * 
 */
@Embeddable
public class OrderTermPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TERM_TYPE_ID", insertable=false, updatable=false)
	private String termTypeId;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID")
	private String orderItemSeqId;

	public OrderTermPK() {
	}
	public String getTermTypeId() {
		return this.termTypeId;
	}
	public void setTermTypeId(String termTypeId) {
		this.termTypeId = termTypeId;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderTermPK)) {
			return false;
		}
		OrderTermPK castOther = (OrderTermPK)other;
		return 
			this.termTypeId.equals(castOther.termTypeId)
			&& this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.termTypeId.hashCode();
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		
		return hash;
	}
}