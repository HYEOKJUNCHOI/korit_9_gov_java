package com.korit.study.개인연습;

import java.util.Scanner;

public class 윤년_평년 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("윤년/평년 판별할 년도를 입력하시오: ");
        int year = sc.nextInt();

//        년도가 4로 나눠지고 , 100으로 나눠 떨어지지않거나 400을 나눠 떨어지면 윤년, 그렇지않으면 평년
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(year + "년은? " + (isLeapYear ? "윤":"평") + "년입니다.");

        sc.close();
    }
}
