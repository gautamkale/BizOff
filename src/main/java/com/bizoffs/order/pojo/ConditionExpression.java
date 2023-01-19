package com.bizoffs.order.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ConditionExpression {

    private String left;
    private String operator;
    private String right;
}
