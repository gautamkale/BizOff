package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the REQUIREMENT database table.
 * 
 */
@Entity
@NamedQuery(name="Requirement.findAll", query="SELECT r FROM Requirement r")
public class Requirement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="REQUIREMENT_ID")
	private String requirementId;

	@Column(name="CREATED_BY_USER_LOGIN")
	private String createdByUserLogin;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="ESTIMATED_BUDGET")
	private BigDecimal estimatedBudget;

	@Column(name="FACILITY_ID_TO")
	private String facilityIdTo;

	@Column(name="LAST_MODIFIED_BY_USER_LOGIN")
	private String lastModifiedByUserLogin;

	@Column(name="LAST_MODIFIED_DATE")
	private Timestamp lastModifiedDate;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	private BigDecimal quantity;

	private String reason;

	@Column(name="REQUIRED_BY_DATE")
	private Timestamp requiredByDate;

	@Column(name="REQUIREMENT_START_DATE")
	private Timestamp requirementStartDate;

	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	public StatusItem getStatusItem() {
		return statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}
	@Lob
	@Column(name="USE_CASE")
	private String useCase;

	//bi-directional many-to-one association to DesiredFeature
	@OneToMany(mappedBy="requirement")
	private List<DesiredFeature> desiredFeatures;

	//bi-directional many-to-one association to OrderRequirementCommitment
	@OneToMany(mappedBy="requirement")
	private List<OrderRequirementCommitment> orderRequirementCommitments;

	//bi-directional many-to-one association to Deliverable
	/*@ManyToOne
	@JoinColumn(name="DELIVERABLE_ID")
	private Deliverable deliverable;

	//bi-directional many-to-one association to Facility
	@ManyToOne
	@JoinColumn(name="FACILITY_ID")
	private Facility facility;

	//bi-directional many-to-one association to FixedAsset
	@ManyToOne
	@JoinColumn(name="FIXED_ASSET_ID")
	private FixedAsset fixedAsset;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;*/

	//bi-directional many-to-one association to RequirementType
	@ManyToOne
	@JoinColumn(name="REQUIREMENT_TYPE_ID")
	private RequirementType requirementType;

	//bi-directional many-to-one association to StatusItem
	/*@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;*/

	//bi-directional many-to-one association to RequirementAttribute
	@OneToMany(mappedBy="requirement")
	private List<RequirementAttribute> requirementAttributes;

	//bi-directional many-to-one association to RequirementBudgetAllocation
	@OneToMany(mappedBy="requirement")
	private List<RequirementBudgetAllocation> requirementBudgetAllocations;

	//bi-directional many-to-one association to RequirementCustRequest
	@OneToMany(mappedBy="requirement")
	private List<RequirementCustRequest> requirementCustRequests;

	//bi-directional many-to-one association to RequirementRole
	@OneToMany(mappedBy="requirement")
	private List<RequirementRole> requirementRoles;

	//bi-directional many-to-one association to RequirementStatus
	@OneToMany(mappedBy="requirement")
	private List<RequirementStatus> requirementStatuses;

	//bi-directional many-to-one association to WorkRequirementFulfillment
	@OneToMany(mappedBy="requirement")
	private List<WorkRequirementFulfillment> workRequirementFulfillments;

	public Requirement() {
	}

	public String getRequirementId() {
		return this.requirementId;
	}

	public void setRequirementId(String requirementId) {
		this.requirementId = requirementId;
	}

	public String getCreatedByUserLogin() {
		return this.createdByUserLogin;
	}

	public void setCreatedByUserLogin(String createdByUserLogin) {
		this.createdByUserLogin = createdByUserLogin;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
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

	public BigDecimal getEstimatedBudget() {
		return this.estimatedBudget;
	}

	public void setEstimatedBudget(BigDecimal estimatedBudget) {
		this.estimatedBudget = estimatedBudget;
	}

	public String getFacilityIdTo() {
		return this.facilityIdTo;
	}

	public void setFacilityIdTo(String facilityIdTo) {
		this.facilityIdTo = facilityIdTo;
	}

	public String getLastModifiedByUserLogin() {
		return this.lastModifiedByUserLogin;
	}

	public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
		this.lastModifiedByUserLogin = lastModifiedByUserLogin;
	}

	public Timestamp getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Timestamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
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

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Timestamp getRequiredByDate() {
		return this.requiredByDate;
	}

	public void setRequiredByDate(Timestamp requiredByDate) {
		this.requiredByDate = requiredByDate;
	}

	public Timestamp getRequirementStartDate() {
		return this.requirementStartDate;
	}

	public void setRequirementStartDate(Timestamp requirementStartDate) {
		this.requirementStartDate = requirementStartDate;
	}

	public String getUseCase() {
		return this.useCase;
	}

	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}

	public List<DesiredFeature> getDesiredFeatures() {
		return this.desiredFeatures;
	}

	public void setDesiredFeatures(List<DesiredFeature> desiredFeatures) {
		this.desiredFeatures = desiredFeatures;
	}

	public DesiredFeature addDesiredFeature(DesiredFeature desiredFeature) {
		getDesiredFeatures().add(desiredFeature);
		desiredFeature.setRequirement(this);

		return desiredFeature;
	}

	public DesiredFeature removeDesiredFeature(DesiredFeature desiredFeature) {
		getDesiredFeatures().remove(desiredFeature);
		desiredFeature.setRequirement(null);

		return desiredFeature;
	}

	public List<OrderRequirementCommitment> getOrderRequirementCommitments() {
		return this.orderRequirementCommitments;
	}

	public void setOrderRequirementCommitments(List<OrderRequirementCommitment> orderRequirementCommitments) {
		this.orderRequirementCommitments = orderRequirementCommitments;
	}

	public OrderRequirementCommitment addOrderRequirementCommitment(OrderRequirementCommitment orderRequirementCommitment) {
		getOrderRequirementCommitments().add(orderRequirementCommitment);
		orderRequirementCommitment.setRequirement(this);

		return orderRequirementCommitment;
	}

	public OrderRequirementCommitment removeOrderRequirementCommitment(OrderRequirementCommitment orderRequirementCommitment) {
		getOrderRequirementCommitments().remove(orderRequirementCommitment);
		orderRequirementCommitment.setRequirement(null);

		return orderRequirementCommitment;
	}

	/*public Deliverable getDeliverable() {
		return this.deliverable;
	}

	public void setDeliverable(Deliverable deliverable) {
		this.deliverable = deliverable;
	}

	public Facility getFacility() {
		return this.facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public FixedAsset getFixedAsset() {
		return this.fixedAsset;
	}

	public void setFixedAsset(FixedAsset fixedAsset) {
		this.fixedAsset = fixedAsset;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
*/
	public RequirementType getRequirementType() {
		return this.requirementType;
	}

	public void setRequirementType(RequirementType requirementType) {
		this.requirementType = requirementType;
	}

/*	public StatusItem getStatusItem() {
		return this.statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}*/

	public List<RequirementAttribute> getRequirementAttributes() {
		return this.requirementAttributes;
	}

	public void setRequirementAttributes(List<RequirementAttribute> requirementAttributes) {
		this.requirementAttributes = requirementAttributes;
	}

	public RequirementAttribute addRequirementAttribute(RequirementAttribute requirementAttribute) {
		getRequirementAttributes().add(requirementAttribute);
		requirementAttribute.setRequirement(this);

		return requirementAttribute;
	}

	public RequirementAttribute removeRequirementAttribute(RequirementAttribute requirementAttribute) {
		getRequirementAttributes().remove(requirementAttribute);
		requirementAttribute.setRequirement(null);

		return requirementAttribute;
	}

	public List<RequirementBudgetAllocation> getRequirementBudgetAllocations() {
		return this.requirementBudgetAllocations;
	}

	public void setRequirementBudgetAllocations(List<RequirementBudgetAllocation> requirementBudgetAllocations) {
		this.requirementBudgetAllocations = requirementBudgetAllocations;
	}

	public RequirementBudgetAllocation addRequirementBudgetAllocation(RequirementBudgetAllocation requirementBudgetAllocation) {
		getRequirementBudgetAllocations().add(requirementBudgetAllocation);
		requirementBudgetAllocation.setRequirement(this);

		return requirementBudgetAllocation;
	}

	public RequirementBudgetAllocation removeRequirementBudgetAllocation(RequirementBudgetAllocation requirementBudgetAllocation) {
		getRequirementBudgetAllocations().remove(requirementBudgetAllocation);
		requirementBudgetAllocation.setRequirement(null);

		return requirementBudgetAllocation;
	}

	public List<RequirementCustRequest> getRequirementCustRequests() {
		return this.requirementCustRequests;
	}

	public void setRequirementCustRequests(List<RequirementCustRequest> requirementCustRequests) {
		this.requirementCustRequests = requirementCustRequests;
	}

	public RequirementCustRequest addRequirementCustRequest(RequirementCustRequest requirementCustRequest) {
		getRequirementCustRequests().add(requirementCustRequest);
		requirementCustRequest.setRequirement(this);

		return requirementCustRequest;
	}

	public RequirementCustRequest removeRequirementCustRequest(RequirementCustRequest requirementCustRequest) {
		getRequirementCustRequests().remove(requirementCustRequest);
		requirementCustRequest.setRequirement(null);

		return requirementCustRequest;
	}

	public List<RequirementRole> getRequirementRoles() {
		return this.requirementRoles;
	}

	public void setRequirementRoles(List<RequirementRole> requirementRoles) {
		this.requirementRoles = requirementRoles;
	}

	public RequirementRole addRequirementRole(RequirementRole requirementRole) {
		getRequirementRoles().add(requirementRole);
		requirementRole.setRequirement(this);

		return requirementRole;
	}

	public RequirementRole removeRequirementRole(RequirementRole requirementRole) {
		getRequirementRoles().remove(requirementRole);
		requirementRole.setRequirement(null);

		return requirementRole;
	}

	public List<RequirementStatus> getRequirementStatuses() {
		return this.requirementStatuses;
	}

	public void setRequirementStatuses(List<RequirementStatus> requirementStatuses) {
		this.requirementStatuses = requirementStatuses;
	}

	public RequirementStatus addRequirementStatus(RequirementStatus requirementStatus) {
		getRequirementStatuses().add(requirementStatus);
		requirementStatus.setRequirement(this);

		return requirementStatus;
	}

	public RequirementStatus removeRequirementStatus(RequirementStatus requirementStatus) {
		getRequirementStatuses().remove(requirementStatus);
		requirementStatus.setRequirement(null);

		return requirementStatus;
	}

	public List<WorkRequirementFulfillment> getWorkRequirementFulfillments() {
		return this.workRequirementFulfillments;
	}

	public void setWorkRequirementFulfillments(List<WorkRequirementFulfillment> workRequirementFulfillments) {
		this.workRequirementFulfillments = workRequirementFulfillments;
	}

	public WorkRequirementFulfillment addWorkRequirementFulfillment(WorkRequirementFulfillment workRequirementFulfillment) {
		getWorkRequirementFulfillments().add(workRequirementFulfillment);
		workRequirementFulfillment.setRequirement(this);

		return workRequirementFulfillment;
	}

	public WorkRequirementFulfillment removeWorkRequirementFulfillment(WorkRequirementFulfillment workRequirementFulfillment) {
		getWorkRequirementFulfillments().remove(workRequirementFulfillment);
		workRequirementFulfillment.setRequirement(null);

		return workRequirementFulfillment;
	}

}