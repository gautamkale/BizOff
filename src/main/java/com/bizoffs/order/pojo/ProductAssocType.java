package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

;

@Data
public class ProductAssocType implements Serializable {
    private static final long serialVersionUID = 1L;
    private String productAssocTypeId;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String description;
    private String hasTable;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private List<ProductAssoc> productAssocs;
    private ProductAssocType productAssocType;
    private List<ProductAssocType> productAssocTypes;
}