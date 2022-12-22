package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the SHOPPING_LIST database table.
 * 
 */
@Entity
@Table(name="SHOPPING_LIST")
@NamedQuery(name="ShoppingList.findAll", query="SELECT s FROM ShoppingList s")
public class ShoppingList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SHOPPING_LIST_ID")
	private String shoppingListId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="CURRENCY_UOM")
	private String currencyUom;

	private String description;

	@Column(name="IS_ACTIVE")
	private String isActive;

	@Column(name="IS_PUBLIC")
	private String isPublic;

	@Column(name="LAST_ADMIN_MODIFIED")
	private Timestamp lastAdminModified;

	@Column(name="LAST_ORDERED_DATE")
	private Timestamp lastOrderedDate;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="LIST_NAME")
	private String listName;

	@Column(name="VISITOR_ID")
	private String visitorId;

	//bi-directional many-to-one association to OrderHeader
	@OneToMany(mappedBy="shoppingList")
	private List<OrderHeader> orderHeaders;

	//bi-directional many-to-one association to CarrierShipmentMethod
	/*@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CARRIER_PARTY_ID", referencedColumnName="PARTY_ID"),
		@JoinColumn(name="CARRIER_ROLE_TYPE_ID", referencedColumnName="ROLE_TYPE_ID"),
		@JoinColumn(name="SHIPMENT_METHOD_TYPE_ID", referencedColumnName="SHIPMENT_METHOD_TYPE_ID")
		})
	private CarrierShipmentMethod carrierShipmentMethod;

	//bi-directional many-to-one association to ContactMech
	@ManyToOne
	@JoinColumn(name="CONTACT_MECH_ID")
	private ContactMech contactMech;

	//bi-directional many-to-one association to Party
	@ManyToOne
	@JoinColumn(name="PARTY_ID")
	private Party party;

	//bi-directional many-to-one association to PaymentMethod
	@ManyToOne
	@JoinColumn(name="PAYMENT_METHOD_ID")
	private PaymentMethod paymentMethod;

	//bi-directional many-to-one association to ProductPromoCode
	@ManyToOne
	@JoinColumn(name="PRODUCT_PROMO_CODE_ID")
	private ProductPromoCode productPromoCode;

	//bi-directional many-to-one association to ProductStore
	@ManyToOne
	@JoinColumn(name="PRODUCT_STORE_ID")
	private ProductStore productStore;

	//bi-directional many-to-one association to RecurrenceInfo
	@ManyToOne
	@JoinColumn(name="RECURRENCE_INFO_ID")
	private RecurrenceInfo recurrenceInfo;*/

	//bi-directional many-to-one association to ShoppingList
	@ManyToOne
	@JoinColumn(name="PARENT_SHOPPING_LIST_ID")
	private ShoppingList shoppingList;

	//bi-directional many-to-one association to ShoppingList
	@OneToMany(mappedBy="shoppingList")
	private List<ShoppingList> shoppingLists;

	//bi-directional many-to-one association to ShoppingListType
	@ManyToOne
	@JoinColumn(name="SHOPPING_LIST_TYPE_ID")
	private ShoppingListType shoppingListType;

	//bi-directional many-to-one association to ShoppingListItem
	@OneToMany(mappedBy="shoppingList")
	private List<ShoppingListItem> shoppingListItems;

	//bi-directional many-to-one association to ShoppingListItemSurvey
	@OneToMany(mappedBy="shoppingList")
	private List<ShoppingListItemSurvey> shoppingListItemSurveys;

	//bi-directional many-to-one association to ShoppingListWorkEffort
	@OneToMany(mappedBy="shoppingList")
	private List<ShoppingListWorkEffort> shoppingListWorkEfforts;

	public ShoppingList() {
	}

	public String getShoppingListId() {
		return this.shoppingListId;
	}

	public void setShoppingListId(String shoppingListId) {
		this.shoppingListId = shoppingListId;
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

	public String getCurrencyUom() {
		return this.currencyUom;
	}

	public void setCurrencyUom(String currencyUom) {
		this.currencyUom = currencyUom;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	public Timestamp getLastAdminModified() {
		return this.lastAdminModified;
	}

	public void setLastAdminModified(Timestamp lastAdminModified) {
		this.lastAdminModified = lastAdminModified;
	}

	public Timestamp getLastOrderedDate() {
		return this.lastOrderedDate;
	}

	public void setLastOrderedDate(Timestamp lastOrderedDate) {
		this.lastOrderedDate = lastOrderedDate;
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

	public String getListName() {
		return this.listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public String getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

	public List<OrderHeader> getOrderHeaders() {
		return this.orderHeaders;
	}

	public void setOrderHeaders(List<OrderHeader> orderHeaders) {
		this.orderHeaders = orderHeaders;
	}

	public OrderHeader addOrderHeader(OrderHeader orderHeader) {
		getOrderHeaders().add(orderHeader);
		orderHeader.setShoppingList(this);

		return orderHeader;
	}

	public OrderHeader removeOrderHeader(OrderHeader orderHeader) {
		getOrderHeaders().remove(orderHeader);
		orderHeader.setShoppingList(null);

		return orderHeader;
	}

	/*public CarrierShipmentMethod getCarrierShipmentMethod() {
		return this.carrierShipmentMethod;
	}

	public void setCarrierShipmentMethod(CarrierShipmentMethod carrierShipmentMethod) {
		this.carrierShipmentMethod = carrierShipmentMethod;
	}

	public ContactMech getContactMech() {
		return this.contactMech;
	}

	public void setContactMech(ContactMech contactMech) {
		this.contactMech = contactMech;
	}

	public Party getParty() {
		return this.party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public PaymentMethod getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public ProductPromoCode getProductPromoCode() {
		return this.productPromoCode;
	}

	public void setProductPromoCode(ProductPromoCode productPromoCode) {
		this.productPromoCode = productPromoCode;
	}

	public ProductStore getProductStore() {
		return this.productStore;
	}

	public void setProductStore(ProductStore productStore) {
		this.productStore = productStore;
	}

	public RecurrenceInfo getRecurrenceInfo() {
		return this.recurrenceInfo;
	}

	public void setRecurrenceInfo(RecurrenceInfo recurrenceInfo) {
		this.recurrenceInfo = recurrenceInfo;
	}*/

	public ShoppingList getShoppingList() {
		return this.shoppingList;
	}

	public void setShoppingList(ShoppingList shoppingList) {
		this.shoppingList = shoppingList;
	}

	public List<ShoppingList> getShoppingLists() {
		return this.shoppingLists;
	}

	public void setShoppingLists(List<ShoppingList> shoppingLists) {
		this.shoppingLists = shoppingLists;
	}

	public ShoppingList addShoppingList(ShoppingList shoppingList) {
		getShoppingLists().add(shoppingList);
		shoppingList.setShoppingList(this);

		return shoppingList;
	}

	public ShoppingList removeShoppingList(ShoppingList shoppingList) {
		getShoppingLists().remove(shoppingList);
		shoppingList.setShoppingList(null);

		return shoppingList;
	}

	public ShoppingListType getShoppingListType() {
		return this.shoppingListType;
	}

	public void setShoppingListType(ShoppingListType shoppingListType) {
		this.shoppingListType = shoppingListType;
	}

	public List<ShoppingListItem> getShoppingListItems() {
		return this.shoppingListItems;
	}

	public void setShoppingListItems(List<ShoppingListItem> shoppingListItems) {
		this.shoppingListItems = shoppingListItems;
	}

	public ShoppingListItem addShoppingListItem(ShoppingListItem shoppingListItem) {
		getShoppingListItems().add(shoppingListItem);
		shoppingListItem.setShoppingList(this);

		return shoppingListItem;
	}

	public ShoppingListItem removeShoppingListItem(ShoppingListItem shoppingListItem) {
		getShoppingListItems().remove(shoppingListItem);
		shoppingListItem.setShoppingList(null);

		return shoppingListItem;
	}

	public List<ShoppingListItemSurvey> getShoppingListItemSurveys() {
		return this.shoppingListItemSurveys;
	}

	public void setShoppingListItemSurveys(List<ShoppingListItemSurvey> shoppingListItemSurveys) {
		this.shoppingListItemSurveys = shoppingListItemSurveys;
	}

	public ShoppingListItemSurvey addShoppingListItemSurvey(ShoppingListItemSurvey shoppingListItemSurvey) {
		getShoppingListItemSurveys().add(shoppingListItemSurvey);
		shoppingListItemSurvey.setShoppingList(this);

		return shoppingListItemSurvey;
	}

	public ShoppingListItemSurvey removeShoppingListItemSurvey(ShoppingListItemSurvey shoppingListItemSurvey) {
		getShoppingListItemSurveys().remove(shoppingListItemSurvey);
		shoppingListItemSurvey.setShoppingList(null);

		return shoppingListItemSurvey;
	}

	public List<ShoppingListWorkEffort> getShoppingListWorkEfforts() {
		return this.shoppingListWorkEfforts;
	}

	public void setShoppingListWorkEfforts(List<ShoppingListWorkEffort> shoppingListWorkEfforts) {
		this.shoppingListWorkEfforts = shoppingListWorkEfforts;
	}

	public ShoppingListWorkEffort addShoppingListWorkEffort(ShoppingListWorkEffort shoppingListWorkEffort) {
		getShoppingListWorkEfforts().add(shoppingListWorkEffort);
		shoppingListWorkEffort.setShoppingList(this);

		return shoppingListWorkEffort;
	}

	public ShoppingListWorkEffort removeShoppingListWorkEffort(ShoppingListWorkEffort shoppingListWorkEffort) {
		getShoppingListWorkEfforts().remove(shoppingListWorkEffort);
		shoppingListWorkEffort.setShoppingList(null);

		return shoppingListWorkEffort;
	}

}