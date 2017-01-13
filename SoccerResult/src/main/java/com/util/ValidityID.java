package com.util;

/**
 * Created by joschinc on 12/30/16.
 */
public class ValidityID {
    public boolean isValidId(int id){
        return id > 0;
    }

    public boolean isValidId(String id){
        return id.length() > 0;
    }
}
