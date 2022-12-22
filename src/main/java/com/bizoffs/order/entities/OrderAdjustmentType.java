package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_ADJUSTMENT_TYPE database table.
 * 
 */
@Entity
@Table(name="ORDER_ADJUSTMENT_TYPE")
@NamedQuery(name="OrderAdjustmentType.findAll", query="SELECT o FROM OrderAdjustmentType o")
public class OrderAdjustmentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ADJUSTMENT_TYPE_ID")
	private String orderAdjustmentTypeId;

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

	//bi-directional many-to-one association to OrderAdjustment
	@OneToMany(mappedBy="orderAdjustmentType")
	private List<OrderAdjustment> orderAdjustments;

	//bi-directional many-to-one association to OrderAdjustmentType
	@ManyToOne
	@JoinColumn(name="PARENT_TYPE_ID")
	private OrderAdjustmentType orderAdjustmentType;

	//bi-directional many-to-one association to OrderAdjustmentType
	@OneToMany(mappedBy="orderAdjustmentType")
	private List<OrderAdjustmentType> orderAdjustmentTypes;

	//bi-directional many-to-one association to OrderAdjustmentTypeAttr
	@OneToMany(mappedBy="orderAdjustmentType")
	private List<com.bizoffs.order.entities.OrderAdjustmentTypeAttr> orderAdjustmentTypeAttrs;

	//bi-directional many-to-one association to ProductPromoAction
/*	@OneToMany(mappedBy="orderAdjustmentType")
	private List<ProductPromoAction> productPromoActions;*/

	//bi-directional many-to-one association to QuoteAdjustment
	@OneToMany(mappedBy="orderAdjustmentType")
	private List<com.bizoffs.order.entities.QuoteAdjustment> quoteAdjustments;

	public OrderAdjustmentType() {
	}

	public String getOrderAdjustmentTypeId() {
		return this.orderAdjustmentTypeId;
	}

	public void setOrderAdjustmentTypeId(String orderAdjustmentTypeId) {
		this.orderAdjustmentTypeId = orderAdjustmentTypeId;
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

	public List<OrderAdjustment> getOrderAdjustments() {
		return this.orderAdjustments;
	}

	public void setOrderAdjustments(List<OrderAdjustment> orderAdjustments) {
		this.orderAdjustments = orderAdjustments;
	}

	public OrderAdjustment addOrderAdjustment(OrderAdjustment orderAdjustment) {
		getOrderAdjustments().add(orderAdjustment);
		orderAdjustment.setOrderAdjustmentType(this);

		return orderAdjustment;
	}

	public OrderAdjustment removeOrderAdjustment(OrderAdjustment orderAdjustment) {
		getOrderAdjustments().remove(orderAdjustment);
		orderAdjustment.setOrderAdjustmentType(null);

		return orderAdjustment;
	}

	public OrderAdjustmentType getOrderAdjustmentType() {
		return this.orderAdjustmentType;
	}

	public void setOrderAdjustmentType(OrderAdjustmentType orderAdjustmentType) {
		this.orderAdjustmentType = orderAdjustmentType;
	}

	public List<OrderAdjustmentType> getOrderAdjustmentTypes() {
		return this.orderAdjustmentTypes;
	}

	public void setOrderAdjustmentTypes(List<OrderAdjustmentType> orderAdjustmentTypes) {
		this.orderAdjustmentTypes = orderAdjustmentTypes;
	}

	public OrderAdjustmentType addOrderAdjustmentType(OrderAdjustmentType orderAdjustmentType) {
		getOrderAdjustmentTypes().add(orderAdjustmentType);
		orderAdjustmentType.setOrderAdjustmentType(this);

		return orderAdjustmentType;
	}

	public OrderAdjustmentType removeOrderAdjustmentType(OrderAdjustmentType orderAdjustmentType) {
		getOrderAdjustmentTypes().remove(orderAdjustmentType);
		orderAdjustmentType.setOrderAdjustmentType(null);

		return orderAdjustmentType;
	}

	public List<com.bizoffs.order.entities.OrderAdjustmentTypeAttr> getOrderAdjustmentTypeAttrs() {
		return this.orderAdjustmentTypeAttrs;
	}

	public void setOrderAdjustmentTypeAttrs(List<com.bizoffs.order.entities.OrderAdjustmentTypeAttr> orderAdjustmentTypeAttrs) {
		this.orderAdjustmentTypeAttrs = orderAdjustmentTypeAttrs;
	}

	public com.bizoffs.order.entities.OrderAdjustmentTypeAttr addOrderAdjustmentTypeAttr(com.bizoffs.order.entities.OrderAdjustmentTypeAttr orderAdjustmentTypeAttr) {
		getOrderAdjustmentTypeAttrs().add(orderAdjustmentTypeAttr);
		orderAdjustmentTypeAttr.setOrderAdjustmentType(this);

		return orderAdjustmentTypeAttr;
	}

	public com.bizoffs.order.entities.OrderAdjustmentTypeAttr removeOrderAdjustmentTypeAttr(com.bizoffs.order.entities.OrderAdjustmentTypeAttr orderAdjustmentTypeAttr) {
		getOrderAdjustmentTypeAttrs().remove(orderAdjustmentTypeAttr);
		orderAdjustmentTypeAttr.setOrderAdjustmentType(null);

		return orderAdjustmentTypeAttr;
	}

	/*public List<ProductPromoAction> getProductPromoActions() {
		return this.productPromoActions;
	}

	public void setProductPromoActions(List<ProductPromoAction> productPromoActions) {
		this.productPromoActions = productPromoActions;
	}

	public ProductPromoAction addProductPromoAction(ProductPromoAction productPromoAction) {
		getProductPromoActions().add(productPromoAction);
		productPromoAction.setOrderAdjustmentType(this);

		return productPromoAction;
	}

	public ProductPromoAction removeProductPromoAction(ProductPromoAction productPromoAction) {
		getProductPromoActions().remove(productPromoAction);
		productPromoAction.setOrderAdjustmentType(null);

		return productPromoAction;
	}*/

	public List<com.bizoffs.order.entities.QuoteAdjustment> getQuoteAdjustments() {
		return this.quoteAdjustments;
	}

	public void setQuoteAdjustments(List<com.bizoffs.order.entities.QuoteAdjustment> quoteAdjustments) {
		this.quoteAdjustments = quoteAdjustments;
	}

	public com.bizoffs.order.entities.QuoteAdjustment addQuoteAdjustment(com.bizoffs.order.entities.QuoteAdjustment quoteAdjustment) {
		getQuoteAdjustments().add(quoteAdjustment);
		quoteAdjustment.setOrderAdjustmentType(this);

		return quoteAdjustment;
	}

	public com.bizoffs.order.entities.QuoteAdjustment removeQuoteAdjustment(com.bizoffs.order.entities.QuoteAdjustment quoteAdjustment) {
		getQuoteAdjustments().remove(quoteAdjustment);
		quoteAdjustment.setOrderAdjustmentType(null);

		return quoteAdjustment;
	}

}