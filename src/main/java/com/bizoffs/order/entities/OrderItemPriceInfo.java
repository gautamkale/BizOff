package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_ITEM_PRICE_INFO database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_PRICE_INFO")
@NamedQuery(name="OrderItemPriceInfo.findAll", query="SELECT o FROM OrderItemPriceInfo o")
public class OrderItemPriceInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ITEM_PRICE_INFO_ID")
	private String orderItemPriceInfoId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="MODIFY_AMOUNT")
	private BigDecimal modifyAmount;

	@Column(name="RATE_CODE")
	private String rateCode;

	//bi-directional many-to-one association to OrderItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID"),
		@JoinColumn(name="ORDER_ITEM_SEQ_ID", referencedColumnName="ORDER_ITEM_SEQ_ID")
		})
	private OrderItem orderItem;

	//bi-directional many-to-one association to ProductPriceAction
	/*@ManyToOne
	@JoinColumns({
		@JoinColumn(name="PRODUCT_PRICE_ACTION_SEQ_ID", referencedColumnName="PRODUCT_PRICE_ACTION_SEQ_ID"),
		@JoinColumn(name="PRODUCT_PRICE_RULE_ID", referencedColumnName="PRODUCT_PRICE_RULE_ID")
		})
	private ProductPriceAction productPriceAction;*/

	public OrderItemPriceInfo() {
	}

	public String getOrderItemPriceInfoId() {
		return this.orderItemPriceInfoId;
	}

	public void setOrderItemPriceInfoId(String orderItemPriceInfoId) {
		this.orderItemPriceInfoId = orderItemPriceInfoId;
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

	public BigDecimal getModifyAmount() {
		return this.modifyAmount;
	}

	public void setModifyAmount(BigDecimal modifyAmount) {
		this.modifyAmount = modifyAmount;
	}

	public String getRateCode() {
		return this.rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public OrderItem getOrderItem() {
		return this.orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

/*	public ProductPriceAction getProductPriceAction() {
		return this.productPriceAction;
	}

	public void setProductPriceAction(ProductPriceAction productPriceAction) {
		this.productPriceAction = productPriceAction;
	}*/

}