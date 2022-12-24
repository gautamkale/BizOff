package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the RETURN_ITEM_SHIPMENT database table.
 * 
 */
@Entity
@Table(name="RETURN_ITEM_SHIPMENT")
@NamedQuery(name="ReturnItemShipment.findAll", query="SELECT r FROM ReturnItemShipment r")
public class ReturnItemShipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReturnItemShipmentPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	private BigDecimal quantity;

	//bi-directional many-to-one association to ReturnHeader
	@ManyToOne
	@JoinColumn(name="RETURN_ID", insertable=false, updatable=false)
	private ReturnHeader returnHeader;

	//bi-directional many-to-one association to ReturnItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="RETURN_ID", referencedColumnName="RETURN_ID", insertable=false, updatable=false),
		@JoinColumn(name="RETURN_ITEM_SEQ_ID", referencedColumnName="RETURN_ITEM_SEQ_ID", insertable=false, updatable=false)
		})
	private ReturnItem returnItem;

	//bi-directional many-to-one association to Shipment
	/*@ManyToOne
	@JoinColumn(name="SHIPMENT_ID")
	private Shipment shipment;*/

	//bi-directional many-to-one association to ShipmentItem
	/*@ManyToOne
	@JoinColumns({
		@JoinColumn(name="SHIPMENT_ID", referencedColumnName="SHIPMENT_ID"),
		@JoinColumn(name="SHIPMENT_ITEM_SEQ_ID", referencedColumnName="SHIPMENT_ITEM_SEQ_ID")
		})
	private ShipmentItem shipmentItem;*/

	public ReturnItemShipment() {
	}

	public ReturnItemShipmentPK getId() {
		return this.id;
	}

	public void setId(ReturnItemShipmentPK id) {
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

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public ReturnHeader getReturnHeader() {
		return this.returnHeader;
	}

	public void setReturnHeader(ReturnHeader returnHeader) {
		this.returnHeader = returnHeader;
	}

	public ReturnItem getReturnItem() {
		return this.returnItem;
	}

	public void setReturnItem(ReturnItem returnItem) {
		this.returnItem = returnItem;
	}

	/*public Shipment getShipment() {
		return this.shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	public ShipmentItem getShipmentItem() {
		return this.shipmentItem;
	}

	public void setShipmentItem(ShipmentItem shipmentItem) {
		this.shipmentItem = shipmentItem;
	}*/

}