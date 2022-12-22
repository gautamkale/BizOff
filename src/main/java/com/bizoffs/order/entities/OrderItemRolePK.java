package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the ORDER_ITEM_ROLE database table.
 * 
 */
@Embeddable
public class OrderItemRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_ID", insertable=false, updatable=false)
	private String orderId;

	@Column(name="ORDER_ITEM_SEQ_ID", insertable=false, updatable=false)
	private String orderItemSeqId;

	@Column(name="PARTY_ID", insertable=false, updatable=false)
	private String partyId;

	@Column(name="ROLE_TYPE_ID", insertable=false, updatable=false)
	private String roleTypeId;

	public OrderItemRolePK() {
	}
	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderItemSeqId() {
		return this.orderItemSeqId;
	}
	public void setOrderItemSeqId(String orderItemSeqId) {
		this.orderItemSeqId = orderItemSeqId;
	}
	public String getPartyId() {
		return this.partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getRoleTypeId() {
		return this.roleTypeId;
	}
	public void setRoleTypeId(String roleTypeId) {
		this.roleTypeId = roleTypeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderItemRolePK)) {
			return false;
		}
		OrderItemRolePK castOther = (OrderItemRolePK)other;
		return 
			this.orderId.equals(castOther.orderId)
			&& this.orderItemSeqId.equals(castOther.orderItemSeqId)
			&& this.partyId.equals(castOther.partyId)
			&& this.roleTypeId.equals(castOther.roleTypeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderId.hashCode();
		hash = hash * prime + this.orderItemSeqId.hashCode();
		hash = hash * prime + this.partyId.hashCode();
		hash = hash * prime + this.roleTypeId.hashCode();
		
		return hash;
	}
}