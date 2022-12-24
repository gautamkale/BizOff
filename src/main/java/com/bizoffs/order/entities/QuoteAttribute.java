package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the QUOTE_ATTRIBUTE database table.
 * 
 */
@Entity
@Table(name="QUOTE_ATTRIBUTE")
@NamedQuery(name="QuoteAttribute.findAll", query="SELECT q FROM QuoteAttribute q")
public class QuoteAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QuoteAttributePK id;

	@Column(name="ATTR_DESCRIPTION")
	private String attrDescription;

	@Column(name="ATTR_VALUE")
	private String attrValue;

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
	@JoinColumn(name="QUOTE_ID", insertable=false, updatable=false)
	private Quote quote;

	public QuoteAttribute() {
	}

	public QuoteAttributePK getId() {
		return this.id;
	}

	public void setId(QuoteAttributePK id) {
		this.id = id;
	}

	public String getAttrDescription() {
		return this.attrDescription;
	}

	public void setAttrDescription(String attrDescription) {
		this.attrDescription = attrDescription;
	}

	public String getAttrValue() {
		return this.attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
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

}