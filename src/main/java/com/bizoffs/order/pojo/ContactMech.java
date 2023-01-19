package com.bizoffs.order.pojo;

import lombok.Data;

@Data
public class ContactMech {
    private String contactMechId;
    private String infoString;

    private PostalAddress postalAddress;

}
