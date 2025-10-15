package com.korit.study.ch09;

import java.awt.desktop.AboutEvent;

class Student {
    String name;
    int age;
    boolean gender;
    void printInfo() {
        System.out.println("학생 정보 출력");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이름: " + (gender ? "남" : "여"));
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "김준일";
        s1.age = 32;
        s1.gender = true;

        System.out.println("이름 : " + s1.name);
        System.out.println("나이 : " + s1.age);
        System.out.println("성별 : " + (s1.gender ? "남" : "여"));

        System.out.print("\n");

        Student s2 = new Student();

        s1.name = "김준이";
        s1.age = 33;
        s1.gender = false;

        System.out.println("이름 : " + s1.name);
        System.out.println("나이 : " + s1.age);
        if (s1.gender == true) {
            System.out.println("성별 : 남");
        } else {
            System.out.println("성별 : 여");
        }

    }

}