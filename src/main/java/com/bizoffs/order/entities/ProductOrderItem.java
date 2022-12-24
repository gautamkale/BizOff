package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the PRODUCT_ORDER_ITEM database table.
 * 
 */
@Entity
@Table(name="PRODUCT_ORDER_ITEM")
@NamedQuery(name="ProductOrderItem.findAll", query="SELECT p FROM ProductOrderItem p")
public class ProductOrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProductOrderItemPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ENGAGEMENT_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader1;

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader2;

	//bi-directional many-to-one association to OrderItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ENGAGEMENT_ID", referencedColumnName="ORDER_ID", insertable=false, updatable=false),
		@JoinColumn(name="ENGAGEMENT_ITEM_SEQ_ID", referencedColumnName="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
		})
	private OrderItem orderItem1;

	//bi-directional many-to-one association to OrderItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID", insertable=false, updatable=false),
		@JoinColumn(name="ORDER_ITEM_SEQ_ID", referencedColumnName="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
		})
	private OrderItem orderItem2;

	//bi-directional many-to-one association to Product
/*	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;*/

	public ProductOrderItem() {
	}

	public ProductOrderItemPK getId() {
		return this.id;
	}

	public void setId(ProductOrderItemPK id) {
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

	public OrderItem getOrderItem1() {
		return this.orderItem1;
	}

	public void setOrderItem1(OrderItem orderItem1) {
		this.orderItem1 = orderItem1;
	}

	public OrderItem getOrderItem2() {
		return this.orderItem2;
	}

	public void setOrderItem2(OrderItem orderItem2) {
		this.orderItem2 = orderItem2;
	}

/*	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}*/

}