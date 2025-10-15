package com.korit.study.ch11_연습.src.com.korit.study.ch11;

/**
 * 스터디 전체 정보를 묶는 클래스
 * - 수업 과목
 * - 학생 목록
 */
public class 스터디 {
    과목 수업과목;
    학생[] 학생목록;

    public 스터디(과목 수업과목, 학생[] 학생목록) {
        this.수업과목 = 수업과목;
        this.학생목록 = 학생목록;
    }
}
