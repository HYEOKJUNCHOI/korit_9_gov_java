package com.korit.study.ch06;

public class 연습문제_2 {
    public static void main(String[] args) {
        add(10,10);
        System.out.println(add(10,10));
        printInfo("최혁준",36,"학교");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // 실수 2개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(double a, double b) {
        a = 1.1;
        b = 2.2;
        return (int)(a+b);

    }

    // 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void printInfo(String name, int age , String school) {
        printInfo(name, age, school);
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("학교: " + school);
    }


    }



