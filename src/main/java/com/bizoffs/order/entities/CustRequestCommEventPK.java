package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the CUST_REQUEST_COMM_EVENT database table.
 * 
 */
@Embeddable
public class CustRequestCommEventPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_REQUEST_ID", insertable=false, updatable=false)
	private String custRequestId;

	@Column(name="COMMUNICATION_EVENT_ID", insertable=false, updatable=false)
	private String communicationEventId;

	public CustRequestCommEventPK() {
	}
	public String getCustRequestId() {
		return this.custRequestId;
	}
	public void setCustRequestId(String custRequestId) {
		this.custRequestId = custRequestId;
	}
	public String getCommunicationEventId() {
		return this.communicationEventId;
	}
	public void setCommunicationEventId(String communicationEventId) {
		this.communicationEventId = communicationEventId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CustRequestCommEventPK)) {
			return false;
		}
		CustRequestCommEventPK castOther = (CustRequestCommEventPK)other;
		return 
			this.custRequestId.equals(castOther.custRequestId)
			&& this.communicationEventId.equals(castOther.communicationEventId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.custRequestId.hashCode();
		hash = hash * prime + this.communicationEventId.hashCode();
		
		return hash;
	}
}