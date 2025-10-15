package com.korit.study.ch02;

public class Operator05 {
    public static void main(String[] args) {

        String 띄우기 = " ";

        boolean a = 10 > 0;

        String r = 10 > 0 ? "영보다커" : "영보다작아";
        double r2 = 10 > 0 ? 1.1 : 2.2;
        char r3 = 10 > 0 ? 'O' : 'X';
        String r4 = -10 > 0 ? "영보다커" : -10 > -20 ? "마이너스십보다커" : "작아";
        String r5 = 2002 % 100 == 0 ? "100의 배수" : "100의 배수가 아님";
        // %는 나누어떨어지는값

        System.out.println(띄우기);
//        문제1
        int year = 1900; // 2024년
        //윤년인지 확인하세요. (4의 배수이면서 100의 배수가 아니거나) 또는 400의 배수
        String result1 = (year % 4 == 0) && (year % 100 != 0) || year % 400 == 0 ? "윤년입니다." : "평년입니다.";
//   % 나누어 떨어지는값이 == 0 이면 배수 && < 이거나  || < 또는
        System.out.println(result1); // 윤년입니다. / 평년입니다.

        System.out.println(띄우기);

        int num = 17;
// 연습문제 num이 짝수면 "짝수입니다." 아니면 "홀수입니다." 출력하세요.
        String result = num % 2 == 0 ? "짝수입니다" : "홀수입니다";
        System.out.println(result);
        System.out.println(띄우기);

//        문제 2
//        String 상태 = // 성공 , 실패
//                // 실패면 잔액보존
//                // 성공이면 수수료 1000원포함 출금

        int 현재잔액 = 150000;
        int 출금금액 = 149000;
        boolean 출금불가능 = 현재잔액 - (출금금액 + 1000) < 0;

        String 상태 = 출금불가능 ? "실패" : "성공";
        int 출금액 = 출금불가능 ? 0 : 출금금액 + 1000;
        int 거래후잔액 = 출금불가능 ? 현재잔액 : 현재잔액 - (출금금액 + 1000);

        System.out.println("거래상태 : " + 상태);
        System.out.printf("거래상태 : %s\n",상태);
        System.out.println("출금액 : " + 출금액);
        System.out.printf("출금액 : %d\n" ,출금액);
        System.out.println("거래후잔액 : " + 거래후잔액);
        System.out.printf("거래후잔액 : %d\n" ,거래후잔액);
//
//        int 현재잔액 = 150000;
//        int 출금금액 = 150000;
//
//        int 수수료 = 1000;
//        int 예상출금액 = (출금금액 + 수수료);
//        int 출금액 = (예상출금액 <= 현재잔액) ? 예상출금액 : 0;
//        int 거래후잔액 = 현재잔액 - 출금액;
//
//        String 상태 = 현재잔액 - 예상출금액 >= 0 ? "성공" : "실패"; // 성공, 실패
//        System.out.println("거래 상태: " + 상태);
//        System.out.println("출금액: " + 출금액 + "원 (수수료 1000원 포함)");
//        System.out.println("거래 후 잔액: " + 거래후잔액 + "원");

    }
}