package com.util;

import javax.swing.*;

/**
 * Created by joschinc on 1/2/17.
 */
public class ValidityTextField {
    public boolean validityTextFieldGeneral(JTextField ... inputs){
        for(JTextField f: inputs){
             if(f.getText().trim().isEmpty()){
                 return false;
             }
        }
        return true;
    }
    public boolean validityTextFieldLength(JTextField input, int size){
            return input.getText().trim().length() >= size;

    }
}
