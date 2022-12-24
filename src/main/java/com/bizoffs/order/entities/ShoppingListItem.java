package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the SHOPPING_LIST_ITEM database table.
 * 
 */
@Entity
@Table(name="SHOPPING_LIST_ITEM")
@NamedQuery(name="ShoppingListItem.findAll", query="SELECT s FROM ShoppingListItem s")
public class ShoppingListItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ShoppingListItemPK id;

	@Column(name="CONFIG_ID")
	private String configId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="MODIFIED_PRICE")
	private BigDecimal modifiedPrice;

	private BigDecimal quantity;

	@Column(name="QUANTITY_PURCHASED")
	private BigDecimal quantityPurchased;

	@Column(name="RESERV_LENGTH")
	private BigDecimal reservLength;

	@Column(name="RESERV_PERSONS")
	private BigDecimal reservPersons;

	@Column(name="RESERV_START")
	private Timestamp reservStart;

	//bi-directional many-to-one association to Product
/*	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;*/

	//bi-directional many-to-one association to ShoppingList
	@ManyToOne
	@JoinColumn(name="SHOPPING_LIST_ID", insertable=false, updatable=false)
	private ShoppingList shoppingList;

	//bi-directional many-to-one association to ShoppingListItemSurvey
	@OneToMany(mappedBy="shoppingListItem")
	private List<ShoppingListItemSurvey> shoppingListItemSurveys;

	public ShoppingListItem() {
	}

	public ShoppingListItemPK getId() {
		return this.id;
	}

	public void setId(ShoppingListItemPK id) {
		this.id = id;
	}

	public String getConfigId() {
		return this.configId;
	}

	public void setConfigId(String configId) {
		this.configId = configId;
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

	public BigDecimal getModifiedPrice() {
		return this.modifiedPrice;
	}

	public void setModifiedPrice(BigDecimal modifiedPrice) {
		this.modifiedPrice = modifiedPrice;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getQuantityPurchased() {
		return this.quantityPurchased;
	}

	public void setQuantityPurchased(BigDecimal quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}

	public BigDecimal getReservLength() {
		return this.reservLength;
	}

	public void setReservLength(BigDecimal reservLength) {
		this.reservLength = reservLength;
	}

	public BigDecimal getReservPersons() {
		return this.reservPersons;
	}

	public void setReservPersons(BigDecimal reservPersons) {
		this.reservPersons = reservPersons;
	}

	public Timestamp getReservStart() {
		return this.reservStart;
	}

	public void setReservStart(Timestamp reservStart) {
		this.reservStart = reservStart;
	}

	/*public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}*/

	public ShoppingList getShoppingList() {
		return this.shoppingList;
	}

	public void setShoppingList(ShoppingList shoppingList) {
		this.shoppingList = shoppingList;
	}

	public List<ShoppingListItemSurvey> getShoppingListItemSurveys() {
		return this.shoppingListItemSurveys;
	}

	public void setShoppingListItemSurveys(List<ShoppingListItemSurvey> shoppingListItemSurveys) {
		this.shoppingListItemSurveys = shoppingListItemSurveys;
	}

	public ShoppingListItemSurvey addShoppingListItemSurvey(ShoppingListItemSurvey shoppingListItemSurvey) {
		getShoppingListItemSurveys().add(shoppingListItemSurvey);
		shoppingListItemSurvey.setShoppingListItem(this);

		return shoppingListItemSurvey;
	}

	public ShoppingListItemSurvey removeShoppingListItemSurvey(ShoppingListItemSurvey shoppingListItemSurvey) {
		getShoppingListItemSurveys().remove(shoppingListItemSurvey);
		shoppingListItemSurvey.setShoppingListItem(null);

		return shoppingListItemSurvey;
	}

}