package com.test.constructor.collection;

import java.util.List;

/**
 * Created by joschinc on 11/22/16.
 */
public class Question {
    private int idQuestion;
    private String item;
    private List<String> aswers;

    public Question(int idQuestion, String item, List<String> aswers) {
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

    public List<String> getAswers() {
        return aswers;
    }

    public void setAswers(List<String> aswers) {
        this.aswers = aswers;
    }

    private String printAswer(){
        String result = "";
        for(String aswer: aswers){
            result += aswer + " ";
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
