package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the QUOTE_TYPE_ATTR database table.
 * 
 */
@Embeddable
public class QuoteTypeAttrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="QUOTE_TYPE_ID", insertable=false, updatable=false)
	private String quoteTypeId;

	@Column(name="ATTR_NAME")
	private String attrName;

	public QuoteTypeAttrPK() {
	}
	public String getQuoteTypeId() {
		return this.quoteTypeId;
	}
	public void setQuoteTypeId(String quoteTypeId) {
		this.quoteTypeId = quoteTypeId;
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
		if (!(other instanceof QuoteTypeAttrPK)) {
			return false;
		}
		QuoteTypeAttrPK castOther = (QuoteTypeAttrPK)other;
		return 
			this.quoteTypeId.equals(castOther.quoteTypeId)
			&& this.attrName.equals(castOther.attrName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.quoteTypeId.hashCode();
		hash = hash * prime + this.attrName.hashCode();
		
		return hash;
	}
}