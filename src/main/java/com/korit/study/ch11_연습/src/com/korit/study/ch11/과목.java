package com.korit.study.ch11_연습.src.com.korit.study.ch11;

/**
 * 과목(수업) 정보를 담는 클래스.
 * 담당 선생님 정보를 포함한다.
 */
public class 과목 {
    String 과목명;
    선생님 담당선생님;

    public 과목(String 과목명, 선생님 담당선생님) {
        this.과목명 = 과목명;
        this.담당선생님 = 담당선생님;
    }
}
