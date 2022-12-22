package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the CUST_REQUEST database table.
 * 
 */
@Entity
@Table(name="CUST_REQUEST")
@NamedQuery(name="CustRequest.findAll", query="SELECT c FROM CustRequest c")
public class CustRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUST_REQUEST_ID")
	private String custRequestId;

	@Column(name="CLOSED_DATE_TIME")
	private Timestamp closedDateTime;

	@Column(name="CREATED_BY_USER_LOGIN")
	private String createdByUserLogin;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="CUST_REQUEST_DATE")
	private Timestamp custRequestDate;

	@Column(name="CUST_REQUEST_NAME")
	private String custRequestName;

	private String description;

	@Column(name="INTERNAL_COMMENT")
	private String internalComment;

	@Column(name="LAST_MODIFIED_BY_USER_LOGIN")
	private String lastModifiedByUserLogin;

	@Column(name="LAST_MODIFIED_DATE")
	private Timestamp lastModifiedDate;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="OPEN_DATE_TIME")
	private Timestamp openDateTime;

	private BigDecimal priority;

	private String reason;

	@Column(name="RESPONSE_REQUIRED_DATE")
	private Timestamp responseRequiredDate;

	//bi-directional many-to-one association to ContactMech
/*	@ManyToOne
	@JoinColumn(name="FULFILL_CONTACT_MECH_ID")
	private ContactMech contactMech;*/

	//bi-directional many-to-one association to CustRequestCategory
	@ManyToOne
	@JoinColumn(name="CUST_REQUEST_CATEGORY_ID")
	private CustRequestCategory custRequestCategory;

	//bi-directional many-to-one association to CustRequestType
	@ManyToOne
	@JoinColumn(name="CUST_REQUEST_TYPE_ID")
	private CustRequestType custRequestType;

	//bi-directional many-to-one association to Enumeration
	/*@ManyToOne
	@JoinColumn(name="SALES_CHANNEL_ENUM_ID")
	private Enumeration enumeration;

	//bi-directional many-to-one association to Party
	@ManyToOne
	@JoinColumn(name="FROM_PARTY_ID")
	private Party party;

	//bi-directional many-to-one association to ProductStore
	@ManyToOne
	@JoinColumn(name="PRODUCT_STORE_ID")
	private ProductStore productStore;

	//bi-directional many-to-one association to StatusItem
	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	//bi-directional many-to-one association to Uom
	@ManyToOne
	@JoinColumn(name="CURRENCY_UOM_ID")
	private Uom uom1;

	//bi-directional many-to-one association to Uom
	@ManyToOne
	@JoinColumn(name="MAXIMUM_AMOUNT_UOM_ID")
	private Uom uom2;
*/
	//bi-directional many-to-one association to CustRequestAttribute
	@OneToMany(mappedBy="custRequest")
	private List<CustRequestAttribute> custRequestAttributes;

	//bi-directional many-to-one association to CustRequestCommEvent
	@OneToMany(mappedBy="custRequest")
	private List<CustRequestCommEvent> custRequestCommEvents;

	//bi-directional many-to-one association to CustRequestContent
	@OneToMany(mappedBy="custRequest")
	private List<CustRequestContent> custRequestContents;

	//bi-directional many-to-one association to CustRequestItem
	@OneToMany(mappedBy="custRequest")
	private List<CustRequestItem> custRequestItems;

	//bi-directional many-to-one association to CustRequestNote
	@OneToMany(mappedBy="custRequest")
	private List<CustRequestNote> custRequestNotes;

	//bi-directional many-to-one association to CustRequestParty
	@OneToMany(mappedBy="custRequest")
	private List<CustRequestParty> custRequestParties;

	//bi-directional many-to-one association to CustRequestStatus
	@OneToMany(mappedBy="custRequest")
	private List<CustRequestStatus> custRequestStatuses;

	//bi-directional many-to-one association to CustRequestWorkEffort
	@OneToMany(mappedBy="custRequest")
	private List<CustRequestWorkEffort> custRequestWorkEfforts;

	//bi-directional many-to-one association to QuoteItem
	@OneToMany(mappedBy="custRequest")
	private List<QuoteItem> quoteItems;

	//bi-directional many-to-one association to RespondingParty
	@OneToMany(mappedBy="custRequest")
	private List<RespondingParty> respondingParties;

	public CustRequest() {
	}

	public String getCustRequestId() {
		return this.custRequestId;
	}

	public void setCustRequestId(String custRequestId) {
		this.custRequestId = custRequestId;
	}

	public Timestamp getClosedDateTime() {
		return this.closedDateTime;
	}

	public void setClosedDateTime(Timestamp closedDateTime) {
		this.closedDateTime = closedDateTime;
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

	public Timestamp getCustRequestDate() {
		return this.custRequestDate;
	}

	public void setCustRequestDate(Timestamp custRequestDate) {
		this.custRequestDate = custRequestDate;
	}

	public String getCustRequestName() {
		return this.custRequestName;
	}

	public void setCustRequestName(String custRequestName) {
		this.custRequestName = custRequestName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInternalComment() {
		return this.internalComment;
	}

	public void setInternalComment(String internalComment) {
		this.internalComment = internalComment;
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

	public Timestamp getOpenDateTime() {
		return this.openDateTime;
	}

	public void setOpenDateTime(Timestamp openDateTime) {
		this.openDateTime = openDateTime;
	}

	public BigDecimal getPriority() {
		return this.priority;
	}

	public void setPriority(BigDecimal priority) {
		this.priority = priority;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Timestamp getResponseRequiredDate() {
		return this.responseRequiredDate;
	}

	public void setResponseRequiredDate(Timestamp responseRequiredDate) {
		this.responseRequiredDate = responseRequiredDate;
	}

/*	public ContactMech getContactMech() {
		return this.contactMech;
	}*/

/*	public void setContactMech(ContactMech contactMech) {
		this.contactMech = contactMech;
	}*/

	public CustRequestCategory getCustRequestCategory() {
		return this.custRequestCategory;
	}

	public void setCustRequestCategory(CustRequestCategory custRequestCategory) {
		this.custRequestCategory = custRequestCategory;
	}

	public CustRequestType getCustRequestType() {
		return this.custRequestType;
	}

	public void setCustRequestType(CustRequestType custRequestType) {
		this.custRequestType = custRequestType;
	}

	/*public Enumeration getEnumeration() {
		return this.enumeration;
	}

	public void setEnumeration(Enumeration enumeration) {
		this.enumeration = enumeration;
	}

	public Party getParty() {
		return this.party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public ProductStore getProductStore() {
		return this.productStore;
	}

	public void setProductStore(ProductStore productStore) {
		this.productStore = productStore;
	}

	public StatusItem getStatusItem() {
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
	}
*/
	public List<CustRequestAttribute> getCustRequestAttributes() {
		return this.custRequestAttributes;
	}

	public void setCustRequestAttributes(List<CustRequestAttribute> custRequestAttributes) {
		this.custRequestAttributes = custRequestAttributes;
	}

	public CustRequestAttribute addCustRequestAttribute(CustRequestAttribute custRequestAttribute) {
		getCustRequestAttributes().add(custRequestAttribute);
		custRequestAttribute.setCustRequest(this);

		return custRequestAttribute;
	}

	public CustRequestAttribute removeCustRequestAttribute(CustRequestAttribute custRequestAttribute) {
		getCustRequestAttributes().remove(custRequestAttribute);
		custRequestAttribute.setCustRequest(null);

		return custRequestAttribute;
	}

	public List<CustRequestCommEvent> getCustRequestCommEvents() {
		return this.custRequestCommEvents;
	}

	public void setCustRequestCommEvents(List<CustRequestCommEvent> custRequestCommEvents) {
		this.custRequestCommEvents = custRequestCommEvents;
	}

	public CustRequestCommEvent addCustRequestCommEvent(CustRequestCommEvent custRequestCommEvent) {
		getCustRequestCommEvents().add(custRequestCommEvent);
		custRequestCommEvent.setCustRequest(this);

		return custRequestCommEvent;
	}

	public CustRequestCommEvent removeCustRequestCommEvent(CustRequestCommEvent custRequestCommEvent) {
		getCustRequestCommEvents().remove(custRequestCommEvent);
		custRequestCommEvent.setCustRequest(null);

		return custRequestCommEvent;
	}

	public List<CustRequestContent> getCustRequestContents() {
		return this.custRequestContents;
	}

	public void setCustRequestContents(List<CustRequestContent> custRequestContents) {
		this.custRequestContents = custRequestContents;
	}

	public CustRequestContent addCustRequestContent(CustRequestContent custRequestContent) {
		getCustRequestContents().add(custRequestContent);
		custRequestContent.setCustRequest(this);

		return custRequestContent;
	}

	public CustRequestContent removeCustRequestContent(CustRequestContent custRequestContent) {
		getCustRequestContents().remove(custRequestContent);
		custRequestContent.setCustRequest(null);

		return custRequestContent;
	}

	public List<CustRequestItem> getCustRequestItems() {
		return this.custRequestItems;
	}

	public void setCustRequestItems(List<CustRequestItem> custRequestItems) {
		this.custRequestItems = custRequestItems;
	}

	public CustRequestItem addCustRequestItem(CustRequestItem custRequestItem) {
		getCustRequestItems().add(custRequestItem);
		custRequestItem.setCustRequest(this);

		return custRequestItem;
	}

	public CustRequestItem removeCustRequestItem(CustRequestItem custRequestItem) {
		getCustRequestItems().remove(custRequestItem);
		custRequestItem.setCustRequest(null);

		return custRequestItem;
	}

	public List<CustRequestNote> getCustRequestNotes() {
		return this.custRequestNotes;
	}

	public void setCustRequestNotes(List<CustRequestNote> custRequestNotes) {
		this.custRequestNotes = custRequestNotes;
	}

	public CustRequestNote addCustRequestNote(CustRequestNote custRequestNote) {
		getCustRequestNotes().add(custRequestNote);
		custRequestNote.setCustRequest(this);

		return custRequestNote;
	}

	public CustRequestNote removeCustRequestNote(CustRequestNote custRequestNote) {
		getCustRequestNotes().remove(custRequestNote);
		custRequestNote.setCustRequest(null);

		return custRequestNote;
	}

	public List<CustRequestParty> getCustRequestParties() {
		return this.custRequestParties;
	}

	public void setCustRequestParties(List<CustRequestParty> custRequestParties) {
		this.custRequestParties = custRequestParties;
	}

	public CustRequestParty addCustRequestParty(CustRequestParty custRequestParty) {
		getCustRequestParties().add(custRequestParty);
		custRequestParty.setCustRequest(this);

		return custRequestParty;
	}

	public CustRequestParty removeCustRequestParty(CustRequestParty custRequestParty) {
		getCustRequestParties().remove(custRequestParty);
		custRequestParty.setCustRequest(null);

		return custRequestParty;
	}

	public List<CustRequestStatus> getCustRequestStatuses() {
		return this.custRequestStatuses;
	}

	public void setCustRequestStatuses(List<CustRequestStatus> custRequestStatuses) {
		this.custRequestStatuses = custRequestStatuses;
	}

	public CustRequestStatus addCustRequestStatus(CustRequestStatus custRequestStatus) {
		getCustRequestStatuses().add(custRequestStatus);
		custRequestStatus.setCustRequest(this);

		return custRequestStatus;
	}

	public CustRequestStatus removeCustRequestStatus(CustRequestStatus custRequestStatus) {
		getCustRequestStatuses().remove(custRequestStatus);
		custRequestStatus.setCustRequest(null);

		return custRequestStatus;
	}

	public List<CustRequestWorkEffort> getCustRequestWorkEfforts() {
		return this.custRequestWorkEfforts;
	}

	public void setCustRequestWorkEfforts(List<CustRequestWorkEffort> custRequestWorkEfforts) {
		this.custRequestWorkEfforts = custRequestWorkEfforts;
	}

	public CustRequestWorkEffort addCustRequestWorkEffort(CustRequestWorkEffort custRequestWorkEffort) {
		getCustRequestWorkEfforts().add(custRequestWorkEffort);
		custRequestWorkEffort.setCustRequest(this);

		return custRequestWorkEffort;
	}

	public CustRequestWorkEffort removeCustRequestWorkEffort(CustRequestWorkEffort custRequestWorkEffort) {
		getCustRequestWorkEfforts().remove(custRequestWorkEffort);
		custRequestWorkEffort.setCustRequest(null);

		return custRequestWorkEffort;
	}

	public List<QuoteItem> getQuoteItems() {
		return this.quoteItems;
	}

	public void setQuoteItems(List<QuoteItem> quoteItems) {
		this.quoteItems = quoteItems;
	}

	public QuoteItem addQuoteItem(QuoteItem quoteItem) {
		getQuoteItems().add(quoteItem);
		quoteItem.setCustRequest(this);

		return quoteItem;
	}

	public QuoteItem removeQuoteItem(QuoteItem quoteItem) {
		getQuoteItems().remove(quoteItem);
		quoteItem.setCustRequest(null);

		return quoteItem;
	}

	public List<RespondingParty> getRespondingParties() {
		return this.respondingParties;
	}

	public void setRespondingParties(List<RespondingParty> respondingParties) {
		this.respondingParties = respondingParties;
	}

	public RespondingParty addRespondingParty(RespondingParty respondingParty) {
		getRespondingParties().add(respondingParty);
		respondingParty.setCustRequest(this);

		return respondingParty;
	}

	public RespondingParty removeRespondingParty(RespondingParty respondingParty) {
		getRespondingParties().remove(respondingParty);
		respondingParty.setCustRequest(null);

		return respondingParty;
	}

}