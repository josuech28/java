package com.test.constructor.collection.hashmap;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by joschinc on 11/22/16.
 */
public class QuestionHashMap {
    private int idQuestion;
    private String item;
    private Map<String,String> aswers;

    public QuestionHashMap(int idQuestion, String item, Map<String,String> aswers) {
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

    public Map<String,String> getAswers() {
        return aswers;
    }

    public void setAswers(Map<String,String> aswers) {
        this.aswers = aswers;
    }

    private String printAswer(){
        String result = "";
        Set<Map.Entry<String,String>> keyset = aswers.entrySet();
        for(Map.Entry<String ,String> aswer: keyset){
            result += "Key: " + aswer.getKey() + " Value: " + aswer.getValue() + " ";
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
