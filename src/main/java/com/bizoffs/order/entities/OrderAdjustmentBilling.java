package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_ADJUSTMENT_BILLING database table.
 * 
 */
@Entity
@Table(name="ORDER_ADJUSTMENT_BILLING")
@NamedQuery(name="OrderAdjustmentBilling.findAll", query="SELECT o FROM OrderAdjustmentBilling o")
public class OrderAdjustmentBilling implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderAdjustmentBillingPK id;

	private BigDecimal amount;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to InvoiceItem
/*
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="INVOICE_ID", referencedColumnName="INVOICE_ID"),
		@JoinColumn(name="INVOICE_ITEM_SEQ_ID", referencedColumnName="INVOICE_ITEM_SEQ_ID")
		})
	private InvoiceItem invoiceItem;
*/

	//bi-directional many-to-one association to OrderAdjustment
	@ManyToOne
	@JoinColumn(name="ORDER_ADJUSTMENT_ID")
	private com.bizoffs.order.entities.OrderAdjustment orderAdjustment;

	public OrderAdjustmentBilling() {
	}

	public OrderAdjustmentBillingPK getId() {
		return this.id;
	}

	public void setId(OrderAdjustmentBillingPK id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	/*public InvoiceItem getInvoiceItem() {
		return this.invoiceItem;
	}

	public void setInvoiceItem(InvoiceItem invoiceItem) {
		this.invoiceItem = invoiceItem;
	}*/

	public com.bizoffs.order.entities.OrderAdjustment getOrderAdjustment() {
		return this.orderAdjustment;
	}

	public void setOrderAdjustment(com.bizoffs.order.entities.OrderAdjustment orderAdjustment) {
		this.orderAdjustment = orderAdjustment;
	}

}