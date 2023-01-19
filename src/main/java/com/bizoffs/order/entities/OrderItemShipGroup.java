package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_ITEM_SHIP_GROUP database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_SHIP_GROUP")
@NamedQuery(name="OrderItemShipGroup.findAll", query="SELECT o FROM OrderItemShipGroup o")
public class OrderItemShipGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemShipGroupPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="ESTIMATED_DELIVERY_DATE")
	private Timestamp estimatedDeliveryDate;

	@Column(name="ESTIMATED_SHIP_DATE")
	private Timestamp estimatedShipDate;

	@Column(name="GIFT_MESSAGE")
	private String giftMessage;

	@Column(name="IS_GIFT")
	private String isGift;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="MAY_SPLIT")
	private String maySplit;

	@Column(name="SHIP_AFTER_DATE")
	private Timestamp shipAfterDate;

	@Column(name="SHIP_BY_DATE")
	private Timestamp shipByDate;

	@Column(name="SHIPPING_INSTRUCTIONS")
	private String shippingInstructions;

	@Column(name="TRACKING_NUMBER")
	private String trackingNumber;

	@Column(name="SHIPMENT_METHOD_TYPE_ID")
	private String shipmentMethodTypeId;

	@Column(name="PARTY_ID")
	private String partyId;

	@Column(name="ROLE_TYPE_ID")
	private String roleTypeId;

	@Column(name="CARRIER_PARTY_ID")
	private String carrierPartyId;

	@Column(name="CONTACT_MECH_ID")
	private String contactMechId;


	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader;


	@OneToMany(mappedBy="orderItemShipGroup")
	private List<OrderItemShipGroupAssoc> orderItemShipGroupAssocs;



	public OrderItemShipGroup() {
	}

	public OrderItemShipGroupPK getId() {
		return this.id;
	}

	public void setId(OrderItemShipGroupPK id) {
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

	public Timestamp getEstimatedDeliveryDate() {
		return this.estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Timestamp estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public Timestamp getEstimatedShipDate() {
		return this.estimatedShipDate;
	}

	public void setEstimatedShipDate(Timestamp estimatedShipDate) {
		this.estimatedShipDate = estimatedShipDate;
	}

	public String getGiftMessage() {
		return this.giftMessage;
	}

	public void setGiftMessage(String giftMessage) {
		this.giftMessage = giftMessage;
	}

	public String getIsGift() {
		return this.isGift;
	}

	public void setIsGift(String isGift) {
		this.isGift = isGift;
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

	public String getMaySplit() {
		return this.maySplit;
	}

	public void setMaySplit(String maySplit) {
		this.maySplit = maySplit;
	}

	public Timestamp getShipAfterDate() {
		return this.shipAfterDate;
	}

	public void setShipAfterDate(Timestamp shipAfterDate) {
		this.shipAfterDate = shipAfterDate;
	}

	public Timestamp getShipByDate() {
		return this.shipByDate;
	}

	public void setShipByDate(Timestamp shipByDate) {
		this.shipByDate = shipByDate;
	}

	public String getShippingInstructions() {
		return this.shippingInstructions;
	}

	public void setShippingInstructions(String shippingInstructions) {
		this.shippingInstructions = shippingInstructions;
	}

	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}



	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}



	public List<OrderItemShipGroupAssoc> getOrderItemShipGroupAssocs() {
		return this.orderItemShipGroupAssocs;
	}

	public void setOrderItemShipGroupAssocs(List<OrderItemShipGroupAssoc> orderItemShipGroupAssocs) {
		this.orderItemShipGroupAssocs = orderItemShipGroupAssocs;
	}

	public OrderItemShipGroupAssoc addOrderItemShipGroupAssoc(OrderItemShipGroupAssoc orderItemShipGroupAssoc) {
		getOrderItemShipGroupAssocs().add(orderItemShipGroupAssoc);
		orderItemShipGroupAssoc.setOrderItemShipGroup(this);

		return orderItemShipGroupAssoc;
	}

	public OrderItemShipGroupAssoc removeOrderItemShipGroupAssoc(OrderItemShipGroupAssoc orderItemShipGroupAssoc) {
		getOrderItemShipGroupAssocs().remove(orderItemShipGroupAssoc);
		orderItemShipGroupAssoc.setOrderItemShipGroup(null);

		return orderItemShipGroupAssoc;
	}

	public String getShipmentMethodTypeId() {
		return shipmentMethodTypeId;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getRoleTypeId() {
		return roleTypeId;
	}

	public void setRoleTypeId(String roleTypeId) {
		this.roleTypeId = roleTypeId;
	}

	public String getCarrierPartyId() {
		return carrierPartyId;
	}

	public void setCarrierPartyId(String carrierPartyId) {
		this.carrierPartyId = carrierPartyId;
	}

	public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
		this.shipmentMethodTypeId = shipmentMethodTypeId;
	}

	public String getContactMechId() {
		return contactMechId;
	}

	public void setContactMechId(String contactMechId) {
		this.contactMechId = contactMechId;
	}
}