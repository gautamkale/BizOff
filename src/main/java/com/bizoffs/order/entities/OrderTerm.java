package com.bizoffs.order.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ORDER_TERM database table.
 * 
 */
@Entity
@Table(name="ORDER_TERM")
@NamedQuery(name="OrderTerm.findAll", query="SELECT o FROM OrderTerm o")
public class OrderTerm implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderTermPK id;

	@Column(name="CREATED_STAMP")
	private Timestamp createdStamp;

	@Column(name="CREATED_TX_STAMP")
	private Timestamp createdTxStamp;

	private String description;

	@Column(name="LAST_UPDATED_STAMP")
	private Timestamp lastUpdatedStamp;

	@Column(name="LAST_UPDATED_TX_STAMP")
	private Timestamp lastUpdatedTxStamp;

	@Column(name="TERM_DAYS")
	private BigDecimal termDays;

	@Column(name="TERM_VALUE")
	private BigDecimal termValue;

	@Column(name="TEXT_VALUE")
	private String textValue;

	//bi-directional many-to-one association to OrderHeader
	@ManyToOne
	@JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
	private OrderHeader orderHeader;

	//bi-directional many-to-one association to TermType
	/*@ManyToOne
	@JoinColumn(name="TERM_TYPE_ID")
	private TermType termType;

	//bi-directional many-to-one association to Uom
	@ManyToOne
	@JoinColumn(name="UOM_ID")
	private Uom uom;*/

	//bi-directional many-to-one association to OrderTermAttribute
	@OneToMany(mappedBy="orderTerm")
	private List<OrderTermAttribute> orderTermAttributes;

	public OrderTerm() {
	}

	public OrderTermPK getId() {
		return this.id;
	}

	public void setId(OrderTermPK id) {
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

	public BigDecimal getTermDays() {
		return this.termDays;
	}

	public void setTermDays(BigDecimal termDays) {
		this.termDays = termDays;
	}

	public BigDecimal getTermValue() {
		return this.termValue;
	}

	public void setTermValue(BigDecimal termValue) {
		this.termValue = termValue;
	}

	public String getTextValue() {
		return this.textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}

	public OrderHeader getOrderHeader() {
		return this.orderHeader;
	}

	public void setOrderHeader(OrderHeader orderHeader) {
		this.orderHeader = orderHeader;
	}

/*	public TermType getTermType() {
		return this.termType;
	}

	public void setTermType(TermType termType) {
		this.termType = termType;
	}

	public Uom getUom() {
		return this.uom;
	}

	public void setUom(Uom uom) {
		this.uom = uom;
	}*/

	public List<OrderTermAttribute> getOrderTermAttributes() {
		return this.orderTermAttributes;
	}

	public void setOrderTermAttributes(List<OrderTermAttribute> orderTermAttributes) {
		this.orderTermAttributes = orderTermAttributes;
	}

	public OrderTermAttribute addOrderTermAttribute(OrderTermAttribute orderTermAttribute) {
		getOrderTermAttributes().add(orderTermAttribute);
		orderTermAttribute.setOrderTerm(this);

		return orderTermAttribute;
	}

	public OrderTermAttribute removeOrderTermAttribute(OrderTermAttribute orderTermAttribute) {
		getOrderTermAttributes().remove(orderTermAttribute);
		orderTermAttribute.setOrderTerm(null);

		return orderTermAttribute;
	}

}