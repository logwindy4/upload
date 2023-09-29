package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args){

        /* static 메소드 호출하기
        *
        * 우리가 지금 작성하고 있는 메소드를 보면 public과 void 사이에 static이라고 하는 키워드가 있다.
        * static 키워드에 대해서는 뒤에서 다르게 될 예정이지만, static 메소드를 호출하는 방법부터 먼저 학습해보자.
        *
        * static이 있는 메소드이건 non-static 메소드이건 메소드의 동작 흐름은 동일하다.
        *
        * */

        /*
        * non-static 메소드를 호출하는경우
        * 클래스명 변수명 = new 클래스명();
        * 변수명.메소드명();
        *
        * static 메소드를 호출하는 경우
        * 클래스명.메소드명(); <- 이런 방식으로 호출한다.
        * */

        System.out.println("10과 20의 합 : " + Application8.sumTwoNumbers(10, 20));

        /* 동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능하다. */
        System.out.println("20과 30의 합 : " + sumTwoNumbers(20, 30));
    }

    /* static 메소드 생성*/
    public static int sumTwoNumbers(int first, int second){

        return first + second;
    }
}
