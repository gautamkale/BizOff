package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ITEM_TYPE_ATTR database table.
 * 
 */
@Embeddable
public class OrderItemTypeAttrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ITEM_TYPE_ID", insertable=false, updatable=false)
	private String orderItemTypeId;

	@Column(name="ATTR_NAME")
	private String attrName;

	public OrderItemTypeAttrPK() {
	}
	public String getOrderItemTypeId() {
		return this.orderItemTypeId;
	}
	public void setOrderItemTypeId(String orderItemTypeId) {
		this.orderItemTypeId = orderItemTypeId;
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
		if (!(other instanceof OrderItemTypeAttrPK)) {
			return false;
		}
		OrderItemTypeAttrPK castOther = (OrderItemTypeAttrPK)other;
		return 
			this.orderItemTypeId.equals(castOther.orderItemTypeId)
			&& this.attrName.equals(castOther.attrName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderItemTypeId.hashCode();
		hash = hash * prime + this.attrName.hashCode();
		
		return hash;
	}
}