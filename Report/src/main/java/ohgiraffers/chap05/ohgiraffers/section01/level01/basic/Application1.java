package chap05.ohgiraffers.section01.level01.basic;

public class Application1 {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {

            arr1[i] = i + 1;

            System.out.println(arr1[i]);
        }
        System.out.println("===================");

        int[] arr2 = new int[10];
        for (int e =0; e < arr2.length; e++){

            arr2[e] = e + 1;
            System.out.println(arr2[e]);
        }
    }
}
