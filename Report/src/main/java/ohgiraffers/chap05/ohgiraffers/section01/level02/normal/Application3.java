package chap05.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 1) {
            int number[] = new int[num];
            int mid = (int)(num / 2 + 1);
            int cnt = 0;

            for (int i = 0; i < mid; i++) {
                number[i] = ++cnt;
            }

            for (int i = mid; i < number.length; i++) {
                number[i] = --cnt;
            }

            for (int i = 0; i < number.length; i++) {
                System.out.print(number[i] + "");
            }

        }else{
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }
    }
}
