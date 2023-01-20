package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class ProductFeatureApplPojo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String productId;
    private String productFeatureId;
    private java.util.Date fromDate;
    private BigDecimal amount;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private BigDecimal recurringAmount;
    private Long sequenceNum;
    private Timestamp thruDate;
    private Product product;
  //  private ProductFeature productFeature;
    private ProductFeatureApplTypePojo productFeatureApplType;
   // private List<ProductFeatureApplAttr> productFeatureApplAttrs;
}