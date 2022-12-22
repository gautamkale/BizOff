package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.io.Serializable;

/**
 * The primary key class for the CUST_REQUEST_PARTY database table.
 * 
 */
@Embeddable
public class CustRequestPartyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_REQUEST_ID", insertable=false, updatable=false)
	private String custRequestId;

	@Column(name="PARTY_ID", insertable=false, updatable=false)
	private String partyId;

	@Column(name="ROLE_TYPE_ID", insertable=false, updatable=false)
	private String roleTypeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FROM_DATE")
	private java.util.Date fromDate;

	public CustRequestPartyPK() {
	}
	public String getCustRequestId() {
		return this.custRequestId;
	}
	public void setCustRequestId(String custRequestId) {
		this.custRequestId = custRequestId;
	}
	public String getPartyId() {
		return this.partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getRoleTypeId() {
		return this.roleTypeId;
	}
	public void setRoleTypeId(String roleTypeId) {
		this.roleTypeId = roleTypeId;
	}
	public java.util.Date getFromDate() {
		return this.fromDate;
	}
	public void setFromDate(java.util.Date fromDate) {
		this.fromDate = fromDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CustRequestPartyPK)) {
			return false;
		}
		CustRequestPartyPK castOther = (CustRequestPartyPK)other;
		return 
			this.custRequestId.equals(castOther.custRequestId)
			&& this.partyId.equals(castOther.partyId)
			&& this.roleTypeId.equals(castOther.roleTypeId)
			&& this.fromDate.equals(castOther.fromDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.custRequestId.hashCode();
		hash = hash * prime + this.partyId.hashCode();
		hash = hash * prime + this.roleTypeId.hashCode();
		hash = hash * prime + this.fromDate.hashCode();
		
		return hash;
	}
}