package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_ITEM_ASSOC_TYPE database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_ASSOC_TYPE")
@NamedQuery(name="OrderItemAssocType.findAll", query="SELECT o FROM OrderItemAssocType o")
public class OrderItemAssocType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ITEM_ASSOC_TYPE_ID")
	private String orderItemAssocTypeId;

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

	//bi-directional many-to-one association to OrderItemAssoc
	@OneToMany(mappedBy="orderItemAssocType")
	private List<OrderItemAssoc> orderItemAssocs;

	//bi-directional many-to-one association to OrderItemAssocType
	@ManyToOne
	@JoinColumn(name="PARENT_TYPE_ID")
	private OrderItemAssocType orderItemAssocType;

	//bi-directional many-to-one association to OrderItemAssocType
	@OneToMany(mappedBy="orderItemAssocType")
	private List<OrderItemAssocType> orderItemAssocTypes;

	public OrderItemAssocType() {
	}

	public String getOrderItemAssocTypeId() {
		return this.orderItemAssocTypeId;
	}

	public void setOrderItemAssocTypeId(String orderItemAssocTypeId) {
		this.orderItemAssocTypeId = orderItemAssocTypeId;
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

	public List<OrderItemAssoc> getOrderItemAssocs() {
		return this.orderItemAssocs;
	}

	public void setOrderItemAssocs(List<OrderItemAssoc> orderItemAssocs) {
		this.orderItemAssocs = orderItemAssocs;
	}

	public OrderItemAssoc addOrderItemAssoc(OrderItemAssoc orderItemAssoc) {
		getOrderItemAssocs().add(orderItemAssoc);
		orderItemAssoc.setOrderItemAssocType(this);

		return orderItemAssoc;
	}

	public OrderItemAssoc removeOrderItemAssoc(OrderItemAssoc orderItemAssoc) {
		getOrderItemAssocs().remove(orderItemAssoc);
		orderItemAssoc.setOrderItemAssocType(null);

		return orderItemAssoc;
	}

	public OrderItemAssocType getOrderItemAssocType() {
		return this.orderItemAssocType;
	}

	public void setOrderItemAssocType(OrderItemAssocType orderItemAssocType) {
		this.orderItemAssocType = orderItemAssocType;
	}

	public List<OrderItemAssocType> getOrderItemAssocTypes() {
		return this.orderItemAssocTypes;
	}

	public void setOrderItemAssocTypes(List<OrderItemAssocType> orderItemAssocTypes) {
		this.orderItemAssocTypes = orderItemAssocTypes;
	}

	public OrderItemAssocType addOrderItemAssocType(OrderItemAssocType orderItemAssocType) {
		getOrderItemAssocTypes().add(orderItemAssocType);
		orderItemAssocType.setOrderItemAssocType(this);

		return orderItemAssocType;
	}

	public OrderItemAssocType removeOrderItemAssocType(OrderItemAssocType orderItemAssocType) {
		getOrderItemAssocTypes().remove(orderItemAssocType);
		orderItemAssocType.setOrderItemAssocType(null);

		return orderItemAssocType;
	}

}