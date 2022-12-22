package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the QUOTE_WORK_EFFORT database table.
 * 
 */
@Entity
@Table(name="QUOTE_WORK_EFFORT")
@NamedQuery(name="QuoteWorkEffort.findAll", query="SELECT q FROM QuoteWorkEffort q")
public class QuoteWorkEffort implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QuoteWorkEffortPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to Quote
	@ManyToOne
	@JoinColumn(name="QUOTE_ID")
	private Quote quote;

	//bi-directional many-to-one association to WorkEffort
	/*@ManyToOne
	@JoinColumn(name="WORK_EFFORT_ID")
	private WorkEffort workEffort;*/

	public QuoteWorkEffort() {
	}

	public QuoteWorkEffortPK getId() {
		return this.id;
	}

	public void setId(QuoteWorkEffortPK id) {
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

	public Quote getQuote() {
		return this.quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}

/*	public WorkEffort getWorkEffort() {
		return this.workEffort;
	}

	public void setWorkEffort(WorkEffort workEffort) {
		this.workEffort = workEffort;
	}*/

}