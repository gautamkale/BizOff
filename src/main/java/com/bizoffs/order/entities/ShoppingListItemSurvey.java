package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the SHOPPING_LIST_ITEM_SURVEY database table.
 * 
 */
@Entity
@Table(name="SHOPPING_LIST_ITEM_SURVEY")
@NamedQuery(name="ShoppingListItemSurvey.findAll", query="SELECT s FROM ShoppingListItemSurvey s")
public class ShoppingListItemSurvey implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ShoppingListItemSurveyPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to ShoppingList
	@ManyToOne
	@JoinColumn(name="SHOPPING_LIST_ID", insertable=false, updatable=false)
	private ShoppingList shoppingList;

	//bi-directional many-to-one association to ShoppingListItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="SHOPPING_LIST_ID", referencedColumnName="SHOPPING_LIST_ID", insertable=false, updatable=false),
		@JoinColumn(name="SHOPPING_LIST_ITEM_SEQ_ID", referencedColumnName="SHOPPING_LIST_ITEM_SEQ_ID", insertable=false, updatable=false)
		})
	private ShoppingListItem shoppingListItem;

	//bi-directional many-to-one association to SurveyResponse
/*	@ManyToOne
	@JoinColumn(name="SURVEY_RESPONSE_ID")
	private SurveyResponse surveyResponse;*/

	public ShoppingListItemSurvey() {
	}

	public ShoppingListItemSurveyPK getId() {
		return this.id;
	}

	public void setId(ShoppingListItemSurveyPK id) {
		this.id = id;
	}

	public Timestamp getCreatedStamp() {
		return this.createdStamp;
	}

	public void setCreatedStamp(Timestamp createdStamp) {
		this.createdStamp = createdStamp;
	}

	public Timestamp getCreatedTxStamp() {
		return this.createdTxStamp;
	}

	public void setCreatedTxStamp(Timestamp createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}

	public Timestamp getLastUpdatedStamp() {
		return this.lastUpdatedStamp;
	}

	public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	public Timestamp getLastUpdatedTxStamp() {
		return this.lastUpdatedTxStamp;
	}

	public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
	}

	public ShoppingList getShoppingList() {
		return this.shoppingList;
	}

	public void setShoppingList(ShoppingList shoppingList) {
		this.shoppingList = shoppingList;
	}

	public ShoppingListItem getShoppingListItem() {
		return this.shoppingListItem;
	}

	public void setShoppingListItem(ShoppingListItem shoppingListItem) {
		this.shoppingListItem = shoppingListItem;
	}

/*	public SurveyResponse getSurveyResponse() {
		return this.surveyResponse;
	}

	public void setSurveyResponse(SurveyResponse surveyResponse) {
		this.surveyResponse = surveyResponse;
	}*/

}