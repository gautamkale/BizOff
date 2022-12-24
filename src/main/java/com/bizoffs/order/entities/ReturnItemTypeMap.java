package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the RETURN_ITEM_TYPE_MAP database table.
 * 
 */
@Entity
@Table(name="RETURN_ITEM_TYPE_MAP")
@NamedQuery(name="ReturnItemTypeMap.findAll", query="SELECT r FROM ReturnItemTypeMap r")
public class ReturnItemTypeMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReturnItemTypeMapPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="RETURN_ITEM_TYPE_ID")
	private String returnItemTypeId;

	//bi-directional many-to-one association to ReturnHeaderType
	@ManyToOne
	@JoinColumn(name="RETURN_HEADER_TYPE_ID", insertable=false, updatable=false)
	private ReturnHeaderType returnHeaderType;

	public ReturnItemTypeMap() {
	}

	public ReturnItemTypeMapPK getId() {
		return this.id;
	}

	public void setId(ReturnItemTypeMapPK id) {
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

	public String getReturnItemTypeId() {
		return this.returnItemTypeId;
	}

	public void setReturnItemTypeId(String returnItemTypeId) {
		this.returnItemTypeId = returnItemTypeId;
	}

	public ReturnHeaderType getReturnHeaderType() {
		return this.returnHeaderType;
	}

	public void setReturnHeaderType(ReturnHeaderType returnHeaderType) {
		this.returnHeaderType = returnHeaderType;
	}

}