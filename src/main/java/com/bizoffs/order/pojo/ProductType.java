package com.bizoffs.order.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ProductType {
    private static final long serialVersionUID = 1L;
    private String productTypeId;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String description;
    private String hasTable;
    private String isDigital;
    private String isPhysical;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
}
