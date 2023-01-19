package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_ITEM database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM")
@NamedQuery(name="OrderItem.findAll", query="SELECT o FROM OrderItem o")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPK id;

	@Column(name="AUTO_CANCEL_DATE")
	private Timestamp autoCancelDate;

	@Column(name="BUDGET_ID")
	private String budgetId;

	@Column(name="BUDGET_ITEM_SEQ_ID")
	private String budgetItemSeqId;

	@Column(name="CANCEL_BACK_ORDER_DATE")
	private Timestamp cancelBackOrderDate;

	@Column(name="CANCEL_QUANTITY")
	private BigDecimal cancelQuantity;

	private String comments;

	@Column(name="CORRESPONDING_PO_ID")
	private String correspondingPoId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="DEPLOYMENT_ID")
	private String deploymentId;

	@Column(name="DONT_CANCEL_SET_DATE")
	private Timestamp dontCancelSetDate;

	@Column(name="ESTIMATED_DELIVERY_DATE")
	private Timestamp estimatedDeliveryDate;

	@Column(name="ESTIMATED_SHIP_DATE")
	private Timestamp estimatedShipDate;

	@Column(name="EXTERNAL_ID")
	private String externalId;

	@Column(name="IS_ITEM_GROUP_PRIMARY")
	private String isItemGroupPrimary;

	@Column(name="IS_MODIFIED_PRICE")
	private String isModifiedPrice;

	@Column(name="IS_PROMO")
	private String isPromo;

	@Column(name="ITEM_DESCRIPTION")
	private String itemDescription;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="PROD_CATALOG_ID")
	private String prodCatalogId;

	@Column(name="PRODUCT_CATEGORY_ID")
	private String productCategoryId;

	@Column(name="PRODUCT_FEATURE_ID")
	private String productFeatureId;

	private BigDecimal quantity;

	@Column(name="RESERVE_AFTER_DATE")
	private Timestamp reserveAfterDate;

	@Column(name="SELECTED_AMOUNT")
	private BigDecimal selectedAmount;

	@Column(name="SHIP_AFTER_DATE")
	private Timestamp shipAfterDate;

	@Column(name="SHIP_BEFORE_DATE")
	private Timestamp shipBeforeDate;

	@Column(name="SHOPPING_LIST_ID")
	private String shoppingListId;

	@Column(name="SHOPPING_LIST_ITEM_SEQ_ID")
	private String shoppingListItemSeqId;

	@Column(name="SUBSCRIPTION_ID")
	private String subscriptionId;

	@Column(name="SUPPLIER_PRODUCT_ID")
	private String supplierProductId;

	@Column(name="UNIT_AVERAGE_COST")
	private BigDecimal unitAverageCost;

	@Column(name="UNIT_LIST_PRICE")
	private BigDecimal unitListPrice;

	@Column(name="UNIT_PRICE")
	private BigDecimal unitPrice;

	@Column(name="UNIT_RECURRING_PRICE")
	private BigDecimal unitRecurringPrice;

	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	public StatusItem getStatusItem() {
		return statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}
	@ManyToOne
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader;

	@Column(name="PRODUCT_ID")
	private String productId;
	//bi-directional many-to-one association to OrderItemGroup
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID", insertable=false, updatable=false),
		@JoinColumn(name="ORDER_ITEM_GROUP_SEQ_ID", referencedColumnName="ORDER_ITEM_GROUP_SEQ_ID", insertable=false, updatable=false)
		})
	private OrderItemGroup orderItemGroup;

	//bi-directional many-to-one association to OrderItemType
	@ManyToOne
	@JoinColumn(name="ORDER_ITEM_TYPE_ID")
	private OrderItemType orderItemType;

	//bi-directional many-to-one association to Product
	/*@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;
*/
	//bi-directional many-to-one association to QuoteItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="QUOTE_ID", referencedColumnName="QUOTE_ID"),
		@JoinColumn(name="QUOTE_ITEM_SEQ_ID", referencedColumnName="QUOTE_ITEM_SEQ_ID")
		})
	private QuoteItem quoteItem;

	@OneToMany(mappedBy="orderItem")
	private List<OrderItemAttribute> orderItemAttributes;

	//bi-directional many-to-one association to OrderItemBilling
	@OneToMany(mappedBy="orderItem")
	private List<OrderItemBilling> orderItemBillings;

	//bi-directional many-to-one association to OrderItemChange
	@OneToMany(mappedBy="orderItem")
	private List<OrderItemChange> orderItemChanges;

	//bi-directional many-to-one association to OrderItemContactMech
	@OneToMany(mappedBy="orderItem")
	private List<OrderItemContactMech> orderItemContactMeches;

	//bi-directional many-to-one association to OrderItemGroupOrder
	@OneToMany(mappedBy="orderItem")
	private List<OrderItemGroupOrder> orderItemGroupOrders;

	//bi-directional many-to-one association to OrderItemPriceInfo
	@OneToMany(mappedBy="orderItem")
	private List<OrderItemPriceInfo> orderItemPriceInfos;

	//bi-directional many-to-one association to OrderItemRole
	@OneToMany(mappedBy="orderItem")
	private List<OrderItemRole> orderItemRoles;

	//bi-directional many-to-one association to OrderItemShipGroupAssoc
	@OneToMany(mappedBy="orderItem")
	private List<OrderItemShipGroupAssoc> orderItemShipGroupAssocs;

	//bi-directional many-to-one association to OrderItemShipGrpInvRe
	@OneToMany(mappedBy="orderItem")
	private List<OrderItemShipGrpInvRe> orderItemShipGrpInvRes;

	//bi-directional many-to-one association to OrderRequirementCommitment
	@OneToMany(mappedBy="orderItem")
	private List<OrderRequirementCommitment> orderRequirementCommitments;

	//bi-directional many-to-one association to ProductOrderItem
	@OneToMany(mappedBy="orderItem1")
	private List<ProductOrderItem> productOrderItems1;

	//bi-directional many-to-one association to ProductOrderItem

	//bi-directional many-to-one association to ReturnItem
	@OneToMany(mappedBy="orderItem")
	private List<ReturnItem> returnItems;

	//bi-directional many-to-one association to ShipmentReceipt
	/*@OneToMany(mappedBy="orderItem")
	private List<ShipmentReceipt> shipmentReceipts;

	//bi-directional many-to-one association to Subscription
	@OneToMany(mappedBy="orderItem")
	private List<Subscription> subscriptions;*/

	//bi-directional many-to-one association to WorkOrderItemFulfillment
	@OneToMany(mappedBy="orderItem")
	private List<WorkOrderItemFulfillment> workOrderItemFulfillments;

	public OrderItem() {
	}

	public OrderItemPK getId() {
		return this.id;
	}

	public void setId(OrderItemPK id) {
		this.id = id;
	}

	public Timestamp getAutoCancelDate() {
		return this.autoCancelDate;
	}

	public void setAutoCancelDate(Timestamp autoCancelDate) {
		this.autoCancelDate = autoCancelDate;
	}

	public String getBudgetId() {
		return this.budgetId;
	}

	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}

	public String getBudgetItemSeqId() {
		return this.budgetItemSeqId;
	}

	public void setBudgetItemSeqId(String budgetItemSeqId) {
		this.budgetItemSeqId = budgetItemSeqId;
	}

	public Timestamp getCancelBackOrderDate() {
		return this.cancelBackOrderDate;
	}

	public void setCancelBackOrderDate(Timestamp cancelBackOrderDate) {
		this.cancelBackOrderDate = cancelBackOrderDate;
	}

	public BigDecimal getCancelQuantity() {
		return this.cancelQuantity;
	}

	public void setCancelQuantity(BigDecimal cancelQuantity) {
		this.cancelQuantity = cancelQuantity;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCorrespondingPoId() {
		return this.correspondingPoId;
	}

	public void setCorrespondingPoId(String correspondingPoId) {
		this.correspondingPoId = correspondingPoId;
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

	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public Timestamp getDontCancelSetDate() {
		return this.dontCancelSetDate;
	}

	public void setDontCancelSetDate(Timestamp dontCancelSetDate) {
		this.dontCancelSetDate = dontCancelSetDate;
	}

	public Timestamp getEstimatedDeliveryDate() {
		return this.estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Timestamp estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public Timestamp getEstimatedShipDate() {
		return this.estimatedShipDate;
	}

	public void setEstimatedShipDate(Timestamp estimatedShipDate) {
		this.estimatedShipDate = estimatedShipDate;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getIsItemGroupPrimary() {
		return this.isItemGroupPrimary;
	}

	public void setIsItemGroupPrimary(String isItemGroupPrimary) {
		this.isItemGroupPrimary = isItemGroupPrimary;
	}

	public String getIsModifiedPrice() {
		return this.isModifiedPrice;
	}

	public void setIsModifiedPrice(String isModifiedPrice) {
		this.isModifiedPrice = isModifiedPrice;
	}

	public String getIsPromo() {
		return this.isPromo;
	}

	public void setIsPromo(String isPromo) {
		this.isPromo = isPromo;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
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

	public String getProdCatalogId() {
		return this.prodCatalogId;
	}

	public void setProdCatalogId(String prodCatalogId) {
		this.prodCatalogId = prodCatalogId;
	}

	public String getProductCategoryId() {
		return this.productCategoryId;
	}

	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductFeatureId() {
		return this.productFeatureId;
	}

	public void setProductFeatureId(String productFeatureId) {
		this.productFeatureId = productFeatureId;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Timestamp getReserveAfterDate() {
		return this.reserveAfterDate;
	}

	public void setReserveAfterDate(Timestamp reserveAfterDate) {
		this.reserveAfterDate = reserveAfterDate;
	}

	public BigDecimal getSelectedAmount() {
		return this.selectedAmount;
	}

	public void setSelectedAmount(BigDecimal selectedAmount) {
		this.selectedAmount = selectedAmount;
	}

	public Timestamp getShipAfterDate() {
		return this.shipAfterDate;
	}

	public void setShipAfterDate(Timestamp shipAfterDate) {
		this.shipAfterDate = shipAfterDate;
	}

	public Timestamp getShipBeforeDate() {
		return this.shipBeforeDate;
	}

	public void setShipBeforeDate(Timestamp shipBeforeDate) {
		this.shipBeforeDate = shipBeforeDate;
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

	public String getSubscriptionId() {
		return this.subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSupplierProductId() {
		return this.supplierProductId;
	}

	public void setSupplierProductId(String supplierProductId) {
		this.supplierProductId = supplierProductId;
	}

	public BigDecimal getUnitAverageCost() {
		return this.unitAverageCost;
	}

	public void setUnitAverageCost(BigDecimal unitAverageCost) {
		this.unitAverageCost = unitAverageCost;
	}

	public BigDecimal getUnitListPrice() {
		return this.unitListPrice;
	}

	public void setUnitListPrice(BigDecimal unitListPrice) {
		this.unitListPrice = unitListPrice;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getUnitRecurringPrice() {
		return this.unitRecurringPrice;
	}

	public void setUnitRecurringPrice(BigDecimal unitRecurringPrice) {
		this.unitRecurringPrice = unitRecurringPrice;
	}

/*	public List<AllocationPlanItem> getAllocationPlanItems() {
		return this.allocationPlanItems;
	}

	public void setAllocationPlanItems(List<AllocationPlanItem> allocationPlanItems) {
		this.allocationPlanItems = allocationPlanItems;
	}

	public AllocationPlanItem addAllocationPlanItem(AllocationPlanItem allocationPlanItem) {
		getAllocationPlanItems().add(allocationPlanItem);
		allocationPlanItem.setOrderItem(this);

		return allocationPlanItem;
	}

	public AllocationPlanItem removeAllocationPlanItem(AllocationPlanItem allocationPlanItem) {
		getAllocationPlanItems().remove(allocationPlanItem);
		allocationPlanItem.setOrderItem(null);

		return allocationPlanItem;
	}

	public List<FinAccountTran> getFinAccountTrans() {
		return this.finAccountTrans;
	}

	public void setFinAccountTrans(List<FinAccountTran> finAccountTrans) {
		this.finAccountTrans = finAccountTrans;
	}

	public FinAccountTran addFinAccountTran(FinAccountTran finAccountTran) {
		getFinAccountTrans().add(finAccountTran);
		finAccountTran.setOrderItem(this);

		return finAccountTran;
	}

	public FinAccountTran removeFinAccountTran(FinAccountTran finAccountTran) {
		getFinAccountTrans().remove(finAccountTran);
		finAccountTran.setOrderItem(null);

		return finAccountTran;
	}

	public List<FixedAsset> getFixedAssets() {
		return this.fixedAssets;
	}

	public void setFixedAssets(List<FixedAsset> fixedAssets) {
		this.fixedAssets = fixedAssets;
	}

	public FixedAsset addFixedAsset(FixedAsset fixedAsset) {
		getFixedAssets().add(fixedAsset);
		fixedAsset.setOrderItem(this);

		return fixedAsset;
	}

	public FixedAsset removeFixedAsset(FixedAsset fixedAsset) {
		getFixedAssets().remove(fixedAsset);
		fixedAsset.setOrderItem(null);

		return fixedAsset;
	}

	public List<GiftCardFulfillment> getGiftCardFulfillments() {
		return this.giftCardFulfillments;
	}

	public void setGiftCardFulfillments(List<GiftCardFulfillment> giftCardFulfillments) {
		this.giftCardFulfillments = giftCardFulfillments;
	}

	public GiftCardFulfillment addGiftCardFulfillment(GiftCardFulfillment giftCardFulfillment) {
		getGiftCardFulfillments().add(giftCardFulfillment);
		giftCardFulfillment.setOrderItem(this);

		return giftCardFulfillment;
	}

	public GiftCardFulfillment removeGiftCardFulfillment(GiftCardFulfillment giftCardFulfillment) {
		getGiftCardFulfillments().remove(giftCardFulfillment);
		giftCardFulfillment.setOrderItem(null);

		return giftCardFulfillment;
	}

	public List<ItemIssuance> getItemIssuances() {
		return this.itemIssuances;
	}

	public void setItemIssuances(List<ItemIssuance> itemIssuances) {
		this.itemIssuances = itemIssuances;
	}

	public ItemIssuance addItemIssuance(ItemIssuance itemIssuance) {
		getItemIssuances().add(itemIssuance);
		itemIssuance.setOrderItem(this);

		return itemIssuance;
	}

	public ItemIssuance removeItemIssuance(ItemIssuance itemIssuance) {
		getItemIssuances().remove(itemIssuance);
		itemIssuance.setOrderItem(null);

		return itemIssuance;
	}

	public GlAccount getGlAccount() {
		return this.glAccount;
	}

	public void setGlAccount(GlAccount glAccount) {
		this.glAccount = glAccount;
	}

	public InventoryItem getInventoryItem() {
		return this.inventoryItem;
	}

	public void setInventoryItem(InventoryItem inventoryItem) {
		this.inventoryItem = inventoryItem;
	}*/

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public OrderItemGroup getOrderItemGroup() {
		return this.orderItemGroup;
	}

	public void setOrderItemGroup(OrderItemGroup orderItemGroup) {
		this.orderItemGroup = orderItemGroup;
	}

	public OrderItemType getOrderItemType() {
		return this.orderItemType;
	}

	public void setOrderItemType(OrderItemType orderItemType) {
		this.orderItemType = orderItemType;
	}

	/*public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}*/

	public QuoteItem getQuoteItem() {
		return this.quoteItem;
	}

	public void setQuoteItem(QuoteItem quoteItem) {
		this.quoteItem = quoteItem;
	}

	/*public SalesOpportunity getSalesOpportunity() {
		return this.salesOpportunity;
	}

	public void setSalesOpportunity(SalesOpportunity salesOpportunity) {
		this.salesOpportunity = salesOpportunity;
	}

	public StatusItem getStatusItem1() {
		return this.statusItem1;
	}

	public void setStatusItem1(StatusItem statusItem1) {
		this.statusItem1 = statusItem1;
	}

	public StatusItem getStatusItem2() {
		return this.statusItem2;
	}

	public void setStatusItem2(StatusItem statusItem2) {
		this.statusItem2 = statusItem2;
	}

	public Uom getUom() {
		return this.uom;
	}

	public void setUom(Uom uom) {
		this.uom = uom;
	}

	public UserLogin getUserLogin1() {
		return this.userLogin1;
	}

	public void setUserLogin1(UserLogin userLogin1) {
		this.userLogin1 = userLogin1;
	}

	public UserLogin getUserLogin2() {
		return this.userLogin2;
	}

	public void setUserLogin2(UserLogin userLogin2) {
		this.userLogin2 = userLogin2;
	}*/

	public List<OrderItemAttribute> getOrderItemAttributes() {
		return this.orderItemAttributes;
	}

	public void setOrderItemAttributes(List<OrderItemAttribute> orderItemAttributes) {
		this.orderItemAttributes = orderItemAttributes;
	}

	public OrderItemAttribute addOrderItemAttribute(OrderItemAttribute orderItemAttribute) {
		getOrderItemAttributes().add(orderItemAttribute);
		orderItemAttribute.setOrderItem(this);

		return orderItemAttribute;
	}

	public OrderItemAttribute removeOrderItemAttribute(OrderItemAttribute orderItemAttribute) {
		getOrderItemAttributes().remove(orderItemAttribute);
		orderItemAttribute.setOrderItem(null);

		return orderItemAttribute;
	}

	public List<OrderItemBilling> getOrderItemBillings() {
		return this.orderItemBillings;
	}

	public void setOrderItemBillings(List<OrderItemBilling> orderItemBillings) {
		this.orderItemBillings = orderItemBillings;
	}

	public OrderItemBilling addOrderItemBilling(OrderItemBilling orderItemBilling) {
		getOrderItemBillings().add(orderItemBilling);
		orderItemBilling.setOrderItem(this);

		return orderItemBilling;
	}

	public OrderItemBilling removeOrderItemBilling(OrderItemBilling orderItemBilling) {
		getOrderItemBillings().remove(orderItemBilling);
		orderItemBilling.setOrderItem(null);

		return orderItemBilling;
	}

	public List<OrderItemChange> getOrderItemChanges() {
		return this.orderItemChanges;
	}

	public void setOrderItemChanges(List<OrderItemChange> orderItemChanges) {
		this.orderItemChanges = orderItemChanges;
	}

	public OrderItemChange addOrderItemChange(OrderItemChange orderItemChange) {
		getOrderItemChanges().add(orderItemChange);
		orderItemChange.setOrderItem(this);

		return orderItemChange;
	}

	public OrderItemChange removeOrderItemChange(OrderItemChange orderItemChange) {
		getOrderItemChanges().remove(orderItemChange);
		orderItemChange.setOrderItem(null);

		return orderItemChange;
	}

	public List<OrderItemContactMech> getOrderItemContactMeches() {
		return this.orderItemContactMeches;
	}

	public void setOrderItemContactMeches(List<OrderItemContactMech> orderItemContactMeches) {
		this.orderItemContactMeches = orderItemContactMeches;
	}

	public OrderItemContactMech addOrderItemContactMech(OrderItemContactMech orderItemContactMech) {
		getOrderItemContactMeches().add(orderItemContactMech);
		orderItemContactMech.setOrderItem(this);

		return orderItemContactMech;
	}

	public OrderItemContactMech removeOrderItemContactMech(OrderItemContactMech orderItemContactMech) {
		getOrderItemContactMeches().remove(orderItemContactMech);
		orderItemContactMech.setOrderItem(null);

		return orderItemContactMech;
	}

	public List<OrderItemGroupOrder> getOrderItemGroupOrders() {
		return this.orderItemGroupOrders;
	}

	public void setOrderItemGroupOrders(List<OrderItemGroupOrder> orderItemGroupOrders) {
		this.orderItemGroupOrders = orderItemGroupOrders;
	}

	public OrderItemGroupOrder addOrderItemGroupOrder(OrderItemGroupOrder orderItemGroupOrder) {
		getOrderItemGroupOrders().add(orderItemGroupOrder);
		orderItemGroupOrder.setOrderItem(this);

		return orderItemGroupOrder;
	}

	public OrderItemGroupOrder removeOrderItemGroupOrder(OrderItemGroupOrder orderItemGroupOrder) {
		getOrderItemGroupOrders().remove(orderItemGroupOrder);
		orderItemGroupOrder.setOrderItem(null);

		return orderItemGroupOrder;
	}

	public List<OrderItemPriceInfo> getOrderItemPriceInfos() {
		return this.orderItemPriceInfos;
	}

	public void setOrderItemPriceInfos(List<OrderItemPriceInfo> orderItemPriceInfos) {
		this.orderItemPriceInfos = orderItemPriceInfos;
	}

	public OrderItemPriceInfo addOrderItemPriceInfo(OrderItemPriceInfo orderItemPriceInfo) {
		getOrderItemPriceInfos().add(orderItemPriceInfo);
		orderItemPriceInfo.setOrderItem(this);

		return orderItemPriceInfo;
	}

	public OrderItemPriceInfo removeOrderItemPriceInfo(OrderItemPriceInfo orderItemPriceInfo) {
		getOrderItemPriceInfos().remove(orderItemPriceInfo);
		orderItemPriceInfo.setOrderItem(null);

		return orderItemPriceInfo;
	}

	public List<OrderItemRole> getOrderItemRoles() {
		return this.orderItemRoles;
	}

	public void setOrderItemRoles(List<OrderItemRole> orderItemRoles) {
		this.orderItemRoles = orderItemRoles;
	}

	public OrderItemRole addOrderItemRole(OrderItemRole orderItemRole) {
		getOrderItemRoles().add(orderItemRole);
		orderItemRole.setOrderItem(this);

		return orderItemRole;
	}

	public OrderItemRole removeOrderItemRole(OrderItemRole orderItemRole) {
		getOrderItemRoles().remove(orderItemRole);
		orderItemRole.setOrderItem(null);

		return orderItemRole;
	}

	public List<OrderItemShipGroupAssoc> getOrderItemShipGroupAssocs() {
		return this.orderItemShipGroupAssocs;
	}

	public void setOrderItemShipGroupAssocs(List<OrderItemShipGroupAssoc> orderItemShipGroupAssocs) {
		this.orderItemShipGroupAssocs = orderItemShipGroupAssocs;
	}

	public OrderItemShipGroupAssoc addOrderItemShipGroupAssoc(OrderItemShipGroupAssoc orderItemShipGroupAssoc) {
		getOrderItemShipGroupAssocs().add(orderItemShipGroupAssoc);
		orderItemShipGroupAssoc.setOrderItem(this);

		return orderItemShipGroupAssoc;
	}

	public OrderItemShipGroupAssoc removeOrderItemShipGroupAssoc(OrderItemShipGroupAssoc orderItemShipGroupAssoc) {
		getOrderItemShipGroupAssocs().remove(orderItemShipGroupAssoc);
		orderItemShipGroupAssoc.setOrderItem(null);

		return orderItemShipGroupAssoc;
	}

	public List<OrderItemShipGrpInvRe> getOrderItemShipGrpInvRes() {
		return this.orderItemShipGrpInvRes;
	}

	public void setOrderItemShipGrpInvRes(List<OrderItemShipGrpInvRe> orderItemShipGrpInvRes) {
		this.orderItemShipGrpInvRes = orderItemShipGrpInvRes;
	}

	public OrderItemShipGrpInvRe addOrderItemShipGrpInvRe(OrderItemShipGrpInvRe orderItemShipGrpInvRe) {
		getOrderItemShipGrpInvRes().add(orderItemShipGrpInvRe);
		orderItemShipGrpInvRe.setOrderItem(this);

		return orderItemShipGrpInvRe;
	}

	public OrderItemShipGrpInvRe removeOrderItemShipGrpInvRe(OrderItemShipGrpInvRe orderItemShipGrpInvRe) {
		getOrderItemShipGrpInvRes().remove(orderItemShipGrpInvRe);
		orderItemShipGrpInvRe.setOrderItem(null);

		return orderItemShipGrpInvRe;
	}

	public List<OrderRequirementCommitment> getOrderRequirementCommitments() {
		return this.orderRequirementCommitments;
	}

	public void setOrderRequirementCommitments(List<OrderRequirementCommitment> orderRequirementCommitments) {
		this.orderRequirementCommitments = orderRequirementCommitments;
	}

	public OrderRequirementCommitment addOrderRequirementCommitment(OrderRequirementCommitment orderRequirementCommitment) {
		getOrderRequirementCommitments().add(orderRequirementCommitment);
		orderRequirementCommitment.setOrderItem(this);

		return orderRequirementCommitment;
	}

	public OrderRequirementCommitment removeOrderRequirementCommitment(OrderRequirementCommitment orderRequirementCommitment) {
		getOrderRequirementCommitments().remove(orderRequirementCommitment);
		orderRequirementCommitment.setOrderItem(null);

		return orderRequirementCommitment;
	}

	/*public List<PicklistItem> getPicklistItems() {
		return this.picklistItems;
	}

	public void setPicklistItems(List<PicklistItem> picklistItems) {
		this.picklistItems = picklistItems;
	}

	public PicklistItem addPicklistItem(PicklistItem picklistItem) {
		getPicklistItems().add(picklistItem);
		picklistItem.setOrderItem(this);

		return picklistItem;
	}

	public PicklistItem removePicklistItem(PicklistItem picklistItem) {
		getPicklistItems().remove(picklistItem);
		picklistItem.setOrderItem(null);

		return picklistItem;
	}
*/
	public List<ProductOrderItem> getProductOrderItems1() {
		return this.productOrderItems1;
	}

	public void setProductOrderItems1(List<ProductOrderItem> productOrderItems1) {
		this.productOrderItems1 = productOrderItems1;
	}

	public ProductOrderItem addProductOrderItems1(ProductOrderItem productOrderItems1) {
		getProductOrderItems1().add(productOrderItems1);
		productOrderItems1.setOrderItem1(this);

		return productOrderItems1;
	}

	public ProductOrderItem removeProductOrderItems1(ProductOrderItem productOrderItems1) {
		getProductOrderItems1().remove(productOrderItems1);
		productOrderItems1.setOrderItem1(null);

		return productOrderItems1;
	}



	public List<ReturnItem> getReturnItems() {
		return this.returnItems;
	}

	public void setReturnItems(List<ReturnItem> returnItems) {
		this.returnItems = returnItems;
	}

	public ReturnItem addReturnItem(ReturnItem returnItem) {
		getReturnItems().add(returnItem);
		returnItem.setOrderItem(this);

		return returnItem;
	}

	public ReturnItem removeReturnItem(ReturnItem returnItem) {
		getReturnItems().remove(returnItem);
		returnItem.setOrderItem(null);

		return returnItem;
	}

	/*public List<ShipmentReceipt> getShipmentReceipts() {
		return this.shipmentReceipts;
	}

	public void setShipmentReceipts(List<ShipmentReceipt> shipmentReceipts) {
		this.shipmentReceipts = shipmentReceipts;
	}

	public ShipmentReceipt addShipmentReceipt(ShipmentReceipt shipmentReceipt) {
		getShipmentReceipts().add(shipmentReceipt);
		shipmentReceipt.setOrderItem(this);

		return shipmentReceipt;
	}

	public ShipmentReceipt removeShipmentReceipt(ShipmentReceipt shipmentReceipt) {
		getShipmentReceipts().remove(shipmentReceipt);
		shipmentReceipt.setOrderItem(null);

		return shipmentReceipt;
	}

	public List<Subscription> getSubscriptions() {
		return this.subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public Subscription addSubscription(Subscription subscription) {
		getSubscriptions().add(subscription);
		subscription.setOrderItem(this);

		return subscription;
	}

	public Subscription removeSubscription(Subscription subscription) {
		getSubscriptions().remove(subscription);
		subscription.setOrderItem(null);

		return subscription;
	}*/

	public List<WorkOrderItemFulfillment> getWorkOrderItemFulfillments() {
		return this.workOrderItemFulfillments;
	}

	public void setWorkOrderItemFulfillments(List<WorkOrderItemFulfillment> workOrderItemFulfillments) {
		this.workOrderItemFulfillments = workOrderItemFulfillments;
	}

	public WorkOrderItemFulfillment addWorkOrderItemFulfillment(WorkOrderItemFulfillment workOrderItemFulfillment) {
		getWorkOrderItemFulfillments().add(workOrderItemFulfillment);
		workOrderItemFulfillment.setOrderItem(this);

		return workOrderItemFulfillment;
	}

	public WorkOrderItemFulfillment removeWorkOrderItemFulfillment(WorkOrderItemFulfillment workOrderItemFulfillment) {
		getWorkOrderItemFulfillments().remove(workOrderItemFulfillment);
		workOrderItemFulfillment.setOrderItem(null);

		return workOrderItemFulfillment;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
}