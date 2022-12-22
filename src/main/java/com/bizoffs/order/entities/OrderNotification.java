package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_NOTIFICATION database table.
 * 
 */
@Entity
@Table(name="ORDER_NOTIFICATION")
@NamedQuery(name="OrderNotification.findAll", query="SELECT o FROM OrderNotification o")
public class OrderNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_NOTIFICATION_ID")
	private String orderNotificationId;

	private String comments;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="NOTIFICATION_DATE")
	private Timestamp notificationDate;

	//bi-directional many-to-one association to Enumeration
	/*@ManyToOne
	@JoinColumn(name="EMAIL_TYPE")
	private Enumeration enumeration;*/

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private OrderHeader orderHeader;

	public OrderNotification() {
	}

	public String getOrderNotificationId() {
		return this.orderNotificationId;
	}

	public void setOrderNotificationId(String orderNotificationId) {
		this.orderNotificationId = orderNotificationId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	public Timestamp getNotificationDate() {
		return this.notificationDate;
	}

	public void setNotificationDate(Timestamp notificationDate) {
		this.notificationDate = notificationDate;
	}

	/*public Enumeration getEnumeration() {
		return this.enumeration;
	}

	public void setEnumeration(Enumeration enumeration) {
		this.enumeration = enumeration;
	}*/

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

}