package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_DENYLIST database table.
 * 
 */
@Entity
@Table(name="ORDER_DENYLIST")
@NamedQuery(name="OrderDenylist.findAll", query="SELECT o FROM OrderDenylist o")
public class OrderDenylist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderDenylistPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to OrderDenylistType
	@ManyToOne
	@JoinColumn(name="ORDER_DENYLIST_TYPE_ID")
	private OrderDenylistType orderDenylistType;

	public OrderDenylist() {
	}

	public OrderDenylistPK getId() {
		return this.id;
	}

	public void setId(OrderDenylistPK id) {
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

	public OrderDenylistType getOrderDenylistType() {
		return this.orderDenylistType;
	}

	public void setOrderDenylistType(OrderDenylistType orderDenylistType) {
		this.orderDenylistType = orderDenylistType;
	}

}