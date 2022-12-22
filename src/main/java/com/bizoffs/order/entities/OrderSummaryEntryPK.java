package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_SUMMARY_ENTRY database table.
 * 
 */
@Embeddable
public class OrderSummaryEntryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="ENTRY_DATE")
	private java.util.Date entryDate;

	@Column(name="PRODUCT_ID", insertable=false, updatable=false)
	private String productId;

	@Column(name="FACILITY_ID", insertable=false, updatable=false)
	private String facilityId;

	public OrderSummaryEntryPK() {
	}
	public java.util.Date getEntryDate() {
		return this.entryDate;
	}
	public void setEntryDate(java.util.Date entryDate) {
		this.entryDate = entryDate;
	}
	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getFacilityId() {
		return this.facilityId;
	}
	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderSummaryEntryPK)) {
			return false;
		}
		OrderSummaryEntryPK castOther = (OrderSummaryEntryPK)other;
		return 
			this.entryDate.equals(castOther.entryDate)
			&& this.productId.equals(castOther.productId)
			&& this.facilityId.equals(castOther.facilityId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.entryDate.hashCode();
		hash = hash * prime + this.productId.hashCode();
		hash = hash * prime + this.facilityId.hashCode();
		
		return hash;
	}
}