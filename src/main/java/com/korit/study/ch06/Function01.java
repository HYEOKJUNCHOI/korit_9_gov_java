package com.korit.study.ch06;

public class Function01 {
    public static void main(String[] args) {
        int result = sum(10, 20, 30 , 40); // 값만 =(대입) 할 수 있다 / 함수명()  > 함수호출 /
        System.out.println(result);
    }

    static int sum(int a, int b , int c, int d) {
        return sum2(a, b) + sum2(c, d); // return 은 무조건 값이 와야함 >> 리턴값이 정해짐 / 리턴을 만나면 함수탈출
    }

    static int sum2(int a, int b) {
        return a + b;

    }
}
