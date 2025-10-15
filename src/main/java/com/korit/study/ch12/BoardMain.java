package com.korit.study.ch12;

import java.security.cert.CertPath;

public class BoardMain {
    public static void main(String[] args) {

        Writer[] writers = new Writer[4];
        writers[0] = new Writer(1, "혁준");
        writers[1] = new Writer(2, "하루");
        writers[2] = new Writer(3, "다솔");
        writers[3] = new Writer(4, "다빈");

        Comment[][] comments = new Comment[2][];
        comments[0] = new Comment[3];
        comments[1] = new Comment[3];

        comments[0][0] = new Comment(1, "게시글1의 댓글1",writers[0]);
        comments[0][1] = new Comment(2, "게시글2의 댓글2",writers[0]);
        comments[0][2] = new Comment(3, "게시글3의 댓글3",writers[0]);
        comments[1][0] = new Comment(1, "게시글1의 댓글1",writers[2]);
        comments[1][1] = new Comment(2, "게시글1의 댓글1",writers[3]);


        Board[] boards = new Board[2];
        boards[0] = new Board(1,"첫인사","안녕하세요",writers[0],comments[0]);
        boards[1] = new Board(2,"첫인사2","반갑습니다",writers[1],comments[1]);

            for (int i=0 ; i < boards.length ; i++) {
                BoardPrintService.printBoard(boards[i]);
                System.out.println("---------------");
            }
    }
}