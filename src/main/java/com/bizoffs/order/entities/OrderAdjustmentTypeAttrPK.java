package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ADJUSTMENT_TYPE_ATTR database table.
 * 
 */
@Embeddable
public class OrderAdjustmentTypeAttrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ADJUSTMENT_TYPE_ID", insertable=false, updatable=false)
	private String orderAdjustmentTypeId;

	@Column(name="ATTR_NAME")
	private String attrName;

	public OrderAdjustmentTypeAttrPK() {
	}
	public String getOrderAdjustmentTypeId() {
		return this.orderAdjustmentTypeId;
	}
	public void setOrderAdjustmentTypeId(String orderAdjustmentTypeId) {
		this.orderAdjustmentTypeId = orderAdjustmentTypeId;
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
		if (!(other instanceof OrderAdjustmentTypeAttrPK)) {
			return false;
		}
		OrderAdjustmentTypeAttrPK castOther = (OrderAdjustmentTypeAttrPK)other;
		return 
			this.orderAdjustmentTypeId.equals(castOther.orderAdjustmentTypeId)
			&& this.attrName.equals(castOther.attrName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderAdjustmentTypeId.hashCode();
		hash = hash * prime + this.attrName.hashCode();
		
		return hash;
	}
}