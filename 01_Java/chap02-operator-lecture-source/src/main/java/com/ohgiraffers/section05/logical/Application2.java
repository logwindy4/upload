package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args){
        
        /*
        * 논리 연산자의 우선순위 활용
        * && : 11 순위
        * || : 12 순위
        * */
        
        /* 1부터 100사이의 값인지 확인 */
        /*
        * 1 <= 변수 <= 100 이렇게는 사용 못함 --> 변수 >= 1 && 변수 <= 100 이렇게 사용
        * */
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        int num2 = 160;
        System.out.println("1부터 100 사이인지 확인 : " + (num2 >= 1 && num2 <= 100));

        /* 영어 대문자니?
        * 문자변수 >= 'A' && 문자변수 <= 'Z'
        * */
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z'));

        /* 대소문자 상관없이 영문자 y인지 확인 */
        char ch3 = 'Y';
        System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));

        char ch4 = 'y';
        System.out.println("영문자 y인지 확인 : " + (ch4 == 'y' || ch4 == 'Y'));
        
        /* 영문자인지 확인
         * */

        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
    }
}
