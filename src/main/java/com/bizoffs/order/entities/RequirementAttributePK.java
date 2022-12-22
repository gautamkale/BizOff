package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the REQUIREMENT_ATTRIBUTE database table.
 * 
 */
@Embeddable
public class RequirementAttributePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="REQUIREMENT_ID", insertable=false, updatable=false)
	private String requirementId;

	@Column(name="ATTR_NAME")
	private String attrName;

	public RequirementAttributePK() {
	}
	public String getRequirementId() {
		return this.requirementId;
	}
	public void setRequirementId(String requirementId) {
		this.requirementId = requirementId;
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
		if (!(other instanceof RequirementAttributePK)) {
			return false;
		}
		RequirementAttributePK castOther = (RequirementAttributePK)other;
		return 
			this.requirementId.equals(castOther.requirementId)
			&& this.attrName.equals(castOther.attrName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.requirementId.hashCode();
		hash = hash * prime + this.attrName.hashCode();
		
		return hash;
	}
}