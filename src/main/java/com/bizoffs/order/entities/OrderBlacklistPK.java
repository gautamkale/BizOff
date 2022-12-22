package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_BLACKLIST database table.
 * 
 */
@Embeddable
public class OrderBlacklistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BLACKLIST_STRING")
	private String blacklistString;

	@Column(name="ORDER_BLACKLIST_TYPE_ID", insertable=false, updatable=false)
	private String orderBlacklistTypeId;

	public OrderBlacklistPK() {
	}
	public String getBlacklistString() {
		return this.blacklistString;
	}
	public void setBlacklistString(String blacklistString) {
		this.blacklistString = blacklistString;
	}
	public String getOrderBlacklistTypeId() {
		return this.orderBlacklistTypeId;
	}
	public void setOrderBlacklistTypeId(String orderBlacklistTypeId) {
		this.orderBlacklistTypeId = orderBlacklistTypeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderBlacklistPK)) {
			return false;
		}
		OrderBlacklistPK castOther = (OrderBlacklistPK)other;
		return 
			this.blacklistString.equals(castOther.blacklistString)
			&& this.orderBlacklistTypeId.equals(castOther.orderBlacklistTypeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.blacklistString.hashCode();
		hash = hash * prime + this.orderBlacklistTypeId.hashCode();
		
		return hash;
	}
}