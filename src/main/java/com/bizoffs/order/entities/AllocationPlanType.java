package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ALLOCATION_PLAN_TYPE database table.
 * 
 */
@Entity
@Table(name="ALLOCATION_PLAN_TYPE")
@NamedQuery(name="AllocationPlanType.findAll", query="SELECT a FROM AllocationPlanType a")
public class AllocationPlanType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PLAN_TYPE_ID")
	private String planTypeId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="HAS_TABLE")
	private String hasTable;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to AllocationPlanHeader
	@OneToMany(mappedBy="allocationPlanType")
	private List<com.bizoffs.order.entities.AllocationPlanHeader> allocationPlanHeaders;

	public AllocationPlanType() {
	}

	public String getPlanTypeId() {
		return this.planTypeId;
	}

	public void setPlanTypeId(String planTypeId) {
		this.planTypeId = planTypeId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHasTable() {
		return this.hasTable;
	}

	public void setHasTable(String hasTable) {
		this.hasTable = hasTable;
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

	public List<com.bizoffs.order.entities.AllocationPlanHeader> getAllocationPlanHeaders() {
		return this.allocationPlanHeaders;
	}

	public void setAllocationPlanHeaders(List<com.bizoffs.order.entities.AllocationPlanHeader> allocationPlanHeaders) {
		this.allocationPlanHeaders = allocationPlanHeaders;
	}

	public com.bizoffs.order.entities.AllocationPlanHeader addAllocationPlanHeader(com.bizoffs.order.entities.AllocationPlanHeader allocationPlanHeader) {
		getAllocationPlanHeaders().add(allocationPlanHeader);
		allocationPlanHeader.setAllocationPlanType(this);

		return allocationPlanHeader;
	}

	public com.bizoffs.order.entities.AllocationPlanHeader removeAllocationPlanHeader(com.bizoffs.order.entities.AllocationPlanHeader allocationPlanHeader) {
		getAllocationPlanHeaders().remove(allocationPlanHeader);
		allocationPlanHeader.setAllocationPlanType(null);

		return allocationPlanHeader;
	}

}