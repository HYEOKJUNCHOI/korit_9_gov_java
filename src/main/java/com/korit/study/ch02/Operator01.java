package com.korit.study.ch02;

public class Operator01 {
    public static void main(String[] args) {
//        산술연산
        int n1 = 10;
        int n2 = 5;
        int r1 = n1 + n2;
        System.out.println(r1);
//        문자열 더하기
        String text1 = "문자열";
        String text2 = "합치기";
        String text3 = text1 + text2;
        System.out.println(text3);
        System.out.println("문자열2" + "   " + "합치기2" + text1 + ": " + r1);

//       연산으로 인한 캐스팅(단계업)
        double n3 = 2.1;
        int n4 = 10;
        System.out.println(n3 + n4);
        String n5 = "" + 2.1;
        double n6 = 10.12;
        Double n7 = Double.parseDouble(n5) + n6;
        System.out.println(n7);
        System.out.println((char) ('a' + 10));
        System.out.println("" + 'a' + 'b');
        System.out.println('a' + 'b' + "");
//      ㄴ ""을 먼저 놔서 문자열로 바꿔줌 , 뒤에놓으면 바뀌지않음 순서대로 하기떄문에
        System.out.println('a' + ('b' + ""));
        // ㄴ이거는 이해가필요할듯..

//        나머지 연산
        int n8 = 10;
        int n9 = 4;
        int n10 = n8 % n9;
        System.out.println(n10);

    }
}
