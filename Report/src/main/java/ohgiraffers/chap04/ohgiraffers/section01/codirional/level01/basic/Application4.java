package chap04.ohgiraffers.section01.codirional.level01.basic;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args){


        Scanner sc1 = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int num = sc1.nextInt();

        String str = (num <= 13)? "어린이" : ((num <= 19) ? "청소년" : "성인");
        System.out.println(str);

        System.out.println("========================================");

        Scanner sc2 = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int num2 = sc2.nextInt();

        if (num2 <= 13 ) {
            System.out.println("어린이");
        }
        else if (num2 <= 19) {

            System.out.println("청소년");
        }
        else {
            System.out.printf("성인");
        }

    }
}
