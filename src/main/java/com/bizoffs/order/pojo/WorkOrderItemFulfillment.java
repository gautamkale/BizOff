package com.bizoffs.order.pojo;

import com.bizoffs.order.entities.WorkOrderItemFulfillmentPK;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

;

@Data
public class WorkOrderItemFulfillment implements Serializable {
    private static final long serialVersionUID = 1L;
    private WorkOrderItemFulfillmentPK id;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private String shipGroupSeqId;
    private WorkEffort workEffort;
   /* private OrderHeader orderHeader;
    private OrderItem orderItem;*/
}