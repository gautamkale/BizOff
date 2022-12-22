package com.bizoffs.order.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * The primary key class for the SHOPPING_LIST_ITEM_SURVEY database table.
 * 
 */
@Embeddable
public class ShoppingListItemSurveyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SHOPPING_LIST_ID", insertable=false, updatable=false)
	private String shoppingListId;

	@Column(name="SHOPPING_LIST_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String shoppingListItemSeqId;

	@Column(name="SURVEY_RESPONSE_ID", insertable=false, updatable=false)
	private String surveyResponseId;

	public ShoppingListItemSurveyPK() {
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
	public String getSurveyResponseId() {
		return this.surveyResponseId;
	}
	public void setSurveyResponseId(String surveyResponseId) {
		this.surveyResponseId = surveyResponseId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ShoppingListItemSurveyPK)) {
			return false;
		}
		ShoppingListItemSurveyPK castOther = (ShoppingListItemSurveyPK)other;
		return 
			this.shoppingListId.equals(castOther.shoppingListId)
			&& this.shoppingListItemSeqId.equals(castOther.shoppingListItemSeqId)
			&& this.surveyResponseId.equals(castOther.surveyResponseId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.shoppingListId.hashCode();
		hash = hash * prime + this.shoppingListItemSeqId.hashCode();
		hash = hash * prime + this.surveyResponseId.hashCode();
		
		return hash;
	}
}