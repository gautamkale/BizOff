package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_PAYMENT_PREFERENCE database table.
 * 
 */
@Entity
@Table(name="ORDER_PAYMENT_PREFERENCE")
@NamedQuery(name="OrderPaymentPreference.findAll", query="SELECT o FROM OrderPaymentPreference o")
public class OrderPaymentPreference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_PAYMENT_PREFERENCE_ID")
	private String orderPaymentPreferenceId;

	@Column(name="BILLING_POSTAL_CODE")
	private String billingPostalCode;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_MODIFIED_BY_USER_LOGIN")
	private String lastModifiedByUserLogin;

	@Column(name="LAST_MODIFIED_DATE")
	private Timestamp lastModifiedDate;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="MANUAL_AUTH_CODE")
	private String manualAuthCode;

	@Column(name="MANUAL_REF_NUM")
	private String manualRefNum;

	@Column(name="MAX_AMOUNT")
	private BigDecimal maxAmount;

	@Column(name="NEEDS_NSF_RETRY")
	private String needsNsfRetry;

	@Column(name="ORDER_ITEM_SEQ_ID")
	private String orderItemSeqId;

	@Column(name="OVERFLOW_FLAG")
	private String overflowFlag;

	@Column(name="PRESENT_FLAG")
	private String presentFlag;

	@Column(name="PROCESS_ATTEMPT")
	private BigDecimal processAttempt;

	@Column(name="SECURITY_CODE")
	private String securityCode;

	@Column(name="SHIP_GROUP_SEQ_ID")
	private String shipGroupSeqId;

	@Column(name="SWIPED_FLAG")
	private String swipedFlag;

	private String track2;

	//bi-directional many-to-one association to FinAccount
	/*@ManyToOne
	@JoinColumn(name="FIN_ACCOUNT_ID")
	private FinAccount finAccount;
*/
	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private OrderHeader orderHeader;

	//bi-directional many-to-one association to PaymentMethod
	/*@ManyToOne
	@JoinColumn(name="PAYMENT_METHOD_ID")
	private PaymentMethod paymentMethod;

	//bi-directional many-to-one association to PaymentMethodType
	@ManyToOne
	@JoinColumn(name="PAYMENT_METHOD_TYPE_ID")
	private PaymentMethodType paymentMethodType;

	//bi-directional many-to-one association to ProductPricePurpose
	@ManyToOne
	@JoinColumn(name="PRODUCT_PRICE_PURPOSE_ID")
	private ProductPricePurpose productPricePurpose;

	//bi-directional many-to-one association to StatusItem
	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	//bi-directional many-to-one association to UserLogin
	@ManyToOne
	@JoinColumn(name="CREATED_BY_USER_LOGIN")
	private UserLogin userLogin;

	//bi-directional many-to-one association to Payment
	@OneToMany(mappedBy="orderPaymentPreference")
	private List<Payment> payments;

	//bi-directional many-to-one association to PaymentGatewayResponse
	@OneToMany(mappedBy="orderPaymentPreference")
	private List<PaymentGatewayResponse> paymentGatewayResponses;*/

	//bi-directional many-to-one association to ReturnItemResponse
	@OneToMany(mappedBy="orderPaymentPreference")
	private List<ReturnItemResponse> returnItemResponses;

	public OrderPaymentPreference() {
	}

	public String getOrderPaymentPreferenceId() {
		return this.orderPaymentPreferenceId;
	}

	public void setOrderPaymentPreferenceId(String orderPaymentPreferenceId) {
		this.orderPaymentPreferenceId = orderPaymentPreferenceId;
	}

	public String getBillingPostalCode() {
		return this.billingPostalCode;
	}

	public void setBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
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

	public String getManualAuthCode() {
		return this.manualAuthCode;
	}

	public void setManualAuthCode(String manualAuthCode) {
		this.manualAuthCode = manualAuthCode;
	}

	public String getManualRefNum() {
		return this.manualRefNum;
	}

	public void setManualRefNum(String manualRefNum) {
		this.manualRefNum = manualRefNum;
	}

	public BigDecimal getMaxAmount() {
		return this.maxAmount;
	}

	public void setMaxAmount(BigDecimal maxAmount) {
		this.maxAmount = maxAmount;
	}

	public String getNeedsNsfRetry() {
		return this.needsNsfRetry;
	}

	public void setNeedsNsfRetry(String needsNsfRetry) {
		this.needsNsfRetry = needsNsfRetry;
	}

	public String getOrderItemSeqId() {
		return this.orderItemSeqId;
	}

	public void setOrderItemSeqId(String orderItemSeqId) {
		this.orderItemSeqId = orderItemSeqId;
	}

	public String getOverflowFlag() {
		return this.overflowFlag;
	}

	public void setOverflowFlag(String overflowFlag) {
		this.overflowFlag = overflowFlag;
	}

	public String getPresentFlag() {
		return this.presentFlag;
	}

	public void setPresentFlag(String presentFlag) {
		this.presentFlag = presentFlag;
	}

	public BigDecimal getProcessAttempt() {
		return this.processAttempt;
	}

	public void setProcessAttempt(BigDecimal processAttempt) {
		this.processAttempt = processAttempt;
	}

	public String getSecurityCode() {
		return this.securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getShipGroupSeqId() {
		return this.shipGroupSeqId;
	}

	public void setShipGroupSeqId(String shipGroupSeqId) {
		this.shipGroupSeqId = shipGroupSeqId;
	}

	public String getSwipedFlag() {
		return this.swipedFlag;
	}

	public void setSwipedFlag(String swipedFlag) {
		this.swipedFlag = swipedFlag;
	}

	public String getTrack2() {
		return this.track2;
	}

	public void setTrack2(String track2) {
		this.track2 = track2;
	}

	/*public FinAccount getFinAccount() {
		return this.finAccount;
	}

	public void setFinAccount(FinAccount finAccount) {
		this.finAccount = finAccount;
	}*/

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	/*public PaymentMethod getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public PaymentMethodType getPaymentMethodType() {
		return this.paymentMethodType;
	}

	public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}

	public ProductPricePurpose getProductPricePurpose() {
		return this.productPricePurpose;
	}

	public void setProductPricePurpose(ProductPricePurpose productPricePurpose) {
		this.productPricePurpose = productPricePurpose;
	}

	public StatusItem getStatusItem() {
		return this.statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}

	public UserLogin getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}*/

	/*public List<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public Payment addPayment(Payment payment) {
		getPayments().add(payment);
		payment.setOrderPaymentPreference(this);

		return payment;
	}

	public Payment removePayment(Payment payment) {
		getPayments().remove(payment);
		payment.setOrderPaymentPreference(null);

		return payment;
	}

	public List<PaymentGatewayResponse> getPaymentGatewayResponses() {
		return this.paymentGatewayResponses;
	}

	public void setPaymentGatewayResponses(List<PaymentGatewayResponse> paymentGatewayResponses) {
		this.paymentGatewayResponses = paymentGatewayResponses;
	}

	public PaymentGatewayResponse addPaymentGatewayRespons(PaymentGatewayResponse paymentGatewayRespons) {
		getPaymentGatewayResponses().add(paymentGatewayRespons);
		paymentGatewayRespons.setOrderPaymentPreference(this);

		return paymentGatewayRespons;
	}

	public PaymentGatewayResponse removePaymentGatewayRespons(PaymentGatewayResponse paymentGatewayRespons) {
		getPaymentGatewayResponses().remove(paymentGatewayRespons);
		paymentGatewayRespons.setOrderPaymentPreference(null);

		return paymentGatewayRespons;
	}
*/
	public List<ReturnItemResponse> getReturnItemResponses() {
		return this.returnItemResponses;
	}

	public void setReturnItemResponses(List<ReturnItemResponse> returnItemResponses) {
		this.returnItemResponses = returnItemResponses;
	}

	public ReturnItemResponse addReturnItemRespons(ReturnItemResponse returnItemRespons) {
		getReturnItemResponses().add(returnItemRespons);
		returnItemRespons.setOrderPaymentPreference(this);

		return returnItemRespons;
	}

	public ReturnItemResponse removeReturnItemRespons(ReturnItemResponse returnItemRespons) {
		getReturnItemResponses().remove(returnItemRespons);
		returnItemRespons.setOrderPaymentPreference(null);

		return returnItemRespons;
	}

}