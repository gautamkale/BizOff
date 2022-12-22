package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the RETURN_STATUS database table.
 * 
 */
@Entity
@Table(name="RETURN_STATUS")
@NamedQuery(name="ReturnStatus.findAll", query="SELECT r FROM ReturnStatus r")
public class ReturnStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RETURN_STATUS_ID")
	private String returnStatusId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="RETURN_ITEM_SEQ_ID")
	private String returnItemSeqId;

	@Column(name="STATUS_DATETIME")
	private Timestamp statusDatetime;

	//bi-directional many-to-one association to ReturnHeader
	@ManyToOne
	@JoinColumn(name="RETURN_ID")
	private ReturnHeader returnHeader;

	//bi-directional many-to-one association to StatusItem
	/*@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private StatusItem statusItem;

	//bi-directional many-to-one association to UserLogin
	@ManyToOne
	@JoinColumn(name="CHANGE_BY_USER_LOGIN_ID")
	private UserLogin userLogin;*/

	public ReturnStatus() {
	}

	public String getReturnStatusId() {
		return this.returnStatusId;
	}

	public void setReturnStatusId(String returnStatusId) {
		this.returnStatusId = returnStatusId;
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

	public String getReturnItemSeqId() {
		return this.returnItemSeqId;
	}

	public void setReturnItemSeqId(String returnItemSeqId) {
		this.returnItemSeqId = returnItemSeqId;
	}

	public Timestamp getStatusDatetime() {
		return this.statusDatetime;
	}

	public void setStatusDatetime(Timestamp statusDatetime) {
		this.statusDatetime = statusDatetime;
	}

	public ReturnHeader getReturnHeader() {
		return this.returnHeader;
	}

	public void setReturnHeader(ReturnHeader returnHeader) {
		this.returnHeader = returnHeader;
	}

	/*public StatusItem getStatusItem() {
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