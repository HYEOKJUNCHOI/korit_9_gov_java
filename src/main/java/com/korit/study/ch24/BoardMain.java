package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardMain {
    public static void main(String[] args) {
        ///  {}를 열면 Map
        ///  []를 열면 List
        // 게시판
        /**
         * [
         *      {
         *          "title": "게시판 제목1",
         *          "writer": {
         *              "name": "김준일",
         *              "age": 32
         *          },
         *          "content": "게시판 내용1",
         *          "comments": [
         *              {
         *                  "writer": "김준이",
         *                  "content": "댓글 내용1"
         *              },
         *              {
         *                  "writer": "김준삼",
         *                  "content": "댓글 내용2"
         *              },
         *          ]
         *      },
         *      {
         *          "title": "게시판 제목2",
         *          "writer": {
         *              "name": "김준사",
         *              "age": 34
         *          },
         *          "content": "게시판 내용2",
         *          "comments": [
         *              {
         *                  "writer": "김준오",
         *                  "content": "댓글 내용11"
         *              },
         *              {
         *                  "writer": "김준육",
         *                  "content": "댓글 내용22"
         *              },
         *          ]
         *      },
         * ]
         */

                // 전체 게시판 리스트
                List<Map<String, Object>> boards = new ArrayList<>();

                // 게시물 1
                Map<String, Object> board1 = new HashMap<>();
                board1.put("제목", "게시판 제목1");
                board1.put("내용", "게시판 내용1");

                // 작성자 정보 (Map)
                Map<String, Object> writer1 = new HashMap<>();
                writer1.put("이름", "김준일");
                writer1.put("나이", 32);
                board1.put("작성자", writer1);

                // 댓글 리스트 (List<Map>)
                List<Map<String, Object>> comments1 = new ArrayList<>();

                Map<String, Object> comment1_1 = new HashMap<>();
                comment1_1.put("작성자", "김준이");
                comment1_1.put("댓글", "댓글내용1");
                comments1.add(comment1_1);

                Map<String, Object> comment1_2 = new HashMap<>();
                comment1_2.put("작성자", "김준삼");
                comment1_2.put("댓글", "댓글내용2");
                comments1.add(comment1_2);

                board1.put("댓글들", comments1);

                // 게시물 2
                Map<String, Object> board2 = new HashMap<>();
                board2.put("제목", "게시판 제목2");
                board2.put("내용", "게시판 내용2");

                Map<String, Object> 작성자2 = new HashMap<>();
                작성자2.put("이름", "김준사");
                작성자2.put("나이", 34);
                board2.put("작성자", 작성자2);

                List<Map<String, Object>> 댓글2 = new ArrayList<>();

                Map<String, Object> 댓글2_1 = new HashMap<>();
                댓글2_1.put("작성자", "김준오");
                댓글2_1.put("댓글", "댓글 내용2");
                댓글2.add(댓글2_1);

                Map<String, Object> 댓글2_2 = new HashMap<>();
                댓글2_2.put("작성자", "김준육");
                댓글2_2.put("댓글", "댓글내용2_2");
                댓글2.add(댓글2_2);

                board2.put("댓글들", 댓글2);

                // 게시물 1, 2를 boards 리스트에 추가
                boards.add(board1);
                boards.add(board2);

                // 출력 확인
                for (Map<String, Object> board : boards) {
                    System.out.println("제목: " + board.get("제목"));
                    System.out.println("내용: " + board.get("내용"));

                    Map<String, Object> 작성자 = (Map<String, Object>) board.get("작성자");
                    System.out.println("작성자: " + 작성자.get("이름") + " (" + 작성자.get("나이") + "세)");

                    List<Map<String, Object>> 댓글들 = (List<Map<String, Object>>) board.get("댓글들");
                    for (Map<String, Object> 댓글 : 댓글들) {
                        System.out.println("   댓글작성자: " + 댓글.get("작성자"));
                        System.out.println("   댓글내용: " + 댓글.get("댓글"));
                    }
                    System.out.println("------------------------------");
                }
            }
        }