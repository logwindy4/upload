package ohgiraffers.chap04.ohgiraffers.section01.codirional.level03;

import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("1 이상의 숫자를 입력해주세요 : ");
            int num = sc.nextInt();

            if (num >= 1) {
                for (int i = 1; i <= num; i++) {
                    System.out.println(i + "");
                }
                break;

            } else {
                System.out.println("1 이상의 숫자를 입력해주세요.");
            }
        }
    }
}