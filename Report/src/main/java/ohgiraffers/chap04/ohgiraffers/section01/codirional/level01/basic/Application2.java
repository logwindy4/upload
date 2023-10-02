package chap04.ohgiraffers.section01.codirional.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int input = sc1.nextInt();

        String num1 = (input % 2 == 0)? "짝수 입니다." : "홀수 입니다.";
        System.out.println("입력하신 정수는? : " + num1);

        System.out.println("=============================");

        Scanner sc2 = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int input2 = sc2.nextInt();

        if(input2 % 2 == 0){
            System.out.println("입력하신 정수는? : 짝수 입니다.");
        }
        else{
            System.out.println("입력하신 정수는? : 홀수 입니다.");
        }

    }
}
