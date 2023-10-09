package chap05.ohgiraffers.section01.level02.normal;

import java.util.Arrays;

public class Application4 {
    public static void main(String[] args){

        int lotto[] = new int[6];  // 6줄 정수배열 생성

        for (int i = 0; i < lotto.length; i++){  // 배열 0 부터 5까지 반복
            lotto[i] = (int)(Math.random() * 45) + 1;  // 0.0이상 1.0이하 랜덤수생성 int로 강제변환, 1~45까지의 난수 생성
            for (int j = 0; j < i; j++){
                if (lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < lotto.length; i++){
            Arrays.sort(lotto);
            System.out.print(lotto[i] + " ");
        }
    }
}