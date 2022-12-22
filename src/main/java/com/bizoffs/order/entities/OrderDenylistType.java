package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_DENYLIST_TYPE database table.
 * 
 */
@Entity
@Table(name="ORDER_DENYLIST_TYPE")
@NamedQuery(name="OrderDenylistType.findAll", query="SELECT o FROM OrderDenylistType o")
public class OrderDenylistType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_DENYLIST_TYPE_ID")
	private String orderDenylistTypeId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to OrderDenylist
	@OneToMany(mappedBy="orderDenylistType")
	private List<OrderDenylist> orderDenylists;

	public OrderDenylistType() {
	}

	public String getOrderDenylistTypeId() {
		return this.orderDenylistTypeId;
	}

	public void setOrderDenylistTypeId(String orderDenylistTypeId) {
		this.orderDenylistTypeId = orderDenylistTypeId;
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

	public List<OrderDenylist> getOrderDenylists() {
		return this.orderDenylists;
	}

	public void setOrderDenylists(List<OrderDenylist> orderDenylists) {
		this.orderDenylists = orderDenylists;
	}

	public OrderDenylist addOrderDenylist(OrderDenylist orderDenylist) {
		getOrderDenylists().add(orderDenylist);
		orderDenylist.setOrderDenylistType(this);

		return orderDenylist;
	}

	public OrderDenylist removeOrderDenylist(OrderDenylist orderDenylist) {
		getOrderDenylists().remove(orderDenylist);
		orderDenylist.setOrderDenylistType(null);

		return orderDenylist;
	}

}