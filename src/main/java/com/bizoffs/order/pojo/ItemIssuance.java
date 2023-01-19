package com.bizoffs.order.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

;

@Data
public class ItemIssuance implements Serializable {
    private static final long serialVersionUID = 1L;
    private String itemIssuanceId;
    private BigDecimal cancelQuantity;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp issuedDateTime;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private BigDecimal quantity;
    private String shipGroupSeqId;
    private String shipmentId;
 /*   private List<InventoryItemDetail> inventoryItemDetails;
    private List<InventoryTransfer> inventoryTransfers;
    private FixedAssetMaint fixedAssetMaint;
    private InventoryItem inventoryItem;
    private OrderItem orderItem;
    private ShipmentItem shipmentItem;
    private UserLogin userLogin;
    private List<ItemIssuanceRole> itemIssuanceRoles;
    private List<OrderItemBilling> orderItemBillings;*/
}