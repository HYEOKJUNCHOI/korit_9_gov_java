package com.korit.study.ch03;

import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = scanner.next();
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        System.out.print("국어 점수를 입력하세요: ");
        double 국어 = scanner.nextDouble();
        System.out.print("영어 점수를 입력하세요: ");
        double 영어 = scanner.nextDouble();
        System.out.print("수학 점수를 입력하세요: ");
        double 수학 = scanner.nextDouble();
        System.out.print("자기 소개를 입력하세요 : ");
        System.out.print(scanner.nextLine());
        String 자기소개 = scanner.nextLine();
        double 평균점수 = (국어 + 영어 + 수학) / 3;

        String 몇학년 = age >= 17 ? "고등학교 1학년" :
                age >= 18 ? "고등학교 2학년" :
                age >= 19 ? "고등학교 3학년" : "오류";

        String 학점 = 평균점수 >= 95 ? "A+" :
                평균점수 >= 90 ? "A" :
                        평균점수 >= 85 ? "B+":
                                평균점수 >= 80 ? "B":
                                        평균점수 >= 75 ? "C+":
                                                평균점수 >= 70 ? "C":
                                                    평균점수 >= 65 ? "D+":
                                                    평균점수 >= 60 ? "D": "F";

        System.out.println("=== 학생 정보 ===");
        System.out.println("이름 : " + name);
        System.out.println("나이  : " + age + " (" + 몇학년 + ")");
        System.out.println("성적 :");
        System.out.println("  국어 : " + 국어);
        System.out.println("  영어 : " + 영어);
        System.out.println("  수학 : " + 수학);
        System.out.println("  평균 : " + 평균점수 + "(학점 : "+ 학점+")");
        System.out.println("자기소개: " + 자기소개);

////        System.out.println("=== 학생 정보 ===");
////      System.out.println(String.format("""
////                        이름:%s
////                      나이: %d세 (고등학교 2학년)
////                      성적:
////                      국어: %.2f점
////                      영어: %.2f점
////                      수학: %.2f점
////                      평균: %.2f점 (학점: %s)
////                      자기소개: %s""", name,age,국어,영어,수학,평균점수,학점,자기소개));

}
}