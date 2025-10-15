package com.korit.study.Exercise;

public class 연습2 {
    public static void main(String[] args) {
//        String[] nums = new String[3];
//
//        nums[0] = "김준일";
//        nums[1] = "김준이";
//        nums[2] = "김준삼";
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(nums[i]);

//        String[] nums = new String[3];
//            nums[0] = "최";
//            nums[1] = "혁";
//            nums[2] = "준";
//
//            for (int i = 0; i < 3; i++) {
//                System.out.println(nums[i]);

//            }

        int[] num = new int[]{5, 10, 15, 20, 25};
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = sum + num[i];
            if (i == 4) { // 덫
                System.out.println("배열의 요소들의 합 :" + sum);
            }

        }
    }
        }
