package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the RESPONDING_PARTY database table.
 * 
 */
@Embeddable
public class RespondingPartyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="RESPONDING_PARTY_SEQ_ID")
	private String respondingPartySeqId;

	@Column(name="CUST_REQUEST_ID", insertable=false, updatable=false)
	private String custRequestId;

	@Column(name="PARTY_ID", insertable=false, updatable=false)
	private String partyId;

	public RespondingPartyPK() {
	}
	public String getRespondingPartySeqId() {
		return this.respondingPartySeqId;
	}
	public void setRespondingPartySeqId(String respondingPartySeqId) {
		this.respondingPartySeqId = respondingPartySeqId;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RespondingPartyPK)) {
			return false;
		}
		RespondingPartyPK castOther = (RespondingPartyPK)other;
		return 
			this.respondingPartySeqId.equals(castOther.respondingPartySeqId)
			&& this.custRequestId.equals(castOther.custRequestId)
			&& this.partyId.equals(castOther.partyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.respondingPartySeqId.hashCode();
		hash = hash * prime + this.custRequestId.hashCode();
		hash = hash * prime + this.partyId.hashCode();
		
		return hash;
	}
}