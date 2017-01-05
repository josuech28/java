package com.util;

/**
 * Created by joschinc on 1/4/17.
 */
public class RemoveEmptyCharacter {
    public String removeWhiteCharacter(String sentence){
        return sentence.replaceAll("\\s","");
    }
}
