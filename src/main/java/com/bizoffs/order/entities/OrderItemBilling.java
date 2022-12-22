package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_ITEM_BILLING database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_BILLING")
@NamedQuery(name="OrderItemBilling.findAll", query="SELECT o FROM OrderItemBilling o")
public class OrderItemBilling implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemBillingPK id;

	private BigDecimal amount;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	private BigDecimal quantity;

	//bi-directional many-to-one association to InvoiceItem
	/*@ManyToOne
	@JoinColumns({
		@JoinColumn(name="INVOICE_ID", referencedColumnName="INVOICE_ID"),
		@JoinColumn(name="INVOICE_ITEM_SEQ_ID", referencedColumnName="INVOICE_ITEM_SEQ_ID")
		})
	private InvoiceItem invoiceItem;

	//bi-directional many-to-one association to ItemIssuance
	@ManyToOne
	@JoinColumn(name="ITEM_ISSUANCE_ID")
	private ItemIssuance itemIssuance;
*/
	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader;

	//bi-directional many-to-one association to OrderItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID", insertable=false, updatable=false),
		@JoinColumn(name="ORDER_ITEM_SEQ_ID", referencedColumnName="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
		})
	private OrderItem orderItem;

	//bi-directional many-to-one association to ShipmentReceipt
/*
	@ManyToOne
	@JoinColumn(name="SHIPMENT_RECEIPT_ID")
	private ShipmentReceipt shipmentReceipt;
*/

	public OrderItemBilling() {
	}

	public OrderItemBillingPK getId() {
		return this.id;
	}

	public void setId(OrderItemBillingPK id) {
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

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	/*public InvoiceItem getInvoiceItem() {
		return this.invoiceItem;
	}

	public void setInvoiceItem(InvoiceItem invoiceItem) {
		this.invoiceItem = invoiceItem;
	}

	public ItemIssuance getItemIssuance() {
		return this.itemIssuance;
	}

	public void setItemIssuance(ItemIssuance itemIssuance) {
		this.itemIssuance = itemIssuance;
	}*/

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public OrderItem getOrderItem() {
		return this.orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	/*public ShipmentReceipt getShipmentReceipt() {
		return this.shipmentReceipt;
	}

	public void setShipmentReceipt(ShipmentReceipt shipmentReceipt) {
		this.shipmentReceipt = shipmentReceipt;
	}*/

}