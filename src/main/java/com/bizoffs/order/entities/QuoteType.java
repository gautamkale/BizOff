package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the QUOTE_TYPE database table.
 * 
 */
@Entity
@Table(name="QUOTE_TYPE")
@NamedQuery(name="QuoteType.findAll", query="SELECT q FROM QuoteType q")
public class QuoteType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="QUOTE_TYPE_ID")
	private String quoteTypeId;

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

	//bi-directional many-to-one association to PartyPrefDocTypeTpl
/*
	@OneToMany(mappedBy="quoteType")
	private List<PartyPrefDocTypeTpl> partyPrefDocTypeTpls;
*/

	//bi-directional many-to-one association to Quote
	@OneToMany(mappedBy="quoteType")
	private List<Quote> quotes;

	//bi-directional many-to-one association to QuoteType
	@ManyToOne
	@JoinColumn(name="PARENT_TYPE_ID")
	private QuoteType quoteType;

	//bi-directional many-to-one association to QuoteType
	@OneToMany(mappedBy="quoteType")
	private List<QuoteType> quoteTypes;

	//bi-directional many-to-one association to QuoteTypeAttr
	@OneToMany(mappedBy="quoteType")
	private List<QuoteTypeAttr> quoteTypeAttrs;

	public QuoteType() {
	}

	public String getQuoteTypeId() {
		return this.quoteTypeId;
	}

	public void setQuoteTypeId(String quoteTypeId) {
		this.quoteTypeId = quoteTypeId;
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

	/*public List<PartyPrefDocTypeTpl> getPartyPrefDocTypeTpls() {
		return this.partyPrefDocTypeTpls;
	}

	public void setPartyPrefDocTypeTpls(List<PartyPrefDocTypeTpl> partyPrefDocTypeTpls) {
		this.partyPrefDocTypeTpls = partyPrefDocTypeTpls;
	}

	public PartyPrefDocTypeTpl addPartyPrefDocTypeTpl(PartyPrefDocTypeTpl partyPrefDocTypeTpl) {
		getPartyPrefDocTypeTpls().add(partyPrefDocTypeTpl);
		partyPrefDocTypeTpl.setQuoteType(this);

		return partyPrefDocTypeTpl;
	}

	public PartyPrefDocTypeTpl removePartyPrefDocTypeTpl(PartyPrefDocTypeTpl partyPrefDocTypeTpl) {
		getPartyPrefDocTypeTpls().remove(partyPrefDocTypeTpl);
		partyPrefDocTypeTpl.setQuoteType(null);

		return partyPrefDocTypeTpl;
	}*/

	public List<Quote> getQuotes() {
		return this.quotes;
	}

	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}

	public Quote addQuote(Quote quote) {
		getQuotes().add(quote);
		quote.setQuoteType(this);

		return quote;
	}

	public Quote removeQuote(Quote quote) {
		getQuotes().remove(quote);
		quote.setQuoteType(null);

		return quote;
	}

	public QuoteType getQuoteType() {
		return this.quoteType;
	}

	public void setQuoteType(QuoteType quoteType) {
		this.quoteType = quoteType;
	}

	public List<QuoteType> getQuoteTypes() {
		return this.quoteTypes;
	}

	public void setQuoteTypes(List<QuoteType> quoteTypes) {
		this.quoteTypes = quoteTypes;
	}

	public QuoteType addQuoteType(QuoteType quoteType) {
		getQuoteTypes().add(quoteType);
		quoteType.setQuoteType(this);

		return quoteType;
	}

	public QuoteType removeQuoteType(QuoteType quoteType) {
		getQuoteTypes().remove(quoteType);
		quoteType.setQuoteType(null);

		return quoteType;
	}

	public List<QuoteTypeAttr> getQuoteTypeAttrs() {
		return this.quoteTypeAttrs;
	}

	public void setQuoteTypeAttrs(List<QuoteTypeAttr> quoteTypeAttrs) {
		this.quoteTypeAttrs = quoteTypeAttrs;
	}

	public QuoteTypeAttr addQuoteTypeAttr(QuoteTypeAttr quoteTypeAttr) {
		getQuoteTypeAttrs().add(quoteTypeAttr);
		quoteTypeAttr.setQuoteType(this);

		return quoteTypeAttr;
	}

	public QuoteTypeAttr removeQuoteTypeAttr(QuoteTypeAttr quoteTypeAttr) {
		getQuoteTypeAttrs().remove(quoteTypeAttr);
		quoteTypeAttr.setQuoteType(null);

		return quoteTypeAttr;
	}

}