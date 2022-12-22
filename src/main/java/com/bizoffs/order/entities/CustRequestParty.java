package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the CUST_REQUEST_PARTY database table.
 * 
 */
@Entity
@Table(name="CUST_REQUEST_PARTY")
@NamedQuery(name="CustRequestParty.findAll", query="SELECT c FROM CustRequestParty c")
public class CustRequestParty implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CustRequestPartyPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="THRU_DATE")
	private Timestamp thruDate;

	//bi-directional many-to-one association to CustRequest
	@ManyToOne
	@JoinColumn(name="CUST_REQUEST_ID")
	private CustRequest custRequest;

	//bi-directional many-to-one association to Party
/*
	@ManyToOne
	@JoinColumn(name="PARTY_ID")
	private Party party;

	//bi-directional many-to-one association to PartyRole
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="PARTY_ID", referencedColumnName="PARTY_ID"),
		@JoinColumn(name="ROLE_TYPE_ID", referencedColumnName="ROLE_TYPE_ID")
		})
	private PartyRole partyRole;
*/

	public CustRequestParty() {
	}

	public CustRequestPartyPK getId() {
		return this.id;
	}

	public void setId(CustRequestPartyPK id) {
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

	public Timestamp getThruDate() {
		return this.thruDate;
	}

	public void setThruDate(Timestamp thruDate) {
		this.thruDate = thruDate;
	}

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
	}

	public PartyRole getPartyRole() {
		return this.partyRole;
	}

	public void setPartyRole(PartyRole partyRole) {
		this.partyRole = partyRole;
	}*/

}