package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_HEADER database table.
 *
 */
@Entity
@Table(name="ORDER_HEADER")
@NamedQuery(name="OrderHeader.findAll", query="SELECT o FROM OrderHeader o")
public class OrderHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private String orderId;

	@Column(name="AGREEMENT_ID")
	private String agreementId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="ENTRY_DATE")
	private Timestamp entryDate;

	@Column(name="EXTERNAL_ID")
	private String externalId;

	@Column(name="FIRST_ATTEMPT_ORDER_ID")
	private String firstAttemptOrderId;

	@Column(name="GRAND_TOTAL")
	private BigDecimal grandTotal;

	@Column(name="INTERNAL_CODE")
	private String internalCode;

	@Column(name="INVOICE_PER_SHIPMENT")
	private String invoicePerShipment;

	@Column(name="IS_RUSH_ORDER")
	private String isRushOrder;

	@Column(name="IS_VIEWED")
	private String isViewed;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="NEEDS_INVENTORY_ISSUANCE")
	private String needsInventoryIssuance;

	@Column(name="ORDER_DATE")
	private Timestamp orderDate;

	@Column(name="ORDER_NAME")
	private String orderName;

	@Column(name="PICK_SHEET_PRINTED_DATE")
	private Timestamp pickSheetPrintedDate;

	private String priority;

	@Column(name="REMAINING_SUB_TOTAL")
	private BigDecimal remainingSubTotal;

	@Column(name="TERMINAL_ID")
	private String terminalId;

	@Column(name="TRANSACTION_ID")
	private String transactionId;

	@Column(name="VISIT_ID")
	private String visitId;

	@Column(name = "PRODUCT_STORE_ID", nullable = true, length = 20)
	private String productStoreId;

	@Column(name = "CURRENCY_UOM", nullable = true, length = 20)
	private String currencyUom;

	@Column(name = "BILLING_ACCOUNT_ID")
	private String billingAccountId;

/*	@OneToOne
	private String statusId;

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}*/

	@OneToMany(mappedBy="orderHeader")
	private List<CommunicationEventOrder> communicationEventOrders;

	//bi-directional many-to-one association to StatusItem

	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	//bi-directional many-to-one association to AllocationPlanItem
	/*@OneToMany(mappedBy="orderHeader")
	private List<AllocationPlanItem> allocationPlanItems;

	//bi-directional many-to-one association to CommunicationEventOrder
	@OneToMany(mappedBy="orderHeader")
	private List<CommunicationEventOrder> communicationEventOrders;

	//bi-directional many-to-one association to FixedAsset
	@OneToMany(mappedBy="orderHeader")
	private List<FixedAsset> fixedAssets;

	//bi-directional many-to-one association to FixedAssetMaint
	@OneToMany(mappedBy="orderHeader")
	private List<FixedAssetMaint> fixedAssetMaints;

	//bi-directional many-to-one association to FixedAssetMaintOrder
	@OneToMany(mappedBy="orderHeader")
	private List<FixedAssetMaintOrder> fixedAssetMaintOrders;

	//bi-directional many-to-one association to GiftCardFulfillment
	@OneToMany(mappedBy="orderHeader")
	private List<GiftCardFulfillment> giftCardFulfillments;*/

	//bi-directional many-to-one association to OrderAdjustment
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderAdjustment> orderAdjustments;

	//bi-directional many-to-one association to OrderAttribute
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderAttribute> orderAttributes;

	//bi-directional many-to-one association to OrderContactMech
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderContactMech> orderContactMeches;

	//bi-directional many-to-one association to OrderContent
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderContent> orderContents;

	//bi-directional many-to-one association to OrderDeliverySchedule
	@OneToMany(mappedBy="orderHeader")
	private List<OrderDeliverySchedule> orderDeliverySchedules;

	//bi-directional many-to-one association to BillingAccount
	/*@ManyToOne
	@JoinColumn(name="BILLING_ACCOUNT_ID")
	private BillingAccount billingAccount;

	//bi-directional many-to-one association to Enumeration
	@ManyToOne
	@JoinColumn(name="SALES_CHANNEL_ENUM_ID")
	private Enumeration enumeration;

	//bi-directional many-to-one association to Facility
	@ManyToOne
	@JoinColumn(name="ORIGIN_FACILITY_ID")
	private Facility facility;*/

	//bi-directional many-to-one association to OrderType
	@ManyToOne
	@JoinColumn(name="ORDER_TYPE_ID")
	private com.bizoffs.order.entities.OrderType orderType;

	//bi-directional many-to-one association to ProductStore
	/*@ManyToOne
	@JoinColumn(name="PRODUCT_STORE_ID")
	private ProductStore productStore;*/

	//bi-directional many-to-one association to ShoppingList
	@ManyToOne
	@JoinColumn(name="AUTO_ORDER_SHOPPING_LIST_ID")
	private com.bizoffs.order.entities.ShoppingList shoppingList;

	//bi-directional many-to-one association to StatusItem
	/*@ManyToOne
	@JoinColumn(name="SYNC_STATUS_ID")
	private StatusItem statusItem1;

	//bi-directional many-to-one association to StatusItem
	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem2;

	//bi-directional many-to-one association to Uom
	@ManyToOne
	@JoinColumn(name="CURRENCY_UOM")
	private Uom uom;

	//bi-directional many-to-one association to UserLogin
	@ManyToOne
	@JoinColumn(name="CREATED_BY")
	private UserLogin userLogin;

	//bi-directional many-to-one association to WebSite
	@ManyToOne
	@JoinColumn(name="WEB_SITE_ID")
	private WebSite webSite;
*/
	//bi-directional many-to-one association to OrderHeaderNote
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderHeaderNote> orderHeaderNotes;

	//bi-directional many-to-one association to OrderHeaderWorkEffort
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderHeaderWorkEffort> orderHeaderWorkEfforts;

	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderItem> orderItems;

	//bi-directional many-to-one association to OrderItemAssoc
	@OneToMany(mappedBy="orderHeader1")
	private List<com.bizoffs.order.entities.OrderItemAssoc> orderItemAssocs1;

	//bi-directional many-to-one association to OrderItemAssoc
	@OneToMany(mappedBy="orderHeader2")
	private List<com.bizoffs.order.entities.OrderItemAssoc> orderItemAssocs2;

	//bi-directional many-to-one association to OrderItemBilling
	@OneToMany(mappedBy="orderHeader")
	private List<OrderItemBilling> orderItemBillings;

	//bi-directional many-to-one association to OrderItemGroup
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderItemGroup> orderItemGroups;

	//bi-directional many-to-one association to OrderItemRole
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderItemRole> orderItemRoles;

	//bi-directional many-to-one association to OrderItemShipGroup
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderItemShipGroup> orderItemShipGroups;

	//bi-directional many-to-one association to OrderItemShipGroupAssoc
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderItemShipGroupAssoc> orderItemShipGroupAssocs;

	//bi-directional many-to-one association to OrderNotification
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderNotification> orderNotifications;

	//bi-directional many-to-one association to OrderPaymentPreference
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderPaymentPreference> orderPaymentPreferences;

	//bi-directional many-to-one association to OrderProductPromoCode
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderProductPromoCode> orderProductPromoCodes;

	//bi-directional many-to-one association to OrderRequirementCommitment
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderRequirementCommitment> orderRequirementCommitments;

	//bi-directional many-to-one association to OrderRole
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderRole> orderRoles;

	//bi-directional many-to-one association to OrderShipment
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderShipment> orderShipments;

	//bi-directional many-to-one association to OrderStatus
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderStatus> orderStatuses;

	//bi-directional many-to-one association to OrderTerm
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.OrderTerm> orderTerms;

	//bi-directional many-to-one association to ProductOrderItem
	@OneToMany(mappedBy="orderHeader1")
	private List<com.bizoffs.order.entities.ProductOrderItem> productOrderItems1;

	//bi-directional many-to-one association to ProductOrderItem
	@OneToMany(mappedBy="orderHeader2")
	private List<com.bizoffs.order.entities.ProductOrderItem> productOrderItems2;

	//bi-directional many-to-one association to ProductPromoUse
	/*@OneToMany(mappedBy="orderHeader")
	private List<ProductPromoUse> productPromoUses;*/

	//bi-directional many-to-one association to ReturnItem
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.ReturnItem> returnItems;

	//bi-directional many-to-one association to ReturnItemResponse
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.ReturnItemResponse> returnItemResponses;

	//bi-directional many-to-one association to Shipment
	/*@OneToMany(mappedBy="orderHeader")
	private List<Shipment> shipments;

	//bi-directional many-to-one association to TrackingCodeOrder
	@OneToMany(mappedBy="orderHeader")
	private List<TrackingCodeOrder> trackingCodeOrders;

	//bi-directional many-to-one association to TrackingCodeOrderReturn
	@OneToMany(mappedBy="orderHeader")
	private List<TrackingCodeOrderReturn> trackingCodeOrderReturns;*/

	//bi-directional many-to-one association to WorkOrderItemFulfillment
	@OneToMany(mappedBy="orderHeader")
	private List<com.bizoffs.order.entities.WorkOrderItemFulfillment> workOrderItemFulfillments;

	public OrderHeader() {
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getAgreementId() {
		return this.agreementId;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
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

	public Timestamp getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Timestamp entryDate) {
		this.entryDate = entryDate;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFirstAttemptOrderId() {
		return this.firstAttemptOrderId;
	}

	public void setFirstAttemptOrderId(String firstAttemptOrderId) {
		this.firstAttemptOrderId = firstAttemptOrderId;
	}

	public BigDecimal getGrandTotal() {
		return this.grandTotal;
	}

	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}

	public String getInternalCode() {
		return this.internalCode;
	}

	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}

	public String getInvoicePerShipment() {
		return this.invoicePerShipment;
	}

	public void setInvoicePerShipment(String invoicePerShipment) {
		this.invoicePerShipment = invoicePerShipment;
	}

	public String getIsRushOrder() {
		return this.isRushOrder;
	}

	public void setIsRushOrder(String isRushOrder) {
		this.isRushOrder = isRushOrder;
	}

	public String getIsViewed() {
		return this.isViewed;
	}

	public void setIsViewed(String isViewed) {
		this.isViewed = isViewed;
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

	public String getNeedsInventoryIssuance() {
		return this.needsInventoryIssuance;
	}

	public void setNeedsInventoryIssuance(String needsInventoryIssuance) {
		this.needsInventoryIssuance = needsInventoryIssuance;
	}

	public Timestamp getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderName() {
		return this.orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Timestamp getPickSheetPrintedDate() {
		return this.pickSheetPrintedDate;
	}

	public void setPickSheetPrintedDate(Timestamp pickSheetPrintedDate) {
		this.pickSheetPrintedDate = pickSheetPrintedDate;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public BigDecimal getRemainingSubTotal() {
		return this.remainingSubTotal;
	}

	public void setRemainingSubTotal(BigDecimal remainingSubTotal) {
		this.remainingSubTotal = remainingSubTotal;
	}

	public String getTerminalId() {
		return this.terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getVisitId() {
		return this.visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	/*public List<AllocationPlanItem> getAllocationPlanItems() {
		return this.allocationPlanItems;
	}

	public void setAllocationPlanItems(List<AllocationPlanItem> allocationPlanItems) {
		this.allocationPlanItems = allocationPlanItems;
	}

	public AllocationPlanItem addAllocationPlanItem(AllocationPlanItem allocationPlanItem) {
		getAllocationPlanItems().add(allocationPlanItem);
		allocationPlanItem.setOrderHeader(this);

		return allocationPlanItem;
	}

	public AllocationPlanItem removeAllocationPlanItem(AllocationPlanItem allocationPlanItem) {
		getAllocationPlanItems().remove(allocationPlanItem);
		allocationPlanItem.setOrderHeader(null);

		return allocationPlanItem;
	}*/

	public List<com.bizoffs.order.entities.CommunicationEventOrder> getCommunicationEventOrders() {
		return this.communicationEventOrders;
	}

	public void setCommunicationEventOrders(List<com.bizoffs.order.entities.CommunicationEventOrder> communicationEventOrders) {
		this.communicationEventOrders = communicationEventOrders;
	}

	public com.bizoffs.order.entities.CommunicationEventOrder addCommunicationEventOrder(com.bizoffs.order.entities.CommunicationEventOrder communicationEventOrder) {
		getCommunicationEventOrders().add(communicationEventOrder);
		communicationEventOrder.setOrderHeader(this);

		return communicationEventOrder;
	}

	public com.bizoffs.order.entities.CommunicationEventOrder removeCommunicationEventOrder(com.bizoffs.order.entities.CommunicationEventOrder communicationEventOrder) {
		getCommunicationEventOrders().remove(communicationEventOrder);
		communicationEventOrder.setOrderHeader(null);

		return communicationEventOrder;
	}

	/*public List<FixedAsset> getFixedAssets() {
		return this.fixedAssets;
	}

	public void setFixedAssets(List<FixedAsset> fixedAssets) {
		this.fixedAssets = fixedAssets;
	}

	public FixedAsset addFixedAsset(FixedAsset fixedAsset) {
		getFixedAssets().add(fixedAsset);
		fixedAsset.setOrderHeader(this);

		return fixedAsset;
	}

	public FixedAsset removeFixedAsset(FixedAsset fixedAsset) {
		getFixedAssets().remove(fixedAsset);
		fixedAsset.setOrderHeader(null);

		return fixedAsset;
	}*/

	/*public List<FixedAssetMaint> getFixedAssetMaints() {
		return this.fixedAssetMaints;
	}

	public void setFixedAssetMaints(List<FixedAssetMaint> fixedAssetMaints) {
		this.fixedAssetMaints = fixedAssetMaints;
	}

	public FixedAssetMaint addFixedAssetMaint(FixedAssetMaint fixedAssetMaint) {
		getFixedAssetMaints().add(fixedAssetMaint);
		fixedAssetMaint.setOrderHeader(this);

		return fixedAssetMaint;
	}

	public FixedAssetMaint removeFixedAssetMaint(FixedAssetMaint fixedAssetMaint) {
		getFixedAssetMaints().remove(fixedAssetMaint);
		fixedAssetMaint.setOrderHeader(null);

		return fixedAssetMaint;
	}

	public List<FixedAssetMaintOrder> getFixedAssetMaintOrders() {
		return this.fixedAssetMaintOrders;
	}

	public void setFixedAssetMaintOrders(List<FixedAssetMaintOrder> fixedAssetMaintOrders) {
		this.fixedAssetMaintOrders = fixedAssetMaintOrders;
	}

	public FixedAssetMaintOrder addFixedAssetMaintOrder(FixedAssetMaintOrder fixedAssetMaintOrder) {
		getFixedAssetMaintOrders().add(fixedAssetMaintOrder);
		fixedAssetMaintOrder.setOrderHeader(this);

		return fixedAssetMaintOrder;
	}

	public FixedAssetMaintOrder removeFixedAssetMaintOrder(FixedAssetMaintOrder fixedAssetMaintOrder) {
		getFixedAssetMaintOrders().remove(fixedAssetMaintOrder);
		fixedAssetMaintOrder.setOrderHeader(null);

		return fixedAssetMaintOrder;
	}

	public List<GiftCardFulfillment> getGiftCardFulfillments() {
		return this.giftCardFulfillments;
	}

	public void setGiftCardFulfillments(List<GiftCardFulfillment> giftCardFulfillments) {
		this.giftCardFulfillments = giftCardFulfillments;
	}

	public GiftCardFulfillment addGiftCardFulfillment(GiftCardFulfillment giftCardFulfillment) {
		getGiftCardFulfillments().add(giftCardFulfillment);
		giftCardFulfillment.setOrderHeader(this);

		return giftCardFulfillment;
	}

	public GiftCardFulfillment removeGiftCardFulfillment(GiftCardFulfillment giftCardFulfillment) {
		getGiftCardFulfillments().remove(giftCardFulfillment);
		giftCardFulfillment.setOrderHeader(null);

		return giftCardFulfillment;
	}*/

	public List<com.bizoffs.order.entities.OrderAdjustment> getOrderAdjustments() {
		return this.orderAdjustments;
	}

	public void setOrderAdjustments(List<com.bizoffs.order.entities.OrderAdjustment> orderAdjustments) {
		this.orderAdjustments = orderAdjustments;
	}

	public com.bizoffs.order.entities.OrderAdjustment addOrderAdjustment(com.bizoffs.order.entities.OrderAdjustment orderAdjustment) {
		getOrderAdjustments().add(orderAdjustment);
		orderAdjustment.setOrderHeader(this);

		return orderAdjustment;
	}

	public com.bizoffs.order.entities.OrderAdjustment removeOrderAdjustment(com.bizoffs.order.entities.OrderAdjustment orderAdjustment) {
		getOrderAdjustments().remove(orderAdjustment);
		orderAdjustment.setOrderHeader(null);

		return orderAdjustment;
	}

	public List<com.bizoffs.order.entities.OrderAttribute> getOrderAttributes() {
		return this.orderAttributes;
	}

	public void setOrderAttributes(List<com.bizoffs.order.entities.OrderAttribute> orderAttributes) {
		this.orderAttributes = orderAttributes;
	}

	public com.bizoffs.order.entities.OrderAttribute addOrderAttribute(com.bizoffs.order.entities.OrderAttribute orderAttribute) {
		getOrderAttributes().add(orderAttribute);
		orderAttribute.setOrderHeader(this);

		return orderAttribute;
	}

	public com.bizoffs.order.entities.OrderAttribute removeOrderAttribute(com.bizoffs.order.entities.OrderAttribute orderAttribute) {
		getOrderAttributes().remove(orderAttribute);
		orderAttribute.setOrderHeader(null);

		return orderAttribute;
	}

	public List<com.bizoffs.order.entities.OrderContactMech> getOrderContactMeches() {
		return this.orderContactMeches;
	}

	public void setOrderContactMeches(List<com.bizoffs.order.entities.OrderContactMech> orderContactMeches) {
		this.orderContactMeches = orderContactMeches;
	}

	public com.bizoffs.order.entities.OrderContactMech addOrderContactMech(com.bizoffs.order.entities.OrderContactMech orderContactMech) {
		getOrderContactMeches().add(orderContactMech);
		orderContactMech.setOrderHeader(this);

		return orderContactMech;
	}

	public com.bizoffs.order.entities.OrderContactMech removeOrderContactMech(com.bizoffs.order.entities.OrderContactMech orderContactMech) {
		getOrderContactMeches().remove(orderContactMech);
		orderContactMech.setOrderHeader(null);

		return orderContactMech;
	}

	public List<com.bizoffs.order.entities.OrderContent> getOrderContents() {
		return this.orderContents;
	}

	public void setOrderContents(List<com.bizoffs.order.entities.OrderContent> orderContents) {
		this.orderContents = orderContents;
	}

	public com.bizoffs.order.entities.OrderContent addOrderContent(com.bizoffs.order.entities.OrderContent orderContent) {
		getOrderContents().add(orderContent);
		orderContent.setOrderHeader(this);

		return orderContent;
	}

	public com.bizoffs.order.entities.OrderContent removeOrderContent(com.bizoffs.order.entities.OrderContent orderContent) {
		getOrderContents().remove(orderContent);
		orderContent.setOrderHeader(null);

		return orderContent;
	}

	public List<OrderDeliverySchedule> getOrderDeliverySchedules() {
		return this.orderDeliverySchedules;
	}

	public void setOrderDeliverySchedules(List<OrderDeliverySchedule> orderDeliverySchedules) {
		this.orderDeliverySchedules = orderDeliverySchedules;
	}

	public OrderDeliverySchedule addOrderDeliverySchedule(OrderDeliverySchedule orderDeliverySchedule) {
		getOrderDeliverySchedules().add(orderDeliverySchedule);
		orderDeliverySchedule.setOrderHeader(this);

		return orderDeliverySchedule;
	}

	public OrderDeliverySchedule removeOrderDeliverySchedule(OrderDeliverySchedule orderDeliverySchedule) {
		getOrderDeliverySchedules().remove(orderDeliverySchedule);
		orderDeliverySchedule.setOrderHeader(null);

		return orderDeliverySchedule;
	}

	/*public BillingAccount getBillingAccount() {
		return this.billingAccount;
	}

	public void setBillingAccount(BillingAccount billingAccount) {
		this.billingAccount = billingAccount;
	}

	public Enumeration getEnumeration() {
		return this.enumeration;
	}

	public void setEnumeration(Enumeration enumeration) {
		this.enumeration = enumeration;
	}

	public Facility getFacility() {
		return this.facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}



	public ProductStore getProductStore() {
		return this.productStore;
	}

	public void setProductStore(ProductStore productStore) {
		this.productStore = productStore;
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

	public UserLogin getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	public WebSite getWebSite() {
		return this.webSite;
	}

	public void setWebSite(WebSite webSite) {
		this.webSite = webSite;
	}*/

	public com.bizoffs.order.entities.ShoppingList getShoppingList() {
		return this.shoppingList;
	}

	public void setShoppingList(com.bizoffs.order.entities.ShoppingList shoppingList) {
		this.shoppingList = shoppingList;
	}
	public com.bizoffs.order.entities.OrderType getOrderType() {
		return this.orderType;
	}

	public void setOrderType(com.bizoffs.order.entities.OrderType orderType) {
		this.orderType = orderType;
	}
	public List<com.bizoffs.order.entities.OrderHeaderNote> getOrderHeaderNotes() {
		return this.orderHeaderNotes;
	}

	public void setOrderHeaderNotes(List<com.bizoffs.order.entities.OrderHeaderNote> orderHeaderNotes) {
		this.orderHeaderNotes = orderHeaderNotes;
	}

	public com.bizoffs.order.entities.OrderHeaderNote addOrderHeaderNote(com.bizoffs.order.entities.OrderHeaderNote orderHeaderNote) {
		getOrderHeaderNotes().add(orderHeaderNote);
		orderHeaderNote.setOrderHeader(this);

		return orderHeaderNote;
	}

	public com.bizoffs.order.entities.OrderHeaderNote removeOrderHeaderNote(com.bizoffs.order.entities.OrderHeaderNote orderHeaderNote) {
		getOrderHeaderNotes().remove(orderHeaderNote);
		orderHeaderNote.setOrderHeader(null);

		return orderHeaderNote;
	}

	public List<com.bizoffs.order.entities.OrderHeaderWorkEffort> getOrderHeaderWorkEfforts() {
		return this.orderHeaderWorkEfforts;
	}

	public void setOrderHeaderWorkEfforts(List<com.bizoffs.order.entities.OrderHeaderWorkEffort> orderHeaderWorkEfforts) {
		this.orderHeaderWorkEfforts = orderHeaderWorkEfforts;
	}

	public com.bizoffs.order.entities.OrderHeaderWorkEffort addOrderHeaderWorkEffort(com.bizoffs.order.entities.OrderHeaderWorkEffort orderHeaderWorkEffort) {
		getOrderHeaderWorkEfforts().add(orderHeaderWorkEffort);
		orderHeaderWorkEffort.setOrderHeader(this);

		return orderHeaderWorkEffort;
	}

	public com.bizoffs.order.entities.OrderHeaderWorkEffort removeOrderHeaderWorkEffort(com.bizoffs.order.entities.OrderHeaderWorkEffort orderHeaderWorkEffort) {
		getOrderHeaderWorkEfforts().remove(orderHeaderWorkEffort);
		orderHeaderWorkEffort.setOrderHeader(null);

		return orderHeaderWorkEffort;
	}

	public List<com.bizoffs.order.entities.OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(List<com.bizoffs.order.entities.OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public com.bizoffs.order.entities.OrderItem addOrderItem(com.bizoffs.order.entities.OrderItem orderItem) {
		getOrderItems().add(orderItem);
		orderItem.setOrderHeader(this);

		return orderItem;
	}

	public com.bizoffs.order.entities.OrderItem removeOrderItem(com.bizoffs.order.entities.OrderItem orderItem) {
		getOrderItems().remove(orderItem);
		orderItem.setOrderHeader(null);

		return orderItem;
	}

	public List<com.bizoffs.order.entities.OrderItemAssoc> getOrderItemAssocs1() {
		return this.orderItemAssocs1;
	}

	public void setOrderItemAssocs1(List<com.bizoffs.order.entities.OrderItemAssoc> orderItemAssocs1) {
		this.orderItemAssocs1 = orderItemAssocs1;
	}

	public com.bizoffs.order.entities.OrderItemAssoc addOrderItemAssocs1(com.bizoffs.order.entities.OrderItemAssoc orderItemAssocs1) {
		getOrderItemAssocs1().add(orderItemAssocs1);
		orderItemAssocs1.setOrderHeader1(this);

		return orderItemAssocs1;
	}

	public com.bizoffs.order.entities.OrderItemAssoc removeOrderItemAssocs1(com.bizoffs.order.entities.OrderItemAssoc orderItemAssocs1) {
		getOrderItemAssocs1().remove(orderItemAssocs1);
		orderItemAssocs1.setOrderHeader1(null);

		return orderItemAssocs1;
	}

	public List<com.bizoffs.order.entities.OrderItemAssoc> getOrderItemAssocs2() {
		return this.orderItemAssocs2;
	}

	public void setOrderItemAssocs2(List<com.bizoffs.order.entities.OrderItemAssoc> orderItemAssocs2) {
		this.orderItemAssocs2 = orderItemAssocs2;
	}

	public com.bizoffs.order.entities.OrderItemAssoc addOrderItemAssocs2(com.bizoffs.order.entities.OrderItemAssoc orderItemAssocs2) {
		getOrderItemAssocs2().add(orderItemAssocs2);
		orderItemAssocs2.setOrderHeader2(this);

		return orderItemAssocs2;
	}

	public com.bizoffs.order.entities.OrderItemAssoc removeOrderItemAssocs2(com.bizoffs.order.entities.OrderItemAssoc orderItemAssocs2) {
		getOrderItemAssocs2().remove(orderItemAssocs2);
		orderItemAssocs2.setOrderHeader2(null);

		return orderItemAssocs2;
	}

	public List<OrderItemBilling> getOrderItemBillings() {
		return this.orderItemBillings;
	}

	public void setOrderItemBillings(List<OrderItemBilling> orderItemBillings) {
		this.orderItemBillings = orderItemBillings;
	}

	public OrderItemBilling addOrderItemBilling(OrderItemBilling orderItemBilling) {
		getOrderItemBillings().add(orderItemBilling);
		orderItemBilling.setOrderHeader(this);

		return orderItemBilling;
	}

	public OrderItemBilling removeOrderItemBilling(OrderItemBilling orderItemBilling) {
		getOrderItemBillings().remove(orderItemBilling);
		orderItemBilling.setOrderHeader(null);

		return orderItemBilling;
	}

	public List<com.bizoffs.order.entities.OrderItemGroup> getOrderItemGroups() {
		return this.orderItemGroups;
	}

	public void setOrderItemGroups(List<com.bizoffs.order.entities.OrderItemGroup> orderItemGroups) {
		this.orderItemGroups = orderItemGroups;
	}

	public com.bizoffs.order.entities.OrderItemGroup addOrderItemGroup(com.bizoffs.order.entities.OrderItemGroup orderItemGroup) {
		getOrderItemGroups().add(orderItemGroup);
		orderItemGroup.setOrderHeader(this);

		return orderItemGroup;
	}

	public com.bizoffs.order.entities.OrderItemGroup removeOrderItemGroup(com.bizoffs.order.entities.OrderItemGroup orderItemGroup) {
		getOrderItemGroups().remove(orderItemGroup);
		orderItemGroup.setOrderHeader(null);

		return orderItemGroup;
	}

	public List<com.bizoffs.order.entities.OrderItemRole> getOrderItemRoles() {
		return this.orderItemRoles;
	}

	public void setOrderItemRoles(List<com.bizoffs.order.entities.OrderItemRole> orderItemRoles) {
		this.orderItemRoles = orderItemRoles;
	}

	public com.bizoffs.order.entities.OrderItemRole addOrderItemRole(com.bizoffs.order.entities.OrderItemRole orderItemRole) {
		getOrderItemRoles().add(orderItemRole);
		orderItemRole.setOrderHeader(this);

		return orderItemRole;
	}

	public com.bizoffs.order.entities.OrderItemRole removeOrderItemRole(com.bizoffs.order.entities.OrderItemRole orderItemRole) {
		getOrderItemRoles().remove(orderItemRole);
		orderItemRole.setOrderHeader(null);

		return orderItemRole;
	}

	public List<com.bizoffs.order.entities.OrderItemShipGroup> getOrderItemShipGroups() {
		return this.orderItemShipGroups;
	}

	public void setOrderItemShipGroups(List<com.bizoffs.order.entities.OrderItemShipGroup> orderItemShipGroups) {
		this.orderItemShipGroups = orderItemShipGroups;
	}

	public com.bizoffs.order.entities.OrderItemShipGroup addOrderItemShipGroup(com.bizoffs.order.entities.OrderItemShipGroup orderItemShipGroup) {
		getOrderItemShipGroups().add(orderItemShipGroup);
		orderItemShipGroup.setOrderHeader(this);

		return orderItemShipGroup;
	}

	public com.bizoffs.order.entities.OrderItemShipGroup removeOrderItemShipGroup(com.bizoffs.order.entities.OrderItemShipGroup orderItemShipGroup) {
		getOrderItemShipGroups().remove(orderItemShipGroup);
		orderItemShipGroup.setOrderHeader(null);

		return orderItemShipGroup;
	}

	public List<com.bizoffs.order.entities.OrderItemShipGroupAssoc> getOrderItemShipGroupAssocs() {
		return this.orderItemShipGroupAssocs;
	}

	public void setOrderItemShipGroupAssocs(List<com.bizoffs.order.entities.OrderItemShipGroupAssoc> orderItemShipGroupAssocs) {
		this.orderItemShipGroupAssocs = orderItemShipGroupAssocs;
	}

	public com.bizoffs.order.entities.OrderItemShipGroupAssoc addOrderItemShipGroupAssoc(com.bizoffs.order.entities.OrderItemShipGroupAssoc orderItemShipGroupAssoc) {
		getOrderItemShipGroupAssocs().add(orderItemShipGroupAssoc);
		orderItemShipGroupAssoc.setOrderHeader(this);

		return orderItemShipGroupAssoc;
	}

	public com.bizoffs.order.entities.OrderItemShipGroupAssoc removeOrderItemShipGroupAssoc(com.bizoffs.order.entities.OrderItemShipGroupAssoc orderItemShipGroupAssoc) {
		getOrderItemShipGroupAssocs().remove(orderItemShipGroupAssoc);
		orderItemShipGroupAssoc.setOrderHeader(null);

		return orderItemShipGroupAssoc;
	}

	public List<com.bizoffs.order.entities.OrderNotification> getOrderNotifications() {
		return this.orderNotifications;
	}

	public void setOrderNotifications(List<com.bizoffs.order.entities.OrderNotification> orderNotifications) {
		this.orderNotifications = orderNotifications;
	}

	public com.bizoffs.order.entities.OrderNotification addOrderNotification(com.bizoffs.order.entities.OrderNotification orderNotification) {
		getOrderNotifications().add(orderNotification);
		orderNotification.setOrderHeader(this);

		return orderNotification;
	}

	public com.bizoffs.order.entities.OrderNotification removeOrderNotification(com.bizoffs.order.entities.OrderNotification orderNotification) {
		getOrderNotifications().remove(orderNotification);
		orderNotification.setOrderHeader(null);

		return orderNotification;
	}

	public List<com.bizoffs.order.entities.OrderPaymentPreference> getOrderPaymentPreferences() {
		return this.orderPaymentPreferences;
	}

	public void setOrderPaymentPreferences(List<com.bizoffs.order.entities.OrderPaymentPreference> orderPaymentPreferences) {
		this.orderPaymentPreferences = orderPaymentPreferences;
	}

	public com.bizoffs.order.entities.OrderPaymentPreference addOrderPaymentPreference(com.bizoffs.order.entities.OrderPaymentPreference orderPaymentPreference) {
		getOrderPaymentPreferences().add(orderPaymentPreference);
		orderPaymentPreference.setOrderHeader(this);

		return orderPaymentPreference;
	}

	public com.bizoffs.order.entities.OrderPaymentPreference removeOrderPaymentPreference(com.bizoffs.order.entities.OrderPaymentPreference orderPaymentPreference) {
		getOrderPaymentPreferences().remove(orderPaymentPreference);
		orderPaymentPreference.setOrderHeader(null);

		return orderPaymentPreference;
	}

	public List<com.bizoffs.order.entities.OrderProductPromoCode> getOrderProductPromoCodes() {
		return this.orderProductPromoCodes;
	}

	public void setOrderProductPromoCodes(List<com.bizoffs.order.entities.OrderProductPromoCode> orderProductPromoCodes) {
		this.orderProductPromoCodes = orderProductPromoCodes;
	}

	public com.bizoffs.order.entities.OrderProductPromoCode addOrderProductPromoCode(com.bizoffs.order.entities.OrderProductPromoCode orderProductPromoCode) {
		getOrderProductPromoCodes().add(orderProductPromoCode);
		orderProductPromoCode.setOrderHeader(this);

		return orderProductPromoCode;
	}

	public com.bizoffs.order.entities.OrderProductPromoCode removeOrderProductPromoCode(com.bizoffs.order.entities.OrderProductPromoCode orderProductPromoCode) {
		getOrderProductPromoCodes().remove(orderProductPromoCode);
		orderProductPromoCode.setOrderHeader(null);

		return orderProductPromoCode;
	}

	public List<com.bizoffs.order.entities.OrderRequirementCommitment> getOrderRequirementCommitments() {
		return this.orderRequirementCommitments;
	}

	public void setOrderRequirementCommitments(List<com.bizoffs.order.entities.OrderRequirementCommitment> orderRequirementCommitments) {
		this.orderRequirementCommitments = orderRequirementCommitments;
	}

	public com.bizoffs.order.entities.OrderRequirementCommitment addOrderRequirementCommitment(com.bizoffs.order.entities.OrderRequirementCommitment orderRequirementCommitment) {
		getOrderRequirementCommitments().add(orderRequirementCommitment);
		orderRequirementCommitment.setOrderHeader(this);

		return orderRequirementCommitment;
	}

	public com.bizoffs.order.entities.OrderRequirementCommitment removeOrderRequirementCommitment(com.bizoffs.order.entities.OrderRequirementCommitment orderRequirementCommitment) {
		getOrderRequirementCommitments().remove(orderRequirementCommitment);
		orderRequirementCommitment.setOrderHeader(null);

		return orderRequirementCommitment;
	}

	public List<com.bizoffs.order.entities.OrderRole> getOrderRoles() {
		return this.orderRoles;
	}

	public void setOrderRoles(List<com.bizoffs.order.entities.OrderRole> orderRoles) {
		this.orderRoles = orderRoles;
	}

	public com.bizoffs.order.entities.OrderRole addOrderRole(com.bizoffs.order.entities.OrderRole orderRole) {
		getOrderRoles().add(orderRole);
		orderRole.setOrderHeader(this);

		return orderRole;
	}

	public com.bizoffs.order.entities.OrderRole removeOrderRole(com.bizoffs.order.entities.OrderRole orderRole) {
		getOrderRoles().remove(orderRole);
		orderRole.setOrderHeader(null);

		return orderRole;
	}

	public List<com.bizoffs.order.entities.OrderShipment> getOrderShipments() {
		return this.orderShipments;
	}

	public void setOrderShipments(List<com.bizoffs.order.entities.OrderShipment> orderShipments) {
		this.orderShipments = orderShipments;
	}

	public com.bizoffs.order.entities.OrderShipment addOrderShipment(com.bizoffs.order.entities.OrderShipment orderShipment) {
		getOrderShipments().add(orderShipment);
		orderShipment.setOrderHeader(this);

		return orderShipment;
	}

	public com.bizoffs.order.entities.OrderShipment removeOrderShipment(com.bizoffs.order.entities.OrderShipment orderShipment) {
		getOrderShipments().remove(orderShipment);
		orderShipment.setOrderHeader(null);

		return orderShipment;
	}

	public List<com.bizoffs.order.entities.OrderStatus> getOrderStatuses() {
		return this.orderStatuses;
	}

	public void setOrderStatuses(List<com.bizoffs.order.entities.OrderStatus> orderStatuses) {
		this.orderStatuses = orderStatuses;
	}

	public com.bizoffs.order.entities.OrderStatus addOrderStatus(com.bizoffs.order.entities.OrderStatus orderStatus) {
		getOrderStatuses().add(orderStatus);
		orderStatus.setOrderHeader(this);

		return orderStatus;
	}

	public com.bizoffs.order.entities.OrderStatus removeOrderStatus(com.bizoffs.order.entities.OrderStatus orderStatus) {
		getOrderStatuses().remove(orderStatus);
		orderStatus.setOrderHeader(null);

		return orderStatus;
	}

	public List<com.bizoffs.order.entities.OrderTerm> getOrderTerms() {
		return this.orderTerms;
	}

	public void setOrderTerms(List<com.bizoffs.order.entities.OrderTerm> orderTerms) {
		this.orderTerms = orderTerms;
	}

	public com.bizoffs.order.entities.OrderTerm addOrderTerm(com.bizoffs.order.entities.OrderTerm orderTerm) {
		getOrderTerms().add(orderTerm);
		orderTerm.setOrderHeader(this);

		return orderTerm;
	}

	public com.bizoffs.order.entities.OrderTerm removeOrderTerm(com.bizoffs.order.entities.OrderTerm orderTerm) {
		getOrderTerms().remove(orderTerm);
		orderTerm.setOrderHeader(null);

		return orderTerm;
	}

	public List<com.bizoffs.order.entities.ProductOrderItem> getProductOrderItems1() {
		return this.productOrderItems1;
	}

	public void setProductOrderItems1(List<com.bizoffs.order.entities.ProductOrderItem> productOrderItems1) {
		this.productOrderItems1 = productOrderItems1;
	}

	public com.bizoffs.order.entities.ProductOrderItem addProductOrderItems1(com.bizoffs.order.entities.ProductOrderItem productOrderItems1) {
		getProductOrderItems1().add(productOrderItems1);
		productOrderItems1.setOrderHeader1(this);

		return productOrderItems1;
	}

	public com.bizoffs.order.entities.ProductOrderItem removeProductOrderItems1(com.bizoffs.order.entities.ProductOrderItem productOrderItems1) {
		getProductOrderItems1().remove(productOrderItems1);
		productOrderItems1.setOrderHeader1(null);

		return productOrderItems1;
	}

	public List<com.bizoffs.order.entities.ProductOrderItem> getProductOrderItems2() {
		return this.productOrderItems2;
	}

	public void setProductOrderItems2(List<com.bizoffs.order.entities.ProductOrderItem> productOrderItems2) {
		this.productOrderItems2 = productOrderItems2;
	}

	public com.bizoffs.order.entities.ProductOrderItem addProductOrderItems2(com.bizoffs.order.entities.ProductOrderItem productOrderItems2) {
		getProductOrderItems2().add(productOrderItems2);
		productOrderItems2.setOrderHeader2(this);

		return productOrderItems2;
	}

	public com.bizoffs.order.entities.ProductOrderItem removeProductOrderItems2(com.bizoffs.order.entities.ProductOrderItem productOrderItems2) {
		getProductOrderItems2().remove(productOrderItems2);
		productOrderItems2.setOrderHeader2(null);

		return productOrderItems2;
	}

	/*public List<ProductPromoUse> getProductPromoUses() {
		return this.productPromoUses;
	}

	public void setProductPromoUses(List<ProductPromoUse> productPromoUses) {
		this.productPromoUses = productPromoUses;
	}

	public ProductPromoUse addProductPromoUs(ProductPromoUse productPromoUs) {
		getProductPromoUses().add(productPromoUs);
		productPromoUs.setOrderHeader(this);

		return productPromoUs;
	}

	public ProductPromoUse removeProductPromoUs(ProductPromoUse productPromoUs) {
		getProductPromoUses().remove(productPromoUs);
		productPromoUs.setOrderHeader(null);

		return productPromoUs;
	}
*/
	public List<com.bizoffs.order.entities.ReturnItem> getReturnItems() {
		return this.returnItems;
	}

	public void setReturnItems(List<com.bizoffs.order.entities.ReturnItem> returnItems) {
		this.returnItems = returnItems;
	}

	public com.bizoffs.order.entities.ReturnItem addReturnItem(com.bizoffs.order.entities.ReturnItem returnItem) {
		getReturnItems().add(returnItem);
		returnItem.setOrderHeader(this);

		return returnItem;
	}

	public com.bizoffs.order.entities.ReturnItem removeReturnItem(com.bizoffs.order.entities.ReturnItem returnItem) {
		getReturnItems().remove(returnItem);
		returnItem.setOrderHeader(null);

		return returnItem;
	}

	public List<com.bizoffs.order.entities.ReturnItemResponse> getReturnItemResponses() {
		return this.returnItemResponses;
	}

	public void setReturnItemResponses(List<com.bizoffs.order.entities.ReturnItemResponse> returnItemResponses) {
		this.returnItemResponses = returnItemResponses;
	}

	public com.bizoffs.order.entities.ReturnItemResponse addReturnItemRespons(com.bizoffs.order.entities.ReturnItemResponse returnItemRespons) {
		getReturnItemResponses().add(returnItemRespons);
		returnItemRespons.setOrderHeader(this);

		return returnItemRespons;
	}

	public com.bizoffs.order.entities.ReturnItemResponse removeReturnItemRespons(com.bizoffs.order.entities.ReturnItemResponse returnItemRespons) {
		getReturnItemResponses().remove(returnItemRespons);
		returnItemRespons.setOrderHeader(null);

		return returnItemRespons;
	}

	/*public List<Shipment> getShipments() {
		return this.shipments;
	}

	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}

	public Shipment addShipment(Shipment shipment) {
		getShipments().add(shipment);
		shipment.setOrderHeader(this);

		return shipment;
	}

	public Shipment removeShipment(Shipment shipment) {
		getShipments().remove(shipment);
		shipment.setOrderHeader(null);

		return shipment;
	}

	public List<TrackingCodeOrder> getTrackingCodeOrders() {
		return this.trackingCodeOrders;
	}

	public void setTrackingCodeOrders(List<TrackingCodeOrder> trackingCodeOrders) {
		this.trackingCodeOrders = trackingCodeOrders;
	}

	public TrackingCodeOrder addTrackingCodeOrder(TrackingCodeOrder trackingCodeOrder) {
		getTrackingCodeOrders().add(trackingCodeOrder);
		trackingCodeOrder.setOrderHeader(this);

		return trackingCodeOrder;
	}

	public TrackingCodeOrder removeTrackingCodeOrder(TrackingCodeOrder trackingCodeOrder) {
		getTrackingCodeOrders().remove(trackingCodeOrder);
		trackingCodeOrder.setOrderHeader(null);

		return trackingCodeOrder;
	}

	public List<TrackingCodeOrderReturn> getTrackingCodeOrderReturns() {
		return this.trackingCodeOrderReturns;
	}

	public void setTrackingCodeOrderReturns(List<TrackingCodeOrderReturn> trackingCodeOrderReturns) {
		this.trackingCodeOrderReturns = trackingCodeOrderReturns;
	}

	public TrackingCodeOrderReturn addTrackingCodeOrderReturn(TrackingCodeOrderReturn trackingCodeOrderReturn) {
		getTrackingCodeOrderReturns().add(trackingCodeOrderReturn);
		trackingCodeOrderReturn.setOrderHeader(this);

		return trackingCodeOrderReturn;
	}

	public TrackingCodeOrderReturn removeTrackingCodeOrderReturn(TrackingCodeOrderReturn trackingCodeOrderReturn) {
		getTrackingCodeOrderReturns().remove(trackingCodeOrderReturn);
		trackingCodeOrderReturn.setOrderHeader(null);

		return trackingCodeOrderReturn;
	}
*/
	public List<com.bizoffs.order.entities.WorkOrderItemFulfillment> getWorkOrderItemFulfillments() {
		return this.workOrderItemFulfillments;
	}

	public void setWorkOrderItemFulfillments(List<com.bizoffs.order.entities.WorkOrderItemFulfillment> workOrderItemFulfillments) {
		this.workOrderItemFulfillments = workOrderItemFulfillments;
	}

	public com.bizoffs.order.entities.WorkOrderItemFulfillment addWorkOrderItemFulfillment(com.bizoffs.order.entities.WorkOrderItemFulfillment workOrderItemFulfillment) {
		getWorkOrderItemFulfillments().add(workOrderItemFulfillment);
		workOrderItemFulfillment.setOrderHeader(this);

		return workOrderItemFulfillment;
	}

	public com.bizoffs.order.entities.WorkOrderItemFulfillment removeWorkOrderItemFulfillment(com.bizoffs.order.entities.WorkOrderItemFulfillment workOrderItemFulfillment) {
		getWorkOrderItemFulfillments().remove(workOrderItemFulfillment);
		workOrderItemFulfillment.setOrderHeader(null);

		return workOrderItemFulfillment;
	}
	public String getProductStoreId() {
		return productStoreId;
	}

	public void setProductStoreId(String productStoreId) {
		this.productStoreId = productStoreId;
	}
	public String getCurrencyUom() {
		return currencyUom;
	}

	public void setCurrencyUom(String currencyUom) {
		this.currencyUom = currencyUom;
	}

	public String getBillingAccountId() {
		return billingAccountId;
	}

	public void setBillingAccountId(String billingAccountId) {
		this.billingAccountId = billingAccountId;
	}

	public StatusItem getStatusItem() {
		return statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}
}