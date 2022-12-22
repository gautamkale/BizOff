package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the REQUIREMENT_CUST_REQUEST database table.
 * 
 */
@Entity
@Table(name="REQUIREMENT_CUST_REQUEST")
@NamedQuery(name="RequirementCustRequest.findAll", query="SELECT r FROM RequirementCustRequest r")
public class RequirementCustRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RequirementCustRequestPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to CustRequestItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CUST_REQUEST_ID", referencedColumnName="CUST_REQUEST_ID"),
		@JoinColumn(name="CUST_REQUEST_ITEM_SEQ_ID", referencedColumnName="CUST_REQUEST_ITEM_SEQ_ID")
		})
	private CustRequestItem custRequestItem;

	//bi-directional many-to-one association to Requirement
	@ManyToOne
	@JoinColumn(name="REQUIREMENT_ID")
	private Requirement requirement;

	public RequirementCustRequest() {
	}

	public RequirementCustRequestPK getId() {
		return this.id;
	}

	public void setId(RequirementCustRequestPK id) {
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

	public CustRequestItem getCustRequestItem() {
		return this.custRequestItem;
	}

	public void setCustRequestItem(CustRequestItem custRequestItem) {
		this.custRequestItem = custRequestItem;
	}

	public Requirement getRequirement() {
		return this.requirement;
	}

	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}

}