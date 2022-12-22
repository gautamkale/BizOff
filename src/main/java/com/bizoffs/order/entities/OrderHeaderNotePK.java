package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_HEADER_NOTE database table.
 * 
 */
@Embeddable
public class OrderHeaderNotePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="NOTE_ID", insertable=false, updatable=false)
	private String noteId;

	public OrderHeaderNotePK() {
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
		if (!(other instanceof OrderHeaderNotePK)) {
			return false;
		}
		OrderHeaderNotePK castOther = (OrderHeaderNotePK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.noteId.equals(castOther.noteId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.noteId.hashCode();
		
		return hash;
	}
}