package com.bizoffs.order.entities;

import com.bizoffs.order.entities.OrderAdjustmentBilling;
import com.bizoffs.order.entities.OrderHeader;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_ADJUSTMENT database table.
 * 
 */
@Entity
@Table(name="ORDER_ADJUSTMENT")
@NamedQuery(name="OrderAdjustment.findAll", query="SELECT o FROM OrderAdjustment o")
public class OrderAdjustment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ADJUSTMENT_ID")
	private String orderAdjustmentId;

	private BigDecimal amount;

	@Column(name="AMOUNT_ALREADY_INCLUDED")
	private BigDecimal amountAlreadyIncluded;

	private String comments;

	@Column(name="CORRESPONDING_PRODUCT_ID")
	private String correspondingProductId;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="CUSTOMER_REFERENCE_ID")
	private String customerReferenceId;

	private String description;

	@Column(name="EXEMPT_AMOUNT")
	private BigDecimal exemptAmount;

	@Column(name="INCLUDE_IN_SHIPPING")
	private String includeInShipping;

	@Column(name="INCLUDE_IN_TAX")
	private String includeInTax;

	@Column(name="IS_MANUAL")
	private String isManual;

	@Column(name="LAST_MODIFIED_BY_USER_LOGIN")
	private String lastModifiedByUserLogin;

	@Column(name="LAST_MODIFIED_DATE")
	private Timestamp lastModifiedDate;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="ORDER_ITEM_SEQ_ID")
	private String orderItemSeqId;

	@Column(name="ORIGINAL_ADJUSTMENT_ID")
	private String originalAdjustmentId;

	@Column(name="PRODUCT_FEATURE_ID")
	private String productFeatureId;

	@Column(name="PRODUCT_PROMO_ACTION_SEQ_ID")
	private String productPromoActionSeqId;

	@Column(name="PRODUCT_PROMO_RULE_ID")
	private String productPromoRuleId;

	@Column(name="RECURRING_AMOUNT")
	private BigDecimal recurringAmount;

	@Column(name="SHIP_GROUP_SEQ_ID")
	private String shipGroupSeqId;

	@Column(name="SOURCE_PERCENTAGE")
	private BigDecimal sourcePercentage;

	@Column(name="SOURCE_REFERENCE_ID")
	private String sourceReferenceId;

	//bi-directional many-to-one association to Geo
	/*@ManyToOne
	@JoinColumn(name="SECONDARY_GEO_ID")
	private Geo geo1;

	//bi-directional many-to-one association to Geo
	@ManyToOne
	@JoinColumn(name="PRIMARY_GEO_ID")
	private Geo geo2;

	//bi-directional many-to-one association to GlAccount
	@ManyToOne
	@JoinColumn(name="OVERRIDE_GL_ACCOUNT_ID")
	private GlAccount glAccount;
*/
	//bi-directional many-to-one association to OrderAdjustmentType
	@ManyToOne
	@JoinColumn(name="ORDER_ADJUSTMENT_TYPE_ID")
	private com.bizoffs.order.entities.OrderAdjustmentType orderAdjustmentType;

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private OrderHeader orderHeader;

	//bi-directional many-to-one association to ProductPromo
	/*@ManyToOne
	@JoinColumn(name="PRODUCT_PROMO_ID")
	private ProductPromo productPromo;

	//bi-directional many-to-one association to TaxAuthority
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="TAX_AUTH_GEO_ID", referencedColumnName="TAX_AUTH_GEO_ID"),
		@JoinColumn(name="TAX_AUTH_PARTY_ID", referencedColumnName="TAX_AUTH_PARTY_ID")
		})
	private TaxAuthority taxAuthority;*/

	//bi-directional many-to-one association to TaxAuthorityRateProduct
	/*@ManyToOne
	@JoinColumn(name="TAX_AUTHORITY_RATE_SEQ_ID")
	private TaxAuthorityRateProduct taxAuthorityRateProduct;

	//bi-directional many-to-one association to UserLogin
	@ManyToOne
	@JoinColumn(name="CREATED_BY_USER_LOGIN")
	private UserLogin userLogin;*/

	//bi-directional many-to-one association to OrderAdjustmentAttribute
	@OneToMany(mappedBy="orderAdjustment")
	private List<com.bizoffs.order.entities.OrderAdjustmentAttribute> orderAdjustmentAttributes;

	//bi-directional many-to-one association to OrderAdjustmentBilling
	@OneToMany(mappedBy="orderAdjustment")
	private List<OrderAdjustmentBilling> orderAdjustmentBillings;

	//bi-directional many-to-one association to ReturnAdjustment
	@OneToMany(mappedBy="orderAdjustment")
	private List<com.bizoffs.order.entities.ReturnAdjustment> returnAdjustments;

	public OrderAdjustment() {
	}

	public String getOrderAdjustmentId() {
		return this.orderAdjustmentId;
	}

	public void setOrderAdjustmentId(String orderAdjustmentId) {
		this.orderAdjustmentId = orderAdjustmentId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmountAlreadyIncluded() {
		return this.amountAlreadyIncluded;
	}

	public void setAmountAlreadyIncluded(BigDecimal amountAlreadyIncluded) {
		this.amountAlreadyIncluded = amountAlreadyIncluded;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCorrespondingProductId() {
		return this.correspondingProductId;
	}

	public void setCorrespondingProductId(String correspondingProductId) {
		this.correspondingProductId = correspondingProductId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
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

	public String getCustomerReferenceId() {
		return this.customerReferenceId;
	}

	public void setCustomerReferenceId(String customerReferenceId) {
		this.customerReferenceId = customerReferenceId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getExemptAmount() {
		return this.exemptAmount;
	}

	public void setExemptAmount(BigDecimal exemptAmount) {
		this.exemptAmount = exemptAmount;
	}

	public String getIncludeInShipping() {
		return this.includeInShipping;
	}

	public void setIncludeInShipping(String includeInShipping) {
		this.includeInShipping = includeInShipping;
	}

	public String getIncludeInTax() {
		return this.includeInTax;
	}

	public void setIncludeInTax(String includeInTax) {
		this.includeInTax = includeInTax;
	}

	public String getIsManual() {
		return this.isManual;
	}

	public void setIsManual(String isManual) {
		this.isManual = isManual;
	}

	public String getLastModifiedByUserLogin() {
		return this.lastModifiedByUserLogin;
	}

	public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
		this.lastModifiedByUserLogin = lastModifiedByUserLogin;
	}

	public Timestamp getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Timestamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
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

	public String getOrderItemSeqId() {
		return this.orderItemSeqId;
	}

	public void setOrderItemSeqId(String orderItemSeqId) {
		this.orderItemSeqId = orderItemSeqId;
	}

	public String getOriginalAdjustmentId() {
		return this.originalAdjustmentId;
	}

	public void setOriginalAdjustmentId(String originalAdjustmentId) {
		this.originalAdjustmentId = originalAdjustmentId;
	}

	public String getProductFeatureId() {
		return this.productFeatureId;
	}

	public void setProductFeatureId(String productFeatureId) {
		this.productFeatureId = productFeatureId;
	}

	public String getProductPromoActionSeqId() {
		return this.productPromoActionSeqId;
	}

	public void setProductPromoActionSeqId(String productPromoActionSeqId) {
		this.productPromoActionSeqId = productPromoActionSeqId;
	}

	public String getProductPromoRuleId() {
		return this.productPromoRuleId;
	}

	public void setProductPromoRuleId(String productPromoRuleId) {
		this.productPromoRuleId = productPromoRuleId;
	}

	public BigDecimal getRecurringAmount() {
		return this.recurringAmount;
	}

	public void setRecurringAmount(BigDecimal recurringAmount) {
		this.recurringAmount = recurringAmount;
	}

	public String getShipGroupSeqId() {
		return this.shipGroupSeqId;
	}

	public void setShipGroupSeqId(String shipGroupSeqId) {
		this.shipGroupSeqId = shipGroupSeqId;
	}

	public BigDecimal getSourcePercentage() {
		return this.sourcePercentage;
	}

	public void setSourcePercentage(BigDecimal sourcePercentage) {
		this.sourcePercentage = sourcePercentage;
	}

	public String getSourceReferenceId() {
		return this.sourceReferenceId;
	}

	public void setSourceReferenceId(String sourceReferenceId) {
		this.sourceReferenceId = sourceReferenceId;
	}

	/*public Geo getGeo1() {
		return this.geo1;
	}

	public void setGeo1(Geo geo1) {
		this.geo1 = geo1;
	}

	public Geo getGeo2() {
		return this.geo2;
	}

	public void setGeo2(Geo geo2) {
		this.geo2 = geo2;
	}

	public GlAccount getGlAccount() {
		return this.glAccount;
	}

	public void setGlAccount(GlAccount glAccount) {
		this.glAccount = glAccount;
	}*/

	public com.bizoffs.order.entities.OrderAdjustmentType getOrderAdjustmentType() {
		return this.orderAdjustmentType;
	}

	public void setOrderAdjustmentType(com.bizoffs.order.entities.OrderAdjustmentType orderAdjustmentType) {
		this.orderAdjustmentType = orderAdjustmentType;
	}

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

/*	public ProductPromo getProductPromo() {
		return this.productPromo;
	}

	public void setProductPromo(ProductPromo productPromo) {
		this.productPromo = productPromo;
	}

	public TaxAuthority getTaxAuthority() {
		return this.taxAuthority;
	}

	public void setTaxAuthority(TaxAuthority taxAuthority) {
		this.taxAuthority = taxAuthority;
	}

	public TaxAuthorityRateProduct getTaxAuthorityRateProduct() {
		return this.taxAuthorityRateProduct;
	}

	public void setTaxAuthorityRateProduct(TaxAuthorityRateProduct taxAuthorityRateProduct) {
		this.taxAuthorityRateProduct = taxAuthorityRateProduct;
	}

	public UserLogin getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}*/

	public List<com.bizoffs.order.entities.OrderAdjustmentAttribute> getOrderAdjustmentAttributes() {
		return this.orderAdjustmentAttributes;
	}

	public void setOrderAdjustmentAttributes(List<com.bizoffs.order.entities.OrderAdjustmentAttribute> orderAdjustmentAttributes) {
		this.orderAdjustmentAttributes = orderAdjustmentAttributes;
	}

	public com.bizoffs.order.entities.OrderAdjustmentAttribute addOrderAdjustmentAttribute(com.bizoffs.order.entities.OrderAdjustmentAttribute orderAdjustmentAttribute) {
		getOrderAdjustmentAttributes().add(orderAdjustmentAttribute);
		orderAdjustmentAttribute.setOrderAdjustment(this);

		return orderAdjustmentAttribute;
	}

	public com.bizoffs.order.entities.OrderAdjustmentAttribute removeOrderAdjustmentAttribute(com.bizoffs.order.entities.OrderAdjustmentAttribute orderAdjustmentAttribute) {
		getOrderAdjustmentAttributes().remove(orderAdjustmentAttribute);
		orderAdjustmentAttribute.setOrderAdjustment(null);

		return orderAdjustmentAttribute;
	}

	public List<OrderAdjustmentBilling> getOrderAdjustmentBillings() {
		return this.orderAdjustmentBillings;
	}

	public void setOrderAdjustmentBillings(List<OrderAdjustmentBilling> orderAdjustmentBillings) {
		this.orderAdjustmentBillings = orderAdjustmentBillings;
	}

	public OrderAdjustmentBilling addOrderAdjustmentBilling(OrderAdjustmentBilling orderAdjustmentBilling) {
		getOrderAdjustmentBillings().add(orderAdjustmentBilling);
		orderAdjustmentBilling.setOrderAdjustment(this);

		return orderAdjustmentBilling;
	}

	public OrderAdjustmentBilling removeOrderAdjustmentBilling(OrderAdjustmentBilling orderAdjustmentBilling) {
		getOrderAdjustmentBillings().remove(orderAdjustmentBilling);
		orderAdjustmentBilling.setOrderAdjustment(null);

		return orderAdjustmentBilling;
	}

	public List<com.bizoffs.order.entities.ReturnAdjustment> getReturnAdjustments() {
		return this.returnAdjustments;
	}

	public void setReturnAdjustments(List<com.bizoffs.order.entities.ReturnAdjustment> returnAdjustments) {
		this.returnAdjustments = returnAdjustments;
	}

	public com.bizoffs.order.entities.ReturnAdjustment addReturnAdjustment(com.bizoffs.order.entities.ReturnAdjustment returnAdjustment) {
		getReturnAdjustments().add(returnAdjustment);
		returnAdjustment.setOrderAdjustment(this);

		return returnAdjustment;
	}

	public com.bizoffs.order.entities.ReturnAdjustment removeReturnAdjustment(com.bizoffs.order.entities.ReturnAdjustment returnAdjustment) {
		getReturnAdjustments().remove(returnAdjustment);
		returnAdjustment.setOrderAdjustment(null);

		return returnAdjustment;
	}

}