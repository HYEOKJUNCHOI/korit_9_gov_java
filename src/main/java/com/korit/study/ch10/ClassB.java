package com.korit.study.ch10;

import javax.xml.namespace.QName;

public class ClassB {
    String name;
    int age;

    ClassB(String name , int age) {
        this.name = name; // this 가 붙으면 위에 public class ClassB에 name
        this.age = age;
    }
}