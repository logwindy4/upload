package chap04.ohgiraffers.section01.codirional.level03;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요. : ");
        String name = sc.nextLine();

        String fruits = "";

        switch (name) {
            case "사과":
                fruits = "1000원";
                break;

            case "바나나":
                fruits = "3000원";
                break;

            case "복숭아":
                fruits = "2000원";
                break;

            case "키위":
                fruits = "5000원";
                break;

            default:
            System.out.println("없는 과일 입니다.");
        }

            if(fruits !=""){
            System.out.println(name + "의 가격은 " + fruits + "입니다.");
            }
    }
}

