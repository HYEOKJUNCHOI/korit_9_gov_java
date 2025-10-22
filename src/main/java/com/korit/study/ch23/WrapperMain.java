package com.korit.study.ch23;

import java.util.ArrayList;

public class WrapperMain {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = num; // autoBoxing 자동으로포장
//      (참조자료형= 타고 들어갔을때 뭔가가 있다는거 / 데이터값,메서드)
//      Integer num3 = new Integer(10);
        int num4 = num2; // autoUnBoxing
        String numStr = Integer.toString(num);
        String numStr2 = "" + num;
        String numStr3 = num2.toString();

        // boxing을 하면 .기능이 생긴다. .toString() 같은..// 일반자료형 >> 참조자료형으로 변경
        // 제네릭은 무조건 참조자료형만 쓸 수 있다.




    }
}
