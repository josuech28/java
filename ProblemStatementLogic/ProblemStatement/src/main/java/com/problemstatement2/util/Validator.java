package com.problemstatement2.util;

/**
 * Created by joschinc on 1/4/17.
 */
public class Validator {
    public boolean isNumberValid(int min, int max, int number){
        return min < number && number <= max;
    }
}
