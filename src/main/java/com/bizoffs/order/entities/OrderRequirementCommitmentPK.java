package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_REQUIREMENT_COMMITMENT database table.
 * 
 */
@Embeddable
public class OrderRequirementCommitmentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String orderItemSeqId;

	@Column(name="REQUIREMENT_ID", insertable=false, updatable=false)
	private String requirementId;

	public OrderRequirementCommitmentPK() {
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
	public String getRequirementId() {
		return this.requirementId;
	}
	public void setRequirementId(String requirementId) {
		this.requirementId = requirementId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderRequirementCommitmentPK)) {
			return false;
		}
		OrderRequirementCommitmentPK castOther = (OrderRequirementCommitmentPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId)
			&& this.requirementId.equals(castOther.requirementId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		hash = hash * prime + this.requirementId.hashCode();
		
		return hash;
	}
}