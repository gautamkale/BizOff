package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_SUMMARY_ENTRY database table.
 * 
 */
@Entity
@Table(name="ORDER_SUMMARY_ENTRY")
@NamedQuery(name="OrderSummaryEntry.findAll", query="SELECT o FROM OrderSummaryEntry o")
public class OrderSummaryEntry implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderSummaryEntryPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="GROSS_SALES")
	private BigDecimal grossSales;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="PRODUCT_COST")
	private BigDecimal productCost;

	@Column(name="TOTAL_QUANTITY")
	private BigDecimal totalQuantity;

	//bi-directional many-to-one association to Facility
/*	@ManyToOne
	@JoinColumn(name="FACILITY_ID")
	private Facility facility;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;*/

	public OrderSummaryEntry() {
	}

	public OrderSummaryEntryPK getId() {
		return this.id;
	}

	public void setId(OrderSummaryEntryPK id) {
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

	public BigDecimal getGrossSales() {
		return this.grossSales;
	}

	public void setGrossSales(BigDecimal grossSales) {
		this.grossSales = grossSales;
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

	public BigDecimal getProductCost() {
		return this.productCost;
	}

	public void setProductCost(BigDecimal productCost) {
		this.productCost = productCost;
	}

	public BigDecimal getTotalQuantity() {
		return this.totalQuantity;
	}

	public void setTotalQuantity(BigDecimal totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	/*public Facility getFacility() {
		return this.facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}*/

}