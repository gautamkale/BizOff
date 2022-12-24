package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_ITEM_SHIP_GROUP_ASSOC database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_SHIP_GROUP_ASSOC")
@NamedQuery(name="OrderItemShipGroupAssoc.findAll", query="SELECT o FROM OrderItemShipGroupAssoc o")
public class OrderItemShipGroupAssoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemShipGroupAssocPK id;

	@Column(name="CANCEL_QUANTITY")
	private BigDecimal cancelQuantity;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	private BigDecimal quantity;

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

	//bi-directional many-to-one association to OrderItemShipGroup
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID", insertable=false, updatable=false),
		@JoinColumn(name="SHIP_GROUP_SEQ_ID", referencedColumnName="SHIP_GROUP_SEQ_ID", insertable=false, updatable=false)
		})
	private OrderItemShipGroup orderItemShipGroup;

	public OrderItemShipGroupAssoc() {
	}

	public OrderItemShipGroupAssocPK getId() {
		return this.id;
	}

	public void setId(OrderItemShipGroupAssocPK id) {
		this.id = id;
	}

	public BigDecimal getCancelQuantity() {
		return this.cancelQuantity;
	}

	public void setCancelQuantity(BigDecimal cancelQuantity) {
		this.cancelQuantity = cancelQuantity;
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

	public OrderItemShipGroup getOrderItemShipGroup() {
		return this.orderItemShipGroup;
	}

	public void setOrderItemShipGroup(OrderItemShipGroup orderItemShipGroup) {
		this.orderItemShipGroup = orderItemShipGroup;
	}

}