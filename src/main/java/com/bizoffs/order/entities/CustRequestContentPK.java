package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.io.Serializable;

/**
 * The primary key class for the CUST_REQUEST_CONTENT database table.
 * 
 */
@Embeddable
public class CustRequestContentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_REQUEST_ID", insertable=false, updatable=false)
	private String custRequestId;

	@Column(name="CONTENT_ID", insertable=false, updatable=false)
	private String contentId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FROM_DATE")
	private java.util.Date fromDate;

	public CustRequestContentPK() {
	}
	public String getCustRequestId() {
		return this.custRequestId;
	}
	public void setCustRequestId(String custRequestId) {
		this.custRequestId = custRequestId;
	}
	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
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
		if (!(other instanceof CustRequestContentPK)) {
			return false;
		}
		CustRequestContentPK castOther = (CustRequestContentPK)other;
		return 
			this.custRequestId.equals(castOther.custRequestId)
			&& this.contentId.equals(castOther.contentId)
			&& this.fromDate.equals(castOther.fromDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.custRequestId.hashCode();
		hash = hash * prime + this.contentId.hashCode();
		hash = hash * prime + this.fromDate.hashCode();
		
		return hash;
	}
}