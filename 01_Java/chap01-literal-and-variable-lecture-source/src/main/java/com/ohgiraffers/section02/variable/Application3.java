package com.ohgiraffers.section02.variable;

public class Application3 {

    public static void main(String[] args){

        /* 동일한 범위({}) 내에서는 동일한 변수명을 가질 수 없다. */
        int age = 20;
//        int age = 20;   // 동일한 변수명을 가지므로 에러 발생

        /* 예약어 안됨 */
//        int true = 1;   // 예약어 사용 불가
//        int public = 1;

        /* 변수명은 대소문자를 구분한다. */
        int Age = 20;   // 위에 만든 age와 다른 것으로 취급한다.
        int True = 10;  // 예약어 true와는 다른 것으로 취급한다.

        /* 특수기호는 _, $만 가능 */
//        int sh@rp = 20;
        int _a_ge_ = 20;  // 언더스코어(_)는 처음,중간,끝 다 가능하다.
        int $harp = 20;   // $는 처음,중간,끝 다 가능하다.

        /* 컴파일 에러는 발생시키지 않지만 개발자들끼리의 암묵적 규칙 */
        // 변수명의 길이 제한은 없다 하지만 적당히 하자.
        int abcdefghijklmnopasdfsadfasdfasdfsadfasdfsadfsdfsadf;

        // 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두번째 시작단어는 대문자로
        // 표현(카멜케이스 표기법)
        int maxAge = 20;
        int minAge = 10;

        // 단어와 단어 사이의 연결을 언더스코어로 하지 않는다.
        String user_name;
        String userName; // 이게 올바른 표현이다.

        int 나이;
        나이 = 10;
        System.out.println(나이); // 가능하기는 하지만 권장하지 않는다.

        String s; // 변수가 어떤 의미를 가지는지 파악하기 힘들다.

        //전형적인 변수 이름이 있다면 가급적 사용하자
        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;

        // 되도록 명사형으로 작성한다.
        String goHome;   // 가능하지만 가급적 명사형으로 짓는다.
        String home;

        /* boolean 형은 의문문으로 가급적 긍정형태로 네이밍한다. */
        boolean isAlive = true;
        boolean isDead = false;  // 부정형보다는 긍정형으로

    }

}
