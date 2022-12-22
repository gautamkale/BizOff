package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ITEM_SHIP_GROUP_ASSOC database table.
 * 
 */
@Embeddable
public class OrderItemShipGroupAssocPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String orderItemSeqId;

	@Column(name="SHIP_GROUP_SEQ_ID", insertable=false, updatable=false)
	private String shipGroupSeqId;

	public OrderItemShipGroupAssocPK() {
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
	public String getShipGroupSeqId() {
		return this.shipGroupSeqId;
	}
	public void setShipGroupSeqId(String shipGroupSeqId) {
		this.shipGroupSeqId = shipGroupSeqId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderItemShipGroupAssocPK)) {
			return false;
		}
		OrderItemShipGroupAssocPK castOther = (OrderItemShipGroupAssocPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId)
			&& this.shipGroupSeqId.equals(castOther.shipGroupSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		hash = hash * prime + this.shipGroupSeqId.hashCode();
		
		return hash;
	}
}