package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the COMMUNICATION_EVENT_ORDER database table.
 * 
 */
@Embeddable
public class CommunicationEventOrderPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="COMMUNICATION_EVENT_ID", insertable=false, updatable=false)
	private String communicationEventId;

	public CommunicationEventOrderPK() {
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
		if (!(other instanceof CommunicationEventOrderPK)) {
			return false;
		}
		CommunicationEventOrderPK castOther = (CommunicationEventOrderPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.communicationEventId.equals(castOther.communicationEventId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.communicationEventId.hashCode();
		
		return hash;
	}
}