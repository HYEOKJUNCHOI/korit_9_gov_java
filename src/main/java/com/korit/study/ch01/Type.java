package com.korit.study.ch01;

import java.util.Date;

public class Type {
    public static void main(String[] args) {
        boolean open = true;
//      논리 자료형
//       ㄴ 초기화 // 메모리청소
        System.out.println(open);
        open = false;
        System.out.println(open);
//      문자 자료형
        char lastName = '김';
        System.out.println(lastName);
//        char firstName = '혁준'
//      문자열 자료형
        String fistName = "준일";
        System.out.println(fistName);
        String contents1 = "안녕하세요.\n김준일입니다.";
        System.out.println(contents1);
        String contents2 = """
               
               안녕하세요.
               김준일입니다/""";
        System.out.println(contents2);
//       숫자
        double avg = 89.33;
        System.out.println(avg);
        int number = 10000000;
        System.out.println(number);
        int nowTime = (int) new Date().getTime();
        System.out.println(nowTime);
        long longNumber = 2200000000L;
        System.out.println(longNumber);

//       상수 = 대문자
        final String uploadPath = "~/upload/image";
        final String UPLOAD_PATH = "~/upload/image";



    }
}