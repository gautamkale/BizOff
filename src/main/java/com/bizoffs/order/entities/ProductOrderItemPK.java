package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the PRODUCT_ORDER_ITEM database table.
 * 
 */
@Embeddable
public class ProductOrderItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String orderItemSeqId;

	@Column(name="ENGAGEMENT_ID", insertable=false, updatable=false)
	private String engagementId;

	@Column(name="ENGAGEMENT_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String engagementItemSeqId;

	public ProductOrderItemPK() {
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
	public String getEngagementId() {
		return this.engagementId;
	}
	public void setEngagementId(String engagementId) {
		this.engagementId = engagementId;
	}
	public String getEngagementItemSeqId() {
		return this.engagementItemSeqId;
	}
	public void setEngagementItemSeqId(String engagementItemSeqId) {
		this.engagementItemSeqId = engagementItemSeqId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProductOrderItemPK)) {
			return false;
		}
		ProductOrderItemPK castOther = (ProductOrderItemPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId)
			&& this.engagementId.equals(castOther.engagementId)
			&& this.engagementItemSeqId.equals(castOther.engagementItemSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		hash = hash * prime + this.engagementId.hashCode();
		hash = hash * prime + this.engagementItemSeqId.hashCode();
		
		return hash;
	}
}