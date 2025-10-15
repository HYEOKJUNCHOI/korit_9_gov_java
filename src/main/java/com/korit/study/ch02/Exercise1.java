package com.korit.study.ch02;

public class Exercise1 {
    public static void main(String[] args) {
        //삼항연산자 연습문제
//문제 1: 복잡한 급여 계산 시스템
//🎯 문제
//주어진 변수값들로 복잡한 급여 계산 시스템을 삼항 연산자만을 사용하여 구현하세요.
//테스트 케이스
//Copy// 테스트 케이스 1
//int baseSalary = 4000000;    // 기본급
//int workYears = 12;          // 근무년수
//int position = 3;            // 직급코드 (1:사원, 2:대리, 3:과장, 4:부장)
//int overtimeHours = 15;      // 야근시간
//
//// 테스트 케이스 2 (추가로 테스트해볼 값들)
//// int baseSalary = 3500000, workYears = 18, position = 4, overtimeHours = 8;
//// int baseSalary = 2800000, workYears = 5, position = 2, overtimeHours = 25;
//
//​
//계산 로직
//직급수당: 사원(0), 대리(50만), 과장(100만), 부장(200만)
//연차수당: 3년 미만(0%), 3-7년(5%), 7-15년(10%), 15년 이상(20%)
//야근수당: 10시간 이하(시간당 1만원), 초과시(시간당 1.5만원)
//세금: 총급여 500만원 이하(10%), 초과시(15%)
//특별보너스: 부장이면서 15년 이상 근무시 50만원 추가
//예상 출력
//=== 급여 명세서 ===
//기본급: 4,000,000원 ===========
//직급: 과장 ==============
// 직급수당: 1,000,000원 ====================
//연차수당: 400,000원 (10%)
//야근수당: 175,000원 (기본 10시간 + 초과 5시간)
//특별보너스: 0원
//총 지급액: 5,575,000원
//세금(15%): 836,250원
//실수령액: 4,738,750원

                        // 테스트 데이터
                int baseSalary = 2500000;
        int workYears = 8;
        int position = 2;
        int overtimeHours = 11;
        int overoverTime = (overtimeHours -10) < 0 ? 0 : (overtimeHours-10);
        // 오버타임이 0보다 작으면 0이야? 그럼 0 , 그외는 오버타임-10

//
//        // 여기에 삼항 연산자를 사용한 계산 로직을 작성하세요
//        // 직급수당 계산
        int positionAllowance = (position == 1) ? 0
        : (position == 2) ?  500000
        : (position == 3) ?  1000000
        : (position == 4) ?  2000000 : 0;
        //직급수당: 사원(0), 대리(50만), 과장(100만), 부장(200만)

        // 연차수당 계산 (기본급 기준 %)
        int yearAllowance = (workYears < 3) ? baseSalary * 0
                : (workYears < 7 ) ? baseSalary * 5 / 100
                : (workYears < 15 ) ? baseSalary * 10 / 100
                : baseSalary  * 20 / 100;
//연차수당: 3년 미만(0%), 3-7년(5%), 7-15년(10%), 15년 이상(20%)

//        // 야근수당 계산
        boolean isOverTime = overtimeHours - 10 > 0 ;
        int baseOvertime = overtimeHours - 10 > 0 ? 10 : overtimeHours;
        int overTime = overtimeHours - 10 > 0 ? overtimeHours - 10 : 0;
        int overtimePayment = isOverTime ? ((overtimeHours -10) * 15000) + (10 * 10000) : overtimeHours * 10000 ;
        // 특별보너스 계산
        int specialBonus = position == 4 && workYears >= 15 ? 500000 : 0; //특별보너스: 부장이면서 15년 이상 근무시 50만원 추가
//
        // 총 지급액 계산
        int totalSalary = baseSalary + positionAllowance + yearAllowance + overtimePayment + specialBonus;
//
//        // 세금 계산
//        double taxRate = totalSalary <= 5000000 ?  0.1 : 0.15;
        // 세금 Rate
//        int tax = totalSalary <= 5000000 ?  totalSalary*taxRate : totalSalary * 15 / 100;
//
//
        // 실수령액 계산
//        int finalSalary = totalSalary-tax;

                // 직급명 출력용
                String positionName = (position == 1) ? "사원"
                : (position == 2) ? "대리"
                : (position == 3) ? "과장"
                : (position == 4) ? "부장"
                : "직급 코드 오류"; //(1:사원, 2:대리, 3:과장, 4:부장)

                // 결과 출력
                System.out.println("=== 급여 명세서 ===");
                System.out.println("기본급: " + String.format("%,d", baseSalary) + "원");
                System.out.println("직급: " + positionName);
                System.out.println("직급수당: " + String.format("%,d", positionAllowance) + "원");
                System.out.println("연차수당: " + String.format("%,d", yearAllowance)+ "원");
                System.out.println("초과수당: " + String.format("%,d", overtimePayment)+ "원");
                System.out.println("특별보너스: " + String.format("%,d", specialBonus) + "원");
                System.out.println(String.format("특별보너스: %,d", specialBonus) + "원");
                System.out.println("총 지급액: " + String.format("%,d",totalSalary)+"원") ;
//                System.out.println("세금(15%): " + tax);
//                System.out.println("실수령액: " + finalSalary);

                // 나머지 출력 구현
    }
}