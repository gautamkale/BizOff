package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the REQUIREMENT_CUST_REQUEST database table.
 * 
 */
@Embeddable
public class RequirementCustRequestPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_REQUEST_ID", insertable=false, updatable=false)
	private String custRequestId;

	@Column(name="CUST_REQUEST_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String custRequestItemSeqId;

	@Column(name="REQUIREMENT_ID", insertable=false, updatable=false)
	private String requirementId;

	public RequirementCustRequestPK() {
	}
	public String getCustRequestId() {
		return this.custRequestId;
	}
	public void setCustRequestId(String custRequestId) {
		this.custRequestId = custRequestId;
	}
	public String getCustRequestItemSeqId() {
		return this.custRequestItemSeqId;
	}
	public void setCustRequestItemSeqId(String custRequestItemSeqId) {
		this.custRequestItemSeqId = custRequestItemSeqId;
	}
	public String getRequirementId() {
		return this.requirementId;
	}
	public void setRequirementId(String requirementId) {
		this.requirementId = requirementId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RequirementCustRequestPK)) {
			return false;
		}
		RequirementCustRequestPK castOther = (RequirementCustRequestPK)other;
		return 
			this.custRequestId.equals(castOther.custRequestId)
			&& this.custRequestItemSeqId.equals(castOther.custRequestItemSeqId)
			&& this.requirementId.equals(castOther.requirementId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.custRequestId.hashCode();
		hash = hash * prime + this.custRequestItemSeqId.hashCode();
		hash = hash * prime + this.requirementId.hashCode();
		
		return hash;
	}
}