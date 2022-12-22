package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_DENYLIST database table.
 * 
 */
@Embeddable
public class OrderDenylistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="DENYLIST_STRING")
	private String denylistString;

	@Column(name="ORDER_DENYLIST_TYPE_ID", insertable=false, updatable=false)
	private String orderDenylistTypeId;

	public OrderDenylistPK() {
	}
	public String getDenylistString() {
		return this.denylistString;
	}
	public void setDenylistString(String denylistString) {
		this.denylistString = denylistString;
	}
	public String getOrderDenylistTypeId() {
		return this.orderDenylistTypeId;
	}
	public void setOrderDenylistTypeId(String orderDenylistTypeId) {
		this.orderDenylistTypeId = orderDenylistTypeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderDenylistPK)) {
			return false;
		}
		OrderDenylistPK castOther = (OrderDenylistPK)other;
		return 
			this.denylistString.equals(castOther.denylistString)
			&& this.orderDenylistTypeId.equals(castOther.orderDenylistTypeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.denylistString.hashCode();
		hash = hash * prime + this.orderDenylistTypeId.hashCode();
		
		return hash;
	}
}