package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the RETURN_ITEM database table.
 * 
 */
@Entity
@Table(name="RETURN_ITEM")
@NamedQuery(name="ReturnItem.findAll", query="SELECT r FROM ReturnItem r")
public class ReturnItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReturnItemPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="RECEIVED_QUANTITY")
	private BigDecimal receivedQuantity;

	@Column(name="RETURN_PRICE")
	private BigDecimal returnPrice;

	@Column(name="RETURN_QUANTITY")
	private BigDecimal returnQuantity;

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private OrderHeader orderHeader;

	//bi-directional many-to-one association to OrderItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID"),
		@JoinColumn(name="ORDER_ITEM_SEQ_ID", referencedColumnName="ORDER_ITEM_SEQ_ID")
		})
	private OrderItem orderItem;

	//bi-directional many-to-one association to Product
/*	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;*/

	//bi-directional many-to-one association to ReturnHeader
	@ManyToOne
	@JoinColumn(name="RETURN_ID")
	private ReturnHeader returnHeader;

	//bi-directional many-to-one association to ReturnItemResponse
	@ManyToOne
	@JoinColumn(name="RETURN_ITEM_RESPONSE_ID")
	private ReturnItemResponse returnItemResponse;

	//bi-directional many-to-one association to ReturnItemType
	@ManyToOne
	@JoinColumn(name="RETURN_ITEM_TYPE_ID")
	private ReturnItemType returnItemType;

	//bi-directional many-to-one association to ReturnReason
	@ManyToOne
	@JoinColumn(name="RETURN_REASON_ID")
	private ReturnReason returnReason;

	//bi-directional many-to-one association to ReturnType
	@ManyToOne
	@JoinColumn(name="RETURN_TYPE_ID")
	private ReturnType returnType;

	//bi-directional many-to-one association to StatusItem
	/*@ManyToOne
	@JoinColumn(name="EXPECTED_ITEM_STATUS")
	private StatusItem statusItem1;

	//bi-directional many-to-one association to StatusItem
	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem2;*/

	//bi-directional many-to-one association to ReturnItemBilling
	@OneToMany(mappedBy="returnItem")
	private List<ReturnItemBilling> returnItemBillings;

	//bi-directional many-to-one association to ReturnItemShipment
	@OneToMany(mappedBy="returnItem")
	private List<ReturnItemShipment> returnItemShipments;

	//bi-directional many-to-one association to ShipmentReceipt
/*	@OneToMany(mappedBy="returnItem")
	private List<ShipmentReceipt> shipmentReceipts;*/

	public ReturnItem() {
	}

	public ReturnItemPK getId() {
		return this.id;
	}

	public void setId(ReturnItemPK id) {
		this.id = id;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public BigDecimal getReceivedQuantity() {
		return this.receivedQuantity;
	}

	public void setReceivedQuantity(BigDecimal receivedQuantity) {
		this.receivedQuantity = receivedQuantity;
	}

	public BigDecimal getReturnPrice() {
		return this.returnPrice;
	}

	public void setReturnPrice(BigDecimal returnPrice) {
		this.returnPrice = returnPrice;
	}

	public BigDecimal getReturnQuantity() {
		return this.returnQuantity;
	}

	public void setReturnQuantity(BigDecimal returnQuantity) {
		this.returnQuantity = returnQuantity;
	}

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

	/*public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}*/

	public ReturnHeader getReturnHeader() {
		return this.returnHeader;
	}

	public void setReturnHeader(ReturnHeader returnHeader) {
		this.returnHeader = returnHeader;
	}

	public ReturnItemResponse getReturnItemResponse() {
		return this.returnItemResponse;
	}

	public void setReturnItemResponse(ReturnItemResponse returnItemResponse) {
		this.returnItemResponse = returnItemResponse;
	}

	public ReturnItemType getReturnItemType() {
		return this.returnItemType;
	}

	public void setReturnItemType(ReturnItemType returnItemType) {
		this.returnItemType = returnItemType;
	}

	public ReturnReason getReturnReason() {
		return this.returnReason;
	}

	public void setReturnReason(ReturnReason returnReason) {
		this.returnReason = returnReason;
	}

	public ReturnType getReturnType() {
		return this.returnType;
	}

	public void setReturnType(ReturnType returnType) {
		this.returnType = returnType;
	}

	/*public StatusItem getStatusItem1() {
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
*/
	public List<ReturnItemBilling> getReturnItemBillings() {
		return this.returnItemBillings;
	}

	public void setReturnItemBillings(List<ReturnItemBilling> returnItemBillings) {
		this.returnItemBillings = returnItemBillings;
	}

	public ReturnItemBilling addReturnItemBilling(ReturnItemBilling returnItemBilling) {
		getReturnItemBillings().add(returnItemBilling);
		returnItemBilling.setReturnItem(this);

		return returnItemBilling;
	}

	public ReturnItemBilling removeReturnItemBilling(ReturnItemBilling returnItemBilling) {
		getReturnItemBillings().remove(returnItemBilling);
		returnItemBilling.setReturnItem(null);

		return returnItemBilling;
	}

	public List<ReturnItemShipment> getReturnItemShipments() {
		return this.returnItemShipments;
	}

	public void setReturnItemShipments(List<ReturnItemShipment> returnItemShipments) {
		this.returnItemShipments = returnItemShipments;
	}

	public ReturnItemShipment addReturnItemShipment(ReturnItemShipment returnItemShipment) {
		getReturnItemShipments().add(returnItemShipment);
		returnItemShipment.setReturnItem(this);

		return returnItemShipment;
	}

	public ReturnItemShipment removeReturnItemShipment(ReturnItemShipment returnItemShipment) {
		getReturnItemShipments().remove(returnItemShipment);
		returnItemShipment.setReturnItem(null);

		return returnItemShipment;
	}

	/*public List<ShipmentReceipt> getShipmentReceipts() {
		return this.shipmentReceipts;
	}

	public void setShipmentReceipts(List<ShipmentReceipt> shipmentReceipts) {
		this.shipmentReceipts = shipmentReceipts;
	}

	public ShipmentReceipt addShipmentReceipt(ShipmentReceipt shipmentReceipt) {
		getShipmentReceipts().add(shipmentReceipt);
		shipmentReceipt.setReturnItem(this);

		return shipmentReceipt;
	}

	public ShipmentReceipt removeShipmentReceipt(ShipmentReceipt shipmentReceipt) {
		getShipmentReceipts().remove(shipmentReceipt);
		shipmentReceipt.setReturnItem(null);

		return shipmentReceipt;
	}*/

}