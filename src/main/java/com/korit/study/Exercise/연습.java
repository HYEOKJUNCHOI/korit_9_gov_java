package com.korit.study.Exercise;

import java.util.Scanner;

public class 연습 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("이름: ");
        String name = s.nextLine();

        switch (name) {
            case "김준일" :
                System.out.println("바보");
                break;
            case "김준이" :
                System.out.println("천재");
                break;
            case "김준삼" :
                System.out.println("바보");
                break;
            case "김준사" :
                System.out.println("천재");
                break;
            default:
                System.out.println("나머지");


        }




    }
}
