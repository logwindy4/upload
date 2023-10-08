package chap04.ohgiraffers.section01.codirional.level03;

import java.util.Scanner;

public class Application12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int num = sc.nextInt(); // 4


        for(int i = 1; i <= num; i++){
           //   i = 1; 1 <=  4   1씩추가            1) 외부 for문 실행

            for(int e = num; e >=i; e--){
           //       e =  4   4   1  1씩감소         2) 내부 for문 반복 후  4) 외부 for문 복귀
                System.out.print('*'); // *로 print

                }
            System.out.println();               // 3) 출력 ****
                                                //        ***
            }                                   //        **
                                                //        * 출력
        }

    }
