package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_PRODUCT_PROMO_CODE database table.
 * 
 */
@Entity
@Table(name="ORDER_PRODUCT_PROMO_CODE")
@NamedQuery(name="OrderProductPromoCode.findAll", query="SELECT o FROM OrderProductPromoCode o")
public class OrderProductPromoCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderProductPromoCodePK id;

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
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader;

	//bi-directional many-to-one association to ProductPromoCode
	/*@ManyToOne
	@JoinColumn(name="PRODUCT_PROMO_CODE_ID")
	private ProductPromoCode productPromoCode;
*/
	public OrderProductPromoCode() {
	}

	public OrderProductPromoCodePK getId() {
		return this.id;
	}

	public void setId(OrderProductPromoCodePK id) {
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

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

/*	public ProductPromoCode getProductPromoCode() {
		return this.productPromoCode;
	}

	public void setProductPromoCode(ProductPromoCode productPromoCode) {
		this.productPromoCode = productPromoCode;
	}*/

}