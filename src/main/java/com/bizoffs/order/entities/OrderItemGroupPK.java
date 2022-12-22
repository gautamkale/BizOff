package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ITEM_GROUP database table.
 * 
 */
@Embeddable
public class OrderItemGroupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_GROUP_SEQ_ID")
	private String orderItemGroupSeqId;

	public OrderItemGroupPK() {
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderItemGroupSeqId() {
		return this.orderItemGroupSeqId;
	}
	public void setOrderItemGroupSeqId(String orderItemGroupSeqId) {
		this.orderItemGroupSeqId = orderItemGroupSeqId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderItemGroupPK)) {
			return false;
		}
		OrderItemGroupPK castOther = (OrderItemGroupPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.orderItemGroupSeqId.equals(castOther.orderItemGroupSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemGroupSeqId.hashCode();
		
		return hash;
	}
}