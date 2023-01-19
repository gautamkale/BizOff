package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the CUST_REQUEST_ITEM database table.
 * 
 */
@Entity
@Table(name="CUST_REQUEST_ITEM")
@NamedQuery(name="CustRequestItem.findAll", query="SELECT c FROM CustRequestItem c")
public class CustRequestItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CustRequestItemPK id;

	@Column(name="CONFIG_ID")
	private String configId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="MAXIMUM_AMOUNT")
	private BigDecimal maximumAmount;

	private BigDecimal priority;

	private BigDecimal quantity;

	@Column(name="REQUIRED_BY_DATE")
	private Timestamp requiredByDate;

	@Column(name="RESERV_LENGTH")
	private BigDecimal reservLength;

	@Column(name="RESERV_PERSONS")
	private BigDecimal reservPersons;

	@Column(name="RESERV_START")
	private Timestamp reservStart;

	@Column(name="SELECTED_AMOUNT")
	private BigDecimal selectedAmount;

	@Column(name="SEQUENCE_NUM")
	private BigDecimal sequenceNum;

	@Lob
	private String story;


	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	public StatusItem getStatusItem() {
		return statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}
	//bi-directional many-to-one association to CustRequest
	@ManyToOne
	@JoinColumn(name="CUST_REQUEST_ID", insertable=false, updatable=false)
	private CustRequest custRequest;

	//bi-directional many-to-one association to CustRequestResolution
	@ManyToOne
	@JoinColumn(name="CUST_REQUEST_RESOLUTION_ID", insertable=false, updatable=false)
	private CustRequestResolution custRequestResolution;

	//bi-directional many-to-one association to Product
/*	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	//bi-directional many-to-one association to StatusItem
	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;*/

	//bi-directional many-to-one association to CustRequestItemNote
	@OneToMany(mappedBy="custRequestItem")
	private List<CustRequestItemNote> custRequestItemNotes;

	//bi-directional many-to-one association to CustRequestItemWorkEffort
	@OneToMany(mappedBy="custRequestItem")
	private List<CustRequestItemWorkEffort> custRequestItemWorkEfforts;

	//bi-directional many-to-one association to QuoteItem
	@OneToMany(mappedBy="custRequestItem")
	private List<QuoteItem> quoteItems;

	//bi-directional many-to-one association to RequirementCustRequest
	@OneToMany(mappedBy="custRequestItem")
	private List<RequirementCustRequest> requirementCustRequests;

	public CustRequestItem() {
	}

	public CustRequestItemPK getId() {
		return this.id;
	}

	public void setId(CustRequestItemPK id) {
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

	public BigDecimal getMaximumAmount() {
		return this.maximumAmount;
	}

	public void setMaximumAmount(BigDecimal maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	public BigDecimal getPriority() {
		return this.priority;
	}

	public void setPriority(BigDecimal priority) {
		this.priority = priority;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Timestamp getRequiredByDate() {
		return this.requiredByDate;
	}

	public void setRequiredByDate(Timestamp requiredByDate) {
		this.requiredByDate = requiredByDate;
	}

	public BigDecimal getReservLength() {
		return this.reservLength;
	}

	public void setReservLength(BigDecimal reservLength) {
		this.reservLength = reservLength;
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

	public BigDecimal getSelectedAmount() {
		return this.selectedAmount;
	}

	public void setSelectedAmount(BigDecimal selectedAmount) {
		this.selectedAmount = selectedAmount;
	}

	public BigDecimal getSequenceNum() {
		return this.sequenceNum;
	}

	public void setSequenceNum(BigDecimal sequenceNum) {
		this.sequenceNum = sequenceNum;
	}

	public String getStory() {
		return this.story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public CustRequest getCustRequest() {
		return this.custRequest;
	}

	public void setCustRequest(CustRequest custRequest) {
		this.custRequest = custRequest;
	}

	public CustRequestResolution getCustRequestResolution() {
		return this.custRequestResolution;
	}

	public void setCustRequestResolution(CustRequestResolution custRequestResolution) {
		this.custRequestResolution = custRequestResolution;
	}

	/*public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public StatusItem getStatusItem() {
		return this.statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}*/

	public List<CustRequestItemNote> getCustRequestItemNotes() {
		return this.custRequestItemNotes;
	}

	public void setCustRequestItemNotes(List<CustRequestItemNote> custRequestItemNotes) {
		this.custRequestItemNotes = custRequestItemNotes;
	}

	public CustRequestItemNote addCustRequestItemNote(CustRequestItemNote custRequestItemNote) {
		getCustRequestItemNotes().add(custRequestItemNote);
		custRequestItemNote.setCustRequestItem(this);

		return custRequestItemNote;
	}

	public CustRequestItemNote removeCustRequestItemNote(CustRequestItemNote custRequestItemNote) {
		getCustRequestItemNotes().remove(custRequestItemNote);
		custRequestItemNote.setCustRequestItem(null);

		return custRequestItemNote;
	}

	public List<CustRequestItemWorkEffort> getCustRequestItemWorkEfforts() {
		return this.custRequestItemWorkEfforts;
	}

	public void setCustRequestItemWorkEfforts(List<CustRequestItemWorkEffort> custRequestItemWorkEfforts) {
		this.custRequestItemWorkEfforts = custRequestItemWorkEfforts;
	}

	public CustRequestItemWorkEffort addCustRequestItemWorkEffort(CustRequestItemWorkEffort custRequestItemWorkEffort) {
		getCustRequestItemWorkEfforts().add(custRequestItemWorkEffort);
		custRequestItemWorkEffort.setCustRequestItem(this);

		return custRequestItemWorkEffort;
	}

	public CustRequestItemWorkEffort removeCustRequestItemWorkEffort(CustRequestItemWorkEffort custRequestItemWorkEffort) {
		getCustRequestItemWorkEfforts().remove(custRequestItemWorkEffort);
		custRequestItemWorkEffort.setCustRequestItem(null);

		return custRequestItemWorkEffort;
	}

	public List<QuoteItem> getQuoteItems() {
		return this.quoteItems;
	}

	public void setQuoteItems(List<QuoteItem> quoteItems) {
		this.quoteItems = quoteItems;
	}

	public QuoteItem addQuoteItem(QuoteItem quoteItem) {
		getQuoteItems().add(quoteItem);
		quoteItem.setCustRequestItem(this);

		return quoteItem;
	}

	public QuoteItem removeQuoteItem(QuoteItem quoteItem) {
		getQuoteItems().remove(quoteItem);
		quoteItem.setCustRequestItem(null);

		return quoteItem;
	}

	public List<RequirementCustRequest> getRequirementCustRequests() {
		return this.requirementCustRequests;
	}

	public void setRequirementCustRequests(List<RequirementCustRequest> requirementCustRequests) {
		this.requirementCustRequests = requirementCustRequests;
	}

	public RequirementCustRequest addRequirementCustRequest(RequirementCustRequest requirementCustRequest) {
		getRequirementCustRequests().add(requirementCustRequest);
		requirementCustRequest.setCustRequestItem(this);

		return requirementCustRequest;
	}

	public RequirementCustRequest removeRequirementCustRequest(RequirementCustRequest requirementCustRequest) {
		getRequirementCustRequests().remove(requirementCustRequest);
		requirementCustRequest.setCustRequestItem(null);

		return requirementCustRequest;
	}

}