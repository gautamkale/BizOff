package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_ITEM_GROUP_ORDER database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_GROUP_ORDER")
@NamedQuery(name="OrderItemGroupOrder.findAll", query="SELECT o FROM OrderItemGroupOrder o")
public class OrderItemGroupOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemGroupOrderPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to OrderItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID", insertable=false, updatable=false),
		@JoinColumn(name="ORDER_ITEM_SEQ_ID", referencedColumnName="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
		})
	private OrderItem orderItem;

	//bi-directional many-to-one association to ProductGroupOrder
	/*@ManyToOne
	@JoinColumn(name="GROUP_ORDER_ID")
	private ProductGroupOrder productGroupOrder;*/

	public OrderItemGroupOrder() {
	}

	public OrderItemGroupOrderPK getId() {
		return this.id;
	}

	public void setId(OrderItemGroupOrderPK id) {
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

	public OrderItem getOrderItem() {
		return this.orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	/*public ProductGroupOrder getProductGroupOrder() {
		return this.productGroupOrder;
	}

	public void setProductGroupOrder(ProductGroupOrder productGroupOrder) {
		this.productGroupOrder = productGroupOrder;
	}*/

}