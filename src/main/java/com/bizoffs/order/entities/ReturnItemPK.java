package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the RETURN_ITEM database table.
 * 
 */
@Embeddable
public class ReturnItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="RETURN_ID", insertable=false, updatable=false)
	private String returnId;

	@Column(name="RETURN_ITEM_SEQ_ID")
	private String returnItemSeqId;

	public ReturnItemPK() {
	}
	public String getReturnId() {
		return this.returnId;
	}
	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}
	public String getReturnItemSeqId() {
		return this.returnItemSeqId;
	}
	public void setReturnItemSeqId(String returnItemSeqId) {
		this.returnItemSeqId = returnItemSeqId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReturnItemPK)) {
			return false;
		}
		ReturnItemPK castOther = (ReturnItemPK)other;
		return 
			this.returnId.equals(castOther.returnId)
			&& this.returnItemSeqId.equals(castOther.returnItemSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.returnId.hashCode();
		hash = hash * prime + this.returnItemSeqId.hashCode();
		
		return hash;
	}
}