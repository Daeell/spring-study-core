package com.example.corestudy;

import com.example.corestudy.member.Grade;
import com.example.corestudy.member.Member;
import com.example.corestudy.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(1L);
        System.out.println("new = " + memberA.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
