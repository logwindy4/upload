package chap05.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application6 {
public static void main(String[] args){


    Scanner sc = new Scanner(System.in);
    System.out.print("치킨의 이름을 입력하세요 : ");
    String chicken = sc.nextLine();

    String[] stringArray = {"후라이드", "양념", "간장", "마라", "허니", "칠리"};

    boolean chickenFound = false;

    for(int i = 0; i < stringArray.length; i++){
       if(stringArray[i].equals(chicken)){
           chickenFound = true;
           break;
       }
   }
    if(chickenFound) {
        System.out.println(chicken + " 치킨 배달 가능 합니다");
    }else{
        System.out.println(chicken + " 치킨은 없는 메뉴 입니다");
    }
}
}
