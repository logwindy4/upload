package chap04.ohgiraffers.section01.codirional.level03;

import java.util.Scanner;

public class Application1 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("연산 기호를 입력하세요 : ");
        char ch1 = sc.next().charAt(0);

        int no1 = 0;

        switch (ch1) {
            case 43:  // 아스키코드 +
                no1 = num1 + num2;
                break;
            case 45:  // 아스키코드 -
                no1 = num1 - num2;
                break;
            case 42:  // 아스키코드 *
                no1 = num1 * num2;
                break;
            case 47:  // 아스키코드 /
                no1 = num1 / num2;
                break;
            case 37:  // 아스키코드 %
                no1 = num1 % num2;
                break;

            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다");
                return;
            }
                System.out.println(num1 + " " + ch1 + " " + num2 + " = " + no1);
        }

    }

