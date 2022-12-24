package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_DELIVERY_SCHEDULE database table.
 * 
 */
@Entity
@Table(name="ORDER_DELIVERY_SCHEDULE")
@NamedQuery(name="OrderDeliverySchedule.findAll", query="SELECT o FROM OrderDeliverySchedule o")
public class OrderDeliverySchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderDeliverySchedulePK id;

	private BigDecimal cartons;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="ESTIMATED_READY_DATE")
	private Timestamp estimatedReadyDate;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="SKIDS_PALLETS")
	private BigDecimal skidsPallets;

	@Column(name="TOTAL_CUBIC_SIZE")
	private BigDecimal totalCubicSize;

	@Column(name="TOTAL_WEIGHT")
	private BigDecimal totalWeight;

	@Column(name="UNITS_PIECES")
	private BigDecimal unitsPieces;

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader;

	//bi-directional many-to-one association to StatusItem
	/*@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	//bi-directional many-to-one association to Uom
	@ManyToOne
	@JoinColumn(name="TOTAL_WEIGHT_UOM_ID")
	private Uom uom1;

	//bi-directional many-to-one association to Uom
	@ManyToOne
	@JoinColumn(name="TOTAL_CUBIC_UOM_ID")
	private Uom uom2;*/

	public OrderDeliverySchedule() {
	}

	public OrderDeliverySchedulePK getId() {
		return this.id;
	}

	public void setId(OrderDeliverySchedulePK id) {
		this.id = id;
	}

	public BigDecimal getCartons() {
		return this.cartons;
	}

	public void setCartons(BigDecimal cartons) {
		this.cartons = cartons;
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

	public Timestamp getEstimatedReadyDate() {
		return this.estimatedReadyDate;
	}

	public void setEstimatedReadyDate(Timestamp estimatedReadyDate) {
		this.estimatedReadyDate = estimatedReadyDate;
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

	public BigDecimal getSkidsPallets() {
		return this.skidsPallets;
	}

	public void setSkidsPallets(BigDecimal skidsPallets) {
		this.skidsPallets = skidsPallets;
	}

	public BigDecimal getTotalCubicSize() {
		return this.totalCubicSize;
	}

	public void setTotalCubicSize(BigDecimal totalCubicSize) {
		this.totalCubicSize = totalCubicSize;
	}

	public BigDecimal getTotalWeight() {
		return this.totalWeight;
	}

	public void setTotalWeight(BigDecimal totalWeight) {
		this.totalWeight = totalWeight;
	}

	public BigDecimal getUnitsPieces() {
		return this.unitsPieces;
	}

	public void setUnitsPieces(BigDecimal unitsPieces) {
		this.unitsPieces = unitsPieces;
	}

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	/*public StatusItem getStatusItem() {
		return this.statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}

	public Uom getUom1() {
		return this.uom1;
	}

	public void setUom1(Uom uom1) {
		this.uom1 = uom1;
	}

	public Uom getUom2() {
		return this.uom2;
	}

	public void setUom2(Uom uom2) {
		this.uom2 = uom2;
	}*/

}