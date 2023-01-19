package com.bizoffs.order.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class orderRequest {
    private String requestId;
    private Object reqObject;
}
