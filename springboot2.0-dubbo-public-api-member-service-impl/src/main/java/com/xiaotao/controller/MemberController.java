package com.xiaotao.controller;

import com.xiaotao.api.order.IOrderService;
import com.xiaotao.api.order.entity.Member;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO 订单表现层
 * @Auther lbt
 * @Date 2018/12/28/028 16:39
 * @Version 1.0
 */
@RestController
public class MemberController {

    @Reference(group = "order_group",version = "1.0.0",check = false)
    private IOrderService orderService;

    @GetMapping("/memberToOrder")
    public String orderToMember() {

        Member member = new Member();
        member.setMemberId("666");

        String order = orderService.getOrder(member);

        System.out.println(order);

        return order;
    }
}
