package com.korit.study.개인연습;

public class 홀수만 {
    public static void main(String[] args) {
        int[] nums = {3, 10, 7, 12, 8, 5, 20, 13};
       int[] evens = new int[0];

        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] % 2 != 0) {
                int temp[] = new int[evens.length + 1];
                for (int j = 0; j < evens.length; j++) {
                    temp[j] = evens[j];
                }
                temp[temp.length - 1] = nums[i];
                evens = temp;
            }
        }
        System.out.print("홀수들 : ");
        for (int i = 0 ; i < evens.length; i++) {
            System.out.print(evens[i] + " ");
        }
    }
}

