package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the QUOTE_COEFFICIENT database table.
 * 
 */
@Embeddable
public class QuoteCoefficientPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="QUOTE_ID", insertable=false, updatable=false)
	private String quoteId;

	@Column(name="COEFF_NAME")
	private String coeffName;

	public QuoteCoefficientPK() {
	}
	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getCoeffName() {
		return this.coeffName;
	}
	public void setCoeffName(String coeffName) {
		this.coeffName = coeffName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof QuoteCoefficientPK)) {
			return false;
		}
		QuoteCoefficientPK castOther = (QuoteCoefficientPK)other;
		return 
			this.quoteId.equals(castOther.quoteId)
			&& this.coeffName.equals(castOther.coeffName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.quoteId.hashCode();
		hash = hash * prime + this.coeffName.hashCode();
		
		return hash;
	}
}