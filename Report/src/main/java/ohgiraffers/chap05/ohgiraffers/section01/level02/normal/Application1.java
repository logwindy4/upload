package chap05.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String str = sc.nextLine();

        char[] ch = new char[str.length()];

        System.out.print("검색할 문자를 입력하세요");
        char ch2 = sc.next().charAt(0);

        char[] ch3 = str.toCharArray();

        for(int i  = 0; i <ch3.length; i++){
            System.out.println(ch3[i]);
        }

        int count = 0;

            for(int i = 0; i < ch.length; i++){
                if(ch3[i] == ch2){
                    count++;
                }
            }
        System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + ch2 + '은' + count + "개입니다.");

    }
}
