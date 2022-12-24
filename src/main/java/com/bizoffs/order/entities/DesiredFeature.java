package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the DESIRED_FEATURE database table.
 * 
 */
@Entity
@Table(name="DESIRED_FEATURE")
@NamedQuery(name="DesiredFeature.findAll", query="SELECT d FROM DesiredFeature d")
public class DesiredFeature implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DesiredFeaturePK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="OPTIONAL_IND")
	private String optionalInd;

	//bi-directional many-to-one association to ProductFeature
/*	@ManyToOne
	@JoinColumn(name="PRODUCT_FEATURE_ID")
	private ProductFeature productFeature;*/

	//bi-directional many-to-one association to Requirement
	@ManyToOne
	@JoinColumn(name="REQUIREMENT_ID", insertable=false, updatable=false)
	private Requirement requirement;

	public DesiredFeature() {
	}

	public DesiredFeaturePK getId() {
		return this.id;
	}

	public void setId(DesiredFeaturePK id) {
		this.id = id;
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

	public String getOptionalInd() {
		return this.optionalInd;
	}

	public void setOptionalInd(String optionalInd) {
		this.optionalInd = optionalInd;
	}

/*	public ProductFeature getProductFeature() {
		return this.productFeature;
	}

	public void setProductFeature(ProductFeature productFeature) {
		this.productFeature = productFeature;
	}*/

	public Requirement getRequirement() {
		return this.requirement;
	}

	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}

}