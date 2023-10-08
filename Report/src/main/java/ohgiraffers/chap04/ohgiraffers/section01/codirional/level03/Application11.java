package chap04.ohgiraffers.section01.codirional.level03;

import java.util.Scanner;

public class Application11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int random1 = (int) (Math.random() * 10) + 1;

        int count = 0;

        while (true) {
            System.out.print("1~10 사이의 난수를 맞춰보세요 : ");
            int num = sc.nextInt();

            if (num >= 1 && num <= 10) {
                if (num != random1) {
                    if (num < random1) {
                        System.out.println("입력하신 숫자보다 큽니다");
                    } else {
                        System.out.println("입력하신 숫자보다 작습니다");
                    }
                    count++;

                } else {
                    count++;

                    System.out.println("입력하신 숫자가 같습니다.");
                    System.out.println("입력한 숫자 : " + num + " , Random : " + random1);
                    System.out.println(count + "번 만에 맞췄습니다.");
                    break;
                }
            }
        }
    }
}