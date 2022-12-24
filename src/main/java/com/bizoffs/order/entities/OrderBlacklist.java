package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_BLACKLIST database table.
 * 
 */
@Entity
@Table(name="ORDER_BLACKLIST")
@NamedQuery(name="OrderBlacklist.findAll", query="SELECT o FROM OrderBlacklist o")
public class OrderBlacklist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderBlacklistPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to OrderBlacklistType
	@ManyToOne
	@JoinColumn(name="ORDER_BLACKLIST_TYPE_ID1", insertable=false, updatable=false)
	private OrderBlacklistType orderBlacklistType;

	public OrderBlacklist() {
	}

	public OrderBlacklistPK getId() {
		return this.id;
	}

	public void setId(OrderBlacklistPK id) {
		this.id = id;
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

	public OrderBlacklistType getOrderBlacklistType() {
		return this.orderBlacklistType;
	}

	public void setOrderBlacklistType(OrderBlacklistType orderBlacklistType) {
		this.orderBlacklistType = orderBlacklistType;
	}

}