package com.korit.study.ch12_백균;

public class BoardMain {
    public static void main(String[] args) {

        // Writer - id(정수), name(문자열)
        Writer w1 = new Writer(202501, "최백균");
        Writer w2 = new Writer(202502, "최백일");
        Writer w3 = new Writer(202503, "최백이");
        // Comment - id(정수), contents(문자열), writer(Writer)
        Comment c1 = new Comment(1001, "댓글1", w1);
        Comment c2 = new Comment(1002, "댓글2", w2);
        Comment c3 = new Comment(1002, "댓글3", w3);
        Comment c4 = new Comment(1002, "댓글4", w2);
        // Comment 배열 - comments
        Comment[] cs1 = new Comment[] {c1,c2};
        Comment[] cs2 = new Comment[] {c3,c4};
        // Board - id(정수), title(문자열), contents(문자열), writer(Writer), comments(Comment[])
        Board b1 = new Board(10001, "제목1", "내용1", w1, cs1);
        Board b2 = new Board(10002, "제목2", "내용2", w2, cs2);
        // Board 배열 - boards -> 게시글 2개
        Board[] bs = new Board[]{b1, b2};

        BoardPrintService bps = new BoardPrintService();
        bps.printBoard(b2);
        bps.printWriter(bs,w3);
    }
}
