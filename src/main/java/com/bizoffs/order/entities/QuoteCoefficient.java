package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the QUOTE_COEFFICIENT database table.
 * 
 */
@Entity
@Table(name="QUOTE_COEFFICIENT")
@NamedQuery(name="QuoteCoefficient.findAll", query="SELECT q FROM QuoteCoefficient q")
public class QuoteCoefficient implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QuoteCoefficientPK id;

	@Column(name="COEFF_VALUE")
	private BigDecimal coeffValue;

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

	public QuoteCoefficient() {
	}

	public QuoteCoefficientPK getId() {
		return this.id;
	}

	public void setId(QuoteCoefficientPK id) {
		this.id = id;
	}

	public BigDecimal getCoeffValue() {
		return this.coeffValue;
	}

	public void setCoeffValue(BigDecimal coeffValue) {
		this.coeffValue = coeffValue;
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