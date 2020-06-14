package com.xiaotao.api.order;

import com.xiaotao.api.order.entity.Member;

/**
 * @ClassName IMemberService
 * @Description TODO
 * @Auther lbt
 * @Date 2018/12/28/028 16:09
 * @Version 1.0
 */
public interface IOrderService {

    // 订单接口
    String getOrder(Member member);
}
