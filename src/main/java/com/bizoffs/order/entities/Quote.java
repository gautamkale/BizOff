package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the QUOTE database table.
 * 
 */
@Entity
@NamedQuery(name="Quote.findAll", query="SELECT q FROM Quote q")
public class Quote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="QUOTE_ID")
	private String quoteId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="ISSUE_DATE")
	private Timestamp issueDate;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="QUOTE_NAME")
	private String quoteName;

	@Column(name="VALID_FROM_DATE")
	private Timestamp validFromDate;

	@Column(name="VALID_THRU_DATE")
	private Timestamp validThruDate;

	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	public StatusItem getStatusItem() {
		return statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}

	//bi-directional many-to-one association to Enumeration
	/*@ManyToOne
	@JoinColumn(name="SALES_CHANNEL_ENUM_ID")
	private Enumeration enumeration;

	//bi-directional many-to-one association to Party
	@ManyToOne
	@JoinColumn(name="PARTY_ID")
	private Party party;

	//bi-directional many-to-one association to ProductStore
	@ManyToOne
	@JoinColumn(name="PRODUCT_STORE_ID")
	private ProductStore productStore;*/

	//bi-directional many-to-one association to QuoteType
	@ManyToOne
	@JoinColumn(name="QUOTE_TYPE_ID")
	private QuoteType quoteType;

	//bi-directional many-to-one association to StatusItem
	/*@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	//bi-directional many-to-one association to Uom
	@ManyToOne
	@JoinColumn(name="CURRENCY_UOM_ID")
	private Uom uom;
*/
	//bi-directional many-to-one association to QuoteAdjustment
	@OneToMany(mappedBy="quote")
	private List<QuoteAdjustment> quoteAdjustments;

	//bi-directional many-to-one association to QuoteAttribute
	@OneToMany(mappedBy="quote")
	private List<QuoteAttribute> quoteAttributes;

	//bi-directional many-to-one association to QuoteCoefficient
	@OneToMany(mappedBy="quote")
	private List<QuoteCoefficient> quoteCoefficients;

	//bi-directional many-to-one association to QuoteItem
	@OneToMany(mappedBy="quote")
	private List<QuoteItem> quoteItems;

	//bi-directional many-to-one association to QuoteNote
	@OneToMany(mappedBy="quote")
	private List<QuoteNote> quoteNotes;

	//bi-directional many-to-one association to QuoteRole
	@OneToMany(mappedBy="quote")
	private List<QuoteRole> quoteRoles;

	//bi-directional many-to-one association to QuoteTerm
	@OneToMany(mappedBy="quote")
	private List<QuoteTerm> quoteTerms;

	//bi-directional many-to-one association to QuoteWorkEffort
	@OneToMany(mappedBy="quote")
	private List<QuoteWorkEffort> quoteWorkEfforts;

	//bi-directional many-to-one association to SalesOpportunityQuote
	/*@OneToMany(mappedBy="quote")
	private List<SalesOpportunityQuote> salesOpportunityQuotes;
*//*
	public Quote() {
	}

	public String getQuoteId() {
		return this.quoteId;
	}

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
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

	public Timestamp getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Timestamp issueDate) {
		this.issueDate = issueDate;
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

	public String getQuoteName() {
		return this.quoteName;
	}

	public void setQuoteName(String quoteName) {
		this.quoteName = quoteName;
	}

	public Timestamp getValidFromDate() {
		return this.validFromDate;
	}

	public void setValidFromDate(Timestamp validFromDate) {
		this.validFromDate = validFromDate;
	}

	public Timestamp getValidThruDate() {
		return this.validThruDate;
	}

	public void setValidThruDate(Timestamp validThruDate) {
		this.validThruDate = validThruDate;
	}

	public Enumeration getEnumeration() {
		return this.enumeration;
	}

	public void setEnumeration(Enumeration enumeration) {
		this.enumeration = enumeration;
	}

	public Party getParty() {
		return this.party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public ProductStore getProductStore() {
		return this.productStore;
	}

	public void setProductStore(ProductStore productStore) {
		this.productStore = productStore;
	}*/

	public QuoteType getQuoteType() {
		return this.quoteType;
	}

	public void setQuoteType(QuoteType quoteType) {
		this.quoteType = quoteType;
	}

	/*public StatusItem getStatusItem() {
		return this.statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}*/

/*	public Uom getUom() {
		return this.uom;
	}

	public void setUom(Uom uom) {
		this.uom = uom;
	}*/

	public List<QuoteAdjustment> getQuoteAdjustments() {
		return this.quoteAdjustments;
	}

	public void setQuoteAdjustments(List<QuoteAdjustment> quoteAdjustments) {
		this.quoteAdjustments = quoteAdjustments;
	}

	public QuoteAdjustment addQuoteAdjustment(QuoteAdjustment quoteAdjustment) {
		getQuoteAdjustments().add(quoteAdjustment);
		quoteAdjustment.setQuote(this);

		return quoteAdjustment;
	}

	public QuoteAdjustment removeQuoteAdjustment(QuoteAdjustment quoteAdjustment) {
		getQuoteAdjustments().remove(quoteAdjustment);
		quoteAdjustment.setQuote(null);

		return quoteAdjustment;
	}

	public List<QuoteAttribute> getQuoteAttributes() {
		return this.quoteAttributes;
	}

	public void setQuoteAttributes(List<QuoteAttribute> quoteAttributes) {
		this.quoteAttributes = quoteAttributes;
	}

	public QuoteAttribute addQuoteAttribute(QuoteAttribute quoteAttribute) {
		getQuoteAttributes().add(quoteAttribute);
		quoteAttribute.setQuote(this);

		return quoteAttribute;
	}

	public QuoteAttribute removeQuoteAttribute(QuoteAttribute quoteAttribute) {
		getQuoteAttributes().remove(quoteAttribute);
		quoteAttribute.setQuote(null);

		return quoteAttribute;
	}

	public List<QuoteCoefficient> getQuoteCoefficients() {
		return this.quoteCoefficients;
	}

	public void setQuoteCoefficients(List<QuoteCoefficient> quoteCoefficients) {
		this.quoteCoefficients = quoteCoefficients;
	}

	public QuoteCoefficient addQuoteCoefficient(QuoteCoefficient quoteCoefficient) {
		getQuoteCoefficients().add(quoteCoefficient);
		quoteCoefficient.setQuote(this);

		return quoteCoefficient;
	}

	public QuoteCoefficient removeQuoteCoefficient(QuoteCoefficient quoteCoefficient) {
		getQuoteCoefficients().remove(quoteCoefficient);
		quoteCoefficient.setQuote(null);

		return quoteCoefficient;
	}

	public List<QuoteItem> getQuoteItems() {
		return this.quoteItems;
	}

	public void setQuoteItems(List<QuoteItem> quoteItems) {
		this.quoteItems = quoteItems;
	}

	public QuoteItem addQuoteItem(QuoteItem quoteItem) {
		getQuoteItems().add(quoteItem);
		quoteItem.setQuote(this);

		return quoteItem;
	}

	public QuoteItem removeQuoteItem(QuoteItem quoteItem) {
		getQuoteItems().remove(quoteItem);
		quoteItem.setQuote(null);

		return quoteItem;
	}

	public List<QuoteNote> getQuoteNotes() {
		return this.quoteNotes;
	}

	public void setQuoteNotes(List<QuoteNote> quoteNotes) {
		this.quoteNotes = quoteNotes;
	}

	public QuoteNote addQuoteNote(QuoteNote quoteNote) {
		getQuoteNotes().add(quoteNote);
		quoteNote.setQuote(this);

		return quoteNote;
	}

	public QuoteNote removeQuoteNote(QuoteNote quoteNote) {
		getQuoteNotes().remove(quoteNote);
		quoteNote.setQuote(null);

		return quoteNote;
	}

	public List<QuoteRole> getQuoteRoles() {
		return this.quoteRoles;
	}

	public void setQuoteRoles(List<QuoteRole> quoteRoles) {
		this.quoteRoles = quoteRoles;
	}

	public QuoteRole addQuoteRole(QuoteRole quoteRole) {
		getQuoteRoles().add(quoteRole);
		quoteRole.setQuote(this);

		return quoteRole;
	}

	public QuoteRole removeQuoteRole(QuoteRole quoteRole) {
		getQuoteRoles().remove(quoteRole);
		quoteRole.setQuote(null);

		return quoteRole;
	}

	public List<QuoteTerm> getQuoteTerms() {
		return this.quoteTerms;
	}

	public void setQuoteTerms(List<QuoteTerm> quoteTerms) {
		this.quoteTerms = quoteTerms;
	}

	public QuoteTerm addQuoteTerm(QuoteTerm quoteTerm) {
		getQuoteTerms().add(quoteTerm);
		quoteTerm.setQuote(this);

		return quoteTerm;
	}

	public QuoteTerm removeQuoteTerm(QuoteTerm quoteTerm) {
		getQuoteTerms().remove(quoteTerm);
		quoteTerm.setQuote(null);

		return quoteTerm;
	}

	public List<QuoteWorkEffort> getQuoteWorkEfforts() {
		return this.quoteWorkEfforts;
	}

	public void setQuoteWorkEfforts(List<QuoteWorkEffort> quoteWorkEfforts) {
		this.quoteWorkEfforts = quoteWorkEfforts;
	}

	public QuoteWorkEffort addQuoteWorkEffort(QuoteWorkEffort quoteWorkEffort) {
		getQuoteWorkEfforts().add(quoteWorkEffort);
		quoteWorkEffort.setQuote(this);

		return quoteWorkEffort;
	}

	public QuoteWorkEffort removeQuoteWorkEffort(QuoteWorkEffort quoteWorkEffort) {
		getQuoteWorkEfforts().remove(quoteWorkEffort);
		quoteWorkEffort.setQuote(null);

		return quoteWorkEffort;
	}

	/*public List<SalesOpportunityQuote> getSalesOpportunityQuotes() {
		return this.salesOpportunityQuotes;
	}

	public void setSalesOpportunityQuotes(List<SalesOpportunityQuote> salesOpportunityQuotes) {
		this.salesOpportunityQuotes = salesOpportunityQuotes;
	}

	public SalesOpportunityQuote addSalesOpportunityQuote(SalesOpportunityQuote salesOpportunityQuote) {
		getSalesOpportunityQuotes().add(salesOpportunityQuote);
		salesOpportunityQuote.setQuote(this);

		return salesOpportunityQuote;
	}

	public SalesOpportunityQuote removeSalesOpportunityQuote(SalesOpportunityQuote salesOpportunityQuote) {
		getSalesOpportunityQuotes().remove(salesOpportunityQuote);
		salesOpportunityQuote.setQuote(null);

		return salesOpportunityQuote;
	}*/

}