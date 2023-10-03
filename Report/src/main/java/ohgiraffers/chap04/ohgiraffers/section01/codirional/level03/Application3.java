package chap04.ohgiraffers.section01.codirional.level03;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        if (average >= 60) {

            if (num1 >= 40 && num2 >= 40 && num3 >= 40) {
                System.out.println("축하 합니다, 합격입니다.");
            }
        } else {
            System.out.println("평균 점수 미달로 불합격 입니다");
        }
        if (num1 > 40) {
            System.out.println("국어 과목 합격 입니다");

        } else if (num1 < 40) {
            System.out.println("국어 과목 점수 미달로 불합격 입니다");
        }

        if (num2 > 40) {
            System.out.println("영어 과목 합격 입니다");

        } else if (num2 < 40) {
            System.out.println("영어 과목 점수 미달로 불합격 입니다");
        }

        if (num3 > 40) {
            System.out.println("수학 과목 합격 입니다");

        } else if (num3 < 40) {
            System.out.println("수학 과목 점수 미달로 불합격 입니다");

        }
    }
}





