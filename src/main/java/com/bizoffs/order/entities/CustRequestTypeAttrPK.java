package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the CUST_REQUEST_TYPE_ATTR database table.
 * 
 */
@Embeddable
public class CustRequestTypeAttrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_REQUEST_TYPE_ID", insertable=false, updatable=false)
	private String custRequestTypeId;

	@Column(name="ATTR_NAME")
	private String attrName;

	public CustRequestTypeAttrPK() {
	}
	public String getCustRequestTypeId() {
		return this.custRequestTypeId;
	}
	public void setCustRequestTypeId(String custRequestTypeId) {
		this.custRequestTypeId = custRequestTypeId;
	}
	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CustRequestTypeAttrPK)) {
			return false;
		}
		CustRequestTypeAttrPK castOther = (CustRequestTypeAttrPK)other;
		return 
			this.custRequestTypeId.equals(castOther.custRequestTypeId)
			&& this.attrName.equals(castOther.attrName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.custRequestTypeId.hashCode();
		hash = hash * prime + this.attrName.hashCode();
		
		return hash;
	}
}