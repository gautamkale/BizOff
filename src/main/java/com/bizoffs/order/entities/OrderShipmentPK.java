package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_SHIPMENT database table.
 * 
 */
@Embeddable
public class OrderShipmentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID")
	private String orderItemSeqId;

	@Column(name="SHIP_GROUP_SEQ_ID")
	private String shipGroupSeqId;

	@Column(name="SHIPMENT_ID", insertable=false, updatable=false)
	private String shipmentId;

	@Column(name="SHIPMENT_ITEM_SEQ_ID")
	private String shipmentItemSeqId;

	public OrderShipmentPK() {
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
	public String getShipmentId() {
		return this.shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getShipmentItemSeqId() {
		return this.shipmentItemSeqId;
	}
	public void setShipmentItemSeqId(String shipmentItemSeqId) {
		this.shipmentItemSeqId = shipmentItemSeqId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderShipmentPK)) {
			return false;
		}
		OrderShipmentPK castOther = (OrderShipmentPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId)
			&& this.shipGroupSeqId.equals(castOther.shipGroupSeqId)
			&& this.shipmentId.equals(castOther.shipmentId)
			&& this.shipmentItemSeqId.equals(castOther.shipmentItemSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		hash = hash * prime + this.shipGroupSeqId.hashCode();
		hash = hash * prime + this.shipmentId.hashCode();
		hash = hash * prime + this.shipmentItemSeqId.hashCode();
		
		return hash;
	}
}