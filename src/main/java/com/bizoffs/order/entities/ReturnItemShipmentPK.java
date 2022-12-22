package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the RETURN_ITEM_SHIPMENT database table.
 * 
 */
@Embeddable
public class ReturnItemShipmentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="RETURN_ID", insertable=false, updatable=false)
	private String returnId;

	@Column(name="RETURN_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String returnItemSeqId;

	@Column(name="SHIPMENT_ID", insertable=false, updatable=false)
	private String shipmentId;

	@Column(name="SHIPMENT_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String shipmentItemSeqId;

	public ReturnItemShipmentPK() {
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
		if (!(other instanceof ReturnItemShipmentPK)) {
			return false;
		}
		ReturnItemShipmentPK castOther = (ReturnItemShipmentPK)other;
		return 
			this.returnId.equals(castOther.returnId)
			&& this.returnItemSeqId.equals(castOther.returnItemSeqId)
			&& this.shipmentId.equals(castOther.shipmentId)
			&& this.shipmentItemSeqId.equals(castOther.shipmentItemSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.returnId.hashCode();
		hash = hash * prime + this.returnItemSeqId.hashCode();
		hash = hash * prime + this.shipmentId.hashCode();
		hash = hash * prime + this.shipmentItemSeqId.hashCode();
		
		return hash;
	}
}