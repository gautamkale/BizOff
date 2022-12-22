package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_ITEM_ROLE database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_ROLE")
@NamedQuery(name="OrderItemRole.findAll", query="SELECT o FROM OrderItemRole o")
public class OrderItemRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemRolePK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader;

	//bi-directional many-to-one association to OrderItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID", insertable=false, updatable=false),
		@JoinColumn(name="ORDER_ITEM_SEQ_ID", referencedColumnName="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
		})
	private OrderItem orderItem;

	//bi-directional many-to-one association to Party
	/*@ManyToOne
	@JoinColumn(name="PARTY_ID")
	private Party party;

	//bi-directional many-to-one association to PartyRole
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="PARTY_ID", referencedColumnName="PARTY_ID"),
		@JoinColumn(name="ROLE_TYPE_ID", referencedColumnName="ROLE_TYPE_ID")
		})
	private PartyRole partyRole;*/

	public OrderItemRole() {
	}

	public OrderItemRolePK getId() {
		return this.id;
	}

	public void setId(OrderItemRolePK id) {
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

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

	public OrderItem getOrderItem() {
		return this.orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	/*public Party getParty() {
		return this.party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public PartyRole getPartyRole() {
		return this.partyRole;
	}

	public void setPartyRole(PartyRole partyRole) {
		this.partyRole = partyRole;
	}*/

}