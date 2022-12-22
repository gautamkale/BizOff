package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ITEM_CONTACT_MECH database table.
 * 
 */
@Embeddable
public class OrderItemContactMechPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String orderItemSeqId;

	@Column(name="CONTACT_MECH_PURPOSE_TYPE_ID", insertable=false, updatable=false)
	private String contactMechPurposeTypeId;

	public OrderItemContactMechPK() {
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
	public String getContactMechPurposeTypeId() {
		return this.contactMechPurposeTypeId;
	}
	public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
		this.contactMechPurposeTypeId = contactMechPurposeTypeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderItemContactMechPK)) {
			return false;
		}
		OrderItemContactMechPK castOther = (OrderItemContactMechPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId)
			&& this.contactMechPurposeTypeId.equals(castOther.contactMechPurposeTypeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		hash = hash * prime + this.contactMechPurposeTypeId.hashCode();
		
		return hash;
	}
}