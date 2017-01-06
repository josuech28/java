package com.problemstatement2.util;

/**
 * Created by joschinc on 1/4/17.
 */
public class Validator {
    public boolean isNumberValid(int min, int max, int number){
        return min < number && number <= max;
    }
    public boolean isNumber(String number){
        try{
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException numberException){
            System.out.println(numberException.toString());
            return false;
        }
    }
}
