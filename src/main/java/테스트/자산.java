package 테스트;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class 자산 {

    // ===== 기본값 =====
    static final double XRP_수량 = 10_000;
    static final double XRP_평단 = 3_699.5;
    static final double XRPT_수량 = 680;
    static final double XRPT_평단 = 21_850;
    static final double ETHU_수량 = 155;
    static final double ETHU_평단 = 124_932;

    // ===== 기준 시세 (전 미장 종가 기준) =====
    static final double ETH_기준가 = 5_777_000;   // ETH 지난 종가
    static final double XRP_기준가 = 3_674;        // XRP 지난 종가

    // ===== 기타 =====
    static final double 부채 = 88_040_000;   // 원
    static final double 수수료율 = 0.004;     // 0.4%
    static final double 세율 = 0.22;          // 22%

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            NumberFormat won = NumberFormat.getInstance(Locale.KOREA);

            // ===== 사용자 입력 =====
            System.out.print("현재 ETH 가격 입력 (만원 단위, 예: 620):::: ");
            double eth가격_만원 = readDoubleSafe(sc);
            double eth가격 = eth가격_만원 * 10_000;

            System.out.print("현재 XRP 가격 입력 (원, 예: 3800):::: ");
            double xrp가격 = readDoubleSafe(sc);

            System.out.print("비과세 금액 입력 (만원 단위, 예: 200):::: ");
            double 비과세_만원 = readDoubleSafe(sc);
            double 비과세금액 = 비과세_만원 * 10_000;

            // ===== ETF 자동 예측 =====
            double eth상승률 = ((eth가격 - ETH_기준가) / ETH_기준가) * 2;   // ETHU 2배
            double xrp상승률 = ((xrp가격 - XRP_기준가) / XRP_기준가) * 2;   // XRPT 2배

            double ETHU평가금 = (ETHU_수량 * ETHU_평단) * (1 + eth상승률);
            double XRPT평가금 = (XRPT_수량 * XRPT_평단) * (1 + xrp상승률);
            double XRP현물평가금 = xrp가격 * XRP_수량;

            // ===== 수수료 반영 =====
            double feeFactor = 1.0 - 수수료율;
            double ETHU_수수료후 = ETHU평가금 * feeFactor;
            double XRPT_수수료후 = XRPT평가금 * feeFactor;
            double XRP_수수료후 = XRP현물평가금 * feeFactor;

            // ===== 과세 구간 (ETF만 해당) =====
            double 과세원금 = (ETHU_수량 * ETHU_평단) + (XRPT_수량 * XRPT_평단);
            double 과세평가합 = ETHU_수수료후 + XRPT_수수료후;
            double 과세수익 = 과세평가합 - 과세원금;

            // ===== 비과세 구간 (현물 XRP) =====
            double 비과세원금 = XRP_수량 * XRP_평단;
            double 비과세수익 = XRP_수수료후 - 비과세원금;

            // ===== 세금 계산 =====
            double 과세표준 = Math.max(과세수익 - 비과세금액, 0);
            double 세금 = 과세표준 * 세율;

            // ===== 최종 실수령 =====
            double 실수령액 = (과세평가합 - 세금) + XRP_수수료후;
            double 총원금 = 과세원금 + 비과세원금;
            double 총수익 = 실수령액 - 총원금;
            double 최종잔액 = 실수령액 - 부채;
            int 수익률 = (int)Math.round((총수익 / 총원금) * 100);

            // 반올림 (소수점 제거)
            long ETHU평가금_r = Math.round(ETHU평가금);
            long XRPT평가금_r = Math.round(XRPT평가금);
            long XRP현물평가금_r = Math.round(XRP현물평가금);
            long 세금_r = Math.round(세금);
            long 실수령액_r = Math.round(실수령액);
            long 총수익_r = Math.round(총수익);
            long 최종잔액_r = Math.round(최종잔액);
            long 총원금_r = Math.round(총원금);

            // ===== 결과 출력 =====
            System.out.println("\n──────────────────────────────────────");
            System.out.println("[📊 자동 실수령 계산 결과]");
            System.out.printf("ETHU 상승률: %.2f%% | XRPT 상승률: %.2f%%%n", eth상승률 * 50, xrp상승률 * 50);
            System.out.println("──────────────────────────────────────");
            System.out.printf("총 평가금액: %s원%n", won.format(ETHU평가금_r + XRPT평가금_r + XRP현물평가금_r));
            System.out.printf("총 원금: %s원%n", won.format(총원금_r));

            System.out.println("\n[💰 세금 구조]");
            System.out.printf("비과세 금액: %s원%n", won.format(Math.round(비과세금액)));
            System.out.printf("과세 표준: %s원%n", won.format(Math.round(과세표준)));
            System.out.printf("세금 (22%%): %s원%n", won.format(세금_r));

            System.out.println("\n[📈 최종 결과]");
            System.out.printf("세금·수수료 반영 후 실수령액: %s원%n", won.format(실수령액_r));
            System.out.printf("부채 차감 후 잔액: %s원%n", won.format(최종잔액_r));
            System.out.printf("💰 총 수익: %s원 (%d%%)%n", won.format(총수익_r), 수익률);

            if (최종잔액_r > 0) {
                System.out.printf("✅ 부채 상환 후 약 %s원이 남습니다.%n", won.format(최종잔액_r));
            } else if (최종잔액_r < 0) {
                System.out.printf("⚠️ 부채 상환 후 약 %s원이 부족합니다.%n", won.format(Math.abs(최종잔액_r)));
            } else {
                System.out.println("➖ 부채 상환 후 딱 0원입니다.");
            }
            System.out.println("──────────────────────────────────────");
        }
    }

    // 안전 입력 처리
    private static double readDoubleSafe(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim().replace(",", "");
            if (line.isEmpty()) {
                System.out.print("숫자를 입력하세요: ");
                continue;
            }
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.print("숫자 형식이 아닙니다. 다시 입력: ");
            }
        }
    }
}
