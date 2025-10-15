package com.korit.study.Exercise;

public class 연습3 {
    public static void main(String[] args) {
        int[] num = new int[] { 23, 45, 12, 67, 34, 89, 11 };
            int max = 0;
            for (int i = 0; i < 7; i++) {
                if (num[i] > max) {
                    max = num[i];
                    // or max = num[i] > max ? num[i] : max;
                    System.out.println(max);
                }
            }
    }
}
