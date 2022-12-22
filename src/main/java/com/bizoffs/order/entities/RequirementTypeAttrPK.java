package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the REQUIREMENT_TYPE_ATTR database table.
 * 
 */
@Embeddable
public class RequirementTypeAttrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="REQUIREMENT_TYPE_ID", insertable=false, updatable=false)
	private String requirementTypeId;

	@Column(name="ATTR_NAME")
	private String attrName;

	public RequirementTypeAttrPK() {
	}
	public String getRequirementTypeId() {
		return this.requirementTypeId;
	}
	public void setRequirementTypeId(String requirementTypeId) {
		this.requirementTypeId = requirementTypeId;
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
		if (!(other instanceof RequirementTypeAttrPK)) {
			return false;
		}
		RequirementTypeAttrPK castOther = (RequirementTypeAttrPK)other;
		return 
			this.requirementTypeId.equals(castOther.requirementTypeId)
			&& this.attrName.equals(castOther.attrName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.requirementTypeId.hashCode();
		hash = hash * prime + this.attrName.hashCode();
		
		return hash;
	}
}