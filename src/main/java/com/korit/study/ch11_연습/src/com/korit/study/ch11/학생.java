package com.korit.study.ch11_연습.src.com.korit.study.ch11;

/**
 * 학생 정보를 담는 클래스
 */
public class 학생 {
    int 학번;
    String 이름;
    int 나이;

    public 학생(int 학번, String 이름, int 나이) {
        this.학번 = 학번;
        this.이름 = 이름;
        this.나이 = 나이;
    }

    @Override
    public String toString() {
        return "[학생정보]\n학번: " + 학번 + "\n학생이름: " + 이름 + "\n학생나이: " + 나이;
    }
}
