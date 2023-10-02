package chap03.com.ohgiraffers.level01.normal;

public class RandomMaker {

    public static String rockPaperScissors() {

        int random1 = (int) (Math.random() * 3);
        String result = "";

        if (random1 == 0) {
            result = "가위";

        } else if (random1 == 1) {
            result = "바위";

        } else if (random1 == 2) {
            result = "보";

        }

        return result;
    }

    public static String tossCoin() {
        int coin = (int) (Math.random() * 2);

        String result2 = "";

        if (coin == 0) {
            result2 = "앞";

        } else if (coin == 1) {
            result2 = "뒤";
        }
        return result2;
    }
}










