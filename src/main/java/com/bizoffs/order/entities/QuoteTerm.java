package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the QUOTE_TERM database table.
 * 
 */
@Entity
@Table(name="QUOTE_TERM")
@NamedQuery(name="QuoteTerm.findAll", query="SELECT q FROM QuoteTerm q")
public class QuoteTerm implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QuoteTermPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="TERM_DAYS")
	private BigDecimal termDays;

	@Column(name="TERM_VALUE")
	private BigDecimal termValue;

	@Column(name="TEXT_VALUE")
	private String textValue;

	@Column(name="UOM_ID")
	private String uomId;

	//bi-directional many-to-one association to Quote
	@ManyToOne
	@JoinColumn(name="QUOTE_ID")
	private Quote quote;

	//bi-directional many-to-one association to TermType
	/*@ManyToOne
	@JoinColumn(name="TERM_TYPE_ID")
	private TermType termType;
*/
	//bi-directional many-to-one association to QuoteTermAttribute
	@OneToMany(mappedBy="quoteTerm")
	private List<QuoteTermAttribute> quoteTermAttributes;

	public QuoteTerm() {
	}

	public QuoteTermPK getId() {
		return this.id;
	}

	public void setId(QuoteTermPK id) {
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

	public BigDecimal getTermDays() {
		return this.termDays;
	}

	public void setTermDays(BigDecimal termDays) {
		this.termDays = termDays;
	}

	public BigDecimal getTermValue() {
		return this.termValue;
	}

	public void setTermValue(BigDecimal termValue) {
		this.termValue = termValue;
	}

	public String getTextValue() {
		return this.textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}

	public String getUomId() {
		return this.uomId;
	}

	public void setUomId(String uomId) {
		this.uomId = uomId;
	}

	public Quote getQuote() {
		return this.quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}

	/*public TermType getTermType() {
		return this.termType;
	}

	public void setTermType(TermType termType) {
		this.termType = termType;
	}*/

	public List<QuoteTermAttribute> getQuoteTermAttributes() {
		return this.quoteTermAttributes;
	}

	public void setQuoteTermAttributes(List<QuoteTermAttribute> quoteTermAttributes) {
		this.quoteTermAttributes = quoteTermAttributes;
	}

	public QuoteTermAttribute addQuoteTermAttribute(QuoteTermAttribute quoteTermAttribute) {
		getQuoteTermAttributes().add(quoteTermAttribute);
		quoteTermAttribute.setQuoteTerm(this);

		return quoteTermAttribute;
	}

	public QuoteTermAttribute removeQuoteTermAttribute(QuoteTermAttribute quoteTermAttribute) {
		getQuoteTermAttributes().remove(quoteTermAttribute);
		quoteTermAttribute.setQuoteTerm(null);

		return quoteTermAttribute;
	}

}