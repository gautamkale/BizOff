package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the CUST_REQUEST_TYPE database table.
 * 
 */
@Entity
@Table(name="CUST_REQUEST_TYPE")
@NamedQuery(name="CustRequestType.findAll", query="SELECT c FROM CustRequestType c")
public class CustRequestType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUST_REQUEST_TYPE_ID")
	private String custRequestTypeId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="HAS_TABLE")
	private String hasTable;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to CustRequest
	@OneToMany(mappedBy="custRequestType")
	private List<CustRequest> custRequests;

	//bi-directional many-to-one association to CustRequestCategory
	@OneToMany(mappedBy="custRequestType")
	private List<CustRequestCategory> custRequestCategories;

	//bi-directional many-to-one association to CustRequestResolution
	@OneToMany(mappedBy="custRequestType")
	private List<CustRequestResolution> custRequestResolutions;

	//bi-directional many-to-one association to CustRequestType
	@ManyToOne
	@JoinColumn(name="PARENT_TYPE_ID")
	private CustRequestType custRequestType;

	//bi-directional many-to-one association to CustRequestType
	@OneToMany(mappedBy="custRequestType")
	private List<CustRequestType> custRequestTypes;

	//bi-directional many-to-one association to Party
	/*@ManyToOne
	@JoinColumn(name="PARTY_ID")
	private Party party;
*/
	//bi-directional many-to-one association to CustRequestTypeAttr
	@OneToMany(mappedBy="custRequestType")
	private List<CustRequestTypeAttr> custRequestTypeAttrs;

	public CustRequestType() {
	}

	public String getCustRequestTypeId() {
		return this.custRequestTypeId;
	}

	public void setCustRequestTypeId(String custRequestTypeId) {
		this.custRequestTypeId = custRequestTypeId;
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

	public String getHasTable() {
		return this.hasTable;
	}

	public void setHasTable(String hasTable) {
		this.hasTable = hasTable;
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

	public List<CustRequest> getCustRequests() {
		return this.custRequests;
	}

	public void setCustRequests(List<CustRequest> custRequests) {
		this.custRequests = custRequests;
	}

	public CustRequest addCustRequest(CustRequest custRequest) {
		getCustRequests().add(custRequest);
		custRequest.setCustRequestType(this);

		return custRequest;
	}

	public CustRequest removeCustRequest(CustRequest custRequest) {
		getCustRequests().remove(custRequest);
		custRequest.setCustRequestType(null);

		return custRequest;
	}

	public List<CustRequestCategory> getCustRequestCategories() {
		return this.custRequestCategories;
	}

	public void setCustRequestCategories(List<CustRequestCategory> custRequestCategories) {
		this.custRequestCategories = custRequestCategories;
	}

	public CustRequestCategory addCustRequestCategory(CustRequestCategory custRequestCategory) {
		getCustRequestCategories().add(custRequestCategory);
		custRequestCategory.setCustRequestType(this);

		return custRequestCategory;
	}

	public CustRequestCategory removeCustRequestCategory(CustRequestCategory custRequestCategory) {
		getCustRequestCategories().remove(custRequestCategory);
		custRequestCategory.setCustRequestType(null);

		return custRequestCategory;
	}

	public List<CustRequestResolution> getCustRequestResolutions() {
		return this.custRequestResolutions;
	}

	public void setCustRequestResolutions(List<CustRequestResolution> custRequestResolutions) {
		this.custRequestResolutions = custRequestResolutions;
	}

	public CustRequestResolution addCustRequestResolution(CustRequestResolution custRequestResolution) {
		getCustRequestResolutions().add(custRequestResolution);
		custRequestResolution.setCustRequestType(this);

		return custRequestResolution;
	}

	public CustRequestResolution removeCustRequestResolution(CustRequestResolution custRequestResolution) {
		getCustRequestResolutions().remove(custRequestResolution);
		custRequestResolution.setCustRequestType(null);

		return custRequestResolution;
	}

	public CustRequestType getCustRequestType() {
		return this.custRequestType;
	}

	public void setCustRequestType(CustRequestType custRequestType) {
		this.custRequestType = custRequestType;
	}

	public List<CustRequestType> getCustRequestTypes() {
		return this.custRequestTypes;
	}

	public void setCustRequestTypes(List<CustRequestType> custRequestTypes) {
		this.custRequestTypes = custRequestTypes;
	}

	public CustRequestType addCustRequestType(CustRequestType custRequestType) {
		getCustRequestTypes().add(custRequestType);
		custRequestType.setCustRequestType(this);

		return custRequestType;
	}

	public CustRequestType removeCustRequestType(CustRequestType custRequestType) {
		getCustRequestTypes().remove(custRequestType);
		custRequestType.setCustRequestType(null);

		return custRequestType;
	}

/*	public Party getParty() {
		return this.party;
	}

	public void setParty(Party party) {
		this.party = party;
	}*/

	public List<CustRequestTypeAttr> getCustRequestTypeAttrs() {
		return this.custRequestTypeAttrs;
	}

	public void setCustRequestTypeAttrs(List<CustRequestTypeAttr> custRequestTypeAttrs) {
		this.custRequestTypeAttrs = custRequestTypeAttrs;
	}

	public CustRequestTypeAttr addCustRequestTypeAttr(CustRequestTypeAttr custRequestTypeAttr) {
		getCustRequestTypeAttrs().add(custRequestTypeAttr);
		custRequestTypeAttr.setCustRequestType(this);

		return custRequestTypeAttr;
	}

	public CustRequestTypeAttr removeCustRequestTypeAttr(CustRequestTypeAttr custRequestTypeAttr) {
		getCustRequestTypeAttrs().remove(custRequestTypeAttr);
		custRequestTypeAttr.setCustRequestType(null);

		return custRequestTypeAttr;
	}

}