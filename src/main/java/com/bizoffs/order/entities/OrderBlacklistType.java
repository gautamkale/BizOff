package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_BLACKLIST_TYPE database table.
 * 
 */
@Entity
@Table(name="ORDER_BLACKLIST_TYPE")
@NamedQuery(name="OrderBlacklistType.findAll", query="SELECT o FROM OrderBlacklistType o")
public class OrderBlacklistType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_BLACKLIST_TYPE_ID")
	private String orderBlacklistTypeId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to OrderBlacklist
	@OneToMany(mappedBy="orderBlacklistType")
	private List<OrderBlacklist> orderBlacklists;

	public OrderBlacklistType() {
	}

	public String getOrderBlacklistTypeId() {
		return this.orderBlacklistTypeId;
	}

	public void setOrderBlacklistTypeId(String orderBlacklistTypeId) {
		this.orderBlacklistTypeId = orderBlacklistTypeId;
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

	public List<OrderBlacklist> getOrderBlacklists() {
		return this.orderBlacklists;
	}

	public void setOrderBlacklists(List<OrderBlacklist> orderBlacklists) {
		this.orderBlacklists = orderBlacklists;
	}

	public OrderBlacklist addOrderBlacklist(OrderBlacklist orderBlacklist) {
		getOrderBlacklists().add(orderBlacklist);
		orderBlacklist.setOrderBlacklistType(this);

		return orderBlacklist;
	}

	public OrderBlacklist removeOrderBlacklist(OrderBlacklist orderBlacklist) {
		getOrderBlacklists().remove(orderBlacklist);
		orderBlacklist.setOrderBlacklistType(null);

		return orderBlacklist;
	}

}