package com.test.constructor.collection.object.list.list;

import java.util.List;

/**
 * Created by joschinc on 11/22/16.
 */
public class QuestionObjectList {
    private int idQuestion;
    private String item;
    private List<Answer> aswers;

    public QuestionObjectList(int idQuestion, String item, List<Answer> aswers) {
        this.idQuestion = idQuestion;
        this.item = item;
        this.aswers = aswers;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public List<Answer> getAswers() {
        return aswers;
    }

    public void setAswers(List<Answer> aswers) {
        this.aswers = aswers;
    }

    private String printAswer(){
        String result = "";
        for(Answer aswer: aswers){
            result += aswer.toString() + " ";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Question{" +
                "idQuestion=" + idQuestion +
                ", item='" + item + '\'' +
                ", aswers:\n" + printAswer()  +
                '}';
    }
}
