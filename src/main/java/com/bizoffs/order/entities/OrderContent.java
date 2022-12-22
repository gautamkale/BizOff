package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_CONTENT database table.
 * 
 */
@Entity
@Table(name="ORDER_CONTENT")
@NamedQuery(name="OrderContent.findAll", query="SELECT o FROM OrderContent o")
public class OrderContent implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderContentPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="THRU_DATE")
	private Timestamp thruDate;

	//bi-directional many-to-one association to Content
/*	@ManyToOne
	@JoinColumn(name="CONTENT_ID")
	private Content content;*/

	//bi-directional many-to-one association to OrderContentType
	@ManyToOne
	@JoinColumn(name="ORDER_CONTENT_TYPE_ID", insertable=false, updatable=false)
	private OrderContentType orderContentType;

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader;

	public OrderContent() {
	}

	public OrderContentPK getId() {
		return this.id;
	}

	public void setId(OrderContentPK id) {
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

	public Timestamp getThruDate() {
		return this.thruDate;
	}

	public void setThruDate(Timestamp thruDate) {
		this.thruDate = thruDate;
	}

/*	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}*/

	public OrderContentType getOrderContentType() {
		return this.orderContentType;
	}

	public void setOrderContentType(OrderContentType orderContentType) {
		this.orderContentType = orderContentType;
	}

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

}