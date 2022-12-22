package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_TYPE_ATTR database table.
 * 
 */
@Embeddable
public class OrderTypeAttrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_TYPE_ID", insertable=false, updatable=false)
	private String orderTypeId;

	@Column(name="ATTR_NAME")
	private String attrName;

	public OrderTypeAttrPK() {
	}
	public String getOrderTypeId() {
		return this.orderTypeId;
	}
	public void setOrderTypeId(String orderTypeId) {
		this.orderTypeId = orderTypeId;
	}
	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderTypeAttrPK)) {
			return false;
		}
		OrderTypeAttrPK castOther = (OrderTypeAttrPK)other;
		return 
			this.orderTypeId.equals(castOther.orderTypeId)
			&& this.attrName.equals(castOther.attrName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderTypeId.hashCode();
		hash = hash * prime + this.attrName.hashCode();
		
		return hash;
	}
}