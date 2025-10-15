package com.korit.study.ch02;

public class Operator02 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        i += 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        i++;
        System.out.println(i);
        System.out.println(++i); // 선증가 / 즉시증가 / 명령이 끝나기전에 증가
        System.out.println(i++ + 10); // 후증가 / 명령이 끝난 후에 증가
//        명령이 끝낫다????????????????? / 볼때는증가되면 안됨 , 보고나서 증가되야한다
        i++;
        System.out.println(i);

    }
}
