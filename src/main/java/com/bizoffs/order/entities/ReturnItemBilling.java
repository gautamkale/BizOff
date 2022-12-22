package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the RETURN_ITEM_BILLING database table.
 * 
 */
@Entity
@Table(name="RETURN_ITEM_BILLING")
@NamedQuery(name="ReturnItemBilling.findAll", query="SELECT r FROM ReturnItemBilling r")
public class ReturnItemBilling implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReturnItemBillingPK id;

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
	private InvoiceItem invoiceItem;*/

	//bi-directional many-to-one association to ReturnHeader
	@ManyToOne
	@JoinColumn(name="RETURN_ID")
	private ReturnHeader returnHeader;

	//bi-directional many-to-one association to ReturnItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="RETURN_ID", referencedColumnName="RETURN_ID"),
		@JoinColumn(name="RETURN_ITEM_SEQ_ID", referencedColumnName="RETURN_ITEM_SEQ_ID")
		})
	private ReturnItem returnItem;

	//bi-directional many-to-one association to ShipmentReceipt
	/*@ManyToOne
	@JoinColumn(name="SHIPMENT_RECEIPT_ID")
	private ShipmentReceipt shipmentReceipt;*/

	public ReturnItemBilling() {
	}

	public ReturnItemBillingPK getId() {
		return this.id;
	}

	public void setId(ReturnItemBillingPK id) {
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
	}*/

	public ReturnHeader getReturnHeader() {
		return this.returnHeader;
	}

	public void setReturnHeader(ReturnHeader returnHeader) {
		this.returnHeader = returnHeader;
	}

	public ReturnItem getReturnItem() {
		return this.returnItem;
	}

	public void setReturnItem(ReturnItem returnItem) {
		this.returnItem = returnItem;
	}

	/*public ShipmentReceipt getShipmentReceipt() {
		return this.shipmentReceipt;
	}

	public void setShipmentReceipt(ShipmentReceipt shipmentReceipt) {
		this.shipmentReceipt = shipmentReceipt;
	}*/

}