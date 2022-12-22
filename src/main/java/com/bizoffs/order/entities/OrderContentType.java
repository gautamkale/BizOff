package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_CONTENT_TYPE database table.
 * 
 */
@Entity
@Table(name="ORDER_CONTENT_TYPE")
@NamedQuery(name="OrderContentType.findAll", query="SELECT o FROM OrderContentType o")
public class OrderContentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_CONTENT_TYPE_ID")
	private String orderContentTypeId;

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

	//bi-directional many-to-one association to OrderContent
	@OneToMany(mappedBy="orderContentType")
	private List<OrderContent> orderContents;

	//bi-directional many-to-one association to OrderContentType
	@ManyToOne
	@JoinColumn(name="PARENT_TYPE_ID")
	private OrderContentType orderContentType;

	//bi-directional many-to-one association to OrderContentType
	@OneToMany(mappedBy="orderContentType")
	private List<OrderContentType> orderContentTypes;

	public OrderContentType() {
	}

	public String getOrderContentTypeId() {
		return this.orderContentTypeId;
	}

	public void setOrderContentTypeId(String orderContentTypeId) {
		this.orderContentTypeId = orderContentTypeId;
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

	public List<OrderContent> getOrderContents() {
		return this.orderContents;
	}

	public void setOrderContents(List<OrderContent> orderContents) {
		this.orderContents = orderContents;
	}

	public OrderContent addOrderContent(OrderContent orderContent) {
		getOrderContents().add(orderContent);
		orderContent.setOrderContentType(this);

		return orderContent;
	}

	public OrderContent removeOrderContent(OrderContent orderContent) {
		getOrderContents().remove(orderContent);
		orderContent.setOrderContentType(null);

		return orderContent;
	}

	public OrderContentType getOrderContentType() {
		return this.orderContentType;
	}

	public void setOrderContentType(OrderContentType orderContentType) {
		this.orderContentType = orderContentType;
	}

	public List<OrderContentType> getOrderContentTypes() {
		return this.orderContentTypes;
	}

	public void setOrderContentTypes(List<OrderContentType> orderContentTypes) {
		this.orderContentTypes = orderContentTypes;
	}

	public OrderContentType addOrderContentType(OrderContentType orderContentType) {
		getOrderContentTypes().add(orderContentType);
		orderContentType.setOrderContentType(this);

		return orderContentType;
	}

	public OrderContentType removeOrderContentType(OrderContentType orderContentType) {
		getOrderContentTypes().remove(orderContentType);
		orderContentType.setOrderContentType(null);

		return orderContentType;
	}

}