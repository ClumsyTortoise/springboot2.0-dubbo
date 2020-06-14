package com.xiaotao.api.member;

import com.xiaotao.api.member.entity.Order;

/**
 * @ClassName IMemberService
 * @Description TODO
 * @Auther lbt
 * @Date 2018/12/28/028 16:09
 * @Version 1.0
 */
public interface IMemberService {

    // 会员接口
    String getMember(Order order);
}
