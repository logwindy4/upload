package chap05.ohgiraffers.section01.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        String[] str = new String[5];
        String[] fruit = {"딸기", "바나나", "복숭아", "키위", "사과" };

        if (num >= 0 && num <= 4){
            System.out.println(fruit[num]);
        }else{
            System.out.println("준비된 과일이 없습니다.");
        }
    }
}
