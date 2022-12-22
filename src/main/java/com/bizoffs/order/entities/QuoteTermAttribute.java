package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the QUOTE_TERM_ATTRIBUTE database table.
 * 
 */
@Entity
@Table(name="QUOTE_TERM_ATTRIBUTE")
@NamedQuery(name="QuoteTermAttribute.findAll", query="SELECT q FROM QuoteTermAttribute q")
public class QuoteTermAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QuoteTermAttributePK id;

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

	//bi-directional many-to-one association to QuoteTerm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="QUOTE_ID", referencedColumnName="QUOTE_ID"),
		@JoinColumn(name="QUOTE_ITEM_SEQ_ID", referencedColumnName="QUOTE_ITEM_SEQ_ID"),
		@JoinColumn(name="TERM_TYPE_ID", referencedColumnName="TERM_TYPE_ID")
		})
	private QuoteTerm quoteTerm;

	public QuoteTermAttribute() {
	}

	public QuoteTermAttributePK getId() {
		return this.id;
	}

	public void setId(QuoteTermAttributePK id) {
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

	public QuoteTerm getQuoteTerm() {
		return this.quoteTerm;
	}

	public void setQuoteTerm(QuoteTerm quoteTerm) {
		this.quoteTerm = quoteTerm;
	}

}