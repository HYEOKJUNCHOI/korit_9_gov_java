package com.korit.study.ch05;

public class Star2 {
    public static void main(String[] args) {

        int s = 5;

        for (int i = 0; i < s; i++) {           // ✅ ① 시작: 0 / 조건: i < s / 증가: i++
            for (int j = 0; j < i + 1; j++) {   // ✅ ② 조건: j < i + 1
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = s; i > 0; i--) {       // ✅ i를 s부터 시작해서 1까지 줄이기
            for (int j = 0; j < i; j++) {   // ✅ j < i (줄마다 별 개수 줄어듦)
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int n = 20;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 2; j++) {
                System.out.print("*");
            }

            for(int j = 0; j < (i < 2 ? i : i <n - 1 ? 1 : n - 1 - i ); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}