package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_ITEM_SHIP_GRP_INV_RES database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_SHIP_GRP_INV_RES")
@NamedQuery(name="OrderItemShipGrpInvRe.findAll", query="SELECT o FROM OrderItemShipGrpInvRe o")
public class OrderItemShipGrpInvRe implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemShipGrpInvRePK id;

	@Column(name="CREATED_DATETIME")
	private Timestamp createdDatetime;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="CURRENT_PROMISED_DATE")
	private Timestamp currentPromisedDate;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="PICK_START_DATE")
	private Timestamp pickStartDate;

	private String priority;

	@Column(name="PROMISED_DATETIME")
	private Timestamp promisedDatetime;

	private BigDecimal quantity;

	@Column(name="QUANTITY_NOT_AVAILABLE")
	private BigDecimal quantityNotAvailable;

	@Column(name="RESERVE_ORDER_ENUM_ID")
	private String reserveOrderEnumId;

	@Column(name="RESERVED_DATETIME")
	private Timestamp reservedDatetime;

	@Column(name="SEQUENCE_ID")
	private BigDecimal sequenceId;

	//bi-directional many-to-one association to InventoryItem
	/*@ManyToOne
	@JoinColumn(name="INVENTORY_ITEM_ID")
	private InventoryItem inventoryItem;*/

	//bi-directional many-to-one association to OrderItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID", insertable=false, updatable=false),
		@JoinColumn(name="ORDER_ITEM_SEQ_ID", referencedColumnName="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
		})
	private OrderItem orderItem;

	public OrderItemShipGrpInvRe() {
	}

	public OrderItemShipGrpInvRePK getId() {
		return this.id;
	}

	public void setId(OrderItemShipGrpInvRePK id) {
		this.id = id;
	}

	public Timestamp getCreatedDatetime() {
		return this.createdDatetime;
	}

	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
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

	public Timestamp getCurrentPromisedDate() {
		return this.currentPromisedDate;
	}

	public void setCurrentPromisedDate(Timestamp currentPromisedDate) {
		this.currentPromisedDate = currentPromisedDate;
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

	public Timestamp getPickStartDate() {
		return this.pickStartDate;
	}

	public void setPickStartDate(Timestamp pickStartDate) {
		this.pickStartDate = pickStartDate;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Timestamp getPromisedDatetime() {
		return this.promisedDatetime;
	}

	public void setPromisedDatetime(Timestamp promisedDatetime) {
		this.promisedDatetime = promisedDatetime;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getQuantityNotAvailable() {
		return this.quantityNotAvailable;
	}

	public void setQuantityNotAvailable(BigDecimal quantityNotAvailable) {
		this.quantityNotAvailable = quantityNotAvailable;
	}

	public String getReserveOrderEnumId() {
		return this.reserveOrderEnumId;
	}

	public void setReserveOrderEnumId(String reserveOrderEnumId) {
		this.reserveOrderEnumId = reserveOrderEnumId;
	}

	public Timestamp getReservedDatetime() {
		return this.reservedDatetime;
	}

	public void setReservedDatetime(Timestamp reservedDatetime) {
		this.reservedDatetime = reservedDatetime;
	}

	public BigDecimal getSequenceId() {
		return this.sequenceId;
	}

	public void setSequenceId(BigDecimal sequenceId) {
		this.sequenceId = sequenceId;
	}

	/*public InventoryItem getInventoryItem() {
		return this.inventoryItem;
	}

	public void setInventoryItem(InventoryItem inventoryItem) {
		this.inventoryItem = inventoryItem;
	}*/

	public OrderItem getOrderItem() {
		return this.orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

}