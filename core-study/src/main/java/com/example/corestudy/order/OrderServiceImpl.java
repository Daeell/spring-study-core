package com.example.corestudy.order;

import com.example.corestudy.discount.DiscountPolicy;
import com.example.corestudy.discount.FixDiscountPolicy;
import com.example.corestudy.member.Member;
import com.example.corestudy.member.MemberRepository;
import com.example.corestudy.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}