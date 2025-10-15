package com.korit.study.ch06;

import java.util.Date;
import java.util.Scanner;

public class 연습문제_1 {
    public static void main(String[] args) {
        helloName();
        String a = isNowTime(11,48);
        System.out.println(a);


    }
    public static void helloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력해주세요: ");
        String name = scanner.next();
           System.out.println("안녕하세요 " + name + "님!" );
         }

     public static void helloName_(String name) {
         System.out.println("안녕하세요" + name + "님!");
     }

    public static void square(int Number) {

    }

    public static String isNowTime(int hours, int minutes) {
        Date now = new Date();
        int nowHours = now.getHours();
        int nowMinutes = now.getMinutes();

        return hours == nowHours && minutes == nowMinutes ? "현재 시간입니다." : "현재 시간이 아닙니다.";
    }


    }
