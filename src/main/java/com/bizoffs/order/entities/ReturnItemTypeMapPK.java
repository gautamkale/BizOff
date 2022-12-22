package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the RETURN_ITEM_TYPE_MAP database table.
 * 
 */
@Embeddable
public class ReturnItemTypeMapPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="RETURN_ITEM_MAP_KEY")
	private String returnItemMapKey;

	@Column(name="RETURN_HEADER_TYPE_ID", insertable=false, updatable=false)
	private String returnHeaderTypeId;

	public ReturnItemTypeMapPK() {
	}
	public String getReturnItemMapKey() {
		return this.returnItemMapKey;
	}
	public void setReturnItemMapKey(String returnItemMapKey) {
		this.returnItemMapKey = returnItemMapKey;
	}
	public String getReturnHeaderTypeId() {
		return this.returnHeaderTypeId;
	}
	public void setReturnHeaderTypeId(String returnHeaderTypeId) {
		this.returnHeaderTypeId = returnHeaderTypeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReturnItemTypeMapPK)) {
			return false;
		}
		ReturnItemTypeMapPK castOther = (ReturnItemTypeMapPK)other;
		return 
			this.returnItemMapKey.equals(castOther.returnItemMapKey)
			&& this.returnHeaderTypeId.equals(castOther.returnHeaderTypeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.returnItemMapKey.hashCode();
		hash = hash * prime + this.returnHeaderTypeId.hashCode();
		
		return hash;
	}
}