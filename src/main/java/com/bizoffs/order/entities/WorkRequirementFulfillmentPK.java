package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the WORK_REQUIREMENT_FULFILLMENT database table.
 * 
 */
@Embeddable
public class WorkRequirementFulfillmentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="REQUIREMENT_ID", insertable=false, updatable=false)
	private String requirementId;

	@Column(name="WORK_EFFORT_ID", insertable=false, updatable=false)
	private String workEffortId;

	public WorkRequirementFulfillmentPK() {
	}
	public String getRequirementId() {
		return this.requirementId;
	}
	public void setRequirementId(String requirementId) {
		this.requirementId = requirementId;
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
		if (!(other instanceof WorkRequirementFulfillmentPK)) {
			return false;
		}
		WorkRequirementFulfillmentPK castOther = (WorkRequirementFulfillmentPK)other;
		return 
			this.requirementId.equals(castOther.requirementId)
			&& this.workEffortId.equals(castOther.workEffortId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.requirementId.hashCode();
		hash = hash * prime + this.workEffortId.hashCode();
		
		return hash;
	}
}