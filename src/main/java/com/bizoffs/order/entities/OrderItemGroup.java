package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_ITEM_GROUP database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_GROUP")
@NamedQuery(name="OrderItemGroup.findAll", query="SELECT o FROM OrderItemGroup o")
public class OrderItemGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemGroupPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="GROUP_NAME")
	private String groupName;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="orderItemGroup")
	private List<OrderItem> orderItems;

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader;

	//bi-directional many-to-one association to OrderItemGroup
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID", insertable=false, updatable=false),
		@JoinColumn(name="PARENT_GROUP_SEQ_ID", referencedColumnName="ORDER_ITEM_GROUP_SEQ_ID", insertable=false, updatable=false)
		})
	private OrderItemGroup orderItemGroup;

	//bi-directional many-to-one association to OrderItemGroup
	@OneToMany(mappedBy="orderItemGroup")
	private List<OrderItemGroup> orderItemGroups;

	public OrderItemGroup() {
	}

	public OrderItemGroupPK getId() {
		return this.id;
	}

	public void setId(OrderItemGroupPK id) {
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

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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
		orderItem.setOrderItemGroup(this);

		return orderItem;
	}

	public OrderItem removeOrderItem(OrderItem orderItem) {
		getOrderItems().remove(orderItem);
		orderItem.setOrderItemGroup(null);

		return orderItem;
	}

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public OrderItemGroup getOrderItemGroup() {
		return this.orderItemGroup;
	}

	public void setOrderItemGroup(OrderItemGroup orderItemGroup) {
		this.orderItemGroup = orderItemGroup;
	}

	public List<OrderItemGroup> getOrderItemGroups() {
		return this.orderItemGroups;
	}

	public void setOrderItemGroups(List<OrderItemGroup> orderItemGroups) {
		this.orderItemGroups = orderItemGroups;
	}

	public OrderItemGroup addOrderItemGroup(OrderItemGroup orderItemGroup) {
		getOrderItemGroups().add(orderItemGroup);
		orderItemGroup.setOrderItemGroup(this);

		return orderItemGroup;
	}

	public OrderItemGroup removeOrderItemGroup(OrderItemGroup orderItemGroup) {
		getOrderItemGroups().remove(orderItemGroup);
		orderItemGroup.setOrderItemGroup(null);

		return orderItemGroup;
	}

}