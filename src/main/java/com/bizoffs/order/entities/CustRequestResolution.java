package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the CUST_REQUEST_RESOLUTION database table.
 * 
 */
@Entity
@Table(name="CUST_REQUEST_RESOLUTION")
@NamedQuery(name="CustRequestResolution.findAll", query="SELECT c FROM CustRequestResolution c")
public class CustRequestResolution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUST_REQUEST_RESOLUTION_ID")
	private String custRequestResolutionId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to CustRequestItem
	@OneToMany(mappedBy="custRequestResolution")
	private List<CustRequestItem> custRequestItems;

	//bi-directional many-to-one association to CustRequestType
	@ManyToOne
	@JoinColumn(name="CUST_REQUEST_TYPE_ID")
	private CustRequestType custRequestType;

	public CustRequestResolution() {
	}

	public String getCustRequestResolutionId() {
		return this.custRequestResolutionId;
	}

	public void setCustRequestResolutionId(String custRequestResolutionId) {
		this.custRequestResolutionId = custRequestResolutionId;
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

	public List<CustRequestItem> getCustRequestItems() {
		return this.custRequestItems;
	}

	public void setCustRequestItems(List<CustRequestItem> custRequestItems) {
		this.custRequestItems = custRequestItems;
	}

	public CustRequestItem addCustRequestItem(CustRequestItem custRequestItem) {
		getCustRequestItems().add(custRequestItem);
		custRequestItem.setCustRequestResolution(this);

		return custRequestItem;
	}

	public CustRequestItem removeCustRequestItem(CustRequestItem custRequestItem) {
		getCustRequestItems().remove(custRequestItem);
		custRequestItem.setCustRequestResolution(null);

		return custRequestItem;
	}

	public CustRequestType getCustRequestType() {
		return this.custRequestType;
	}

	public void setCustRequestType(CustRequestType custRequestType) {
		this.custRequestType = custRequestType;
	}

}