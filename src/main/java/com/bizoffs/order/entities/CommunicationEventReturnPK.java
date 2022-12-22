package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the COMMUNICATION_EVENT_RETURN database table.
 * 
 */
@Embeddable
public class CommunicationEventReturnPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="RETURN_ID", insertable=false, updatable=false)
	private String returnId;

	@Column(name="COMMUNICATION_EVENT_ID", insertable=false, updatable=false)
	private String communicationEventId;

	public CommunicationEventReturnPK() {
	}
	public String getReturnId() {
		return this.returnId;
	}
	public void setReturnId(String returnId) {
		this.returnId = returnId;
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
		if (!(other instanceof CommunicationEventReturnPK)) {
			return false;
		}
		CommunicationEventReturnPK castOther = (CommunicationEventReturnPK)other;
		return 
			this.returnId.equals(castOther.returnId)
			&& this.communicationEventId.equals(castOther.communicationEventId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.returnId.hashCode();
		hash = hash * prime + this.communicationEventId.hashCode();
		
		return hash;
	}
}