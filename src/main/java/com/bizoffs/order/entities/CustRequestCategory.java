package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the CUST_REQUEST_CATEGORY database table.
 * 
 */
@Entity
@Table(name="CUST_REQUEST_CATEGORY")
@NamedQuery(name="CustRequestCategory.findAll", query="SELECT c FROM CustRequestCategory c")
public class CustRequestCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUST_REQUEST_CATEGORY_ID")
	private String custRequestCategoryId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to CustRequest
	@OneToMany(mappedBy="custRequestCategory")
	private List<CustRequest> custRequests;

	//bi-directional many-to-one association to CustRequestType
	@ManyToOne
	@JoinColumn(name="CUST_REQUEST_TYPE_ID")
	private CustRequestType custRequestType;

	public CustRequestCategory() {
	}

	public String getCustRequestCategoryId() {
		return this.custRequestCategoryId;
	}

	public void setCustRequestCategoryId(String custRequestCategoryId) {
		this.custRequestCategoryId = custRequestCategoryId;
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

	public List<CustRequest> getCustRequests() {
		return this.custRequests;
	}

	public void setCustRequests(List<CustRequest> custRequests) {
		this.custRequests = custRequests;
	}

	public CustRequest addCustRequest(CustRequest custRequest) {
		getCustRequests().add(custRequest);
		custRequest.setCustRequestCategory(this);

		return custRequest;
	}

	public CustRequest removeCustRequest(CustRequest custRequest) {
		getCustRequests().remove(custRequest);
		custRequest.setCustRequestCategory(null);

		return custRequest;
	}

	public CustRequestType getCustRequestType() {
		return this.custRequestType;
	}

	public void setCustRequestType(CustRequestType custRequestType) {
		this.custRequestType = custRequestType;
	}

}