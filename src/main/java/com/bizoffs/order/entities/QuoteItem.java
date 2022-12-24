package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the QUOTE_ITEM database table.
 * 
 */
@Entity
@Table(name="QUOTE_ITEM")
@NamedQuery(name="QuoteItem.findAll", query="SELECT q FROM QuoteItem q")
public class QuoteItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private QuoteItemPK id;

	private String comments;

	@Column(name="CONFIG_ID")
	private String configId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="ESTIMATED_DELIVERY_DATE")
	private Timestamp estimatedDeliveryDate;

	@Column(name="IS_PROMO")
	private String isPromo;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="LEAD_TIME_DAYS")
	private BigDecimal leadTimeDays;

	private BigDecimal quantity;

	@Column(name="QUOTE_UNIT_PRICE")
	private BigDecimal quoteUnitPrice;

	@Column(name="RESERV_LENGTH")
	private BigDecimal reservLength;

	@Column(name="RESERV_PERSONS")
	private BigDecimal reservPersons;

	@Column(name="RESERV_START")
	private Timestamp reservStart;

	@Column(name="SELECTED_AMOUNT")
	private BigDecimal selectedAmount;

	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="quoteItem")
	private List<OrderItem> orderItems;

	//bi-directional many-to-one association to CustRequest
	@ManyToOne
	@JoinColumn(name="CUST_REQUEST_ID", insertable=false, updatable=false)
	private CustRequest custRequest;

	//bi-directional many-to-one association to CustRequestItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CUST_REQUEST_ID", referencedColumnName="CUST_REQUEST_ID", insertable=false, updatable=false),
		@JoinColumn(name="CUST_REQUEST_ITEM_SEQ_ID", referencedColumnName="CUST_REQUEST_ITEM_SEQ_ID", insertable=false, updatable=false)
		})
	private CustRequestItem custRequestItem;

	//bi-directional many-to-one association to DeliverableType
	/*@ManyToOne
	@JoinColumn(name="DELIVERABLE_TYPE_ID")
	private DeliverableType deliverableType;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	//bi-directional many-to-one association to ProductFeature
	@ManyToOne
	@JoinColumn(name="PRODUCT_FEATURE_ID")
	private ProductFeature productFeature;*/

	//bi-directional many-to-one association to Quote
	@ManyToOne
	@JoinColumn(name="QUOTE_ID", insertable=false, updatable=false)
	private Quote quote;

	//bi-directional many-to-one association to SkillType
/*	@ManyToOne
	@JoinColumn(name="SKILL_TYPE_ID")
	private SkillType skillType;

	//bi-directional many-to-one association to Uom
	@ManyToOne
	@JoinColumn(name="UOM_ID")
	private Uom uom;

	//bi-directional many-to-one association to WorkEffort
	@ManyToOne
	@JoinColumn(name="WORK_EFFORT_ID")
	private WorkEffort workEffort;*/

	public QuoteItem() {
	}

	public QuoteItemPK getId() {
		return this.id;
	}

	public void setId(QuoteItemPK id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	public Timestamp getEstimatedDeliveryDate() {
		return this.estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Timestamp estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public String getIsPromo() {
		return this.isPromo;
	}

	public void setIsPromo(String isPromo) {
		this.isPromo = isPromo;
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

	public BigDecimal getLeadTimeDays() {
		return this.leadTimeDays;
	}

	public void setLeadTimeDays(BigDecimal leadTimeDays) {
		this.leadTimeDays = leadTimeDays;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getQuoteUnitPrice() {
		return this.quoteUnitPrice;
	}

	public void setQuoteUnitPrice(BigDecimal quoteUnitPrice) {
		this.quoteUnitPrice = quoteUnitPrice;
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

	public BigDecimal getSelectedAmount() {
		return this.selectedAmount;
	}

	public void setSelectedAmount(BigDecimal selectedAmount) {
		this.selectedAmount = selectedAmount;
	}

	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public OrderItem addOrderItem(OrderItem orderItem) {
		getOrderItems().add(orderItem);
		orderItem.setQuoteItem(this);

		return orderItem;
	}

	public OrderItem removeOrderItem(OrderItem orderItem) {
		getOrderItems().remove(orderItem);
		orderItem.setQuoteItem(null);

		return orderItem;
	}

	public CustRequest getCustRequest() {
		return this.custRequest;
	}

	public void setCustRequest(CustRequest custRequest) {
		this.custRequest = custRequest;
	}

	public CustRequestItem getCustRequestItem() {
		return this.custRequestItem;
	}

	public void setCustRequestItem(CustRequestItem custRequestItem) {
		this.custRequestItem = custRequestItem;
	}

	/*public DeliverableType getDeliverableType() {
		return this.deliverableType;
	}

	public void setDeliverableType(DeliverableType deliverableType) {
		this.deliverableType = deliverableType;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductFeature getProductFeature() {
		return this.productFeature;
	}

	public void setProductFeature(ProductFeature productFeature) {
		this.productFeature = productFeature;
	}

	public Quote getQuote() {
		return this.quote;
	}*/

	public void setQuote(Quote quote) {
		this.quote = quote;
	}

	/*public SkillType getSkillType() {
		return this.skillType;
	}

	public void setSkillType(SkillType skillType) {
		this.skillType = skillType;
	}

	public Uom getUom() {
		return this.uom;
	}

	public void setUom(Uom uom) {
		this.uom = uom;
	}

	public WorkEffort getWorkEffort() {
		return this.workEffort;
	}

	public void setWorkEffort(WorkEffort workEffort) {
		this.workEffort = workEffort;
	}*/

}