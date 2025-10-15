import java.util.Scanner;

public class Array05 {

    public static void main(String[] args) {
        String[] products = {
                "아이폰17", "아이폰17 플러스", "아이폰17 프로", "아이폰17 프로 맥스",
                "아이폰17 미니", "아이폰17 SE", "아이폰17 울트라", "아이폰17 라이트",
                "아이폰17 맥스", "아이폰17 에어"
        };

        int[] prices = {
                1290000, 1390000, 1690000, 1890000,
                1090000, 990000, 1990000, 1190000,
                1490000, 1590000
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("모델명 검색: ");
        String keyword = scanner.nextLine();

        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(keyword)) {
                System.out.printf("%s → %,d원%n", products[i], prices[i]);
                return; // ✅ 찾았으면 바로 프로그램 종료
            }
        }

        // 여기까지 내려왔다는 건 하나도 못 찾았다는 뜻
        System.out.println("해당 모델을 찾을 수 없습니다.");
    }
}
