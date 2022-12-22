package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the WORK_ORDER_ITEM_FULFILLMENT database table.
 * 
 */
@Entity
@Table(name="WORK_ORDER_ITEM_FULFILLMENT")
@NamedQuery(name="WorkOrderItemFulfillment.findAll", query="SELECT w FROM WorkOrderItemFulfillment w")
public class WorkOrderItemFulfillment implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private WorkOrderItemFulfillmentPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="SHIP_GROUP_SEQ_ID")
	private String shipGroupSeqId;

	//bi-directional many-to-one association to WorkEffort
	/*@ManyToOne
	@JoinColumn(name="WORK_EFFORT_ID")
	private WorkEffort workEffort;*/

	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private OrderHeader orderHeader;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID"),
		@JoinColumn(name="ORDER_ITEM_SEQ_ID", referencedColumnName="ORDER_ITEM_SEQ_ID")
		})
	private OrderItem orderItem;
	
	public OrderHeader getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public WorkOrderItemFulfillment() {
	}

	public WorkOrderItemFulfillmentPK getId() {
		return this.id;
	}

	public void setId(WorkOrderItemFulfillmentPK id) {
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

	public String getShipGroupSeqId() {
		return this.shipGroupSeqId;
	}

	public void setShipGroupSeqId(String shipGroupSeqId) {
		this.shipGroupSeqId = shipGroupSeqId;
	}

	/*public WorkEffort getWorkEffort() {
		return this.workEffort;
	}

	public void setWorkEffort(WorkEffort workEffort) {
		this.workEffort = workEffort;
	}*/

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

}