package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the RETURN_HEADER database table.
 * 
 */
@Entity
@Table(name="RETURN_HEADER")
@NamedQuery(name="ReturnHeader.findAll", query="SELECT r FROM ReturnHeader r")
public class ReturnHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RETURN_ID")
	private String returnId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="ENTRY_DATE")
	private Timestamp entryDate;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="NEEDS_INVENTORY_RECEIVE")
	private String needsInventoryReceive;

	@Column(name="SUPPLIER_RMA_ID")
	private String supplierRmaId;

	//bi-directional many-to-one association to CommunicationEventReturn
	@OneToMany(mappedBy="returnHeader")
	private List<CommunicationEventReturn> communicationEventReturns;

	//bi-directional many-to-one association to ReturnAdjustment
	@OneToMany(mappedBy="returnHeader")
	private List<ReturnAdjustment> returnAdjustments;

	//bi-directional many-to-one association to ReturnContactMech
	@OneToMany(mappedBy="returnHeader")
	private List<ReturnContactMech> returnContactMeches;

	//bi-directional many-to-one association to BillingAccount
	/*@ManyToOne
	@JoinColumn(name="BILLING_ACCOUNT_ID")
	private BillingAccount billingAccount;

	//bi-directional many-to-one association to ContactMech
	@ManyToOne
	@JoinColumn(name="ORIGIN_CONTACT_MECH_ID")
	private ContactMech contactMech;

	//bi-directional many-to-one association to Facility
	@ManyToOne
	@JoinColumn(name="DESTINATION_FACILITY_ID")
	private Facility facility;

	//bi-directional many-to-one association to FinAccount
	@ManyToOne
	@JoinColumn(name="FIN_ACCOUNT_ID")
	private FinAccount finAccount;

	//bi-directional many-to-one association to Party
	@ManyToOne
	@JoinColumn(name="TO_PARTY_ID")
	private Party party1;

	//bi-directional many-to-one association to Party
	@ManyToOne
	@JoinColumn(name="FROM_PARTY_ID")
	private Party party2;

	//bi-directional many-to-one association to PaymentMethod
	@ManyToOne
	@JoinColumn(name="PAYMENT_METHOD_ID")
	private PaymentMethod paymentMethod;*/

	//bi-directional many-to-one association to ReturnHeaderType
	@ManyToOne
	@JoinColumn(name="RETURN_HEADER_TYPE_ID")
	private ReturnHeaderType returnHeaderType;

	//bi-directional many-to-one association to StatusItem
	/*@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	//bi-directional many-to-one association to Uom
	@ManyToOne
	@JoinColumn(name="CURRENCY_UOM_ID")
	private Uom uom;*/

	//bi-directional many-to-one association to ReturnItem
	@OneToMany(mappedBy="returnHeader")
	private List<ReturnItem> returnItems;

	//bi-directional many-to-one association to ReturnItemBilling
	@OneToMany(mappedBy="returnHeader")
	private List<ReturnItemBilling> returnItemBillings;

	//bi-directional many-to-one association to ReturnItemShipment
	@OneToMany(mappedBy="returnHeader")
	private List<ReturnItemShipment> returnItemShipments;

	//bi-directional many-to-one association to ReturnStatus
	@OneToMany(mappedBy="returnHeader")
	private List<ReturnStatus> returnStatuses;

	//bi-directional many-to-one association to Shipment
	/*@OneToMany(mappedBy="returnHeader")
	private List<Shipment> shipments;

	//bi-directional many-to-one association to TrackingCodeOrderReturn
	@OneToMany(mappedBy="returnHeader")
	private List<TrackingCodeOrderReturn> trackingCodeOrderReturns;*/

	public ReturnHeader() {
	}

	public String getReturnId() {
		return this.returnId;
	}

	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public Timestamp getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Timestamp entryDate) {
		this.entryDate = entryDate;
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

	public String getNeedsInventoryReceive() {
		return this.needsInventoryReceive;
	}

	public void setNeedsInventoryReceive(String needsInventoryReceive) {
		this.needsInventoryReceive = needsInventoryReceive;
	}

	public String getSupplierRmaId() {
		return this.supplierRmaId;
	}

	public void setSupplierRmaId(String supplierRmaId) {
		this.supplierRmaId = supplierRmaId;
	}

	public List<CommunicationEventReturn> getCommunicationEventReturns() {
		return this.communicationEventReturns;
	}

	public void setCommunicationEventReturns(List<CommunicationEventReturn> communicationEventReturns) {
		this.communicationEventReturns = communicationEventReturns;
	}

	public CommunicationEventReturn addCommunicationEventReturn(CommunicationEventReturn communicationEventReturn) {
		getCommunicationEventReturns().add(communicationEventReturn);
		communicationEventReturn.setReturnHeader(this);

		return communicationEventReturn;
	}

	public CommunicationEventReturn removeCommunicationEventReturn(CommunicationEventReturn communicationEventReturn) {
		getCommunicationEventReturns().remove(communicationEventReturn);
		communicationEventReturn.setReturnHeader(null);

		return communicationEventReturn;
	}

	public List<ReturnAdjustment> getReturnAdjustments() {
		return this.returnAdjustments;
	}

	public void setReturnAdjustments(List<ReturnAdjustment> returnAdjustments) {
		this.returnAdjustments = returnAdjustments;
	}

	public ReturnAdjustment addReturnAdjustment(ReturnAdjustment returnAdjustment) {
		getReturnAdjustments().add(returnAdjustment);
		returnAdjustment.setReturnHeader(this);

		return returnAdjustment;
	}

	public ReturnAdjustment removeReturnAdjustment(ReturnAdjustment returnAdjustment) {
		getReturnAdjustments().remove(returnAdjustment);
		returnAdjustment.setReturnHeader(null);

		return returnAdjustment;
	}

	public List<ReturnContactMech> getReturnContactMeches() {
		return this.returnContactMeches;
	}

	public void setReturnContactMeches(List<ReturnContactMech> returnContactMeches) {
		this.returnContactMeches = returnContactMeches;
	}

	public ReturnContactMech addReturnContactMech(ReturnContactMech returnContactMech) {
		getReturnContactMeches().add(returnContactMech);
		returnContactMech.setReturnHeader(this);

		return returnContactMech;
	}

	public ReturnContactMech removeReturnContactMech(ReturnContactMech returnContactMech) {
		getReturnContactMeches().remove(returnContactMech);
		returnContactMech.setReturnHeader(null);

		return returnContactMech;
	}

	/*public BillingAccount getBillingAccount() {
		return this.billingAccount;
	}

	public void setBillingAccount(BillingAccount billingAccount) {
		this.billingAccount = billingAccount;
	}

	public ContactMech getContactMech() {
		return this.contactMech;
	}

	public void setContactMech(ContactMech contactMech) {
		this.contactMech = contactMech;
	}

	public Facility getFacility() {
		return this.facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public FinAccount getFinAccount() {
		return this.finAccount;
	}

	public void setFinAccount(FinAccount finAccount) {
		this.finAccount = finAccount;
	}

	public Party getParty1() {
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

	public PaymentMethod getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}*/

	public ReturnHeaderType getReturnHeaderType() {
		return this.returnHeaderType;
	}

	public void setReturnHeaderType(ReturnHeaderType returnHeaderType) {
		this.returnHeaderType = returnHeaderType;
	}

	/*public StatusItem getStatusItem() {
		return this.statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}

	public Uom getUom() {
		return this.uom;
	}

	public void setUom(Uom uom) {
		this.uom = uom;
	}
*/
	public List<ReturnItem> getReturnItems() {
		return this.returnItems;
	}

	public void setReturnItems(List<ReturnItem> returnItems) {
		this.returnItems = returnItems;
	}

	public ReturnItem addReturnItem(ReturnItem returnItem) {
		getReturnItems().add(returnItem);
		returnItem.setReturnHeader(this);

		return returnItem;
	}

	public ReturnItem removeReturnItem(ReturnItem returnItem) {
		getReturnItems().remove(returnItem);
		returnItem.setReturnHeader(null);

		return returnItem;
	}

	public List<ReturnItemBilling> getReturnItemBillings() {
		return this.returnItemBillings;
	}

	public void setReturnItemBillings(List<ReturnItemBilling> returnItemBillings) {
		this.returnItemBillings = returnItemBillings;
	}

	public ReturnItemBilling addReturnItemBilling(ReturnItemBilling returnItemBilling) {
		getReturnItemBillings().add(returnItemBilling);
		returnItemBilling.setReturnHeader(this);

		return returnItemBilling;
	}

	public ReturnItemBilling removeReturnItemBilling(ReturnItemBilling returnItemBilling) {
		getReturnItemBillings().remove(returnItemBilling);
		returnItemBilling.setReturnHeader(null);

		return returnItemBilling;
	}

	public List<ReturnItemShipment> getReturnItemShipments() {
		return this.returnItemShipments;
	}

	public void setReturnItemShipments(List<ReturnItemShipment> returnItemShipments) {
		this.returnItemShipments = returnItemShipments;
	}

	public ReturnItemShipment addReturnItemShipment(ReturnItemShipment returnItemShipment) {
		getReturnItemShipments().add(returnItemShipment);
		returnItemShipment.setReturnHeader(this);

		return returnItemShipment;
	}

	public ReturnItemShipment removeReturnItemShipment(ReturnItemShipment returnItemShipment) {
		getReturnItemShipments().remove(returnItemShipment);
		returnItemShipment.setReturnHeader(null);

		return returnItemShipment;
	}

	public List<ReturnStatus> getReturnStatuses() {
		return this.returnStatuses;
	}

	public void setReturnStatuses(List<ReturnStatus> returnStatuses) {
		this.returnStatuses = returnStatuses;
	}

	public ReturnStatus addReturnStatus(ReturnStatus returnStatus) {
		getReturnStatuses().add(returnStatus);
		returnStatus.setReturnHeader(this);

		return returnStatus;
	}

	public ReturnStatus removeReturnStatus(ReturnStatus returnStatus) {
		getReturnStatuses().remove(returnStatus);
		returnStatus.setReturnHeader(null);

		return returnStatus;
	}

	/*public List<Shipment> getShipments() {
		return this.shipments;
	}

	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}

	public Shipment addShipment(Shipment shipment) {
		getShipments().add(shipment);
		shipment.setReturnHeader(this);

		return shipment;
	}

	public Shipment removeShipment(Shipment shipment) {
		getShipments().remove(shipment);
		shipment.setReturnHeader(null);

		return shipment;
	}

	public List<TrackingCodeOrderReturn> getTrackingCodeOrderReturns() {
		return this.trackingCodeOrderReturns;
	}

	public void setTrackingCodeOrderReturns(List<TrackingCodeOrderReturn> trackingCodeOrderReturns) {
		this.trackingCodeOrderReturns = trackingCodeOrderReturns;
	}

	public TrackingCodeOrderReturn addTrackingCodeOrderReturn(TrackingCodeOrderReturn trackingCodeOrderReturn) {
		getTrackingCodeOrderReturns().add(trackingCodeOrderReturn);
		trackingCodeOrderReturn.setReturnHeader(this);

		return trackingCodeOrderReturn;
	}

	public TrackingCodeOrderReturn removeTrackingCodeOrderReturn(TrackingCodeOrderReturn trackingCodeOrderReturn) {
		getTrackingCodeOrderReturns().remove(trackingCodeOrderReturn);
		trackingCodeOrderReturn.setReturnHeader(null);

		return trackingCodeOrderReturn;
	}*/

}