package chap04.ohgiraffers.section01.codirional.level01.basic;

import java.util.Scanner;

public class Application5 {
    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);

        System.out.print("인원 수 : ");
        int num = sc1.nextInt();

        System.out.print("사탕 개수 : ");
        int num2 = sc1.nextInt();

        int num3 = (num2 / num);
        int num4 = (num2 % num);

        System.out.println("1인당 사탕 개수 : " + num3);
        System.out.println("남는 사탕 개수 : " + num4);

    }
}
