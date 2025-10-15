package com.korit.study.ch12_백균;

public class Comment {
    int id;
    String contents;
    Writer writer;

    Comment(int id, String contents, Writer writer) {
        this.id = id;
        this.contents = contents;
        this.writer = writer;
    }
}
