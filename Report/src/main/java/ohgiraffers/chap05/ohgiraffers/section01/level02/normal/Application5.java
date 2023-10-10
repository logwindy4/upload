package ohgiraffers.chap05;

import java.util.Scanner;

public class Application5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 : ");
        String str1 = sc.nextLine();

        System.out.print("문자 : ");
        char ch1 = sc.nextLine().charAt(0);


        char[] ch2 = new char[str1.length()];
        int count = 0;
        String strindex = "";
        for(int i = 0; i < str1.length(); i++){
            ch2[i] = str1.charAt(i);

            if(ch1 == ch2[i]){
                count++;
                strindex += i +"";
            }
        }
        System.out.print(str1 + "에" + ch1 + "가 존재하는 위치(인덱스) : " + strindex);
        System.out.println();
        System.out.println(ch1 + " 개수 : " + count);
    }
}
