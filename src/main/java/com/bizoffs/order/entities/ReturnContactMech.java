package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the RETURN_CONTACT_MECH database table.
 * 
 */
@Entity
@Table(name="RETURN_CONTACT_MECH")
@NamedQuery(name="ReturnContactMech.findAll", query="SELECT r FROM ReturnContactMech r")
public class ReturnContactMech implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReturnContactMechPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to ContactMech
/*	@ManyToOne
	@JoinColumn(name="CONTACT_MECH_ID")
	private ContactMech contactMech;

	//bi-directional many-to-one association to ContactMechPurposeType
	@ManyToOne
	@JoinColumn(name="CONTACT_MECH_PURPOSE_TYPE_ID")
	private ContactMechPurposeType contactMechPurposeType;*/

	//bi-directional many-to-one association to ReturnHeader
	@ManyToOne
	@JoinColumn(name="RETURN_ID")
	private ReturnHeader returnHeader;

	public ReturnContactMech() {
	}

	public ReturnContactMechPK getId() {
		return this.id;
	}

	public void setId(ReturnContactMechPK id) {
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

	/*public ContactMech getContactMech() {
		return this.contactMech;
	}

	public void setContactMech(ContactMech contactMech) {
		this.contactMech = contactMech;
	}

	public ContactMechPurposeType getContactMechPurposeType() {
		return this.contactMechPurposeType;
	}

	public void setContactMechPurposeType(ContactMechPurposeType contactMechPurposeType) {
		this.contactMechPurposeType = contactMechPurposeType;
	}
*/
	public ReturnHeader getReturnHeader() {
		return this.returnHeader;
	}

	public void setReturnHeader(ReturnHeader returnHeader) {
		this.returnHeader = returnHeader;
	}

}