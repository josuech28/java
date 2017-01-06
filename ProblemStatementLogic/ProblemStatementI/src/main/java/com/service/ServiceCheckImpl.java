package com.service;

import com.model.Input;
import com.model.StackExpression;

import java.util.Stack;

/**
 * Created by joschinc on 1/5/17.
 */
public class ServiceCheckImpl implements ServiceCheck {

    public Stack<Character> validateExpression(Input expression){
        String expToValidate = expression.getExpression();
        StackExpression stackExpression = new StackExpression();
        char letter;
        for (int i=1;i<=expToValidate.length();i++){
            letter = expToValidate.substring((i-1),i).charAt(0);
            if(letter == '{'|| letter == '[' || letter == '('){
                stackExpression.push(letter);
            } else {
                if(letter == '}'){
                    if(stackExpression.peek() == '{'){
                        stackExpression.pop();
                    }
                } else {
                    if(letter == ']'){
                        if(stackExpression.peek() == '['){
                            stackExpression.pop();
                        }
                    } else {
                        if(letter == ')'){
                            if(stackExpression.peek() == '('){
                                stackExpression.pop();
                            }
                        }
                    }
                }

            }
        }
        return stackExpression.getStackExpression();
    }

    public boolean checkExpression(Input expression){
       Stack<Character> stackExpression = validateExpression(expression);
       return stackExpression.isEmpty();
    }
}
