package com.bizoffs.order.pojo;

import lombok.Data;

@Data
public class CarrierShipmentMethod {
    static final long serialVersionUID = 1L;
    private String shipmentMethodTypeId;
    private String partyId;
    private String roleTypeId;
    private String carrierServiceCode;
    private Long sequenceNumber;

    private ShipmentMethodType shipmentMethodType;

}
