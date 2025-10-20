package com.korit.study.테스트;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class 아파트매도 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance(Locale.KOREA);

        System.out.print("아파트 매도가가 얼마입니까? (예: 4억 → 40, 3.5억 → 35) : ");
        long sellInput = sc.nextLong();

        // ✅ 입력 단위: (억 × 10) 을 정수로 입력 → 실매도가 = 입력값 × 10,000,000
        long sellPrice = sellInput * 10_000_000L;

        // 고정값(필요 시 수정)
        final long loan = 272_000_000L;     // 대출잔액 2.72억
        final long registry = 4_500_000L;   // 등기 450만
        final long rentGap = 19_500_000L;   // 월세-대출차액(5년 가정) 1,950만
        final double brokerFeeRate = 0.01;  // 복비 1%
        final double friendShare = 0.10;    // 친구 지분 10%
        final long baseCost = 300_000_000L; // 매입가(예시: 3억)

        // 계산
        long remainAfterLoan = sellPrice - loan;
        long brokerFee = Math.round(sellPrice * brokerFeeRate);

        // 총차익(매입가+등기 기준). 마이너스면 친구몫 0원 처리
        long totalProfit = sellPrice - (baseCost + registry);
        long friendProfit = Math.round(Math.max(0, totalProfit) * friendShare);

        long afterBroker = remainAfterLoan - brokerFee;
        long afterFriend = afterBroker - friendProfit;

        long finalNet = afterFriend;                               // 최종 실수령(양도세 제외)
        long finalRealProfit = afterFriend - registry - rentGap;   // 등기+보유부담 반영 순수익

        // 출력(기본)
        System.out.println("\n📊 [결과]");
        System.out.println("매도가: " + nf.format(sellPrice) + "원");
        System.out.println("대출 상환 후 남는 금액: " + nf.format(remainAfterLoan) + "원");
        System.out.println("복비 차감: " + nf.format(brokerFee) + "원");
        System.out.println("친구 몫 차감: " + nf.format(friendProfit) + "원");
        System.out.println("✅ 최종 실수령액 (양도세 제외): " + nf.format(finalNet) + "원");
        System.out.println("📉 등기비 + 월세 부담 반영 후 실제 순수익: " + nf.format(finalRealProfit) + "원");

        // =======================
        // ✅ 세입자 보증금 차감
        // =======================
        long deposit = 30_000_000L; // 기본값 3,000만원
        System.out.println("\n세입자 보증금 기본 공제액은 " + nf.format(deposit) + "원입니다.");
        System.out.print("세입자 보증금에 변화가 있습니까? (0=없음, 1=있음): ");
        int depChange = sc.nextInt();
        if (depChange == 1) {
            System.out.print("변화된 보증금을 입력해주세요 (원 단위): ");
            deposit = sc.nextLong();
        }

        long finalAfterDeposit = finalRealProfit - deposit;
        System.out.println("🏁 세입자 보증금 차감 후 최종 수익: " + nf.format(finalAfterDeposit) + "원");

        sc.close();
    }
}
