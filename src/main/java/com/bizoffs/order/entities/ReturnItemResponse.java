package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the RETURN_ITEM_RESPONSE database table.
 * 
 */
@Entity
@Table(name="RETURN_ITEM_RESPONSE")
@NamedQuery(name="ReturnItemResponse.findAll", query="SELECT r FROM ReturnItemResponse r")
public class ReturnItemResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RETURN_ITEM_RESPONSE_ID")
	private String returnItemResponseId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="RESPONSE_AMOUNT")
	private BigDecimal responseAmount;

	@Column(name="RESPONSE_DATE")
	private Timestamp responseDate;

	//bi-directional many-to-one association to ReturnItem
	@OneToMany(mappedBy="returnItemResponse")
	private List<ReturnItem> returnItems;

	//bi-directional many-to-one association to BillingAccount
	/*@ManyToOne
	@JoinColumn(name="BILLING_ACCOUNT_ID")
	private BillingAccount billingAccount;

	//bi-directional many-to-one association to FinAccountTran
	@ManyToOne
	@JoinColumn(name="FIN_ACCOUNT_TRANS_ID")
	private FinAccountTran finAccountTran;
*/
	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="REPLACEMENT_ORDER_ID")
	private OrderHeader orderHeader;

	//bi-directional many-to-one association to OrderPaymentPreference
	@ManyToOne
	@JoinColumn(name="ORDER_PAYMENT_PREFERENCE_ID")
	private OrderPaymentPreference orderPaymentPreference;

	//bi-directional many-to-one association to Payment
/*	@ManyToOne
	@JoinColumn(name="PAYMENT_ID")
	private Payment payment;*/

	public ReturnItemResponse() {
	}

	public String getReturnItemResponseId() {
		return this.returnItemResponseId;
	}

	public void setReturnItemResponseId(String returnItemResponseId) {
		this.returnItemResponseId = returnItemResponseId;
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

	public BigDecimal getResponseAmount() {
		return this.responseAmount;
	}

	public void setResponseAmount(BigDecimal responseAmount) {
		this.responseAmount = responseAmount;
	}

	public Timestamp getResponseDate() {
		return this.responseDate;
	}

	public void setResponseDate(Timestamp responseDate) {
		this.responseDate = responseDate;
	}

	public List<ReturnItem> getReturnItems() {
		return this.returnItems;
	}

	public void setReturnItems(List<ReturnItem> returnItems) {
		this.returnItems = returnItems;
	}

	public ReturnItem addReturnItem(ReturnItem returnItem) {
		getReturnItems().add(returnItem);
		returnItem.setReturnItemResponse(this);

		return returnItem;
	}

	public ReturnItem removeReturnItem(ReturnItem returnItem) {
		getReturnItems().remove(returnItem);
		returnItem.setReturnItemResponse(null);

		return returnItem;
	}

	/*public BillingAccount getBillingAccount() {
		return this.billingAccount;
	}

	public void setBillingAccount(BillingAccount billingAccount) {
		this.billingAccount = billingAccount;
	}

	public FinAccountTran getFinAccountTran() {
		return this.finAccountTran;
	}

	public void setFinAccountTran(FinAccountTran finAccountTran) {
		this.finAccountTran = finAccountTran;
	}*/

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public OrderPaymentPreference getOrderPaymentPreference() {
		return this.orderPaymentPreference;
	}

	public void setOrderPaymentPreference(OrderPaymentPreference orderPaymentPreference) {
		this.orderPaymentPreference = orderPaymentPreference;
	}

	/*public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}*/

}