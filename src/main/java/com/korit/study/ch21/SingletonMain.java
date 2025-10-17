package com.korit.study.ch21;

import com.korit.study.ch14.SigninDto;

public class SingletonMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
//   필요없음 >>     Singleton singleton = new Singleton("Class data");

        a.run();
        b.run();
        c.run();

    }
}
