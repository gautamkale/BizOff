package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ITEM_ASSOC database table.
 * 
 */
@Embeddable
public class OrderItemAssocPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID")
	private String orderItemSeqId;

	@Column(name="SHIP_GROUP_SEQ_ID")
	private String shipGroupSeqId;

	@Column(name="TO_ORDER_ID", insertable=false, updatable=false)
	private String toOrderId;

	@Column(name="TO_ORDER_ITEM_SEQ_ID")
	private String toOrderItemSeqId;

	@Column(name="TO_SHIP_GROUP_SEQ_ID")
	private String toShipGroupSeqId;

	@Column(name="ORDER_ITEM_ASSOC_TYPE_ID", insertable=false, updatable=false)
	private String orderItemAssocTypeId;

	public OrderItemAssocPK() {
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
	public String getToOrderId() {
		return this.toOrderId;
	}
	public void setToOrderId(String toOrderId) {
		this.toOrderId = toOrderId;
	}
	public String getToOrderItemSeqId() {
		return this.toOrderItemSeqId;
	}
	public void setToOrderItemSeqId(String toOrderItemSeqId) {
		this.toOrderItemSeqId = toOrderItemSeqId;
	}
	public String getToShipGroupSeqId() {
		return this.toShipGroupSeqId;
	}
	public void setToShipGroupSeqId(String toShipGroupSeqId) {
		this.toShipGroupSeqId = toShipGroupSeqId;
	}
	public String getOrderItemAssocTypeId() {
		return this.orderItemAssocTypeId;
	}
	public void setOrderItemAssocTypeId(String orderItemAssocTypeId) {
		this.orderItemAssocTypeId = orderItemAssocTypeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderItemAssocPK)) {
			return false;
		}
		OrderItemAssocPK castOther = (OrderItemAssocPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId)
			&& this.shipGroupSeqId.equals(castOther.shipGroupSeqId)
			&& this.toOrderId.equals(castOther.toOrderId)
			&& this.toOrderItemSeqId.equals(castOther.toOrderItemSeqId)
			&& this.toShipGroupSeqId.equals(castOther.toShipGroupSeqId)
			&& this.orderItemAssocTypeId.equals(castOther.orderItemAssocTypeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		hash = hash * prime + this.shipGroupSeqId.hashCode();
		hash = hash * prime + this.toOrderId.hashCode();
		hash = hash * prime + this.toOrderItemSeqId.hashCode();
		hash = hash * prime + this.toShipGroupSeqId.hashCode();
		hash = hash * prime + this.orderItemAssocTypeId.hashCode();
		
		return hash;
	}
}