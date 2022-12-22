package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the COMMUNICATION_EVENT_ORDER database table.
 * 
 */
@Entity
@Table(name="COMMUNICATION_EVENT_ORDER")
@NamedQuery(name="CommunicationEventOrder.findAll", query="SELECT c FROM CommunicationEventOrder c")
public class CommunicationEventOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CommunicationEventOrderPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to CommunicationEvent
	/*@ManyToOne
	@JoinColumn(name="COMMUNICATION_EVENT_ID")
	private CommunicationEvent communicationEvent;*/

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private OrderHeader orderHeader;

	public CommunicationEventOrder() {
	}

	public CommunicationEventOrderPK getId() {
		return this.id;
	}

	public void setId(CommunicationEventOrderPK id) {
		this.id = id;
	}

	public Timestamp getCreatedStamp() {
		return this.createdStamp;
	}

	public void setCreatedStamp(Timestamp createdStamp) {
		this.createdStamp = createdStamp;
	}

	public Timestamp getCreatedTxStamp() {
		return this.createdTxStamp;
	}

	public void setCreatedTxStamp(Timestamp createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}

	public Timestamp getLastUpdatedStamp() {
		return this.lastUpdatedStamp;
	}

	public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	public Timestamp getLastUpdatedTxStamp() {
		return this.lastUpdatedTxStamp;
	}

	public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
	}

/*	public CommunicationEvent getCommunicationEvent() {
		return this.communicationEvent;
	}

	public void setCommunicationEvent(CommunicationEvent communicationEvent) {
		this.communicationEvent = communicationEvent;
	}*/

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

}