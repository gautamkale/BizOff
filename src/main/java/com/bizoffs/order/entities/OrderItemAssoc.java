package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_ITEM_ASSOC database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_ASSOC")
@NamedQuery(name="OrderItemAssoc.findAll", query="SELECT o FROM OrderItemAssoc o")
public class OrderItemAssoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemAssocPK id;

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
	@JoinColumn(name="TO_ORDER_ID")
	private OrderHeader orderHeader1;

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private OrderHeader orderHeader2;

	//bi-directional many-to-one association to OrderItemAssocType
	@ManyToOne
	@JoinColumn(name="ORDER_ITEM_ASSOC_TYPE_ID")
	private OrderItemAssocType orderItemAssocType;

	public OrderItemAssoc() {
	}

	public OrderItemAssocPK getId() {
		return this.id;
	}

	public void setId(OrderItemAssocPK id) {
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

	public OrderHeader getOrderHeader1() {
		return this.orderHeader1;
	}

	public void setOrderHeader1(OrderHeader orderHeader1) {
		this.orderHeader1 = orderHeader1;
	}

	public OrderHeader getOrderHeader2() {
		return this.orderHeader2;
	}

	public void setOrderHeader2(OrderHeader orderHeader2) {
		this.orderHeader2 = orderHeader2;
	}

	public OrderItemAssocType getOrderItemAssocType() {
		return this.orderItemAssocType;
	}

	public void setOrderItemAssocType(OrderItemAssocType orderItemAssocType) {
		this.orderItemAssocType = orderItemAssocType;
	}

}