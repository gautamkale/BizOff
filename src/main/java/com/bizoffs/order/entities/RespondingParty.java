package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the RESPONDING_PARTY database table.
 * 
 */
@Entity
@Table(name="RESPONDING_PARTY")
@NamedQuery(name="RespondingParty.findAll", query="SELECT r FROM RespondingParty r")
public class RespondingParty implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RespondingPartyPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="DATE_SENT")
	private Timestamp dateSent;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to ContactMech
	/*@ManyToOne
	@JoinColumn(name="CONTACT_MECH_ID")
	private ContactMech contactMech;*/

	//bi-directional many-to-one association to CustRequest
	@ManyToOne
	@JoinColumn(name="CUST_REQUEST_ID", insertable=false, updatable=false)
	private CustRequest custRequest;

	//bi-directional many-to-one association to Party
/*	@ManyToOne
	@JoinColumn(name="PARTY_ID")
	private Party party;*/

	public RespondingParty() {
	}

	public RespondingPartyPK getId() {
		return this.id;
	}

	public void setId(RespondingPartyPK id) {
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

	public Timestamp getDateSent() {
		return this.dateSent;
	}

	public void setDateSent(Timestamp dateSent) {
		this.dateSent = dateSent;
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
	}*/

	public CustRequest getCustRequest() {
		return this.custRequest;
	}

	public void setCustRequest(CustRequest custRequest) {
		this.custRequest = custRequest;
	}

/*	public Party getParty() {
		return this.party;
	}

	public void setParty(Party party) {
		this.party = party;
	}*/

}