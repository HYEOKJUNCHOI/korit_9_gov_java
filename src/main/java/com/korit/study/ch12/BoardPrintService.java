package com.korit.study.ch12;
// Board - id(정수), title(문자열) , contents(문자열) , writer(Writer) , comments(Comment[])

// Writer - id(정수), name(문자열)

// Comment - id(정수), contents(문자열), writer(Writer)

public class BoardPrintService {

    public static void printcomments(Comment[] c) {
        for (Comment a : c) {
            System.out.println("댓글 : " + a.contents);
        }

    }

    public static void printBoard(Board board) {

        System.out.println("ID : " + board.id);
        System.out.println("제목 : " + board.title);
        System.out.println("게시글 내용 : " + board.contents);
        System.out.println("작성자 ID : " + board.writer.id);
        System.out.println("작성자 이름 : : " + board.writer.name);
        printcomments(board.comments);
        System.out.println("[작성자]");
        printWriter(board.writer);

        System.out.println("[댓글]");
        if (board.comments != null && board.comments.length > 0) {
            for (Comment c : board.comments) {
                printComment(c);
                System.out.println();
            }
        } else {
            System.out.println("댓글 없음");
        }
    }

        public static void printWriter (Writer writer) {
            if (writer == null) {
                System.out.println("(작성자 정보 없음)");
            return;
            }
            System.out.println("ID : " + writer.id);
            System.out.println("작성자 : " + writer.name);
        }


    public static void printComment (Comment Comment){
        if (Comment == null) return;
        System.out.println("ID : " + Comment.id);
        System.out.println("게시물 : " + Comment.contents);
        System.out.println("작성자 : " + Comment.writer);
    }
}
