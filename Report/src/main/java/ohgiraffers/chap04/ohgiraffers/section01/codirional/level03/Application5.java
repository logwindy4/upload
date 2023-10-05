package chap04.ohgiraffers.section01.codirional.level03;

import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1 이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if(num >= 1){
            // (타입 i = 1; i <= 입력한 숫자; 1씩증가)
            for(int i = 1; i <= num; i++) { // {for문브레이스} 입력 숫자 만큼 계산후 전부 표시? 해서 총숫자가 다 나옴
                System.out.print(i + "");   // 1줄 이상의 for문이면 안됨?
            }
            //           출력

        }else{
            System.out.println("1 이상의 숫자를 입력해주세요.");

        }
        
    }
}
