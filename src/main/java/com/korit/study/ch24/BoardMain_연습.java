package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardMain_연습 {
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

        // 댓글 작성자 1,2,3,4
        Map<String,Object> comments1 = new HashMap<>();
        comments1.put("작성자","김준일");
        comments1.put("댓글","댓글내용1");

        Map<String,Object> comments2 = new HashMap<>();
        comments1.put("작성자","김준삼");
        comments1.put("댓글","댓글내용2");

        Map<String,Object> comments3 = new HashMap<>();
        comments1.put("작성자","김준오");
        comments1.put("댓글","댓글내용11");

        Map<String,Object> comments4 = new HashMap<>();
        comments1.put("작성자","김준육");
        comments1.put("댓글","댓글내용22");

        // 게시글 작성자 ===

        Map<String,Object> writer1 = new HashMap<>();
        writer1.put("작성자","김준일");
        writer1.put("나이",32);

        Map<String,Object> writer2 = new HashMap<>();
        writer1.put("작성자","김준사");
        writer1.put("나이",34);

        // 게시글 1,2

        List<Object> 게시글1 = new ArrayList<>();
        게시글1.add("게시판 내용1");
        게시글1.add(comments1);
        게시글1.add(comments2);

        List<Object> 게시글2 = new ArrayList<>();
        게시글2.add("게시판 내용2");
        게시글2.add(comments3);
        게시글2.add(comments4);

        List<Object> 게시글제목1 = new ArrayList<>();
        게시글제목1.add("게시판 제목");
        게시글제목1.add(게시글1);

        List<Object> 게시글제목2 = new ArrayList<>();
        게시글제목2.add("게시판 제목2");
        게시글제목2.add(게시글2);

        List<Object> all = new ArrayList<>();
        all.add(게시글제목1);
        all.add(게시글제목2);

        System.out.println(all);












    }
        }
