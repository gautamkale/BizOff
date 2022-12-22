package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the QUOTE_TERM database table.
 * 
 */
@Embeddable
public class QuoteTermPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TERM_TYPE_ID", insertable=false, updatable=false)
	private String termTypeId;

	@Column(name="QUOTE_ID", insertable=false, updatable=false)
	private String quoteId;

	@Column(name="QUOTE_ITEM_SEQ_ID")
	private String quoteItemSeqId;

	public QuoteTermPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof QuoteTermPK)) {
			return false;
		}
		QuoteTermPK castOther = (QuoteTermPK)other;
		return 
			this.termTypeId.equals(castOther.termTypeId)
			&& this.quoteId.equals(castOther.quoteId)
			&& this.quoteItemSeqId.equals(castOther.quoteItemSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.termTypeId.hashCode();
		hash = hash * prime + this.quoteId.hashCode();
		hash = hash * prime + this.quoteItemSeqId.hashCode();
		
		return hash;
	}
}