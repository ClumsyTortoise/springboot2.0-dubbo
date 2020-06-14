package com.xiaotao.controller;

import com.xiaotao.api.member.IMemberService;
import com.xiaotao.api.member.entity.Order;
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
public class OrderController {

    @Reference(group = "member_group",version = "1.0.0",check = false)
    private IMemberService memberService;

    @GetMapping("/orderToMember")
    public String orderToMember() {

        Order order = new Order();
        order.setOrderId("888");
        String member = memberService.getMember(order);
        System.out.println(member);
        return member;
    }
}
