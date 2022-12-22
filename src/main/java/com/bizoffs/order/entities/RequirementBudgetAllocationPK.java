package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the REQUIREMENT_BUDGET_ALLOCATION database table.
 * 
 */
@Embeddable
public class RequirementBudgetAllocationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BUDGET_ID", insertable=false, updatable=false)
	private String budgetId;

	@Column(name="BUDGET_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String budgetItemSeqId;

	@Column(name="REQUIREMENT_ID", insertable=false, updatable=false)
	private String requirementId;

	public RequirementBudgetAllocationPK() {
	}
	public String getBudgetId() {
		return this.budgetId;
	}
	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}
	public String getBudgetItemSeqId() {
		return this.budgetItemSeqId;
	}
	public void setBudgetItemSeqId(String budgetItemSeqId) {
		this.budgetItemSeqId = budgetItemSeqId;
	}
	public String getRequirementId() {
		return this.requirementId;
	}
	public void setRequirementId(String requirementId) {
		this.requirementId = requirementId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RequirementBudgetAllocationPK)) {
			return false;
		}
		RequirementBudgetAllocationPK castOther = (RequirementBudgetAllocationPK)other;
		return 
			this.budgetId.equals(castOther.budgetId)
			&& this.budgetItemSeqId.equals(castOther.budgetItemSeqId)
			&& this.requirementId.equals(castOther.requirementId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.budgetId.hashCode();
		hash = hash * prime + this.budgetItemSeqId.hashCode();
		hash = hash * prime + this.requirementId.hashCode();
		
		return hash;
	}
}