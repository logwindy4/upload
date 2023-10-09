package chap05.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");
        String sc2 = sc.nextLine();

        char[] ch = sc2.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(i >= 8){
                ch[i] ='*';
            }
            System.out.print(ch[i]);
        }
    }
}
