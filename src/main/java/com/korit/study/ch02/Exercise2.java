package com.korit.study.ch02;

public class Exercise2 {
    public static void main(String[] args) {

//        int level = 75;
//        int jobCode = 1;        // 1:전사, 2:마법사, 3:궁수, 4:도적
//        int equipGrade = 4;     // 1-5등급
//        int skillPoints = 95;
//
//// 테스트 케이스 2 (추가 테스트)
//// int level = 63, jobCode = 2, equipGrade = 5, skillPoints = 120;
//// int level = 42, jobCode = 4, equipGrade = 2, skillPoints = 60;

//        === 캐릭터 스탯 ===
//        직업: 전사 (Lv.75)
//        기본 능력치: 112
//        장비 보정: +56 (50% 보너스)
//        스킬 보너스: +56 (50% 보너스)
//        직업 특성 보너스: +45 (레벨 50+ 전사 20% 보너스)
//        최종 능력치: 269
//        전투력 등급: D
//
//        ### **계산 로직**
//
//        1. **기본 능력치**: 레벨 × 직업별 계수 (전사:1.5, 마법사:1.2, 궁수:1.3, 도적:1.1)
//        2. **장비 보정**: 등급별 보너스 (1등급:+0%, 2등급:+10%, 3등급:+25%, 4등급:+50%, 5등급:+100%)
//        3. **스킬 보너스**: 스킬포인트 10당 5% 추가 (최대 50%)
//        4. **직업 특성**:
//        - 전사: 레벨 50이상이면 20% 추가
//                - 마법사: 스킬포인트 80이상이면 30% 추가
//                - 궁수: 장비등급 4이상이면 25% 추가
//                - 도적: 레벨이 홀수면 15% 추가
//        5. **전투력 등급**: S(8000+), A(6000+), B(4000+), C(2000+), D(그 외)

        // 테스트 데이터
        int level = 75;
        int jobCode = 1;
        int equipGrade = 4;
        int skillPoints = 95;
//
//        // 직업별 계수 계산 (삼항 연산자 사용)
        double jobMultiplier =
                jobCode == 1 ? 1.5
                :jobCode == 2 ? 1.2
                :jobCode == 3? 1.3
                :jobCode == 4? 1.1:0;
//        1. **기본 능력치**: 레벨 × 직업별 계수 (전사:1.5, 마법사:1.2, 궁수:1.3, 도적:1.1)
//
        // 기본 능력치 계산
        int baseStats = (int)(level * jobMultiplier);
//
        // 장비 보정 계산 (%)
        double equipBonusRate = equipGrade == 1 ? + 0.0
                : (equipGrade == 2) ?  0.1
                : (equipGrade == 3) ?  0.25
                : (equipGrade == 4) ?  0.5
                : (equipGrade == 5) ? 1.0 : 0.0;
        double equipBonus = (int)(baseStats * equipBonusRate);
// 2. **장비 보정**: 등급별 보너스 (1등급:+0%, 2등급:+10%, 3등급:+25%, 4등급:+50%, 5등급:+100%)

        // 스킬 보너스 계산 (최대 50%)
        double skillPointsRate = (skillPoints / 10 * 0.05); // 스킬포인트 10당 5%증가
        double skillPointsBonusRate = (skillPointsRate >= 0.5 ? 0.5 : skillPointsRate);
        // 스킬포인트 제한걸기 0.5(50%) 이상이면 0.5 / 아니면 그냥 계산

        double skillPointsBonus = baseStats * skillPointsBonusRate;
//        3. **스킬 보너스**: 스킬포인트 10당 5% 추가 (최대 50%)
        //
        // 직업 특성 보너스 계산
        double jobSpecialBonus = jobCode == 1 && level >= 50 ? baseStats * 0.2
                : jobCode == 2 && skillPoints >= 80 ?  baseStats * 0.3
                : jobCode == 3 && equipGrade >= 4 ?  baseStats * 0.25
                : jobCode == 4 && (level % 2 != 0) ?  baseStats * 0.15 : 0.0 ;

//   4. **직업 특성**:
////        - 전사: 레벨 50이상이면 20% 추가
////                - 마법사: 스킬포인트 80이상이면 30% 추가
////                - 궁수: 장비등급 4이상이면 25% 추가
////                - 도적: 레벨이 홀수면 15% 추가

//        // 최종 능력치 계산
        double totalStats = baseStats + equipBonus + skillPointsBonus + jobSpecialBonus;
//
//        // 전투력 등급 계산
//        String combatRank = ?;
//
//        // 직업명 계산   // 1:전사, 2:마법사, 3:궁수, 4:도적
        String jobName =
                (jobCode == 1) ? "전사"
                : (jobCode == 2) ? "마법사"
                : (jobCode == 3) ? "궁수"
                : (jobCode == 4) ? "도적"
                : "없는 직업";

//        // 결과 출력
        System.out.println("=== 캐릭터 스탯 ===");
        System.out.println("직업: " + jobName + "(Lv." + level +")");
        System.out.println("기본능력치: " + baseStats);
        System.out.println("장비보정: " + (int)(equipBonus) + " (+" + (int)(equipBonusRate * 100)+ "%)");
        System.out.println("스킬 보너스: " + (int)(skillPointsBonus) + " (+" + (int)(skillPointsBonusRate * 100)+ "%)");
        System.out.println("직업 특성 보너스: " + (int)(jobSpecialBonus));
        System.out.println("최종 능력치: " + (int)(totalStats));

//        // 출력 구현

    }
}
