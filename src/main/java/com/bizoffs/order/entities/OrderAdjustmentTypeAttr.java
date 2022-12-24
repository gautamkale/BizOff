package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_ADJUSTMENT_TYPE_ATTR database table.
 * 
 */
@Entity
@Table(name="ORDER_ADJUSTMENT_TYPE_ATTR")
@NamedQuery(name="OrderAdjustmentTypeAttr.findAll", query="SELECT o FROM OrderAdjustmentTypeAttr o")
public class OrderAdjustmentTypeAttr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderAdjustmentTypeAttrPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to OrderAdjustmentType
	@ManyToOne
	@JoinColumn(name="ORDER_ADJUSTMENT_TYPE_ID", insertable=false, updatable=false)
	private OrderAdjustmentType orderAdjustmentType;

	public OrderAdjustmentTypeAttr() {
	}

	public OrderAdjustmentTypeAttrPK getId() {
		return this.id;
	}

	public void setId(OrderAdjustmentTypeAttrPK id) {
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

	public OrderAdjustmentType getOrderAdjustmentType() {
		return this.orderAdjustmentType;
	}

	public void setOrderAdjustmentType(OrderAdjustmentType orderAdjustmentType) {
		this.orderAdjustmentType = orderAdjustmentType;
	}

}