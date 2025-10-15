package com.korit.study.ch02;

public class Operator03 {
    public static void main(String[] args) {
//       논리 연산자 / 논리가 들어가면 true/false , 0,1
//        || or연산자 (합) = 이거나
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = b1 || b2;
        System.out.println(b3);
        b3 = b1 || true;
        System.out.println(b3);

//        && and연산자 (곱) = 이면서
        boolean b4 = b1 && b2;
        b4 = b1 && true;
        b4 = true && true;

//        ! not연산자 (부정) = 가 아니다
        boolean b5 = b1 && true;
        b5 = !b5;
        System.out.println(b5);
        System.out.println(!(true && true));



    }
}
