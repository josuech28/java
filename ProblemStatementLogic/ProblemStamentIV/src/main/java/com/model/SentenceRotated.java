package com.model;

/**
 * Created by joschinc on 1/4/17.
 */
public final  class SentenceRotated {
    private final String result;
    private final Sentence sentence;

    public SentenceRotated(String result, Sentence sentence) {
        this.result = result;
        this.sentence = sentence;
    }

    public String getResult() {
        return result;
    }

    public Sentence getSentence() {
        return sentence;
    }

    @Override
    public String toString() {
        return "SentenceRotated{" +
                "result='" + result + '\'' +
                ", sentence=" + sentence.toString() +
                '}';
    }
}
