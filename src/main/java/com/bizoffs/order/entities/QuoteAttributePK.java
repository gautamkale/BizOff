package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the QUOTE_ATTRIBUTE database table.
 * 
 */
@Embeddable
public class QuoteAttributePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="QUOTE_ID", insertable=false, updatable=false)
	private String quoteId;

	@Column(name="ATTR_NAME")
	private String attrName;

	public QuoteAttributePK() {
	}
	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof QuoteAttributePK)) {
			return false;
		}
		QuoteAttributePK castOther = (QuoteAttributePK)other;
		return 
			this.quoteId.equals(castOther.quoteId)
			&& this.attrName.equals(castOther.attrName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.quoteId.hashCode();
		hash = hash * prime + this.attrName.hashCode();
		
		return hash;
	}
}