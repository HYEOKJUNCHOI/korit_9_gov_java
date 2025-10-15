package com.korit.study.ch03;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("고객 ID를 입력하세요 : ");
        String id = scanner.next();

        System.out.print("상품코드를 입력하세요 : ");
        String 상품코드 = scanner.next();
        scanner.nextLine();

        System.out.print("상품명을 입력하세요 : ");
        String 상품명 = scanner.nextLine();

        System.out.print("수량을 입력하세요 : ");
        int 수량 = scanner.nextInt();

        System.out.print("단가를 입력하세요 : ");
        int 단가 = scanner.nextInt();

        System.out.print("우편번호를 입력하세요 : ");
        int 우편번호 = scanner.nextInt();
        scanner.nextLine();

        int 상품총액 = 단가 * 수량;
        int 배송비금액 = 상품총액 >= 30000 ? 0 : 3000;
        int 최종금액계산 = 상품총액 + 배송비금액;

        System.out.print("주소를 입력하세요 : ");
        String 주소 = scanner.nextLine();

        String 배송비한글 = 상품총액 >= 30000 ? "무료배송" : 3000 + "원";


        //// 출력
        System.out.println("=== 주문 확인서 ===");
        System.out.println("고객 ID : " + id );
        System.out.println("상품 정보 : ");
        System.out.println( "상품 코드 : " + 상품코드 );
        System.out.println( "상품명 : " + 상품명 );
        System.out.println( "수량 : " + 수량 );
        System.out.println( "단가 : " + 단가 + "원"+ "x" + 수량 + "개 = " + 상품총액 + "원" );
        System.out.println("배송 정보 : ");
        System.out.println( "우편번호 : " + 우편번호 );
        System.out.println( "주소 : " + 주소 );
        System.out.println( "배송비 : " + 배송비한글 );
        System.out.println( "최종 금액 : "+ 최종금액계산);


//        package com.korit.study.ch03;
//
//import java.util.Scanner;
//
//        public class OnlineShoppingSystem {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.println("=== 고객 정보 입력하기 ====");
//
//                System.out.print("고객 ID를 입력하세요: ");
//                String iD = scanner.nextLine();
//
//                System.out.print("상품코드를 입력하세요: ");
//                String productCode = scanner.nextLine();
//
//                System.out.print("상품명을 입력하세요: ");
//                String productName = scanner.nextLine();
//
//                System.out.print("상품의 구매 수량을 입력하세요: ");
//                int purchaseQuantity = scanner.nextInt();
//                scanner.nextLine();
//
//                System.out.print("상품의 단가를 입력하세요: ");
//                int purchasePrice = scanner.nextInt();
//                scanner.nextLine();
//
//                System.out.print("배송받을 우편번호를 입력하세요: ");
//                int postNumber = scanner.nextInt();
//                scanner.nextLine();
//
//                System.out.print("배송받을 주소를 입력하세요: ");
//                String address = scanner.nextLine();
//
//                scanner.close();
//
//                System.out.println("");
//                System.out.println("");
//                System.out.println("===== 계산 로직에 따른 결과 =====");
//
//                // 총 상품 가격 = 단가 * 수량
//                int totalProductPrice = purchasePrice * purchaseQuantity;
//                System.out.println("고객께서 주문하신 총 상품의 가격 합계는: " + totalProductPrice + "입니다.");
//
//                // 배송비: 3만원 이상 구매시 무료, 미만시 3000원 부과
//                int purchaseFee = totalProductPrice >= 30000 ? 0 : 3000;
//
//                // 최종 금액 = 상품 가격 + 배송비
//                int finalTotalProductPrice = totalProductPrice + purchaseFee;
//
//                System.out.println("");
//                System.out.println("");
//                System.out.println("===== 주문 확인서 =====");
//
//                System.out.println("고객 ID: " + iD);
//
//                System.out.println("상품 정보: ");
//                System.out.println("    -  상품코드: " + productCode);
//                System.out.println("    -  상품명: " + productName);
//                System.out.println("    -  단가: " + purchasePrice + "원 * " + purchaseQuantity + "개 = " + totalProductPrice + "원");
//
//                System.out.println("배송 정보: ");
//                System.out.println("    -  우편번호: " + postNumber);
//                System.out.println("    -  주소: " + address);
//
//                String comment = totalProductPrice >= 30000 ? "무료 (3만원 이상 구매)" : "3000원";
//                System.out.println("    -  배송비: " + comment);
//
//                System.out.println("총 결제 금액: " + finalTotalProductPrice + "원");
//            }
//        }


    }
}
