package com.korit.study.ch12_백균;

public class BoardPrintService {
    void printWriter(Board[] boards, Writer writer) {
        int boardCount = 0;
        int commentCount= 0;
        for(Board board : boards) {
            if (writer.id == board.writer.id) {
                boardCount++;
            }
            for (Comment comment : board.comments ) {
                if (writer.id == comment.writer.id) {
                    commentCount++;
                }
            }
        }
        System.out.println("작성자 " + writer.id + "의 게시글: " + boardCount + "개");
        System.out.println("작성자 " + writer.id + "의 댓글: " + commentCount + "개");


    }

    void printComment(Comment comment) {
        System.out.printf("""
                댓글 id %d | 내용: %s             | 작성자 id: %d
                """, comment.id, comment.contents, comment.writer.id);
    }
    void printAllComments(Comment[] comments) {
        for (Comment comment : comments) {
            printComment(comment);
        }
        System.out.println();
    }

    void printBoard(Board board) {
        System.out.printf("""
                게시글 id: %d | 제목: %s         | 작성자 id: %d
                
                                 내용 : %s
                    
                """, board.id, board.title, board.writer.id, board.contents);
        printAllComments(board.comments);
    }
}