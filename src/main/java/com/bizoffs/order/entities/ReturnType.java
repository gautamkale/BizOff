package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the RETURN_TYPE database table.
 * 
 */
@Entity
@Table(name="RETURN_TYPE")
@NamedQuery(name="ReturnType.findAll", query="SELECT r FROM ReturnType r")
public class ReturnType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RETURN_TYPE_ID")
	private String returnTypeId;

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

	@Column(name="PARENT_TYPE_ID")
	private String parentTypeId;

	@Column(name="SEQUENCE_ID")
	private String sequenceId;

	//bi-directional many-to-one association to ReturnAdjustment
	@OneToMany(mappedBy="returnType")
	private List<ReturnAdjustment> returnAdjustments;

	//bi-directional many-to-one association to ReturnItem
	@OneToMany(mappedBy="returnType")
	private List<ReturnItem> returnItems;

	public ReturnType() {
	}

	public String getReturnTypeId() {
		return this.returnTypeId;
	}

	public void setReturnTypeId(String returnTypeId) {
		this.returnTypeId = returnTypeId;
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

	public String getParentTypeId() {
		return this.parentTypeId;
	}

	public void setParentTypeId(String parentTypeId) {
		this.parentTypeId = parentTypeId;
	}

	public String getSequenceId() {
		return this.sequenceId;
	}

	public void setSequenceId(String sequenceId) {
		this.sequenceId = sequenceId;
	}

	public List<ReturnAdjustment> getReturnAdjustments() {
		return this.returnAdjustments;
	}

	public void setReturnAdjustments(List<ReturnAdjustment> returnAdjustments) {
		this.returnAdjustments = returnAdjustments;
	}

	public ReturnAdjustment addReturnAdjustment(ReturnAdjustment returnAdjustment) {
		getReturnAdjustments().add(returnAdjustment);
		returnAdjustment.setReturnType(this);

		return returnAdjustment;
	}

	public ReturnAdjustment removeReturnAdjustment(ReturnAdjustment returnAdjustment) {
		getReturnAdjustments().remove(returnAdjustment);
		returnAdjustment.setReturnType(null);

		return returnAdjustment;
	}

	public List<ReturnItem> getReturnItems() {
		return this.returnItems;
	}

	public void setReturnItems(List<ReturnItem> returnItems) {
		this.returnItems = returnItems;
	}

	public ReturnItem addReturnItem(ReturnItem returnItem) {
		getReturnItems().add(returnItem);
		returnItem.setReturnType(this);

		return returnItem;
	}

	public ReturnItem removeReturnItem(ReturnItem returnItem) {
		getReturnItems().remove(returnItem);
		returnItem.setReturnType(null);

		return returnItem;
	}

}