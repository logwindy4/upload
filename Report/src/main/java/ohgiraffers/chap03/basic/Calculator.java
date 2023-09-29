package ohgiraffers.chap03.basic;

public class Calculator {
    public void checkMethod() {

        System.out.println("메소드 호출 확인");

    }
    public void sumTwoNumber(){
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + "과 " + num2 + "의 합은 " +( num1 + num2 ) + "입니다." );
    }
}