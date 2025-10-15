package com.korit.study.Exercise;

public class 연습4_4 {
    public static void main(String[] args) {
        int[] scores = {45, 67, 80, 90, 58, 77, 100, 61, 70};
        int[] pass = new int[0];

        for(int i = 0; i < scores.length; i++) {
            if (scores[i] >= 70) {
                int[] temp = new int[pass.length+1];

                for (int j = 0 ; j < pass.length; j++) {
                    temp[j] = pass[j];
                }

                temp[temp.length - 1] = scores[i];
                pass = temp;
            }
        }

        System.out.print("합격자 점수 : ");
        for (int i = 0; i < pass.length; i++) {
            System.out.print(pass[i] + "점 ");
        }





    }
}