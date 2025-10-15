package com.korit.study.ch08;

public class Array03 {
    public static void main(String[] args) {
        int[] nums = {15, 23, 7, 30, 4, 18};
        int 탐색횟수 = 0;
        int 찾은인덱스 = 0;


        int foundNum = 30;

        for (int i = 0 ; i < nums.length; i++) {
            탐색횟수++; // << 위로 올라간이유
            if (nums[i] == foundNum) {
                찾은인덱스 = i;
                break;
            }
        }
        // 30을 찾기 위한 탐색 시도가 몇번 있었는지와 30의 인덱스 위치를 출력하시오.
        System.out.println( "탐색횟수: " + 탐색횟수 );
        System.out.println( "찾은인덱스: " + 찾은인덱스 );




    }
}
