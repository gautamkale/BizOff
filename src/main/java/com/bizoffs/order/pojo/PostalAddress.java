package com.bizoffs.order.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PostalAddress {
    private static final long serialVersionUID = 1L;
    private String contactMechId;
    private String address1;
    private String address2;
    private String attnName;
    private String city;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String directions;
    private Long houseNumber;
    private String houseNumberExt;
}
