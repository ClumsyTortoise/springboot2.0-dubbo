package com.xiaotao.api.member.entity;

import java.io.Serializable;

public class Order implements Serializable {
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
