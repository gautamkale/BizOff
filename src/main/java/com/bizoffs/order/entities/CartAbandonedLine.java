package com.bizoffs.order.entities;

import com.bizoffs.order.entities.CartAbandonedLinePK;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the CART_ABANDONED_LINE database table.
 * 
 */
@Entity
@Table(name="CART_ABANDONED_LINE")
@NamedQuery(name="CartAbandonedLine.findAll", query="SELECT c FROM CartAbandonedLine c")
public class CartAbandonedLine implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CartAbandonedLinePK id;

	@Column(name="CONFIG_ID")
	private String configId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	private BigDecimal quantity;

	@Column(name="RESERV_LENGTH")
	private BigDecimal reservLength;

	@Column(name="RESERV_NTH_P_P_PERC")
	private BigDecimal reservNthPPPerc;

	@Column(name="RESERV_PERSONS")
	private BigDecimal reservPersons;

	@Column(name="RESERV_START")
	private Timestamp reservStart;

	@Column(name="RESERV2ND_P_P_PERC")
	private BigDecimal reserv2ndPPPerc;

	@Column(name="TOTAL_WITH_ADJUSTMENTS")
	private BigDecimal totalWithAdjustments;

	@Column(name="UNIT_PRICE")
	private BigDecimal unitPrice;

	@Column(name="WAS_RESERVED")
	private String wasReserved;

	//bi-directional many-to-one association to Product
	/*@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	//bi-directional many-to-one association to ProdCatalog
	@ManyToOne
	@JoinColumn(name="PROD_CATALOG_ID")
	private ProdCatalog prodCatalog;*/

	public CartAbandonedLine() {
	}

	public CartAbandonedLinePK getId() {
		return this.id;
	}

	public void setId(CartAbandonedLinePK id) {
		this.id = id;
	}

	public String getConfigId() {
		return this.configId;
	}

	public void setConfigId(String configId) {
		this.configId = configId;
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

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getReservLength() {
		return this.reservLength;
	}

	public void setReservLength(BigDecimal reservLength) {
		this.reservLength = reservLength;
	}

	public BigDecimal getReservNthPPPerc() {
		return this.reservNthPPPerc;
	}

	public void setReservNthPPPerc(BigDecimal reservNthPPPerc) {
		this.reservNthPPPerc = reservNthPPPerc;
	}

	public BigDecimal getReservPersons() {
		return this.reservPersons;
	}

	public void setReservPersons(BigDecimal reservPersons) {
		this.reservPersons = reservPersons;
	}

	public Timestamp getReservStart() {
		return this.reservStart;
	}

	public void setReservStart(Timestamp reservStart) {
		this.reservStart = reservStart;
	}

	public BigDecimal getReserv2ndPPPerc() {
		return this.reserv2ndPPPerc;
	}

	public void setReserv2ndPPPerc(BigDecimal reserv2ndPPPerc) {
		this.reserv2ndPPPerc = reserv2ndPPPerc;
	}

	public BigDecimal getTotalWithAdjustments() {
		return this.totalWithAdjustments;
	}

	public void setTotalWithAdjustments(BigDecimal totalWithAdjustments) {
		this.totalWithAdjustments = totalWithAdjustments;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getWasReserved() {
		return this.wasReserved;
	}

	public void setWasReserved(String wasReserved) {
		this.wasReserved = wasReserved;
	}
/*
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProdCatalog getProdCatalog() {
		return this.prodCatalog;
	}

	public void setProdCatalog(ProdCatalog prodCatalog) {
		this.prodCatalog = prodCatalog;
	}*/

}