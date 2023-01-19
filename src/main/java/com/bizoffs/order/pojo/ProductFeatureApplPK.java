package com.bizoffs.order.pojo;

import lombok.Data;

@Data
public class ProductFeatureApplPK {

    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;
    private String productId;
    private String productFeatureId;
    private java.util.Date fromDate;
}
