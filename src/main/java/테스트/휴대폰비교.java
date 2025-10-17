package 테스트;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class 휴대폰비교 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance(Locale.KOREA);

        System.out.println("=== 📱 자급제 vs 통신사 vs 선택약정 비교 계산기 ===\n");

        // ===== 기본 입력 =====
        System.out.print("출고가 (만원 단위 입력): ");
        double 출고가 = sc.nextDouble() * 10_000;

        System.out.print("통신사 기기값 (만원 단위 입력): ");
        double 기기값 = sc.nextDouble() * 10_000;

        System.out.print("6개월 요금제 금액: ");
        double 요금제6 = sc.nextDouble();

        System.out.print("이후 18개월 요금제 금액: ");
        double 요금제18 = sc.nextDouble();

        System.out.print("부가옵션 포함 여부 (0=O / 1=X): ");
        int 옵션여부 = sc.nextInt();
        double 옵션가 = 0;

        if (옵션여부 == 0) {
            System.out.print("부가옵션 금액 입력 (예: 14900): ");
            옵션가 = sc.nextDouble();
            요금제6 -= 옵션가;
            요금제18 -= 옵션가;
        }

        System.out.print("할인율 적용 여부 (0=O / 1=X): ");
        int 할인여부 = sc.nextInt();
        double 할인율 = 0;
        if (할인여부 == 0) {
            System.out.print("할인율 입력 (예: 30): ");
            할인율 = sc.nextDouble();
        }

        System.out.print("알뜰폰 기본 요금제 (예: 20000): ");
        double 알뜰폰요금 = sc.nextDouble();

        System.out.print("알뜰폰 부가서비스 요금 (없으면 0 입력): ");
        double 알뜰폰옵션 = sc.nextDouble();

        // 선택약정 할부 개월 입력
        System.out.print("선택약정 할부 기간 (개월 단위, 예: 24): ");
        int 선택약정할부개월 = sc.nextInt();

        // ===== 기본 계산 =====
        double 할인후요금제6 = 요금제6 * (1 - 할인율 / 100);
        double 할인후요금제18 = 요금제18 * (1 - 할인율 / 100);

        double 통신사총액 = 기기값 + (할인후요금제6 * 6) + (할인후요금제18 * 18) + (옵션가 * 24);
        double 자급제총액 = 출고가 + ((알뜰폰요금 + 알뜰폰옵션) * 24);

        // ===== 선택약정 계산 =====
        double 선택약정이자 = 출고가 * 0.038;
        double 선택약정총액 = 출고가 + 선택약정이자;
        double 선택약정월할부 = 선택약정총액 / 선택약정할부개월;

        // 요금제 할인 (일반 + 선택약정 25%)
        double 선택약정요금제 = 요금제18 * (1 - 할인율 / 100) * 0.75;
        double 선택약정월부담 = 선택약정월할부 + 선택약정요금제;
        double 선택약정총지출 = (선택약정월부담 * 선택약정할부개월);

        // ===== 평균 계산 =====
        int 통신사월평균 = (int) Math.round(통신사총액 / 24);
        int 자급제월평균 = (int) Math.round(자급제총액 / 24);
        int 선택약정월평균 = (int) Math.round(선택약정총지출 / 24);

        // ===== 결과 출력 =====
        System.out.println("\n===============================");
        System.out.println("💰 [24개월 총 지출 비교]");
        System.out.println("① 자급제 + 알뜰폰 : " + nf.format((int) 자급제총액) + "원");
        System.out.println("② 통신사 약정형 : " + nf.format((int) 통신사총액) + "원");
        System.out.println("③ 선택약정형 : " + nf.format((int) 선택약정총지출) + "원");
        System.out.println("-------------------------------");
        System.out.println("🏁 초기지출");
        System.out.println("자급제 : " + nf.format((int) 출고가) + "원");
        System.out.println("통신사 : " + nf.format((int) 기기값) + "원");
        System.out.println("선택약정 : 0원 (풀할부)");
        System.out.println("-------------------------------");
        System.out.println("📊 월평균 부담");
        System.out.println("자급제 : " + nf.format(자급제월평균) + "원");
        System.out.println("통신사 : " + nf.format(통신사월평균) + "원");
        System.out.println("선택약정 : " + nf.format(선택약정월평균) + "원");
        System.out.println("-------------------------------");
        System.out.println("💳 [선택약정 상세]");
        System.out.println("기기값 : " + nf.format((int) 출고가) + "원");
        System.out.println("할부이자(3.8%) : " + nf.format((int) 선택약정이자) + "원");
        System.out.println("총 납부액 : " + nf.format((int) 선택약정총액) + "원");
        System.out.println("할부기간 : " + 선택약정할부개월 + "개월");
        System.out.println("월 할부금 : " + nf.format((int) 선택약정월할부) + "원");
        System.out.println("요금제 (할인율 " + 할인율 + "% + 선택약정25%) : " + nf.format((int) 선택약정요금제) + "원");
        System.out.println("총 월 납부액 : " + nf.format((int) 선택약정월부담) + "원");
        System.out.println("-------------------------------");
        System.out.println("💬 요약");
        System.out.println("- 자급제 : 초기비용 큼, 월 요금 적음");
        System.out.println("- 통신사 : 초기비용 적음, 단기 유리");
        System.out.println("- 선택약정 : 초기비용, 요금제 25% 추가할인 + 할부이자 발생");
        System.out.println("===============================");
    }
}
