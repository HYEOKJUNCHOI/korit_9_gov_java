package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardMain_이근 {
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


                Map<String,Object> comments1 = new HashMap<>();
                comments1.put("writer", "김준이");
                comments1.put("conetent","댓글내용1");

                Map<String,Object> comments2 = new HashMap<>();
                comments2.put("writer", "김준삼");
                comments2.put("conetent","댓글내용2");

                Map<String,Object> comments3 = new HashMap<>();
                comments3.put("writer", "김준오");
                comments3.put("conetent","댓글내용11");

                Map<String,Object> comments4 = new HashMap<>();
                comments4.put("writer", "김준육");
                comments4.put("conetent","댓글내용22");

                Map<String,Object> writer1 = new HashMap<>();
                writer1.put("name", "김준일");
                writer1.put("age",32);

                Map<String,Object> writer2 = new HashMap<>();
                writer2.put("name", "김준사");
                writer2.put("age",34);

                List<Object> content1 = new ArrayList<>();
                content1.add("게시판 내용1");
                content1.add(comments1);
                content1.add(comments2);

                List<Object> content2 = new ArrayList<>();
                content2.add("게시판 내용2");
                content2.add(comments3);
                content2.add(comments4);

                List<Object> title1 = new ArrayList<>();
                title1.add("게시판 제목1");
                title1.add(content1);

                List<Object> title2 = new ArrayList<>();
                title2.add("게시판 제목2");
                title2.add(content2);

                List<Object> all = new ArrayList<>();
                all.add(title1);
                all.add(title2);

                System.out.println(all);

            }
        }
