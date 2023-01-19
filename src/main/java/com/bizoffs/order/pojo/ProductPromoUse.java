package com.bizoffs.order.pojo;

import com.bizoffs.order.entities.OrderHeader;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class ProductPromoUse implements Serializable {
    private static final long serialVersionUID = 1L;
    private String orderId;
    private String promoSequenceId;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private BigDecimal quantityLeftInActions;
    private BigDecimal totalDiscountAmount;
    private OrderHeader orderHeader;
   /* private Party party;
    private ProductPromo productPromo;
    private ProductPromoCode productPromoCode;*/
}