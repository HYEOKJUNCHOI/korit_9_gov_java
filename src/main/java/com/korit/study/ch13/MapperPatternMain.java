//package com.korit.study.ch13;
//
//public class MapperPatternMain {
//    public static void main(String[] args) {
//        // Mapper Pattern
//        // 자바 디자인 패턴
//        // https://refactoring.guru/ko/design-patterns
//        // 서로 매칭시켜서 객체를 변환하기
//
//        클라이언트에서받은객체 a = new 클라이언트에서받은객체();
//        a.username = "test1234"; //아이디: 키값 , username
//        a.password = "1q2w3e4r";
//        a.fullName = "김준일"; // 실제 사용자 이름
//        a.email = "test@gmail.com";
//
//
////        데이터베이스에보낼객체 b = new 데이터베이스에보낼객체();
////        //서로 매칭시켜서 매핑
////        b.username = a.username;
////        b.password = a.password;
////        b.name = a.fullName;
////        b.email = a.email;
//
//
//        /*
//        *
//        *
//            데이터베이스에보낼객체 to() {
//            데이터베이스에보낼객체 a = new 데이터베이스에보낼객체();
//            a.username = username;
//            a.password = password;
//            a.name = fullName;
//            a.email = email;
//
//            return a;
//
//             }
//
//
//*/
//
//        데이터베이스에보낼객체 c = a.to();
//    }
//}