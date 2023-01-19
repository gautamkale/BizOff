package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the CUST_REQUEST_STATUS database table.
 * 
 */
@Entity
@Table(name="CUST_REQUEST_STATUS")
@NamedQuery(name="CustRequestStatus.findAll", query="SELECT c FROM CustRequestStatus c")
public class CustRequestStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUST_REQUEST_STATUS_ID")
	private String custRequestStatusId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="CUST_REQUEST_ITEM_SEQ_ID")
	private String custRequestItemSeqId;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	//bi-directional many-to-one association to CustRequest
	@ManyToOne
	@JoinColumn(name="CUST_REQUEST_ID")
	private CustRequest custRequest;

	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	public StatusItem getStatusItem() {
		return statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}

	//bi-directional many-to-one association to StatusItem
/*	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	//bi-directional many-to-one association to UserLogin
	@ManyToOne
	@JoinColumn(name="CHANGE_BY_USER_LOGIN_ID")
	private UserLogin userLogin;*/

	public CustRequestStatus() {
	}

	public String getCustRequestStatusId() {
		return this.custRequestStatusId;
	}

	public void setCustRequestStatusId(String custRequestStatusId) {
		this.custRequestStatusId = custRequestStatusId;
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

	public String getCustRequestItemSeqId() {
		return this.custRequestItemSeqId;
	}

	public void setCustRequestItemSeqId(String custRequestItemSeqId) {
		this.custRequestItemSeqId = custRequestItemSeqId;
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

	public Timestamp getStatusDate() {
		return this.statusDate;
	}

	public void setStatusDate(Timestamp statusDate) {
		this.statusDate = statusDate;
	}

	public CustRequest getCustRequest() {
		return this.custRequest;
	}

	public void setCustRequest(CustRequest custRequest) {
		this.custRequest = custRequest;
	}

/*	public StatusItem getStatusItem() {
		return this.statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}

	public UserLogin getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}*/

}