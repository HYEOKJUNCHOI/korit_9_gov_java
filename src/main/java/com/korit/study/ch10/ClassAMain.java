package com.korit.study.ch10;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a = new ClassA(); // 생성자 이름
        a.name = "김준일";
        a.age = 32;

        ClassB b = new ClassB("김준이", 33);
        System.out.println(b.name);

        ClassC c = new ClassC("김준삼", 34 , "동래구");
        System.out.println(c.name); // 값을 주입한다.
        System.out.println(c.age);
        System.out.println(c.address);

        ClassC c2 = new ClassC(); {
        }
    }
}