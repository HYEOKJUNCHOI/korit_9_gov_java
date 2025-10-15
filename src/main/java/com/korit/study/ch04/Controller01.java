package com.korit.study.ch04;

public class Controller01 {
    public static void main(String[] args) {
        int num = 10;

        String text = num > 5 ? "5보다 큽니다." : "5이하입니다.";
        System.out.println(text);
//// 삼항연산자 : 참이면 <-- 거짓이면 -->
        if (num > 5) {
            System.out.println("5보다 큽니다.");
        } else {
            System.out.println("5이하 입니다.");
        }
        // 값이 나온경우는 else는 실행안됨.
        /// if문 : 만약에 , ( )안에 조건이 참이면 실행하겠다.
//          흐름도 검색해보기
        int score = 85;

        if (score > 50) System.out.println("50보다 큽니다.");
        else System.out.println("50이하 입니다.");
        // 하나만 실행시킬땐 중괄호 생략가능


        if (score >= 95) {
            System.out.println("A+");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 85) {
            System.out.println("B+");
        } else {
            System.out.println("B");
        }
    }
///  위에께 왜 하나인거지..

}

