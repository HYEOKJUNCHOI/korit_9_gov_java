package com.korit.study.ch11_연습.src.com.korit.study.ch11;

/**
 * 스터디, 과목, 학생 정보를 출력하는 전담 서비스
 * (콘솔 출력 전담: 나중에 파일 저장/웹 출력으로 바꾸기 쉬움)
 */
public class 스터디출력서비스 {

    // 전체 정보 출력
    public void 전체정보출력(스터디 스터디정보) {
        과목정보출력(스터디정보.수업과목);
        학생전체출력(스터디정보.학생목록);
    }

    // 과목 + 선생님 정보 출력
    public void 과목정보출력(과목 과목정보) {
        System.out.println("[과목정보]");
        System.out.println("과목명: " + 과목정보.과목명);
        System.out.println("[선생정보]");
        System.out.println("선생이름: " + 과목정보.담당선생님.이름);
        System.out.println("선생나이: " + 과목정보.담당선생님.나이);
    }

    // 학생 전체 정보 출력
    public void 학생전체출력(학생[] 학생목록) {
        System.out.println("[학생정보 전체조회]");
        if (학생목록 == null) return;
        for (학생 개별학생 : 학생목록) {
            if (개별학생 == null) continue;
            학생정보출력(개별학생);
        }
    }

    // 개별 학생 정보 출력
    public void 학생정보출력(학생 개별학생) {
        System.out.println("[학생정보]");
        System.out.println("학번: " + 개별학생.학번);
        System.out.println("학생이름: " + 개별학생.이름);
        System.out.println("학생나이: " + 개별학생.나이);
    }
}
