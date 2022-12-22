package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the CUST_REQUEST_ITEM_NOTE database table.
 * 
 */
@Entity
@Table(name="CUST_REQUEST_ITEM_NOTE")
@NamedQuery(name="CustRequestItemNote.findAll", query="SELECT c FROM CustRequestItemNote c")
public class CustRequestItemNote implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CustRequestItemNotePK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to CustRequestItem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CUST_REQUEST_ID", referencedColumnName="CUST_REQUEST_ID"),
		@JoinColumn(name="CUST_REQUEST_ITEM_SEQ_ID", referencedColumnName="CUST_REQUEST_ITEM_SEQ_ID")
		})
	private CustRequestItem custRequestItem;

	//bi-directional many-to-one association to NoteData
/*	@ManyToOne
	@JoinColumn(name="NOTE_ID")
	private NoteData noteData;*/

	public CustRequestItemNote() {
	}

	public CustRequestItemNotePK getId() {
		return this.id;
	}

	public void setId(CustRequestItemNotePK id) {
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

	public CustRequestItem getCustRequestItem() {
		return this.custRequestItem;
	}

	public void setCustRequestItem(CustRequestItem custRequestItem) {
		this.custRequestItem = custRequestItem;
	}

/*	public NoteData getNoteData() {
		return this.noteData;
	}

	public void setNoteData(NoteData noteData) {
		this.noteData = noteData;
	}*/

}