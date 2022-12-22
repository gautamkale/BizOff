package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the ALLOCATION_PLAN_HEADER database table.
 * 
 */
@Embeddable
public class AllocationPlanHeaderPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PLAN_ID")
	private String planId;

	@Column(name="PRODUCT_ID")
	private String productId;

	public AllocationPlanHeaderPK() {
	}
	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AllocationPlanHeaderPK)) {
			return false;
		}
		AllocationPlanHeaderPK castOther = (AllocationPlanHeaderPK)other;
		return 
			this.planId.equals(castOther.planId)
			&& this.productId.equals(castOther.productId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.planId.hashCode();
		hash = hash * prime + this.productId.hashCode();
		
		return hash;
	}
}