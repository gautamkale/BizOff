package com.bizoffs.order.entities;

import jakarta.persistence.*;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the STATUS_ITEM database table.
 * 
 */
@Entity
@Table(name="STATUS_ITEM")
@NamedQuery(name="StatusItem.findAll", query="SELECT s FROM StatusItem s")
public class StatusItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STATUS_ID")
	private String statusId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="SEQUENCE_ID")
	private String sequenceId;

	@Column(name="STATUS_CODE")
	private String statusCode;



	//bi-directional many-to-one association to AllocationPlanHeader
	@OneToMany(mappedBy="statusItem")
	private List<AllocationPlanHeader> allocationPlanHeaders;



	//bi-directional many-to-one association to CustRequest
	@OneToMany(mappedBy="statusItem")
	private List<CustRequest> custRequests;

	//bi-directional many-to-one association to CustRequestItem
	@OneToMany(mappedBy="statusItem")
	private List<CustRequestItem> custRequestItems;

	//bi-directional many-to-one association to CustRequestStatus
	@OneToMany(mappedBy="statusItem")
	private List<CustRequestStatus> custRequestStatuses;



	//bi-directional many-to-one association to OrderDeliverySchedule
	@OneToMany(mappedBy="statusItem")
	private List<OrderDeliverySchedule> orderDeliverySchedules;

	//bi-directional many-to-one association to OrderHeader
	@OneToMany(mappedBy="statusItem")
	private List<OrderHeader> orderHeaders;

	//bi-directional many-to-one association to OrderHeader


	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="statusItem")
	private List<OrderItem> orderItems;

	//bi-directional many-to-one association to OrderItem


	//bi-directional many-to-one association to OrderPaymentPreference
	@OneToMany(mappedBy="statusItem")
	private List<OrderPaymentPreference> orderPaymentPreferences;

	//bi-directional many-to-one association to OrderStatus
	@OneToMany(mappedBy="statusItem")
	private List<OrderStatus> orderStatuses;



	//bi-directional many-to-one association to Quote
	@OneToMany(mappedBy="statusItem")
	private List<Quote> quotes;

	//bi-directional many-to-one association to Requirement
	@OneToMany(mappedBy="statusItem")
	private List<Requirement> requirements;

	//bi-directional many-to-one association to RequirementStatus
	@OneToMany(mappedBy="statusItem")
	private List<RequirementStatus> requirementStatuses;

	//bi-directional many-to-one association to ReturnHeader
	@OneToMany(mappedBy="statusItem")
	private List<ReturnHeader> returnHeaders;

	//bi-directional many-to-one association to ReturnItem
	@OneToMany(mappedBy="statusItem")
	private List<ReturnItem> returnItems;

	//bi-directional many-to-one association to ReturnItem
	//bi-directional many-to-one association to ReturnStatus
	@OneToMany(mappedBy="statusItem")
	private List<ReturnStatus> returnStatuses;

	//bi-directional many-to-one association to Shipment


	public StatusItem() {
	}

	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getSequenceId() {
		return this.sequenceId;
	}

	public void setSequenceId(String sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}



	public List<AllocationPlanHeader> getAllocationPlanHeaders() {
		return this.allocationPlanHeaders;
	}

	public void setAllocationPlanHeaders(List<AllocationPlanHeader> allocationPlanHeaders) {
		this.allocationPlanHeaders = allocationPlanHeaders;
	}

	public AllocationPlanHeader addAllocationPlanHeader(AllocationPlanHeader allocationPlanHeader) {
		getAllocationPlanHeaders().add(allocationPlanHeader);
		allocationPlanHeader.setStatusItem(this);

		return allocationPlanHeader;
	}

	public AllocationPlanHeader removeAllocationPlanHeader(AllocationPlanHeader allocationPlanHeader) {
		getAllocationPlanHeaders().remove(allocationPlanHeader);
		allocationPlanHeader.setStatusItem(null);

		return allocationPlanHeader;
	}


	public List<CustRequest> getCustRequests() {
		return this.custRequests;
	}

	public void setCustRequests(List<CustRequest> custRequests) {
		this.custRequests = custRequests;
	}

	public CustRequest addCustRequest(CustRequest custRequest) {
		getCustRequests().add(custRequest);
		custRequest.setStatusItem(this);

		return custRequest;
	}

	public CustRequest removeCustRequest(CustRequest custRequest) {
		getCustRequests().remove(custRequest);
		custRequest.setStatusItem(null);

		return custRequest;
	}

	public List<CustRequestItem> getCustRequestItems() {
		return this.custRequestItems;
	}

	public void setCustRequestItems(List<CustRequestItem> custRequestItems) {
		this.custRequestItems = custRequestItems;
	}

	public CustRequestItem addCustRequestItem(CustRequestItem custRequestItem) {
		getCustRequestItems().add(custRequestItem);
		custRequestItem.setStatusItem(this);

		return custRequestItem;
	}

	public CustRequestItem removeCustRequestItem(CustRequestItem custRequestItem) {
		getCustRequestItems().remove(custRequestItem);
		custRequestItem.setStatusItem(null);

		return custRequestItem;
	}

	public List<CustRequestStatus> getCustRequestStatuses() {
		return this.custRequestStatuses;
	}

	public void setCustRequestStatuses(List<CustRequestStatus> custRequestStatuses) {
		this.custRequestStatuses = custRequestStatuses;
	}

	public CustRequestStatus addCustRequestStatus(CustRequestStatus custRequestStatus) {
		getCustRequestStatuses().add(custRequestStatus);
		custRequestStatus.setStatusItem(this);

		return custRequestStatus;
	}

	public CustRequestStatus removeCustRequestStatus(CustRequestStatus custRequestStatus) {
		getCustRequestStatuses().remove(custRequestStatus);
		custRequestStatus.setStatusItem(null);

		return custRequestStatus;
	}


	public List<OrderDeliverySchedule> getOrderDeliverySchedules() {
		return this.orderDeliverySchedules;
	}

	public void setOrderDeliverySchedules(List<OrderDeliverySchedule> orderDeliverySchedules) {
		this.orderDeliverySchedules = orderDeliverySchedules;
	}

	public OrderDeliverySchedule addOrderDeliverySchedule(OrderDeliverySchedule orderDeliverySchedule) {
		getOrderDeliverySchedules().add(orderDeliverySchedule);
		orderDeliverySchedule.setStatusItem(this);

		return orderDeliverySchedule;
	}

	public OrderDeliverySchedule removeOrderDeliverySchedule(OrderDeliverySchedule orderDeliverySchedule) {
		getOrderDeliverySchedules().remove(orderDeliverySchedule);
		orderDeliverySchedule.setStatusItem(null);

		return orderDeliverySchedule;
	}

	public List<OrderHeader> getOrderHeaders() {
		return this.orderHeaders;
	}

	public void setOrderHeaders1(List<OrderHeader> orderHeaders1) {
		this.orderHeaders = orderHeaders1;
	}

	public OrderHeader addOrderHeaders1(OrderHeader orderHeaders1) {
		getOrderHeaders().add(orderHeaders1);
		orderHeaders1.setStatusItem(this);

		return orderHeaders1;
	}

	public OrderHeader removeOrderHeaders1(OrderHeader orderHeaders) {
		getOrderHeaders().remove(orderHeaders);
		orderHeaders.setStatusItem(null);

		return orderHeaders;
	}




	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems1(List<OrderItem> orderItems1) {
		this.orderItems = orderItems1;
	}

	public OrderItem addOrderItems1(OrderItem orderItems) {
		getOrderItems().add(orderItems);
		orderItems.setStatusItem(this);

		return orderItems;
	}

	public OrderItem removeOrderItems1(OrderItem orderItems1) {
		getOrderItems().remove(orderItems1);
		orderItems1.setStatusItem(null);

		return orderItems1;
	}



	public List<OrderPaymentPreference> getOrderPaymentPreferences() {
		return this.orderPaymentPreferences;
	}

	public void setOrderPaymentPreferences(List<OrderPaymentPreference> orderPaymentPreferences) {
		this.orderPaymentPreferences = orderPaymentPreferences;
	}

	public OrderPaymentPreference addOrderPaymentPreference(OrderPaymentPreference orderPaymentPreference) {
		getOrderPaymentPreferences().add(orderPaymentPreference);
		orderPaymentPreference.setStatusItem(this);

		return orderPaymentPreference;
	}

	public OrderPaymentPreference removeOrderPaymentPreference(OrderPaymentPreference orderPaymentPreference) {
		getOrderPaymentPreferences().remove(orderPaymentPreference);
		orderPaymentPreference.setStatusItem(null);

		return orderPaymentPreference;
	}

	public List<OrderStatus> getOrderStatuses() {
		return this.orderStatuses;
	}

	public void setOrderStatuses(List<OrderStatus> orderStatuses) {
		this.orderStatuses = orderStatuses;
	}

	public OrderStatus addOrderStatus(OrderStatus orderStatus) {
		getOrderStatuses().add(orderStatus);
		orderStatus.setStatusItem(this);

		return orderStatus;
	}

	public OrderStatus removeOrderStatus(OrderStatus orderStatus) {
		getOrderStatuses().remove(orderStatus);
		orderStatus.setStatusItem(null);

		return orderStatus;
	}






	public List<Quote> getQuotes() {
		return this.quotes;
	}

	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}

	public Quote addQuote(Quote quote) {
		getQuotes().add(quote);
		quote.setStatusItem(this);

		return quote;
	}

	public Quote removeQuote(Quote quote) {
		getQuotes().remove(quote);
		quote.setStatusItem(null);

		return quote;
	}

	public List<Requirement> getRequirements() {
		return this.requirements;
	}

	public void setRequirements(List<Requirement> requirements) {
		this.requirements = requirements;
	}

	public Requirement addRequirement(Requirement requirement) {
		getRequirements().add(requirement);
		requirement.setStatusItem(this);

		return requirement;
	}

	public Requirement removeRequirement(Requirement requirement) {
		getRequirements().remove(requirement);
		requirement.setStatusItem(null);

		return requirement;
	}

	public List<RequirementStatus> getRequirementStatuses() {
		return this.requirementStatuses;
	}

	public void setRequirementStatuses(List<RequirementStatus> requirementStatuses) {
		this.requirementStatuses = requirementStatuses;
	}

	public RequirementStatus addRequirementStatus(RequirementStatus requirementStatus) {
		getRequirementStatuses().add(requirementStatus);
		requirementStatus.setStatusItem(this);

		return requirementStatus;
	}

	public RequirementStatus removeRequirementStatus(RequirementStatus requirementStatus) {
		getRequirementStatuses().remove(requirementStatus);
		requirementStatus.setStatusItem(null);

		return requirementStatus;
	}

	public List<ReturnHeader> getReturnHeaders() {
		return this.returnHeaders;
	}

	public void setReturnHeaders(List<ReturnHeader> returnHeaders) {
		this.returnHeaders = returnHeaders;
	}

	public ReturnHeader addReturnHeader(ReturnHeader returnHeader) {
		getReturnHeaders().add(returnHeader);
		returnHeader.setStatusItem(this);

		return returnHeader;
	}

	public ReturnHeader removeReturnHeader(ReturnHeader returnHeader) {
		getReturnHeaders().remove(returnHeader);
		returnHeader.setStatusItem(null);

		return returnHeader;
	}

	public List<ReturnItem> getReturnItems() {
		return this.returnItems;
	}

	public void setReturnItems(List<ReturnItem> returnItems1) {
		this.returnItems = returnItems1;
	}

	public ReturnItem addReturnItems(ReturnItem returnItems1) {
		getReturnItems().add(returnItems1);
		returnItems1.setStatusItem(this);

		return returnItems1;
	}

	public ReturnItem removeReturnItems(ReturnItem returnItems1) {
		getReturnItems().remove(returnItems1);
		returnItems1.setStatusItem(null);

		return returnItems1;
	}



	public List<ReturnStatus> getReturnStatuses() {
		return this.returnStatuses;
	}

	public void setReturnStatuses(List<ReturnStatus> returnStatuses) {
		this.returnStatuses = returnStatuses;
	}

	public ReturnStatus addReturnStatus(ReturnStatus returnStatus) {
		getReturnStatuses().add(returnStatus);
		returnStatus.setStatusItem(this);

		return returnStatus;
	}

	public ReturnStatus removeReturnStatus(ReturnStatus returnStatus) {
		getReturnStatuses().remove(returnStatus);
		returnStatus.setStatusItem(null);

		return returnStatus;
	}



}
