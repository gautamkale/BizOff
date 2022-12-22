package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ITEM_GROUP_ORDER database table.
 * 
 */
@Embeddable
public class OrderItemGroupOrderPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String orderItemSeqId;

	@Column(name="GROUP_ORDER_ID", insertable=false, updatable=false)
	private String groupOrderId;

	public OrderItemGroupOrderPK() {
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
	public String getGroupOrderId() {
		return this.groupOrderId;
	}
	public void setGroupOrderId(String groupOrderId) {
		this.groupOrderId = groupOrderId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderItemGroupOrderPK)) {
			return false;
		}
		OrderItemGroupOrderPK castOther = (OrderItemGroupOrderPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId)
			&& this.groupOrderId.equals(castOther.groupOrderId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		hash = hash * prime + this.groupOrderId.hashCode();
		
		return hash;
	}
}