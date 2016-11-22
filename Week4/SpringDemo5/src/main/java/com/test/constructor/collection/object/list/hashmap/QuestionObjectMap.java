package com.test.constructor.collection.object.list.hashmap;

import com.test.constructor.collection.object.list.list.Answer;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by joschinc on 11/22/16.
 */
public class QuestionObjectMap {
    private int idQuestion;
    private String item;
    private Map<Answer,User> aswers;

    public QuestionObjectMap(int idQuestion, String item, Map<Answer,User> aswers) {
        this.idQuestion = idQuestion;
        this.item = item;
        this.aswers = aswers;
    }

    public QuestionObjectMap(int idQuestion, String item) {
        this.idQuestion = idQuestion;
        this.item = item;
        this.aswers = null;
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

    public Map<Answer,User> getAswers() {
        return aswers;
    }

    public void setAswers(Map<Answer,User> aswers) {
        this.aswers = aswers;
    }

    private String printAswer(){
        String result = "";
        Set<Map.Entry<Answer,User>> keySet = aswers.entrySet();
        for(Map.Entry<Answer,User> aswer: keySet){
            result += "Answer: " + aswer.getKey().toString() + " User: " + aswer.getValue().toString() + " ";
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
