package chap04.ohgiraffers.section01.codirional.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.print("체중을 입력하세요. : ");
        double num = sc1.nextDouble();

        System.out.print("신장을 입력하세요. : ");
        double num2 = sc1.nextDouble() / 100;

        double bmi = (num / (num2 * num2));

        if (bmi < 20) {
            System.out.println("당신은 저체중 입니다.");

        } else if (bmi < 25) {
            System.out.println("당신은 정상체중 입니다.");

        } else if (bmi < 30) {
            System.out.println("당신은 과체중 입니다.");

        } else {
            System.out.println("당신은 비만 입니다.");

        }
    }
}