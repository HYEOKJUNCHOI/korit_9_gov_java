package com.korit.study.테스트;

import java.util.Scanner;

public class ETHU {
    private static int qty = 155;              // 기본 수량
    private static int avgPrice = 124930;      // 기본 평단
    private static int taxFreeLimit = 1500000; // 비과세 한도(원)
    private static long defaultDebt = 8804;    // 기본 부채(만원 단위)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nETHU 현재가 입력 (0 입력시 종료): ");
            long currentPrice = sc.nextLong();
            if (currentPrice == 0) break;

            // 수량 변경
            System.out.print("수량 변동 있습니까? (0=없음, 1=있음): ");
            if (sc.nextInt() == 1) {
                System.out.print("변경된 수량 입력: ");
                qty = sc.nextInt();
            }

            // 평단 변경
            System.out.print("평단 변경 있습니까? (0=없음, 1=있음): ");
            if (sc.nextInt() == 1) {
                System.out.print("변경된 평단 입력: ");
                avgPrice = sc.nextInt();
            }

            // 비과세 변경
            System.out.print("비과세 금액 변경 있습니까? (0=없음, 1=있음): ");
            if (sc.nextInt() == 1) {
                System.out.print("변경된 비과세 금액 입력(원): ");
                taxFreeLimit = sc.nextInt();
            }

            // ===== 계산 (원 단위) =====
            long totalAmount   = currentPrice * qty;                 // 총 평가액
            long principal     = (long) avgPrice * qty;              // 원금
            long profit        = (currentPrice - avgPrice) * qty;    // 총 수익
            long taxable       = Math.max(profit - taxFreeLimit, 0); // 과세 수익
            long taxFreeApplied= Math.max(0, Math.min(profit, taxFreeLimit)); // 표시용(음수 방지)
            long afterTaxProfit= Math.round(taxable * 0.78) + Math.min(profit, taxFreeLimit); // 세후 수익(손실 허용)
            long netAmount     = principal + afterTaxProfit;         // 세후 총액

            // ===== 출력 (만원 단위) =====
            System.out.println("\n================ 계산 결과 (만원 단위) ================");
            System.out.println("총 평가액      : " + String.format("%,d", totalAmount / 10_000) + "만원");
            System.out.println("원금           : " + String.format("%,d", principal / 10_000) + "만원");
            System.out.println("총 수익        : " + String.format("%,d", profit / 10_000) + "만원");
            System.out.println("비과세         : " + String.format("%,d", taxFreeApplied / 10_000) + "만원");
            System.out.println("과세 수익      : " + String.format("%,d", taxable / 10_000) + "만원");
            System.out.println("세후 수익      : " + String.format("%,d", afterTaxProfit / 10_000) + "만원");
            System.out.println("✅ 세후 총액    : " + String.format("%,d", netAmount / 10_000) + "만원");
            System.out.println("====================================================");

            // 추가 자산
            System.out.print("추가할 자산이 있습니까? (만원 단위, 0=없음): ");
            long addAsset = sc.nextLong();
            long finalTotal = netAmount / 10_000; // 만원 단위 누적
            if (addAsset > 0) {
                finalTotal += addAsset;
                System.out.println("📈 추가 자산 포함 총액: " + String.format("%,d", finalTotal) + "만원");
            }

            // 부채 (기본값 8804 → 변경 여부 먼저)
            System.out.println("현재 자산에서 부채 기본값은 " + defaultDebt + "만원 입니다.");
            System.out.print("변화 있습니까? (0=없음, 1=있음): ");
            long change = sc.nextLong();

            long debt = defaultDebt;
            if (change == 1) {
                System.out.print("새로운 부채 금액 입력 (만원 단위, 예: 8804 → 8,804만원): ");
                debt = sc.nextLong();
            }

            long netAfterDebt = finalTotal - debt;
            System.out.println("📉 부채 차감 후 최종 자산: " + String.format("%,d", netAfterDebt) + "만원");
        }

        sc.close();
    }
}