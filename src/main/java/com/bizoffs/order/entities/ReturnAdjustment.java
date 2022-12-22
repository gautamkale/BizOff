package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the RETURN_ADJUSTMENT database table.
 * 
 */
@Entity
@Table(name="RETURN_ADJUSTMENT")
@NamedQuery(name="ReturnAdjustment.findAll", query="SELECT r FROM ReturnAdjustment r")
public class ReturnAdjustment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RETURN_ADJUSTMENT_ID")
	private String returnAdjustmentId;

	private BigDecimal amount;

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

	@Column(name="LAST_MODIFIED_BY_USER_LOGIN")
	private String lastModifiedByUserLogin;

	@Column(name="LAST_MODIFIED_DATE")
	private Timestamp lastModifiedDate;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="PRODUCT_FEATURE_ID")
	private String productFeatureId;

	@Column(name="PRODUCT_PROMO_ACTION_SEQ_ID")
	private String productPromoActionSeqId;

	@Column(name="PRODUCT_PROMO_RULE_ID")
	private String productPromoRuleId;

	@Column(name="RETURN_ITEM_SEQ_ID")
	private String returnItemSeqId;

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
	//bi-directional many-to-one association to OrderAdjustment
	@ManyToOne
	@JoinColumn(name="ORDER_ADJUSTMENT_ID")
	private OrderAdjustment orderAdjustment;

	//bi-directional many-to-one association to ProductPromo
	/*@ManyToOne
	@JoinColumn(name="PRODUCT_PROMO_ID")
	private ProductPromo productPromo;*/

	//bi-directional many-to-one association to ReturnAdjustmentType
	@ManyToOne
	@JoinColumn(name="RETURN_ADJUSTMENT_TYPE_ID")
	private ReturnAdjustmentType returnAdjustmentType;

	//bi-directional many-to-one association to ReturnHeader
	@ManyToOne
	@JoinColumn(name="RETURN_ID")
	private ReturnHeader returnHeader;

	//bi-directional many-to-one association to ReturnType
	@ManyToOne
	@JoinColumn(name="RETURN_TYPE_ID")
	private ReturnType returnType;

	//bi-directional many-to-one association to TaxAuthority
/*
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="TAX_AUTH_GEO_ID", referencedColumnName="TAX_AUTH_GEO_ID"),
		@JoinColumn(name="TAX_AUTH_PARTY_ID", referencedColumnName="TAX_AUTH_PARTY_ID")
		})
	private TaxAuthority taxAuthority;

	//bi-directional many-to-one association to TaxAuthorityRateProduct
	@ManyToOne
	@JoinColumn(name="TAX_AUTHORITY_RATE_SEQ_ID")
	private TaxAuthorityRateProduct taxAuthorityRateProduct;

	//bi-directional many-to-one association to UserLogin
	@ManyToOne
	@JoinColumn(name="CREATED_BY_USER_LOGIN")
	private UserLogin userLogin;
*/

	public ReturnAdjustment() {
	}

	public String getReturnAdjustmentId() {
		return this.returnAdjustmentId;
	}

	public void setReturnAdjustmentId(String returnAdjustmentId) {
		this.returnAdjustmentId = returnAdjustmentId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public String getReturnItemSeqId() {
		return this.returnItemSeqId;
	}

	public void setReturnItemSeqId(String returnItemSeqId) {
		this.returnItemSeqId = returnItemSeqId;
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

	public OrderAdjustment getOrderAdjustment() {
		return this.orderAdjustment;
	}

	public void setOrderAdjustment(OrderAdjustment orderAdjustment) {
		this.orderAdjustment = orderAdjustment;
	}

	/*public ProductPromo getProductPromo() {
		return this.productPromo;
	}

	public void setProductPromo(ProductPromo productPromo) {
		this.productPromo = productPromo;
	}*/

	public ReturnAdjustmentType getReturnAdjustmentType() {
		return this.returnAdjustmentType;
	}

	public void setReturnAdjustmentType(ReturnAdjustmentType returnAdjustmentType) {
		this.returnAdjustmentType = returnAdjustmentType;
	}

	public ReturnHeader getReturnHeader() {
		return this.returnHeader;
	}

	public void setReturnHeader(ReturnHeader returnHeader) {
		this.returnHeader = returnHeader;
	}

	public ReturnType getReturnType() {
		return this.returnType;
	}

	public void setReturnType(ReturnType returnType) {
		this.returnType = returnType;
	}

/*
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
*/

	/*public UserLogin getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}*/

}