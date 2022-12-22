package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the WORK_ORDER_ITEM_FULFILLMENT database table.
 * 
 */
@Embeddable
public class WorkOrderItemFulfillmentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="WORK_EFFORT_ID", insertable=false, updatable=false)
	private String workEffortId;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String orderItemSeqId;

	public WorkOrderItemFulfillmentPK() {
	}
	public String getWorkEffortId() {
		return this.workEffortId;
	}
	public void setWorkEffortId(String workEffortId) {
		this.workEffortId = workEffortId;
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderItemSeqId() {
		return this.orderItemSeqId;
	}
	public void setOrderItemSeqId(String orderItemSeqId) {
		this.orderItemSeqId = orderItemSeqId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof WorkOrderItemFulfillmentPK)) {
			return false;
		}
		WorkOrderItemFulfillmentPK castOther = (WorkOrderItemFulfillmentPK)other;
		return 
			this.workEffortId.equals(castOther.workEffortId)
			&& this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.workEffortId.hashCode();
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		
		return hash;
	}
}