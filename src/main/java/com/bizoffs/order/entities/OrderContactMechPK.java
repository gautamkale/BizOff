package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_CONTACT_MECH database table.
 * 
 */
@Embeddable
public class OrderContactMechPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="CONTACT_MECH_PURPOSE_TYPE_ID", insertable=false, updatable=false)
	private String contactMechPurposeTypeId;

	@Column(name="CONTACT_MECH_ID", insertable=false, updatable=false)
	private String contactMechId;

	public OrderContactMechPK() {
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getContactMechPurposeTypeId() {
		return this.contactMechPurposeTypeId;
	}
	public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
		this.contactMechPurposeTypeId = contactMechPurposeTypeId;
	}
	public String getContactMechId() {
		return this.contactMechId;
	}
	public void setContactMechId(String contactMechId) {
		this.contactMechId = contactMechId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderContactMechPK)) {
			return false;
		}
		OrderContactMechPK castOther = (OrderContactMechPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.contactMechPurposeTypeId.equals(castOther.contactMechPurposeTypeId)
			&& this.contactMechId.equals(castOther.contactMechId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.contactMechPurposeTypeId.hashCode();
		hash = hash * prime + this.contactMechId.hashCode();
		
		return hash;
	}
}