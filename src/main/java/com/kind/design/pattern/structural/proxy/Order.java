package com.kind.design.pattern.structural.proxy;

import com.google.common.base.Objects;

/**
 * @author zhoujifeng
 * @date 2020/5/10 11:06 上午
 */
public class Order {

    private Object orderInfo;

    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
