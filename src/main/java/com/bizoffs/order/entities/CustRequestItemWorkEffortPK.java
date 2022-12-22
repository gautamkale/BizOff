package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the CUST_REQUEST_ITEM_WORK_EFFORT database table.
 * 
 */
@Embeddable
public class CustRequestItemWorkEffortPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_REQUEST_ID", insertable=false, updatable=false)
	private String custRequestId;

	@Column(name="CUST_REQUEST_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String custRequestItemSeqId;

	@Column(name="WORK_EFFORT_ID", insertable=false, updatable=false)
	private String workEffortId;

	public CustRequestItemWorkEffortPK() {
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
	public String getWorkEffortId() {
		return this.workEffortId;
	}
	public void setWorkEffortId(String workEffortId) {
		this.workEffortId = workEffortId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CustRequestItemWorkEffortPK)) {
			return false;
		}
		CustRequestItemWorkEffortPK castOther = (CustRequestItemWorkEffortPK)other;
		return 
			this.custRequestId.equals(castOther.custRequestId)
			&& this.custRequestItemSeqId.equals(castOther.custRequestItemSeqId)
			&& this.workEffortId.equals(castOther.workEffortId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.custRequestId.hashCode();
		hash = hash * prime + this.custRequestItemSeqId.hashCode();
		hash = hash * prime + this.workEffortId.hashCode();
		
		return hash;
	}
}