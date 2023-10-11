package ohgiraffers.chap05;

public class Application7 {
    public static void main(String[] args) {

        int[] num = new int[10];

        int min = 10;
        int max = 1;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10 + 1);

            if (num[i] > max) {
                max = num[i];
            }

            if (num[i] < min) {
                min = num[i];
            }

            System.out.print(num[i] + " ");
        }

        System.out.println();
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }

}
