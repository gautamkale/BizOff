package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the WORK_REQUIREMENT_FULFILLMENT database table.
 * 
 */
@Entity
@Table(name="WORK_REQUIREMENT_FULFILLMENT")
@NamedQuery(name="WorkRequirementFulfillment.findAll", query="SELECT w FROM WorkRequirementFulfillment w")
public class WorkRequirementFulfillment implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private WorkRequirementFulfillmentPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to WorkEffort
/*	@ManyToOne
	@JoinColumn(name="WORK_EFFORT_ID")
	private WorkEffort workEffort;*/

	//bi-directional many-to-one association to WorkReqFulfType
	@ManyToOne
	@JoinColumn(name="WORK_REQ_FULF_TYPE_ID")
	private WorkReqFulfType workReqFulfType;

	public Requirement getRequirement() {
		return requirement;
	}

	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}

	@ManyToOne
	@JoinColumn(name="REQUIREMENT_ID", insertable=false, updatable=false)
	private Requirement requirement;
	
	public WorkRequirementFulfillment() {
	}

	public WorkRequirementFulfillmentPK getId() {
		return this.id;
	}

	public void setId(WorkRequirementFulfillmentPK id) {
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

/*	public WorkEffort getWorkEffort() {
		return this.workEffort;
	}

	public void setWorkEffort(WorkEffort workEffort) {
		this.workEffort = workEffort;
	}*/

	public WorkReqFulfType getWorkReqFulfType() {
		return this.workReqFulfType;
	}

	public void setWorkReqFulfType(WorkReqFulfType workReqFulfType) {
		this.workReqFulfType = workReqFulfType;
	}

}