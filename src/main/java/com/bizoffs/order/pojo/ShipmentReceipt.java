package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class ShipmentReceipt implements Serializable {
    private static final long serialVersionUID = 1L;
    private String receiptId;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp datetimeReceived;
    private String itemDescription;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private BigDecimal quantityAccepted;
    private BigDecimal quantityRejected;
    private String shipmentItemSeqId;
   /* private List<AcctgTran> acctgTrans;
    private List<InventoryItemDetail> inventoryItemDetails;
    private List<OrderItemBilling> orderItemBillings;
    private List<ReturnItemBilling> returnItemBillings;
    private InventoryItem inventoryItem;
    private OrderItem orderItem;
    private Product product;
    private RejectionReason rejectionReason;
    private ReturnItem returnItem;
    private ShipmentPackage shipmentPackage;
    private UserLogin userLogin;
    private List<ShipmentReceiptRole> shipmentReceiptRoles;*/
}