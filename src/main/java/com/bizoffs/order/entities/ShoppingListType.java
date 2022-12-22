package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the SHOPPING_LIST_TYPE database table.
 * 
 */
@Entity
@Table(name="SHOPPING_LIST_TYPE")
@NamedQuery(name="ShoppingListType.findAll", query="SELECT s FROM ShoppingListType s")
public class ShoppingListType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SHOPPING_LIST_TYPE_ID")
	private String shoppingListTypeId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to ShoppingList
	@OneToMany(mappedBy="shoppingListType")
	private List<ShoppingList> shoppingLists;

	public ShoppingListType() {
	}

	public String getShoppingListTypeId() {
		return this.shoppingListTypeId;
	}

	public void setShoppingListTypeId(String shoppingListTypeId) {
		this.shoppingListTypeId = shoppingListTypeId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public List<ShoppingList> getShoppingLists() {
		return this.shoppingLists;
	}

	public void setShoppingLists(List<ShoppingList> shoppingLists) {
		this.shoppingLists = shoppingLists;
	}

	public ShoppingList addShoppingList(ShoppingList shoppingList) {
		getShoppingLists().add(shoppingList);
		shoppingList.setShoppingListType(this);

		return shoppingList;
	}

	public ShoppingList removeShoppingList(ShoppingList shoppingList) {
		getShoppingLists().remove(shoppingList);
		shoppingList.setShoppingListType(null);

		return shoppingList;
	}

}