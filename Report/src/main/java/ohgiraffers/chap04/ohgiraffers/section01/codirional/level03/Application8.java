package chap04.ohgiraffers.section01.codirional.level03;

import java.util.Scanner;

public class Application8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : "); // 5
        int num = sc.nextInt();

        int sum = 0;  //
    //          i = 1; 1 <=  5;  i:1씩증가
    //          i = 2; 2 <=  5;
    //          i = 3; 3 <=  5;
    //          i = 4; 4 <=  5;
    //          i = 5; 5 <=  5;  정지
        for(int i = 1; i <= num; i++){
            sum += i;//   15 += i+i+i+i+i

            if(i != num){ //두 연산자의 값이 다른가? [사실]
                System.out.print(i + "+");  // 여기서 for문으로 이동
            }else{
                System.out.print(i + " = " + sum); // 1 + 2 + 3 + 4 + 5 " = " 15
            }
        }
    }
}
