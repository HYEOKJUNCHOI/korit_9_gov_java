package 테스트;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class 휴대폰비교 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance(Locale.KOREA);

        System.out.println("=== 📱 자급제 vs 통신사 약정 비교 계산기 ===");
        System.out.print("출고가 (만원 단위 입력): ");
        double 출고가 = sc.nextDouble() * 10_000;

        System.out.print("통신사 기기값 (만원 단위 입력): ");
        double 기기값 = sc.nextDouble() * 10_000;

        System.out.print("6개월 요금제 금액: ");
        double 요금제6 = sc.nextDouble();

        System.out.print("이후 요금제 금액: ");
        double 요금제18 = sc.nextDouble();

        System.out.print("부가옵션 포함 여부 (O / X): ");
        String 옵션여부 = sc.next();

        double 옵션가 = 0;
        if (옵션여부.equalsIgnoreCase("O")) {
            System.out.print("부가옵션 금액 입력 (예: 14500): ");
            옵션가 = sc.nextDouble();
            // 옵션이 포함이면 옵션가를 빼고 계산
            요금제6 -= 옵션가;
            요금제18 -= 옵션가;
        }

        System.out.print("할인율 적용 여부 (O / X): ");
        String 할인여부 = sc.next();
        double 할인율 = 0;

        if (할인여부.equalsIgnoreCase("O")) {
            System.out.print("할인율 입력 (예: 30): ");
            할인율 = sc.nextDouble();
        }

        // 할인 적용
        요금제6 = 요금제6 * (1 - 할인율 / 100);
        요금제18 = 요금제18 * (1 - 할인율 / 100);

        // 계산 구간
        double 통신사총액 = 기기값 + (요금제6 * 6) + (요금제18 * 18) + (옵션가 * 24);
        double 자급제총액 = 출고가 + (20_000 * 24) + (옵션가 * 24);  // 알뜰폰은 2만원 고정

        // 비교
        double 차이 = 자급제총액 - 통신사총액;
        String 유리한쪽 = (차이 > 0) ? "통신사 약정이 유리함 👍" : "자급제가 유리함 💡";

        // 출력
        System.out.println("\n===============================");
        System.out.println("📱 통신사 약정 총비용 : " + nf.format(통신사총액) + "원");
        System.out.println("📱 자급제 + 알뜰폰 총비용 : " + nf.format(자급제총액) + "원");
        System.out.println("-------------------------------");
        System.out.println("💰 차이 : " + nf.format(Math.abs(차이)) + "원");
        System.out.println("👉 " + 유리한쪽);
        System.out.println("===============================");
    }
}
