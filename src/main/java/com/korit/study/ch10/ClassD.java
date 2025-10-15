package com.korit.study.ch10;

public class ClassD {
    final String name; // 상수는 초기화가 무조건 필요
    int age;
    String address;

    ClassD(String name) { // 생성자를 통해 초기화
        this.name = name;
    }
}