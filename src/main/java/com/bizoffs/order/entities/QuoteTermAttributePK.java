package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the QUOTE_TERM_ATTRIBUTE database table.
 * 
 */
@Embeddable
public class QuoteTermAttributePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TERM_TYPE_ID", insertable=false, updatable=false)
	private String termTypeId;

	@Column(name="QUOTE_ID", insertable=false, updatable=false)
	private String quoteId;

	@Column(name="QUOTE_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String quoteItemSeqId;

	@Column(name="ATTR_NAME")
	private String attrName;

	public QuoteTermAttributePK() {
	}
	public String getTermTypeId() {
		return this.termTypeId;
	}
	public void setTermTypeId(String termTypeId) {
		this.termTypeId = termTypeId;
	}
	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getQuoteItemSeqId() {
		return this.quoteItemSeqId;
	}
	public void setQuoteItemSeqId(String quoteItemSeqId) {
		this.quoteItemSeqId = quoteItemSeqId;
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
		if (!(other instanceof QuoteTermAttributePK)) {
			return false;
		}
		QuoteTermAttributePK castOther = (QuoteTermAttributePK)other;
		return 
			this.termTypeId.equals(castOther.termTypeId)
			&& this.quoteId.equals(castOther.quoteId)
			&& this.quoteItemSeqId.equals(castOther.quoteItemSeqId)
			&& this.attrName.equals(castOther.attrName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.termTypeId.hashCode();
		hash = hash * prime + this.quoteId.hashCode();
		hash = hash * prime + this.quoteItemSeqId.hashCode();
		hash = hash * prime + this.attrName.hashCode();
		
		return hash;
	}
}