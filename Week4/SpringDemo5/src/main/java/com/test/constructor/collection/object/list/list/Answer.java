package com.test.constructor.collection.object.list.list;

/**
 * Created by joschinc on 11/22/16.
 */
public class Answer {
    private int id;
    private String content;
    private String byUser;

    public Answer(int id, String content, String byUser) {
        this.id = id;
        this.content = content;
        this.byUser = byUser;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", byUser='" + byUser + '\'' +
                '}';
    }
}
