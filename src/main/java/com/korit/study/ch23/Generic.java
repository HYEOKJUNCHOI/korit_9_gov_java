package com.korit.study.ch23;

public class Generic<T, T2> {  // 제네릭은 한 글자이며 대문자로 써야함 T = 타입, R = 리턴타입, E = 요소(엘리먼츠)
    private T data;
    private T data2;
    private Double data3;
    private T2 data4;
    private T[] arr;

    public Generic(T data, T data2, Double data3, T2 data4) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
//        arr = new T[10];
    }
}
