package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ADJUSTMENT_ATTRIBUTE database table.
 * 
 */
@Embeddable
public class OrderAdjustmentAttributePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ADJUSTMENT_ID", insertable=false, updatable=false)
	private String orderAdjustmentId;

	@Column(name="ATTR_NAME")
	private String attrName;

	public OrderAdjustmentAttributePK() {
	}
	public String getOrderAdjustmentId() {
		return this.orderAdjustmentId;
	}
	public void setOrderAdjustmentId(String orderAdjustmentId) {
		this.orderAdjustmentId = orderAdjustmentId;
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
		if (!(other instanceof OrderAdjustmentAttributePK)) {
			return false;
		}
		OrderAdjustmentAttributePK castOther = (OrderAdjustmentAttributePK)other;
		return 
			this.orderAdjustmentId.equals(castOther.orderAdjustmentId)
			&& this.attrName.equals(castOther.attrName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderAdjustmentId.hashCode();
		hash = hash * prime + this.attrName.hashCode();
		
		return hash;
	}
}