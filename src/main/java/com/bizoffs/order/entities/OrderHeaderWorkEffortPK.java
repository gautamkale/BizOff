package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_HEADER_WORK_EFFORT database table.
 * 
 */
@Embeddable
public class OrderHeaderWorkEffortPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="WORK_EFFORT_ID", insertable=false, updatable=false)
	private String workEffortId;

	public OrderHeaderWorkEffortPK() {
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getWorkEffortId() {
		return this.workEffortId;
	}
	public void setWorkEffortId(String workEffortId) {
		this.workEffortId = workEffortId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderHeaderWorkEffortPK)) {
			return false;
		}
		OrderHeaderWorkEffortPK castOther = (OrderHeaderWorkEffortPK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.workEffortId.equals(castOther.workEffortId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.workEffortId.hashCode();
		
		return hash;
	}
}