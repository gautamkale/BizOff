package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the RETURN_REASON database table.
 * 
 */
@Entity
@Table(name="RETURN_REASON")
@NamedQuery(name="ReturnReason.findAll", query="SELECT r FROM ReturnReason r")
public class ReturnReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RETURN_REASON_ID")
	private String returnReasonId;

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

	//bi-directional many-to-one association to ReturnItem
	@OneToMany(mappedBy="returnReason")
	private List<ReturnItem> returnItems;

	public ReturnReason() {
	}

	public String getReturnReasonId() {
		return this.returnReasonId;
	}

	public void setReturnReasonId(String returnReasonId) {
		this.returnReasonId = returnReasonId;
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

	public List<ReturnItem> getReturnItems() {
		return this.returnItems;
	}

	public void setReturnItems(List<ReturnItem> returnItems) {
		this.returnItems = returnItems;
	}

	public ReturnItem addReturnItem(ReturnItem returnItem) {
		getReturnItems().add(returnItem);
		returnItem.setReturnReason(this);

		return returnItem;
	}

	public ReturnItem removeReturnItem(ReturnItem returnItem) {
		getReturnItems().remove(returnItem);
		returnItem.setReturnReason(null);

		return returnItem;
	}

}