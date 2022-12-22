package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the REQUIREMENT_BUDGET_ALLOCATION database table.
 * 
 */
@Entity
@Table(name="REQUIREMENT_BUDGET_ALLOCATION")
@NamedQuery(name="RequirementBudgetAllocation.findAll", query="SELECT r FROM RequirementBudgetAllocation r")
public class RequirementBudgetAllocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RequirementBudgetAllocationPK id;

	private BigDecimal amount;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to BudgetItem
/*	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="BUDGET_ID", referencedColumnName="BUDGET_ID"),
		@JoinColumn(name="BUDGET_ITEM_SEQ_ID", referencedColumnName="BUDGET_ITEM_SEQ_ID")
		})
	private BudgetItem budgetItem;*/

	//bi-directional many-to-one association to Requirement
	@ManyToOne
	@JoinColumn(name="REQUIREMENT_ID")
	private Requirement requirement;

	public RequirementBudgetAllocation() {
	}

	public RequirementBudgetAllocationPK getId() {
		return this.id;
	}

	public void setId(RequirementBudgetAllocationPK id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

/*	public BudgetItem getBudgetItem() {
		return this.budgetItem;
	}

	public void setBudgetItem(BudgetItem budgetItem) {
		this.budgetItem = budgetItem;
	}*/

	public Requirement getRequirement() {
		return this.requirement;
	}

	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}

}