package chap04.ohgiraffers.section01.codirional.level03;


import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int num3 = sc.nextInt();

        int sum = (num1 + num2 + num3);
        double average = sum / 3.0;

        if (num1 >= 40 && num2 >=40 && num3 >=40 && average >= 60){
            System.out.println("=====================");
            System.out.println("축하합니다, 합격입니다!");
            System.out.println("국어 점수 : " + num1);
            System.out.println("영어 점수 : " + num2);
            System.out.println("수학 점수 : " + num3);
            System.out.println("평균 점수 : " + average);
        }else{
            System.out.println("=====================");
            System.out.println("불합격 입니다.");
        }

    }
}
