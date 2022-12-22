package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the WORK_REQ_FULF_TYPE database table.
 * 
 */
@Entity
@Table(name="WORK_REQ_FULF_TYPE")
@NamedQuery(name="WorkReqFulfType.findAll", query="SELECT w FROM WorkReqFulfType w")
public class WorkReqFulfType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="WORK_REQ_FULF_TYPE_ID")
	private String workReqFulfTypeId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to WorkRequirementFulfillment
	@OneToMany(mappedBy="workReqFulfType")
	private List<WorkRequirementFulfillment> workRequirementFulfillments;

	public WorkReqFulfType() {
	}

	public String getWorkReqFulfTypeId() {
		return this.workReqFulfTypeId;
	}

	public void setWorkReqFulfTypeId(String workReqFulfTypeId) {
		this.workReqFulfTypeId = workReqFulfTypeId;
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

	public List<WorkRequirementFulfillment> getWorkRequirementFulfillments() {
		return this.workRequirementFulfillments;
	}

	public void setWorkRequirementFulfillments(List<WorkRequirementFulfillment> workRequirementFulfillments) {
		this.workRequirementFulfillments = workRequirementFulfillments;
	}

	public WorkRequirementFulfillment addWorkRequirementFulfillment(WorkRequirementFulfillment workRequirementFulfillment) {
		getWorkRequirementFulfillments().add(workRequirementFulfillment);
		workRequirementFulfillment.setWorkReqFulfType(this);

		return workRequirementFulfillment;
	}

	public WorkRequirementFulfillment removeWorkRequirementFulfillment(WorkRequirementFulfillment workRequirementFulfillment) {
		getWorkRequirementFulfillments().remove(workRequirementFulfillment);
		workRequirementFulfillment.setWorkReqFulfType(null);

		return workRequirementFulfillment;
	}

}