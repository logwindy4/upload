package ohgiraffers.chap02;

public class Application2 {
    public static void main(String[] args){

        int age = 200;

       String str = (age <= 13)? "어린이" : (age > 19)? "성인" :(age <= 19)? "청소년":"";

    //   System.out.println(sd);

    //    String as = (age <= 13) ? "어린이" : (age >19) ? "성인" : "청소년";
        System.out.println(str);



    //    System.out.println("===============================================");


    //    String str = (age <= 13)? "어린이" : (age > 19) ? "성인" : "청소년";
    //    System.out.println(str);
    }
}
