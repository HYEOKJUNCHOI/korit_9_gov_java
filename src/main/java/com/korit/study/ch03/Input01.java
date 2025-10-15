package com.korit.study.ch03;

import java.io.InputStream;
import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
       InputStream inputStream = System.in;
        Scanner s = new Scanner(inputStream); // s라는 변수를 선언했다?
        String str = s.nextLine(); // 입력 > 엔터 > 실행
        System.out.println(String.format("입력값: %s",str));
        s.nextLine(); // 엔터입력을 캔슬시켜주는 코드
        String address = s.nextLine();
        System.out.println(String.format("주소: " + address));

//      키보드 >> 컴퓨터 >> 출력
//             ㄴ이벤트 발생 //  ㄱ ㅣ ㅁ 을 모아주는게 System.in
//      next() > 버퍼에 있는걸 꺼내서 입력해라 / next[버퍼에 있는거] > 꺼내서 입력되면 , 버퍼는 [  ] 비어짐 / 엔터도 키보드입력
//      스페이스 or 엔터앞까지것을 짤라서 가져옴 // next() 앞쪽에 스페이스바는 무시하고 들고옴
//      s.nextLine()은 엔터앞 스페이스바를 포함해서 가져옴
//

    }
}