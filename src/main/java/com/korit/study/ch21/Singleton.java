package com.korit.study.ch21;

import java.util.Objects;

public class Singleton {
    private volatile static Singleton instance;
// 변수명을 인스턴스라고 해야하는이유?
    /// 싱크로나이즈 때문에 볼렛타일"save 느낌"에 넣어야함

    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton("Class Data");
        }
        return instance;
    }
    public static Singleton getSynchronizedtInstance() {
        if (Objects.isNull(instance)) { // 값이 널인지 확인
            synchronized (Singleton.class) { // 다른사람이 작업중인건지 확인
                if (Objects.isNull(instance)) { // 혹시나 한번더 확인
                    instance = new Singleton("Class data");
                }
            }
        }
        return instance;
    }

    public void changeData() {
        System.out.println("데이터 변경 "+ data);
    }

    public void deleteData() {
        System.out.println("데이터 삭제 "+ data);
    }
}
