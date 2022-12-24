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

	//bi-directional many-to-one association to Agreement
	/*@ManyToOne
	@JoinColumn(name="SUPPLIER_AGREEMENT_ID")
	private Agreement agreement;

	//bi-directional many-to-one association to CarrierShipmentMethod
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CARRIER_PARTY_ID", referencedColumnName="PARTY_ID"),
		@JoinColumn(name="CARRIER_ROLE_TYPE_ID", referencedColumnName="ROLE_TYPE_ID"),
		@JoinColumn(name="SHIPMENT_METHOD_TYPE_ID", referencedColumnName="SHIPMENT_METHOD_TYPE_ID")
		})
	private CarrierShipmentMethod carrierShipmentMethod;

	//bi-directional many-to-one association to ContactMech
	@ManyToOne
	@JoinColumn(name="TELECOM_CONTACT_MECH_ID")
	private ContactMech contactMech1;

	//bi-directional many-to-one association to ContactMech
	@ManyToOne
	@JoinColumn(name="CONTACT_MECH_ID")
	private ContactMech contactMech2;

	//bi-directional many-to-one association to Facility
	@ManyToOne
	@JoinColumn(name="FACILITY_ID")
	private Facility facility;
*/
	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader;

	//bi-directional many-to-one association to Party
	/*@ManyToOne
	@JoinColumn(name="CARRIER_PARTY_ID")
	private Party party1;

	//bi-directional many-to-one association to Party
	@ManyToOne
	@JoinColumn(name="VENDOR_PARTY_ID")
	private Party party2;

	//bi-directional many-to-one association to Party
	@ManyToOne
	@JoinColumn(name="SUPPLIER_PARTY_ID")
	private Party party3;

	//bi-directional many-to-one association to PartyRole
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CARRIER_PARTY_ID", referencedColumnName="PARTY_ID"),
		@JoinColumn(name="CARRIER_ROLE_TYPE_ID", referencedColumnName="ROLE_TYPE_ID")
		})
	private PartyRole partyRole;

	//bi-directional many-to-one association to PostalAddress
	@ManyToOne
	@JoinColumn(name="CONTACT_MECH_ID")
	private PostalAddress postalAddress;

	//bi-directional many-to-one association to ShipmentMethodType
	@ManyToOne
	@JoinColumn(name="SHIPMENT_METHOD_TYPE_ID")
	private ShipmentMethodType shipmentMethodType;

	//bi-directional many-to-one association to TelecomNumber
	@ManyToOne
	@JoinColumn(name="TELECOM_CONTACT_MECH_ID")
	private TelecomNumber telecomNumber;*/

	//bi-directional many-to-one association to OrderItemShipGroupAssoc
	@OneToMany(mappedBy="orderItemShipGroup")
	private List<OrderItemShipGroupAssoc> orderItemShipGroupAssocs;

	//bi-directional many-to-one association to PicklistBin
	/*@OneToMany(mappedBy="orderItemShipGroup")
	private List<PicklistBin> picklistBins;

	//bi-directional many-to-one association to PicklistItem
	@OneToMany(mappedBy="orderItemShipGroup")
	private List<PicklistItem> picklistItems;*/

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

	/*public Agreement getAgreement() {
		return this.agreement;
	}

	public void setAgreement(Agreement agreement) {
		this.agreement = agreement;
	}

	public CarrierShipmentMethod getCarrierShipmentMethod() {
		return this.carrierShipmentMethod;
	}

	public void setCarrierShipmentMethod(CarrierShipmentMethod carrierShipmentMethod) {
		this.carrierShipmentMethod = carrierShipmentMethod;
	}

	public ContactMech getContactMech1() {
		return this.contactMech1;
	}

	public void setContactMech1(ContactMech contactMech1) {
		this.contactMech1 = contactMech1;
	}

	public ContactMech getContactMech2() {
		return this.contactMech2;
	}

	public void setContactMech2(ContactMech contactMech2) {
		this.contactMech2 = contactMech2;
	}

	public Facility getFacility() {
		return this.facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}*/

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	/*public Party getParty1() {
		return this.party1;
	}

	public void setParty1(Party party1) {
		this.party1 = party1;
	}

	public Party getParty2() {
		return this.party2;
	}

	public void setParty2(Party party2) {
		this.party2 = party2;
	}

	public Party getParty3() {
		return this.party3;
	}

	public void setParty3(Party party3) {
		this.party3 = party3;
	}

	public PartyRole getPartyRole() {
		return this.partyRole;
	}

	public void setPartyRole(PartyRole partyRole) {
		this.partyRole = partyRole;
	}

	public PostalAddress getPostalAddress() {
		return this.postalAddress;
	}

	public void setPostalAddress(PostalAddress postalAddress) {
		this.postalAddress = postalAddress;
	}

	public ShipmentMethodType getShipmentMethodType() {
		return this.shipmentMethodType;
	}

	public void setShipmentMethodType(ShipmentMethodType shipmentMethodType) {
		this.shipmentMethodType = shipmentMethodType;
	}

	public TelecomNumber getTelecomNumber() {
		return this.telecomNumber;
	}

	public void setTelecomNumber(TelecomNumber telecomNumber) {
		this.telecomNumber = telecomNumber;
	}*/

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

/*	public List<PicklistBin> getPicklistBins() {
		return this.picklistBins;
	}

	public void setPicklistBins(List<PicklistBin> picklistBins) {
		this.picklistBins = picklistBins;
	}

	public PicklistBin addPicklistBin(PicklistBin picklistBin) {
		getPicklistBins().add(picklistBin);
		picklistBin.setOrderItemShipGroup(this);

		return picklistBin;
	}

	public PicklistBin removePicklistBin(PicklistBin picklistBin) {
		getPicklistBins().remove(picklistBin);
		picklistBin.setOrderItemShipGroup(null);

		return picklistBin;
	}

	public List<PicklistItem> getPicklistItems() {
		return this.picklistItems;
	}

	public void setPicklistItems(List<PicklistItem> picklistItems) {
		this.picklistItems = picklistItems;
	}

	public PicklistItem addPicklistItem(PicklistItem picklistItem) {
		getPicklistItems().add(picklistItem);
		picklistItem.setOrderItemShipGroup(this);

		return picklistItem;
	}

	public PicklistItem removePicklistItem(PicklistItem picklistItem) {
		getPicklistItems().remove(picklistItem);
		picklistItem.setOrderItemShipGroup(null);

		return picklistItem;
	}*/

}