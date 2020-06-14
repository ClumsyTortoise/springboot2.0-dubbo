package com.xiaotao.api.order.impl;

import com.xiaotao.api.order.IOrderService;
import com.xiaotao.api.order.entity.Member;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName MemberServiceImpl
 * @Description TODO
 * @Auther lbt
 * @Date 2018/12/28/028 16:08
 * @Version 1.0
 */
@Service(group = "order_group",version = "1.0.0")
public class OderServiceImpl implements IOrderService {

    /**
     * 1.dubbo服务发布采用dubbo注解方式，使用 Dubbo 提供的 @Service 注解进行服务的发布
     * 2.Dubbo 提供@Service 将该接口注册到注册中心去
     * 3.Spring 提供@Service 将类注入到Spring容器中去
     */

    @Value("${dubbo.protocol.port}")
    private String dubboPort;

    @Override
    public String getOrder(Member member) {

        System.out.println("会员服务调用订单服务，服务端口号：" + dubboPort);
        System.out.println("接受的会员id: " + member.getMemberId());
        return "会员服务调用订单服务，订单服务端口号：" + dubboPort + " 调用成功";
    }
}
