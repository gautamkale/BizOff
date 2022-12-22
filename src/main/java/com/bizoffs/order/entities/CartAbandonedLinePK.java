package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the CART_ABANDONED_LINE database table.
 * 
 */
@Embeddable
public class CartAbandonedLinePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="VISIT_ID")
	private String visitId;

	@Column(name="CART_ABANDONED_LINE_SEQ_ID")
	private String cartAbandonedLineSeqId;

	public CartAbandonedLinePK() {
	}
	public String getVisitId() {
		return this.visitId;
	}
	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}
	public String getCartAbandonedLineSeqId() {
		return this.cartAbandonedLineSeqId;
	}
	public void setCartAbandonedLineSeqId(String cartAbandonedLineSeqId) {
		this.cartAbandonedLineSeqId = cartAbandonedLineSeqId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CartAbandonedLinePK)) {
			return false;
		}
		CartAbandonedLinePK castOther = (CartAbandonedLinePK)other;
		return 
			this.visitId.equals(castOther.visitId)
			&& this.cartAbandonedLineSeqId.equals(castOther.cartAbandonedLineSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.visitId.hashCode();
		hash = hash * prime + this.cartAbandonedLineSeqId.hashCode();
		
		return hash;
	}
}