package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class ProductContent implements Serializable {
    private static final long serialVersionUID = 1L;
    private String productId;

    private String contentId;

    private String productContentTypeId;

    private java.util.Date fromDate;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp purchaseFromDate;
    private Timestamp purchaseThruDate;
    private BigDecimal sequenceNum;
    private Timestamp thruDate;
    private BigDecimal useCountLimit;
    private BigDecimal useTime;
    /*private Content content;
    private Product product;
    private ProductContentType productContentType;
    private RoleType roleType;
    private Uom uom;*/
}