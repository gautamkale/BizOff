package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the RETURN_ITEM_TYPE database table.
 * 
 */
@Entity
@Table(name="RETURN_ITEM_TYPE")
@NamedQuery(name="ReturnItemType.findAll", query="SELECT r FROM ReturnItemType r")
public class ReturnItemType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RETURN_ITEM_TYPE_ID")
	private String returnItemTypeId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to ReturnItem
	@OneToMany(mappedBy="returnItemType")
	private List<ReturnItem> returnItems;

	//bi-directional many-to-one association to ReturnItemType
	@ManyToOne
	@JoinColumn(name="PARENT_TYPE_ID")
	private ReturnItemType returnItemType;

	//bi-directional many-to-one association to ReturnItemType
	@OneToMany(mappedBy="returnItemType")
	private List<ReturnItemType> returnItemTypes;

	public ReturnItemType() {
	}

	public String getReturnItemTypeId() {
		return this.returnItemTypeId;
	}

	public void setReturnItemTypeId(String returnItemTypeId) {
		this.returnItemTypeId = returnItemTypeId;
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

	public List<ReturnItem> getReturnItems() {
		return this.returnItems;
	}

	public void setReturnItems(List<ReturnItem> returnItems) {
		this.returnItems = returnItems;
	}

	public ReturnItem addReturnItem(ReturnItem returnItem) {
		getReturnItems().add(returnItem);
		returnItem.setReturnItemType(this);

		return returnItem;
	}

	public ReturnItem removeReturnItem(ReturnItem returnItem) {
		getReturnItems().remove(returnItem);
		returnItem.setReturnItemType(null);

		return returnItem;
	}

	public ReturnItemType getReturnItemType() {
		return this.returnItemType;
	}

	public void setReturnItemType(ReturnItemType returnItemType) {
		this.returnItemType = returnItemType;
	}

	public List<ReturnItemType> getReturnItemTypes() {
		return this.returnItemTypes;
	}

	public void setReturnItemTypes(List<ReturnItemType> returnItemTypes) {
		this.returnItemTypes = returnItemTypes;
	}

	public ReturnItemType addReturnItemType(ReturnItemType returnItemType) {
		getReturnItemTypes().add(returnItemType);
		returnItemType.setReturnItemType(this);

		return returnItemType;
	}

	public ReturnItemType removeReturnItemType(ReturnItemType returnItemType) {
		getReturnItemTypes().remove(returnItemType);
		returnItemType.setReturnItemType(null);

		return returnItemType;
	}

}