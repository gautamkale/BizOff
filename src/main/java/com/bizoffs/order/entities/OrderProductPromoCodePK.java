package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_PRODUCT_PROMO_CODE database table.
 * 
 */
@Embeddable
public class OrderProductPromoCodePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="PRODUCT_PROMO_CODE_ID", insertable=false, updatable=false)
	private String productPromoCodeId;

	public OrderProductPromoCodePK() {
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductPromoCodeId() {
		return this.productPromoCodeId;
	}
	public void setProductPromoCodeId(String productPromoCodeId) {
		this.productPromoCodeId = productPromoCodeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderProductPromoCodePK)) {
			return false;
		}
		OrderProductPromoCodePK castOther = (OrderProductPromoCodePK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.productPromoCodeId.equals(castOther.productPromoCodeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.productPromoCodeId.hashCode();
		
		return hash;
	}
}