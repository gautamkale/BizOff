package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the RETURN_CONTACT_MECH database table.
 * 
 */
@Embeddable
public class ReturnContactMechPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="RETURN_ID", insertable=false, updatable=false)
	private String returnId;

	@Column(name="CONTACT_MECH_PURPOSE_TYPE_ID", insertable=false, updatable=false)
	private String contactMechPurposeTypeId;

	@Column(name="CONTACT_MECH_ID", insertable=false, updatable=false)
	private String contactMechId;

	public ReturnContactMechPK() {
	}
	public String getReturnId() {
		return this.returnId;
	}
	public void setReturnId(String returnId) {
		this.returnId = returnId;
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
		if (!(other instanceof ReturnContactMechPK)) {
			return false;
		}
		ReturnContactMechPK castOther = (ReturnContactMechPK)other;
		return 
			this.returnId.equals(castOther.returnId)
			&& this.contactMechPurposeTypeId.equals(castOther.contactMechPurposeTypeId)
			&& this.contactMechId.equals(castOther.contactMechId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.returnId.hashCode();
		hash = hash * prime + this.contactMechPurposeTypeId.hashCode();
		hash = hash * prime + this.contactMechId.hashCode();
		
		return hash;
	}
}