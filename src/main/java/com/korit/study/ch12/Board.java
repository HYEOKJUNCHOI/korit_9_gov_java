package com.korit.study.ch12;
// Board - id(정수), title(문자열) , contents(문자열) , writer(Writer) , comments(Comment[])
public class Board {

    int id;
    String title;
    String contents;
    Writer writer;
    Comment[] comments;


    public Board(int id, String title, String contents, Writer writer, Comment[] comments) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.writer = writer;
        this.comments = comments;

    }
}
