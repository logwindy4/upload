package chap04.ohgiraffers.section01.codirional.level01.basic;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록 번호를 입력하세요.(-포함) : ");
        String str = sc.nextLine();
                //851113 - 1000000
                //012345 6 789
        char num = str.charAt(7);

        if (num % 2  == 1){
            System.out.println("남자 입니다.");
        }
        else{
            System.out.println("여자 입니다.");

            System.out.println("==================================");

        Scanner sc2 = new Scanner(System.in);
        System.out.print("주민등록 번호를 입력하세요.(-포함) : ");
        char pNo = sc.nextLine().charAt(7);
        System.out.println("pNo: " + pNo);

        if (pNo =='1'|| pNo =='3'){
            System.out.println("남자 입니다.");
            }
        if (pNo =='2'|| pNo =='4'){
            System.out.println("여자 입니다.");
            }
        }
    }
}
