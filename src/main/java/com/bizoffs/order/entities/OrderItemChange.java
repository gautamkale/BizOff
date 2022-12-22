package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ORDER_ITEM_CHANGE database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM_CHANGE")
@NamedQuery(name="OrderItemChange.findAll", query="SELECT o FROM OrderItemChange o")
public class OrderItemChange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ITEM_CHANGE_ID")
	private String orderItemChangeId;

	@Column(name="CANCEL_QUANTITY")
	private BigDecimal cancelQuantity;

	@Column(name="CHANGE_COMMENTS")
	private String changeComments;

	@Column(name="CHANGE_DATETIME")
	private Timestamp changeDatetime;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="ITEM_DESCRIPTION")
	private String itemDescription;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	private BigDecimal quantity;

	@Column(name="UNIT_PRICE")
	private BigDecimal unitPrice;

	//bi-directional many-to-one association to Enumeration
/*	@ManyToOne
	@JoinColumn(name="REASON_ENUM_ID")
	private Enumeration enumeration1;

	//bi-directional many-to-one association to Enumeration
	@ManyToOne
	@JoinColumn(name="CHANGE_TYPE_ENUM_ID")
	private Enumeration enumeration2;*/

	//bi-directional many-to-one association to OrderItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ORDER_ID", referencedColumnName="ORDER_ID"),
		@JoinColumn(name="ORDER_ITEM_SEQ_ID", referencedColumnName="ORDER_ITEM_SEQ_ID")
		})
	private OrderItem orderItem;

	//bi-directional many-to-one association to UserLogin
/*	@ManyToOne
	@JoinColumn(name="CHANGE_USER_LOGIN")
	private UserLogin userLogin;*/

	public OrderItemChange() {
	}

	public String getOrderItemChangeId() {
		return this.orderItemChangeId;
	}

	public void setOrderItemChangeId(String orderItemChangeId) {
		this.orderItemChangeId = orderItemChangeId;
	}

	public BigDecimal getCancelQuantity() {
		return this.cancelQuantity;
	}

	public void setCancelQuantity(BigDecimal cancelQuantity) {
		this.cancelQuantity = cancelQuantity;
	}

	public String getChangeComments() {
		return this.changeComments;
	}

	public void setChangeComments(String changeComments) {
		this.changeComments = changeComments;
	}

	public Timestamp getChangeDatetime() {
		return this.changeDatetime;
	}

	public void setChangeDatetime(Timestamp changeDatetime) {
		this.changeDatetime = changeDatetime;
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

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
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

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	/*public Enumeration getEnumeration1() {
		return this.enumeration1;
	}

	public void setEnumeration1(Enumeration enumeration1) {
		this.enumeration1 = enumeration1;
	}

	public Enumeration getEnumeration2() {
		return this.enumeration2;
	}

	public void setEnumeration2(Enumeration enumeration2) {
		this.enumeration2 = enumeration2;
	}
*/
	public OrderItem getOrderItem() {
		return this.orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}
/*

	public UserLogin getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}
*/

}