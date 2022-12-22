package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the ALLOCATION_PLAN_HEADER database table.
 * 
 */
@Entity
@Table(name="ALLOCATION_PLAN_HEADER")
@NamedQuery(name="AllocationPlanHeader.findAll", query="SELECT a FROM AllocationPlanHeader a")
public class AllocationPlanHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AllocationPlanHeaderPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="PLAN_NAME")
	private String planName;

	//bi-directional many-to-one association to AllocationPlanType
	@ManyToOne
	@JoinColumn(name="PLAN_TYPE_ID")
	private com.bizoffs.order.entities.AllocationPlanType allocationPlanType;

	//bi-directional many-to-one association to StatusItem

	public AllocationPlanHeader() {
	}

	public AllocationPlanHeaderPK getId() {
		return this.id;
	}

	public void setId(AllocationPlanHeaderPK id) {
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

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public com.bizoffs.order.entities.AllocationPlanType getAllocationPlanType() {
		return this.allocationPlanType;
	}

	public void setAllocationPlanType(com.bizoffs.order.entities.AllocationPlanType allocationPlanType) {
		this.allocationPlanType = allocationPlanType;
	}


}