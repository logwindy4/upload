package chap04.ohgiraffers.section01.codirional.level03;

import java.util.Scanner;

public class Application9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해 주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력해 주세요 : ");
        int num2 = sc.nextInt();


        if (num1 > 0 && num2 > 0) {
            for (int i = num1; i <= num2; i++)
                System.out.print(i + " ");
            }else{
                System.out.println("1이상의 숫자를 입력해주세요.");
            }
        }
    }
