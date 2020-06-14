package com.xiaotao.api.order.entity;

import java.io.Serializable;

public class Member implements Serializable {
    private String memberId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
