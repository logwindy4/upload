package chap04.ohgiraffers.section01.codirional.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int inputData = sc1.nextInt();

      //  int num = inputData;
        String num2 = (inputData > 0) ? "양수 입니다." : "음수 입니다.";
        System.out.println(num2);

        System.out.println("============================");

        Scanner sc2 = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int inputData2 = sc1.nextInt();

        if (inputData2 > 0) {
            System.out.println("양수 입니다.");

        }
        else {
            System.out.println("음수 입니다.");
        }
    }
}
