package com.model;

/**
 * Created by joschinc on 1/4/17.
 */
public final class Input {
    private final String word;

    public Input(String word) {
        this.word = word;
        
    }

    public String getWord() {
        return word;
    }


    @Override
    public String toString() {
        return "Input{" + "word=" + word + '}';
    }
   

}
