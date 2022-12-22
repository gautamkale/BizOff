package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the DESIRED_FEATURE database table.
 * 
 */
@Embeddable
public class DesiredFeaturePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="DESIRED_FEATURE_ID")
	private String desiredFeatureId;

	@Column(name="REQUIREMENT_ID", insertable=false, updatable=false)
	private String requirementId;

	public DesiredFeaturePK() {
	}
	public String getDesiredFeatureId() {
		return this.desiredFeatureId;
	}
	public void setDesiredFeatureId(String desiredFeatureId) {
		this.desiredFeatureId = desiredFeatureId;
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
		if (!(other instanceof DesiredFeaturePK)) {
			return false;
		}
		DesiredFeaturePK castOther = (DesiredFeaturePK)other;
		return 
			this.desiredFeatureId.equals(castOther.desiredFeatureId)
			&& this.requirementId.equals(castOther.requirementId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.desiredFeatureId.hashCode();
		hash = hash * prime + this.requirementId.hashCode();
		
		return hash;
	}
}