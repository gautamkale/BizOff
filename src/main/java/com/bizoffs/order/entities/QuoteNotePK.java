package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the QUOTE_NOTE database table.
 * 
 */
@Embeddable
public class QuoteNotePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="QUOTE_ID", insertable=false, updatable=false)
	private String quoteId;

	@Column(name="NOTE_ID", insertable=false, updatable=false)
	private String noteId;

	public QuoteNotePK() {
	}
	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getNoteId() {
		return this.noteId;
	}
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof QuoteNotePK)) {
			return false;
		}
		QuoteNotePK castOther = (QuoteNotePK)other;
		return 
			this.quoteId.equals(castOther.quoteId)
			&& this.noteId.equals(castOther.noteId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.quoteId.hashCode();
		hash = hash * prime + this.noteId.hashCode();
		
		return hash;
	}
}