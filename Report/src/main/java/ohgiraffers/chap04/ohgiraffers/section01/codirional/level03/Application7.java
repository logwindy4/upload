package chap04.ohgiraffers.section01.codirional.level03;

import java.util.Scanner;

public class Application7 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if(num >= 1){
            for(int i = num; i >= 1; i--){
                System.out.print(i + "");
            }
        }else{
            System.out.print("1 이상의 숫자를 입력해주세요.");
        }


    }
}
