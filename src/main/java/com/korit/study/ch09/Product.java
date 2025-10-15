package com.korit.study.ch09;

public class Product {
    String name;
    int price;

    int disocunt() {
        return (int) (price - (price * 0.2));
    }
}