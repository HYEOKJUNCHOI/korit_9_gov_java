package com.korit.study.ch02;

public class Operator04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        boolean c = a > b;
        boolean d = a < b;
        boolean e = a >= b; // 크거나 같다
        boolean f = a <= b; // 작거나 같다
        boolean g = a == b; // 같다
        boolean h = a != b; // 다르다
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        int n = 20;
        boolean r = 5 <= n && n <= 15; // 5 ~ 15 사이면 n의 값이 true;
        System.out.println(r);
        a = 10;
        b = 10;
        System.out.println("a" == "a");
        System.out.println(true == true);
        System.out.println("a".equals("a"));
        System.out.println(false == false);
        System.out.println('a' == 'a');

        int 키 = 170;
        int 몸무게 = 65;
        double BMI = 몸무게/(((double)키/100)*(키/100.0));  // 키에서 100을 나눈결과의 제곱을 몸무게에서 나눈 결과
        boolean 저체중 = BMI < 18.5; // 18.5미만
//        변수는 항상 왼쪽 / ex ) BMI
        boolean 정상 = BMI >= 18.5 && BMI <= 24.9 ; // 18.5에서 24.9사이
        boolean 과체중 = BMI >= 24.9 && BMI <= 29.9; // 24.9에서 29.9사이
        boolean 비만 = BMI >= 30; // 30이상
        System.out.println(BMI);
        System.out.println("저체중: " + 저체중);
        System.out.println("저체중: " + 정상);
        System.out.println("저체중: " + 과체중);
        System.out.println("저체중: " + 비만);

        String 띄우기 = " ";
        System.out.println(띄우기);

//      급여 계산 (근로기준법 주간 총근로시간 40시간, 나머지는 시간외 근무시간)
        int 기본급 = 2400000;
        int 근무시간 = 52 * 4;
        int 기본시간 = 40 * 4;
        int 기본시급 = 기본급/기본시간;
        System.out.println("기본시간 :" + 기본시간);
        System.out.println("근무시간 :" + 근무시간);
        System.out.println("기본시급 :" + 기본시급);
        int 시간외수당 = (int)(기본시급 * 1.5);
        int 초과근무시간 = 근무시간-기본시간;
        int 총급여 = 기본급 + 시간외수당 * 초과근무시간; // 기본급 + (시간외 수당 * 1.5배)
        int 세금 =  (int)(총급여 * 0.1); // 총급여의 10%
        int 지급급여 = 총급여 - 세금 ; // 총급여 - 세금
        System.out.println("총급여: " + 총급여);
        System.out.println("세금: " + 세금);
        System.out.println("지급급여: " + 지급급여);


    }
}
