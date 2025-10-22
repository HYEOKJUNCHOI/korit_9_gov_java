package com.korit.study.ch23;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionMain {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("20");
        list.add(30.5);
        list.add(true);
        System.out.println(list); // 오브젝트로 받아옴
        System.out.println(list.get(0)); // 꺼낼때도..
        ArrayList<String> strList = new ArrayList<>();
        strList.add("문자열");
        System.out.println(strList.get(0)); /// ★★★ String[] 과 동일하다?

        test(new ArrayList<>()); /// ★★★ ..?

    }
    public static void test(ArrayList<String> strList) {

    }
}
