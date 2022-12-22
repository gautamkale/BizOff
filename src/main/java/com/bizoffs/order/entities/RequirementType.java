package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the REQUIREMENT_TYPE database table.
 * 
 */
@Entity
@Table(name="REQUIREMENT_TYPE")
@NamedQuery(name="RequirementType.findAll", query="SELECT r FROM RequirementType r")
public class RequirementType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="REQUIREMENT_TYPE_ID")
	private String requirementTypeId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="HAS_TABLE")
	private String hasTable;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to Requirement
	@OneToMany(mappedBy="requirementType")
	private List<Requirement> requirements;

	//bi-directional many-to-one association to RequirementType
	@ManyToOne
	@JoinColumn(name="PARENT_TYPE_ID")
	private RequirementType requirementType;

	//bi-directional many-to-one association to RequirementType
	@OneToMany(mappedBy="requirementType")
	private List<RequirementType> requirementTypes;

	//bi-directional many-to-one association to RequirementTypeAttr
	@OneToMany(mappedBy="requirementType")
	private List<RequirementTypeAttr> requirementTypeAttrs;

	public RequirementType() {
	}

	public String getRequirementTypeId() {
		return this.requirementTypeId;
	}

	public void setRequirementTypeId(String requirementTypeId) {
		this.requirementTypeId = requirementTypeId;
	}

	public Timestamp getCreatedStamp() {
		return this.createdStamp;
	}

	public void setCreatedStamp(Timestamp createdStamp) {
		this.createdStamp = createdStamp;
	}

	public Timestamp getCreatedTxStamp() {
		return this.createdTxStamp;
	}

	public void setCreatedTxStamp(Timestamp createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHasTable() {
		return this.hasTable;
	}

	public void setHasTable(String hasTable) {
		this.hasTable = hasTable;
	}

	public Timestamp getLastUpdatedStamp() {
		return this.lastUpdatedStamp;
	}

	public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	public Timestamp getLastUpdatedTxStamp() {
		return this.lastUpdatedTxStamp;
	}

	public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
	}

	public List<Requirement> getRequirements() {
		return this.requirements;
	}

	public void setRequirements(List<Requirement> requirements) {
		this.requirements = requirements;
	}

	public Requirement addRequirement(Requirement requirement) {
		getRequirements().add(requirement);
		requirement.setRequirementType(this);

		return requirement;
	}

	public Requirement removeRequirement(Requirement requirement) {
		getRequirements().remove(requirement);
		requirement.setRequirementType(null);

		return requirement;
	}

	public RequirementType getRequirementType() {
		return this.requirementType;
	}

	public void setRequirementType(RequirementType requirementType) {
		this.requirementType = requirementType;
	}

	public List<RequirementType> getRequirementTypes() {
		return this.requirementTypes;
	}

	public void setRequirementTypes(List<RequirementType> requirementTypes) {
		this.requirementTypes = requirementTypes;
	}

	public RequirementType addRequirementType(RequirementType requirementType) {
		getRequirementTypes().add(requirementType);
		requirementType.setRequirementType(this);

		return requirementType;
	}

	public RequirementType removeRequirementType(RequirementType requirementType) {
		getRequirementTypes().remove(requirementType);
		requirementType.setRequirementType(null);

		return requirementType;
	}

	public List<RequirementTypeAttr> getRequirementTypeAttrs() {
		return this.requirementTypeAttrs;
	}

	public void setRequirementTypeAttrs(List<RequirementTypeAttr> requirementTypeAttrs) {
		this.requirementTypeAttrs = requirementTypeAttrs;
	}

	public RequirementTypeAttr addRequirementTypeAttr(RequirementTypeAttr requirementTypeAttr) {
		getRequirementTypeAttrs().add(requirementTypeAttr);
		requirementTypeAttr.setRequirementType(this);

		return requirementTypeAttr;
	}

	public RequirementTypeAttr removeRequirementTypeAttr(RequirementTypeAttr requirementTypeAttr) {
		getRequirementTypeAttrs().remove(requirementTypeAttr);
		requirementTypeAttr.setRequirementType(null);

		return requirementTypeAttr;
	}

}