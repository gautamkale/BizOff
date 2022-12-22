package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the REQUIREMENT_STATUS database table.
 * 
 */
@Embeddable
public class RequirementStatusPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="REQUIREMENT_ID", insertable=false, updatable=false)
	private String requirementId;

	@Column(name="STATUS_ID", insertable=false, updatable=false)
	private String statusId;

	public RequirementStatusPK() {
	}
	public String getRequirementId() {
		return this.requirementId;
	}
	public void setRequirementId(String requirementId) {
		this.requirementId = requirementId;
	}
	public String getStatusId() {
		return this.statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RequirementStatusPK)) {
			return false;
		}
		RequirementStatusPK castOther = (RequirementStatusPK)other;
		return 
			this.requirementId.equals(castOther.requirementId)
			&& this.statusId.equals(castOther.statusId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.requirementId.hashCode();
		hash = hash * prime + this.statusId.hashCode();
		
		return hash;
	}
}