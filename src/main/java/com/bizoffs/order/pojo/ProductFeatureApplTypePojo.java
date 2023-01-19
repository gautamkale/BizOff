package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

;

@Data
public class ProductFeatureApplTypePojo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String productFeatureApplTypeId;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String description;
    private String hasTable;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
  /*  private List<ProductFeatureAppl> productFeatureAppls;
    private ProductFeatureApplType productFeatureApplType;
    private List<ProductFeatureApplType> productFeatureApplTypes;*/
}