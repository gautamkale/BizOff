package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_TYPE database table.
 * 
 */
@Entity
@Table(name="ORDER_TYPE")
@NamedQuery(name="OrderType.findAll", query="SELECT o FROM OrderType o")
public class OrderType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_TYPE_ID")
	private String orderTypeId;

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

	//bi-directional many-to-one association to OrderHeader
	@OneToMany(mappedBy="orderType")
	private List<OrderHeader> orderHeaders;

	//bi-directional many-to-one association to OrderType
	@ManyToOne
	@JoinColumn(name="PARENT_TYPE_ID")
	private OrderType orderType;

	//bi-directional many-to-one association to OrderType
	@OneToMany(mappedBy="orderType")
	private List<OrderType> orderTypes;

	//bi-directional many-to-one association to OrderTypeAttr
	@OneToMany(mappedBy="orderType")
	private List<OrderTypeAttr> orderTypeAttrs;

	//bi-directional many-to-one association to PartyPrefDocTypeTpl
/*	@OneToMany(mappedBy="orderType")
	private List<PartyPrefDocTypeTpl> partyPrefDocTypeTpls;*/

	public OrderType() {
	}

	public String getOrderTypeId() {
		return this.orderTypeId;
	}

	public void setOrderTypeId(String orderTypeId) {
		this.orderTypeId = orderTypeId;
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

	public List<OrderHeader> getOrderHeaders() {
		return this.orderHeaders;
	}

	public void setOrderHeaders(List<OrderHeader> orderHeaders) {
		this.orderHeaders = orderHeaders;
	}

	public OrderHeader addOrderHeader(OrderHeader orderHeader) {
		getOrderHeaders().add(orderHeader);
		orderHeader.setOrderType(this);

		return orderHeader;
	}

	public OrderHeader removeOrderHeader(OrderHeader orderHeader) {
		getOrderHeaders().remove(orderHeader);
		orderHeader.setOrderType(null);

		return orderHeader;
	}

	public OrderType getOrderType() {
		return this.orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public List<OrderType> getOrderTypes() {
		return this.orderTypes;
	}

	public void setOrderTypes(List<OrderType> orderTypes) {
		this.orderTypes = orderTypes;
	}

	public OrderType addOrderType(OrderType orderType) {
		getOrderTypes().add(orderType);
		orderType.setOrderType(this);

		return orderType;
	}

	public OrderType removeOrderType(OrderType orderType) {
		getOrderTypes().remove(orderType);
		orderType.setOrderType(null);

		return orderType;
	}

	public List<OrderTypeAttr> getOrderTypeAttrs() {
		return this.orderTypeAttrs;
	}

	public void setOrderTypeAttrs(List<OrderTypeAttr> orderTypeAttrs) {
		this.orderTypeAttrs = orderTypeAttrs;
	}

	public OrderTypeAttr addOrderTypeAttr(OrderTypeAttr orderTypeAttr) {
		getOrderTypeAttrs().add(orderTypeAttr);
		orderTypeAttr.setOrderType(this);

		return orderTypeAttr;
	}

	public OrderTypeAttr removeOrderTypeAttr(OrderTypeAttr orderTypeAttr) {
		getOrderTypeAttrs().remove(orderTypeAttr);
		orderTypeAttr.setOrderType(null);

		return orderTypeAttr;
	}

	/*public List<PartyPrefDocTypeTpl> getPartyPrefDocTypeTpls() {
		return this.partyPrefDocTypeTpls;
	}

	public void setPartyPrefDocTypeTpls(List<PartyPrefDocTypeTpl> partyPrefDocTypeTpls) {
		this.partyPrefDocTypeTpls = partyPrefDocTypeTpls;
	}

	public PartyPrefDocTypeTpl addPartyPrefDocTypeTpl(PartyPrefDocTypeTpl partyPrefDocTypeTpl) {
		getPartyPrefDocTypeTpls().add(partyPrefDocTypeTpl);
		partyPrefDocTypeTpl.setOrderType(this);

		return partyPrefDocTypeTpl;
	}

	public PartyPrefDocTypeTpl removePartyPrefDocTypeTpl(PartyPrefDocTypeTpl partyPrefDocTypeTpl) {
		getPartyPrefDocTypeTpls().remove(partyPrefDocTypeTpl);
		partyPrefDocTypeTpl.setOrderType(null);

		return partyPrefDocTypeTpl;
	}*/

}