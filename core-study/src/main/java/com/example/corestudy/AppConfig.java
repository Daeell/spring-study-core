package com.example.corestudy;

import com.example.corestudy.discount.FixDiscountPolicy;
import com.example.corestudy.member.MemberService;
import com.example.corestudy.member.MemberServiceImpl;
import com.example.corestudy.member.MemoryMemberRepository;
import com.example.corestudy.order.OrderService;
import com.example.corestudy.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
