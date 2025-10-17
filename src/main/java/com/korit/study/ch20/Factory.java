package com.korit.study.ch20;

public class Factory {
    private static int id; // 한줄추가
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    public Product createProduct(String name) {
        return new Product(++id,name); // ++id 한줄 추가
    } // 1부터넣어라 선증가 , 0부터넣어라 후증가

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                '}';
    }
}
// 프러덕트 끼리 공유할게아니라 팩토리끼리 공유해야한다.