package 테스트;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class 예상가 {

    // ====== [보유 수량 / 원금] ======
    static final int XRPT_보유수량 = 680;
    static final int ETHU_보유수량 = 155;
    static final long 원금 = 34_223_000L;

    // ====== [기준가(현재가) 설정] ======
    static final int XRP_기준가 = 4328;        // 원
    static final int XRPT_기준가 = 24112;      // 원

    static final int ETH_기준가 = 6_500_000;   // 원 (650만 원)
    static final int ETHU_기준가 = 214_412;    // 원

    // ====== [세율 / 수수료] ======
    static final double 세후계수 = 0.78;    // 세금 22%
    static final double 수수료계수 = 0.996; // 수수료 0.4%

    public static void main(String[] args) {
        Scanner 입력 = new Scanner(System.in);
        NumberFormat 통화 = NumberFormat.getNumberInstance(Locale.KOREA);

        System.out.println("[XRP/ETH 입력 → ETF 실수령 계산기]");
        System.out.print("XRP 예상 가격을 입력하세요(원 단위): ");
        double xrp가격 = 입력.nextDouble();

        System.out.print("이더리움 예상 가격을 입력하세요(만원 단위): ");
        double eth입력만원 = 입력.nextDouble();
        double eth가격 = eth입력만원 * 10_000; // 만원 단위를 원으로 변환

        // 1️⃣ 원자산 등락률 계산
        double xrp등락률 = (xrp가격 - XRP_기준가) / XRP_기준가;
        double eth등락률 = (eth가격 - ETH_기준가) / ETH_기준가;

        // 2️⃣ ETF 추정가 계산 (2배 ETF 기준)
        double xrpt추정가 = XRPT_기준가 * (1 + 2 * xrp등락률);
        double ethu추정가 = ETHU_기준가 * (1 + 2 * eth등락률);

        xrpt추정가 = Math.max(0, xrpt추정가);
        ethu추정가 = Math.max(0, ethu추정가);

        // 3️⃣ 평가금액 계산
        long xrpt평가 = Math.round(xrpt추정가 * XRPT_보유수량);
        long ethu평가 = Math.round(ethu추정가 * ETHU_보유수량);
        long 총평가 = xrpt평가 + ethu평가;

        // 4️⃣ 수수료 차감
        double 수수료차감총액 = 총평가 * 수수료계수;

        // 5️⃣ 수익 계산
        double 수익 = 수수료차감총액 - 원금;

        // 6️⃣ 세후 수익 계산
        double 세후수익 = (수익 > 0) ? 수익 * 세후계수 : 수익;
        double 최종실수령액 = (수익 > 0) ? (원금 + 세후수익) : 수수료차감총액;

        // 7️⃣ 출력
        System.out.println("\n===== 계산 결과 =====");
        System.out.println("입력 XRP 가격: " + 통화.format(Math.round(xrp가격)) + "원");
        System.out.println("입력 ETH 가격: " + 통화.format(Math.round(eth가격)) + "원");

        System.out.println("\n[ETF 추정가]");
        System.out.println("XRPT 추정가: " + 통화.format(Math.round(xrpt추정가)) + "원");
        System.out.println("ETHU 추정가: " + 통화.format(Math.round(ethu추정가)) + "원");

        System.out.println("\n[평가금액]");
        System.out.println("XRPT 평가: " + 통화.format(xrpt평가) + "원");
        System.out.println("ETHU 평가: " + 통화.format(ethu평가) + "원");
        System.out.println("총 평가금액: " + 통화.format(총평가) + "원");

        System.out.println("\n[수수료 / 세금 반영]");
        System.out.println("수수료 차감 후: " + 통화.format(Math.round(수수료차감총액)) + "원");
        System.out.println("수익: " + 통화.format(Math.round(수익)) + "원");

        if (수익 > 0) {
            System.out.println("세후 수익(22% 차감): " + 통화.format(Math.round(세후수익)) + "원");
            System.out.println("최종 실수령액: " + 통화.format(Math.round(최종실수령액)) + "원");
        } else {
            System.out.println("손실 구간 → 세금 없음");
            System.out.println("최종 실수령액: " + 통화.format(Math.round(최종실수령액)) + "원");
        }

        // 참고용 기준가 표시
        System.out.println("\n[기준가 참고]");
        System.out.println("XRP 기준가: " + 통화.format(XRP_기준가) + "원");
        System.out.println("ETH 기준가: " + 통화.format(ETH_기준가) + "원");
    }
}
