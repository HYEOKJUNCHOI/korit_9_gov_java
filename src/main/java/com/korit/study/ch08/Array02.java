package com.korit.study.ch08;

import com.sun.source.tree.StringTemplateTree;

public class Array02 {
    public static void main(String[] args) {

        String[] 사원ID배열 = new String[] {"E1001","E1002","E1003","E1004"};
        String[] 이름배열 = new String[] {"김민준", "이서연", "박지훈", "최애나"};
        String[] 부서배열 = new String[] {"영업팀", "마케팅팀", "개발팀", "인사팀"};
        String[] 직급배열 = new String[] {"사원", "대리", "과장", "차장"};

        String name = "이서연";

        int foundIndex = -1;

        for (int i = 0; i < 이름배열.length ; i++) {
            if (name == 이름배열[i]) {
                foundIndex = i;
                break;
            }
        }

        System.out.println(foundIndex);

//
//        printInfo(사원ID배열, 이름배열 , 부서배열 , 직급배열, 0);

    }


    public static void printInfo(String[] 사원ID배열, String[] 이름배열, String[] 부서배열, String[] 직급배열,int index) {

//        System.out.println(String.format(
//        System.out.printf();
        // 차이

        String text = String.format("""
                사원ID: %s
                이름: %s
                부서: %s
                직급: %s
                """,사원ID배열[index], 이름배열[index], 부서배열[index], 직급배열[index]);

        System.out.println(text);

        System.out.printf("""
                사원ID: %s
                이름: %s
                부서: %s
                직급: %s
                """, 사원ID배열[index], 이름배열[index], 부서배열[index], 직급배열[index]);

    }
}
