package chap04.ohgiraffers.section01.codirional.level03;

import java.util.Scanner;

public class Application10 {  //잘 모르겠음
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("연산자(+, -, *, /, %) : ");
            String sc2 = sc.next();

            if (sc.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("첫번째 정수를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 정수를 입력하세요 : ");
            int num2 = sc.nextInt();

            if (sc2.equals("/") && num2 == 0) {
                System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요.\n");
                continue;
            }

            switch (sc2) {
                case "+":
                    System.out.printf("%d %s %d = %d\n", num1, sc2, num2, (num1 + num2));
                    break;
                case "-":
                    System.out.printf("%d %s %d = %d\n", num1, sc2, num2, (num1 - num2));
                    break;
                case "*":
                    System.out.printf("%d %s %d = %d\n", num1, sc2, num2, (num1 * num2));
                    break;
                case "/":
                    System.out.printf("%d %s %d = %d\n", num1, sc2, num2, (num1 / num2));
                    break;
                case "%":
                    System.out.printf("%d %s %d = %d\n", num1, sc2, num2, (num1 % num2));
                    break;
                default:
                    System.out.println("없는 연산자 입니다. 다시 입력해 주세요.\n");
                    continue;
            }
            System.out.println();
        }
    }
}





