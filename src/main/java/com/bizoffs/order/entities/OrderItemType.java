package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_ITEM_TYPE database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_TYPE")
@NamedQuery(name="OrderItemType.findAll", query="SELECT o FROM OrderItemType o")
public class OrderItemType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ITEM_TYPE_ID")
	private String orderItemTypeId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="HAS_TABLE")
	private String hasTable;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="orderItemType")
	private List<OrderItem> orderItems;

	//bi-directional many-to-one association to OrderItemType
	@ManyToOne
	@JoinColumn(name="PARENT_TYPE_ID")
	private OrderItemType orderItemType;

	//bi-directional many-to-one association to OrderItemType
	@OneToMany(mappedBy="orderItemType")
	private List<OrderItemType> orderItemTypes;

	//bi-directional many-to-one association to OrderItemTypeAttr
	@OneToMany(mappedBy="orderItemType")
	private List<OrderItemTypeAttr> orderItemTypeAttrs;

	public OrderItemType() {
	}

	public String getOrderItemTypeId() {
		return this.orderItemTypeId;
	}

	public void setOrderItemTypeId(String orderItemTypeId) {
		this.orderItemTypeId = orderItemTypeId;
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

	public String getHasTable() {
		return this.hasTable;
	}

	public void setHasTable(String hasTable) {
		this.hasTable = hasTable;
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

	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public OrderItem addOrderItem(OrderItem orderItem) {
		getOrderItems().add(orderItem);
		orderItem.setOrderItemType(this);

		return orderItem;
	}

	public OrderItem removeOrderItem(OrderItem orderItem) {
		getOrderItems().remove(orderItem);
		orderItem.setOrderItemType(null);

		return orderItem;
	}

	public OrderItemType getOrderItemType() {
		return this.orderItemType;
	}

	public void setOrderItemType(OrderItemType orderItemType) {
		this.orderItemType = orderItemType;
	}

	public List<OrderItemType> getOrderItemTypes() {
		return this.orderItemTypes;
	}

	public void setOrderItemTypes(List<OrderItemType> orderItemTypes) {
		this.orderItemTypes = orderItemTypes;
	}

	public OrderItemType addOrderItemType(OrderItemType orderItemType) {
		getOrderItemTypes().add(orderItemType);
		orderItemType.setOrderItemType(this);

		return orderItemType;
	}

	public OrderItemType removeOrderItemType(OrderItemType orderItemType) {
		getOrderItemTypes().remove(orderItemType);
		orderItemType.setOrderItemType(null);

		return orderItemType;
	}

	public List<OrderItemTypeAttr> getOrderItemTypeAttrs() {
		return this.orderItemTypeAttrs;
	}

	public void setOrderItemTypeAttrs(List<OrderItemTypeAttr> orderItemTypeAttrs) {
		this.orderItemTypeAttrs = orderItemTypeAttrs;
	}

	public OrderItemTypeAttr addOrderItemTypeAttr(OrderItemTypeAttr orderItemTypeAttr) {
		getOrderItemTypeAttrs().add(orderItemTypeAttr);
		orderItemTypeAttr.setOrderItemType(this);

		return orderItemTypeAttr;
	}

	public OrderItemTypeAttr removeOrderItemTypeAttr(OrderItemTypeAttr orderItemTypeAttr) {
		getOrderItemTypeAttrs().remove(orderItemTypeAttr);
		orderItemTypeAttr.setOrderItemType(null);

		return orderItemTypeAttr;
	}

}