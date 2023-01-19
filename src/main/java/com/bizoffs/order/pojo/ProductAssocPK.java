package com.bizoffs.order.pojo;

import lombok.Data;

@Data
public class ProductAssocPK {
    private String productId;
    private String productIdTo;
    private String productAssocTypeId;
}
