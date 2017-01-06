package com.util;

/**
 * Created by joschinc on 1/5/17.
 */
public class ValidateNumber {
    public boolean isNumeric(String chain){
        try {
            Integer.parseInt(chain);
            return true;
        } catch (NumberFormatException numberException){
            System.out.println(numberException.toString());
            return false;
        }
    }
}
