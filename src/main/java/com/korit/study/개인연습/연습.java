package com.korit.study.개인연습;

public class 연습 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 45, 32, 19};
//👉 배열 안에서 가장 큰 숫자를 찾아서 출력해봐.

        int max = 0;

        for (int i = 0 ; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("제일 큰 수: " + max);
    }
}
