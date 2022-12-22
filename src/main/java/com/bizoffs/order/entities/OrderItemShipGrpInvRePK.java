package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ITEM_SHIP_GRP_INV_RES database table.
 * 
 */
@Embeddable
public class OrderItemShipGrpInvRePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="SHIP_GROUP_SEQ_ID")
	private String shipGroupSeqId;

	@Column(name="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String orderItemSeqId;

	@Column(name="INVENTORY_ITEM_ID", insertable=false, updatable=false)
	private String inventoryItemId;

	public OrderItemShipGrpInvRePK() {
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
	public String getOrderItemSeqId() {
		return this.orderItemSeqId;
	}
	public void setOrderItemSeqId(String orderItemSeqId) {
		this.orderItemSeqId = orderItemSeqId;
	}
	public String getInventoryItemId() {
		return this.inventoryItemId;
	}
	public void setInventoryItemId(String inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderItemShipGrpInvRePK)) {
			return false;
		}
		OrderItemShipGrpInvRePK castOther = (OrderItemShipGrpInvRePK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.shipGroupSeqId.equals(castOther.shipGroupSeqId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId)
			&& this.inventoryItemId.equals(castOther.inventoryItemId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.shipGroupSeqId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		hash = hash * prime + this.inventoryItemId.hashCode();
		
		return hash;
	}
}