package com.model;

/**
 * Created by joschinc on 1/4/17.
 */
public final class Sentence {
    private final String sentence;
    private final int rotatedTimes;

    public Sentence(String sentence, int rotatedTimes) {
        this.sentence = sentence;
        this.rotatedTimes = rotatedTimes;
    }

    public String getSentence() {
        return sentence;
    }

    public int getRotatedTimes() {
        return rotatedTimes;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence='" + sentence + '\'' +
                ", rotatedTimes=" + rotatedTimes +
                '}';
    }
}
