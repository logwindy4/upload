package chap03.com.ohgiraffers.level01.normal;

import static chap03.com.ohgiraffers.level01.normal.RandomMaker.rockPaperScissors;
import static chap03.com.ohgiraffers.level01.normal.RandomMaker.tossCoin;

public class Application {

       public static void main(String[] args) {

        RandomMaker random = new RandomMaker();
        rockPaperScissors();
        System.out.println(rockPaperScissors());

        System.out.println("=====================");

        RandomMaker Coin = new RandomMaker();
        tossCoin();
        System.out.println(tossCoin());


    }

}