package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the SHOPPING_LIST_WORK_EFFORT database table.
 * 
 */
@Embeddable
public class ShoppingListWorkEffortPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SHOPPING_LIST_ID", insertable=false, updatable=false)
	private String shoppingListId;

	@Column(name="WORK_EFFORT_ID", insertable=false, updatable=false)
	private String workEffortId;

	public ShoppingListWorkEffortPK() {
	}
	public String getShoppingListId() {
		return this.shoppingListId;
	}
	public void setShoppingListId(String shoppingListId) {
		this.shoppingListId = shoppingListId;
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
		if (!(other instanceof ShoppingListWorkEffortPK)) {
			return false;
		}
		ShoppingListWorkEffortPK castOther = (ShoppingListWorkEffortPK)other;
		return 
			this.shoppingListId.equals(castOther.shoppingListId)
			&& this.workEffortId.equals(castOther.workEffortId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.shoppingListId.hashCode();
		hash = hash * prime + this.workEffortId.hashCode();
		
		return hash;
	}
}