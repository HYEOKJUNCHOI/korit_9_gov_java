package com.korit.study.ch20;

import com.korit.study.ch01.Casting;
import com.korit.study.ch04.Controller01;

public class StaticMain {
    public static void main(String[] args) {
        StaticStudy staticStudy = new StaticStudy();

        staticStudy.print("김준일");
        staticStudy.age = 10;
        System.out.println(staticStudy.age);
        System.out.println(staticStudy.age2);
        StaticStudy.age2 = 20;
        System.out.println(StaticStudy.age2);
        staticStudy.age2 = 30;
        System.out.println(StaticStudy.age2);
        StaticStudy s2 = new StaticStudy();
        s2.age2 = 50;
        System.out.println(staticStudy.age2);

    } // 공유된다? 공유되니까 StaticStudy.age2 가 30이다 ???
    // 소문자 , 대문자 스테틱인지 어떻게 알지??
}