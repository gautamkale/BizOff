package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the RETURN_ADJUSTMENT_TYPE database table.
 * 
 */
@Entity
@Table(name="RETURN_ADJUSTMENT_TYPE")
@NamedQuery(name="ReturnAdjustmentType.findAll", query="SELECT r FROM ReturnAdjustmentType r")
public class ReturnAdjustmentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RETURN_ADJUSTMENT_TYPE_ID")
	private String returnAdjustmentTypeId;

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

	//bi-directional many-to-one association to ReturnAdjustment
	@OneToMany(mappedBy="returnAdjustmentType")
	private List<ReturnAdjustment> returnAdjustments;

	//bi-directional many-to-one association to ReturnAdjustmentType
	@ManyToOne
	@JoinColumn(name="PARENT_TYPE_ID")
	private ReturnAdjustmentType returnAdjustmentType;

	//bi-directional many-to-one association to ReturnAdjustmentType
	@OneToMany(mappedBy="returnAdjustmentType")
	private List<ReturnAdjustmentType> returnAdjustmentTypes;

	public ReturnAdjustmentType() {
	}

	public String getReturnAdjustmentTypeId() {
		return this.returnAdjustmentTypeId;
	}

	public void setReturnAdjustmentTypeId(String returnAdjustmentTypeId) {
		this.returnAdjustmentTypeId = returnAdjustmentTypeId;
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

	public List<ReturnAdjustment> getReturnAdjustments() {
		return this.returnAdjustments;
	}

	public void setReturnAdjustments(List<ReturnAdjustment> returnAdjustments) {
		this.returnAdjustments = returnAdjustments;
	}

	public ReturnAdjustment addReturnAdjustment(ReturnAdjustment returnAdjustment) {
		getReturnAdjustments().add(returnAdjustment);
		returnAdjustment.setReturnAdjustmentType(this);

		return returnAdjustment;
	}

	public ReturnAdjustment removeReturnAdjustment(ReturnAdjustment returnAdjustment) {
		getReturnAdjustments().remove(returnAdjustment);
		returnAdjustment.setReturnAdjustmentType(null);

		return returnAdjustment;
	}

	public ReturnAdjustmentType getReturnAdjustmentType() {
		return this.returnAdjustmentType;
	}

	public void setReturnAdjustmentType(ReturnAdjustmentType returnAdjustmentType) {
		this.returnAdjustmentType = returnAdjustmentType;
	}

	public List<ReturnAdjustmentType> getReturnAdjustmentTypes() {
		return this.returnAdjustmentTypes;
	}

	public void setReturnAdjustmentTypes(List<ReturnAdjustmentType> returnAdjustmentTypes) {
		this.returnAdjustmentTypes = returnAdjustmentTypes;
	}

	public ReturnAdjustmentType addReturnAdjustmentType(ReturnAdjustmentType returnAdjustmentType) {
		getReturnAdjustmentTypes().add(returnAdjustmentType);
		returnAdjustmentType.setReturnAdjustmentType(this);

		return returnAdjustmentType;
	}

	public ReturnAdjustmentType removeReturnAdjustmentType(ReturnAdjustmentType returnAdjustmentType) {
		getReturnAdjustmentTypes().remove(returnAdjustmentType);
		returnAdjustmentType.setReturnAdjustmentType(null);

		return returnAdjustmentType;
	}

}