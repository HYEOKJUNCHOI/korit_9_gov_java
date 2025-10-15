package com.korit.study.ch09;

class Car {
    String model;
    String color;
}

public class CarMain {
    public static void main(String[] args) {
        String model1 = "소나타";
        String color1 = "검정색";
        String model2 = "아반떼";
        String color2 = "파란색";
        String[] models = new String[100000];
        String[] colors = new String[100000];
        models[99954] = "소나타";
        colors[99954] = "검정색";

        Car c1 = new Car();

        c1.model = "소나타";
        c1.color = "검정색";

        Car c2 = new Car();

        c2.model = "아반떼";
        c2.color = "파란색";

        Car c3 = new Car(); // (인스턴스는) 자동으로 기본값으로 초가화해줌
        System.out.println(c3.model);

        int a = 1;
        System.out.println(a);

    }

}
