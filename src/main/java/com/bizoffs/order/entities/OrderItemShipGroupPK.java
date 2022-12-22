package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ITEM_SHIP_GROUP database table.
 * 
 */
@Embeddable
public class OrderItemShipGroupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="SHIP_GROUP_SEQ_ID")
	private String shipGroupSeqId;

	public OrderItemShipGroupPK() {
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
		if (!(other instanceof OrderItemShipGroupPK)) {
			return false;
		}
		OrderItemShipGroupPK castOther = (OrderItemShipGroupPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.shipGroupSeqId.equals(castOther.shipGroupSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.shipGroupSeqId.hashCode();
		
		return hash;
	}
}