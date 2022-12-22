package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the QUOTE_TYPE_ATTR database table.
 * 
 */
@Entity
@Table(name="QUOTE_TYPE_ATTR")
@NamedQuery(name="QuoteTypeAttr.findAll", query="SELECT q FROM QuoteTypeAttr q")
public class QuoteTypeAttr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QuoteTypeAttrPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to QuoteType
	@ManyToOne
	@JoinColumn(name="QUOTE_TYPE_ID1")
	private QuoteType quoteType;

	public QuoteTypeAttr() {
	}

	public QuoteTypeAttrPK getId() {
		return this.id;
	}

	public void setId(QuoteTypeAttrPK id) {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public QuoteType getQuoteType() {
		return this.quoteType;
	}

	public void setQuoteType(QuoteType quoteType) {
		this.quoteType = quoteType;
	}

}