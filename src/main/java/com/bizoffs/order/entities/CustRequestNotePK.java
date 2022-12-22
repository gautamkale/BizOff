package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the CUST_REQUEST_NOTE database table.
 * 
 */
@Embeddable
public class CustRequestNotePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_REQUEST_ID", insertable=false, updatable=false)
	private String custRequestId;

	@Column(name="NOTE_ID", insertable=false, updatable=false)
	private String noteId;

	public CustRequestNotePK() {
	}
	public String getCustRequestId() {
		return this.custRequestId;
	}
	public void setCustRequestId(String custRequestId) {
		this.custRequestId = custRequestId;
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
		if (!(other instanceof CustRequestNotePK)) {
			return false;
		}
		CustRequestNotePK castOther = (CustRequestNotePK)other;
		return 
			this.custRequestId.equals(castOther.custRequestId)
			&& this.noteId.equals(castOther.noteId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.custRequestId.hashCode();
		hash = hash * prime + this.noteId.hashCode();
		
		return hash;
	}
}