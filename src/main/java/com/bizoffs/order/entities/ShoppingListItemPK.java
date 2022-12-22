package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the SHOPPING_LIST_ITEM database table.
 * 
 */
@Embeddable
public class ShoppingListItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SHOPPING_LIST_ID", insertable=false, updatable=false)
	private String shoppingListId;

	@Column(name="SHOPPING_LIST_ITEM_SEQ_ID")
	private String shoppingListItemSeqId;

	public ShoppingListItemPK() {
	}
	public String getShoppingListId() {
		return this.shoppingListId;
	}
	public void setShoppingListId(String shoppingListId) {
		this.shoppingListId = shoppingListId;
	}
	public String getShoppingListItemSeqId() {
		return this.shoppingListItemSeqId;
	}
	public void setShoppingListItemSeqId(String shoppingListItemSeqId) {
		this.shoppingListItemSeqId = shoppingListItemSeqId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ShoppingListItemPK)) {
			return false;
		}
		ShoppingListItemPK castOther = (ShoppingListItemPK)other;
		return 
			this.shoppingListId.equals(castOther.shoppingListId)
			&& this.shoppingListItemSeqId.equals(castOther.shoppingListItemSeqId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.shoppingListId.hashCode();
		hash = hash * prime + this.shoppingListItemSeqId.hashCode();
		
		return hash;
	}
}