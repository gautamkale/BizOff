package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_CONTACT_MECH database table.
 * 
 */
@Entity
@Table(name="ORDER_CONTACT_MECH")
@NamedQuery(name="OrderContactMech.findAll", query="SELECT o FROM OrderContactMech o")
public class OrderContactMech implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderContactMechPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to ContactMech
/*	@ManyToOne
	@JoinColumn(name="CONTACT_MECH_ID")
	private ContactMech contactMech;

	//bi-directional many-to-one association to ContactMechPurposeType
	@ManyToOne
	@JoinColumn(name="CONTACT_MECH_PURPOSE_TYPE_ID")
	private ContactMechPurposeType contactMechPurposeType;*/

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader;

	public OrderContactMech() {
	}

	public OrderContactMechPK getId() {
		return this.id;
	}

	public void setId(OrderContactMechPK id) {
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

	/*public ContactMech getContactMech() {
		return this.contactMech;
	}

	public void setContactMech(ContactMech contactMech) {
		this.contactMech = contactMech;
	}

	public ContactMechPurposeType getContactMechPurposeType() {
		return this.contactMechPurposeType;
	}

	public void setContactMechPurposeType(ContactMechPurposeType contactMechPurposeType) {
		this.contactMechPurposeType = contactMechPurposeType;
	}*/

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

}