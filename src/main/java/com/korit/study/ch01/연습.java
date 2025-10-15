package com.korit.study.ch01;

public class 연습 {
    public static void main(String[] args) {
        int[] score = {72, 88, 95, 60, 45};
            double sum = 0.0;
                for (int i = 0; i < score.length ; i++) {
                    sum += score[i];
                }

                double avg = sum / score.length;
                    System.out.println("총점 : " + sum);
                    System.out.println("평균 : " + avg);

                if ( avg >= 60 ) {
                    System.out.println("결과 : 합격");
                } else {
                    System.out.println("결과 :불합격");
                }
    }
}