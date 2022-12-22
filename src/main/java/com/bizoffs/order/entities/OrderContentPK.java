package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_CONTENT database table.
 * 
 */
@Embeddable
public class OrderContentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CONTENT_ID", insertable=false, updatable=false)
	private String contentId;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID")
	private String orderItemSeqId;

	@Column(name="ORDER_CONTENT_TYPE_ID", insertable=false, updatable=false)
	private String orderContentTypeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FROM_DATE")
	private java.util.Date fromDate;

	public OrderContentPK() {
	}
	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
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
	public String getOrderContentTypeId() {
		return this.orderContentTypeId;
	}
	public void setOrderContentTypeId(String orderContentTypeId) {
		this.orderContentTypeId = orderContentTypeId;
	}
	public java.util.Date getFromDate() {
		return this.fromDate;
	}
	public void setFromDate(java.util.Date fromDate) {
		this.fromDate = fromDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderContentPK)) {
			return false;
		}
		OrderContentPK castOther = (OrderContentPK)other;
		return 
			this.contentId.equals(castOther.contentId)
			&& this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId)
			&& this.orderContentTypeId.equals(castOther.orderContentTypeId)
			&& this.fromDate.equals(castOther.fromDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.contentId.hashCode();
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		hash = hash * prime + this.orderContentTypeId.hashCode();
		hash = hash * prime + this.fromDate.hashCode();
		
		return hash;
	}
}