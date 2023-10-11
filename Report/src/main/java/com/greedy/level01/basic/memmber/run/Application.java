package com.greedy.level01.basic.memmber.run;

import com.greedy.level01.basic.memmber.model.dto.MemberDTO;



public class Application {
    public static void main(String[] args){

    MemberDTO member= new MemberDTO();

        System.out.println("아이디 : " + member.getId());
        System.out.println("패스워드 : " + member.getPwd());
        System.out.println("이름 : " + member.getName());
        System.out.println("나이 : " + member.getAge());
        System.out.println("성별 : " + member.getGender());
        System.out.println("전화번호 : " + member.getPhone());
        System.out.println("이메일 : " + member.getEmail());

        System.out.println("================================");

        member.setId("user01");
        member.setPwd("pass01");
        member.setName("홍길동");
        member.setAge(10);
        member.setGender('남');
        member.setPhone("018-018-1818");
        member.setEmail("email.email.com");

        System.out.println("변경후 아이디 : " + member.getId());
        System.out.println("변경후 패스워드 : " + member.getPwd());
        System.out.println("변경후 이름 : " + member.getName());
        System.out.println("변경후 나이 : " + member.getAge());
        System.out.println("변경후 성별 : " + member.getGender());
        System.out.println("변경후 전화번호 : " + member.getPhone());
        System.out.println("변경후 이메일 : " + member.getEmail());

    }
}

