package com.korit.study.개인연습;

public class 연습2 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 45, 32, 19};
//👉 배열 안에서 가장 큰 수와 그 위치(인덱스) 를 출력해보자.
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("가장 큰 수: " + max);
        System.out.println("가장 큰 수의 위치: " + "[" + maxIndex + "]");
    }
}