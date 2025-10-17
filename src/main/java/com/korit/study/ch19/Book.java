package com.korit.study.ch19;

import java.util.Objects;

public class Book {
    private String model;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book car)) return false;
        // if (o.getClass() != Car.class) { return flase; 로도 바꿀 수 있다.
        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    public Book(String model, String color) {
        this.model = model;
        this.color = color;


    }
}

