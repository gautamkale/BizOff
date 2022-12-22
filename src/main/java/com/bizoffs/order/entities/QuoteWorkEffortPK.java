package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the QUOTE_WORK_EFFORT database table.
 * 
 */
@Embeddable
public class QuoteWorkEffortPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="QUOTE_ID", insertable=false, updatable=false)
	private String quoteId;

	@Column(name="WORK_EFFORT_ID", insertable=false, updatable=false)
	private String workEffortId;

	public QuoteWorkEffortPK() {
	}
	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getWorkEffortId() {
		return this.workEffortId;
	}
	public void setWorkEffortId(String workEffortId) {
		this.workEffortId = workEffortId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof QuoteWorkEffortPK)) {
			return false;
		}
		QuoteWorkEffortPK castOther = (QuoteWorkEffortPK)other;
		return 
			this.quoteId.equals(castOther.quoteId)
			&& this.workEffortId.equals(castOther.workEffortId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.quoteId.hashCode();
		hash = hash * prime + this.workEffortId.hashCode();
		
		return hash;
	}
}