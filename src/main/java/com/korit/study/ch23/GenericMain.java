package com.korit.study.ch23;

public class GenericMain {

    public static void main(String[] args) {
        NonGeneric a = new NonGeneric("문자열 데이터");
        NonGeneric b = new NonGeneric(10);
        NonGeneric c = new NonGeneric(new NonGeneric(null));
        NonGeneric d = new NonGeneric(a);
        NonGeneric[] arr = {a, b, c, d};
        for (NonGeneric n : arr) {
            System.out.println(n.getData().getClass());
            if (n.getData() instanceof String data) {
                // n.getData()가 원형이 스트링인지 트루,펄스로 확인 , 트루면 data변수에 담아준다
                System.out.println(data);
            } else if (n.getData() instanceof NonGeneric data) { /// ★★NonGeneric을 넣으면 전체선택??
                System.out.println(data.getData());
            }
        }

        Generic<String, Integer> e = new Generic<String, Integer> ("문자열 데이터", "", 3.14,10);
        Generic<String, Integer> f = new Generic<> ("문자열 데이터", "", 3.14,10);
        // 제네릭을 쓰는건 상황별로 자료형이 바뀌었으면 할 때 씀

        Object[] arr2 = new Object[1]; // 객체가 아니면 참조자료형이라 할 수 없다.


    }
}