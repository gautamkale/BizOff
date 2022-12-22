package com.bizoffs.order.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the RETURN_HEADER_TYPE database table.
 * 
 */
@Entity
@Table(name="RETURN_HEADER_TYPE")
@NamedQuery(name="ReturnHeaderType.findAll", query="SELECT r FROM ReturnHeaderType r")
public class ReturnHeaderType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RETURN_HEADER_TYPE_ID")
	private String returnHeaderTypeId;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	//bi-directional many-to-one association to ReturnHeader
	@OneToMany(mappedBy="returnHeaderType")
	private List<ReturnHeader> returnHeaders;

	//bi-directional many-to-one association to ReturnHeaderType
	@ManyToOne
	@JoinColumn(name="PARENT_TYPE_ID")
	private ReturnHeaderType returnHeaderType;

	//bi-directional many-to-one association to ReturnHeaderType
	@OneToMany(mappedBy="returnHeaderType")
	private List<ReturnHeaderType> returnHeaderTypes;

	//bi-directional many-to-one association to ReturnItemTypeMap
	@OneToMany(mappedBy="returnHeaderType")
	private List<ReturnItemTypeMap> returnItemTypeMaps;

	public ReturnHeaderType() {
	}

	public String getReturnHeaderTypeId() {
		return this.returnHeaderTypeId;
	}

	public void setReturnHeaderTypeId(String returnHeaderTypeId) {
		this.returnHeaderTypeId = returnHeaderTypeId;
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

	public List<ReturnHeader> getReturnHeaders() {
		return this.returnHeaders;
	}

	public void setReturnHeaders(List<ReturnHeader> returnHeaders) {
		this.returnHeaders = returnHeaders;
	}

	public ReturnHeader addReturnHeader(ReturnHeader returnHeader) {
		getReturnHeaders().add(returnHeader);
		returnHeader.setReturnHeaderType(this);

		return returnHeader;
	}

	public ReturnHeader removeReturnHeader(ReturnHeader returnHeader) {
		getReturnHeaders().remove(returnHeader);
		returnHeader.setReturnHeaderType(null);

		return returnHeader;
	}

	public ReturnHeaderType getReturnHeaderType() {
		return this.returnHeaderType;
	}

	public void setReturnHeaderType(ReturnHeaderType returnHeaderType) {
		this.returnHeaderType = returnHeaderType;
	}

	public List<ReturnHeaderType> getReturnHeaderTypes() {
		return this.returnHeaderTypes;
	}

	public void setReturnHeaderTypes(List<ReturnHeaderType> returnHeaderTypes) {
		this.returnHeaderTypes = returnHeaderTypes;
	}

	public ReturnHeaderType addReturnHeaderType(ReturnHeaderType returnHeaderType) {
		getReturnHeaderTypes().add(returnHeaderType);
		returnHeaderType.setReturnHeaderType(this);

		return returnHeaderType;
	}

	public ReturnHeaderType removeReturnHeaderType(ReturnHeaderType returnHeaderType) {
		getReturnHeaderTypes().remove(returnHeaderType);
		returnHeaderType.setReturnHeaderType(null);

		return returnHeaderType;
	}

	public List<ReturnItemTypeMap> getReturnItemTypeMaps() {
		return this.returnItemTypeMaps;
	}

	public void setReturnItemTypeMaps(List<ReturnItemTypeMap> returnItemTypeMaps) {
		this.returnItemTypeMaps = returnItemTypeMaps;
	}

	public ReturnItemTypeMap addReturnItemTypeMap(ReturnItemTypeMap returnItemTypeMap) {
		getReturnItemTypeMaps().add(returnItemTypeMap);
		returnItemTypeMap.setReturnHeaderType(this);

		return returnItemTypeMap;
	}

	public ReturnItemTypeMap removeReturnItemTypeMap(ReturnItemTypeMap returnItemTypeMap) {
		getReturnItemTypeMaps().remove(returnItemTypeMap);
		returnItemTypeMap.setReturnHeaderType(null);

		return returnItemTypeMap;
	}

}