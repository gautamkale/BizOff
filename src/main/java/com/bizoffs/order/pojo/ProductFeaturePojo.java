package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class ProductFeaturePojo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String productFeatureId;
    private String abbrev;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private BigDecimal defaultAmount;
    private BigDecimal defaultSequenceNum;
    private String description;
    private String idCode;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private BigDecimal numberSpecified;
  /*  private List<CostComponent> costComponents;
    private List<DesiredFeature> desiredFeatures;
    private List<InvoiceItem> invoiceItems;
    private ProductFeatureCategory productFeatureCategory;
    private ProductFeatureType productFeatureType;
    private Uom uom;
    private List<ProductFeatureAppl> productFeatureAppls;
    private List<ProductFeatureApplAttr> productFeatureApplAttrs;
    private List<ProductFeatureDataResource> productFeatureDataResources;
    private List<ProductFeatureGroupAppl> productFeatureGroupAppls;
    private List<ProductFeatureIactn> productFeatureIactns1;
    private List<ProductFeatureIactn> productFeatureIactns2;
    private List<ProductManufacturingRule> productManufacturingRules;
    private List<QuoteItem> quoteItems;
    private List<ShipmentItemFeature> shipmentItemFeatures;
    private List<SupplierProductFeature> supplierProductFeatures;*/
}