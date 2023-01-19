package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class ProductAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private ProductAssocPK id;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String instruction;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private BigDecimal quantity;
    private String reason;
    private BigDecimal scrapFactor;
    private BigDecimal sequenceNum;
    private Timestamp thruDate;
  // private CustomMethod customMethod;
    private Product product;

  /*   private ProductAssocType productAssocType;
    private RecurrenceInfo recurrenceInfo;
    private WorkEffort workEffort;*/
}