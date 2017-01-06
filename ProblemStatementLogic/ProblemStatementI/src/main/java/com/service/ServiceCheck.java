package com.service;

import com.model.Input;

import java.util.Stack;

/**
 * Created by joschinc on 1/5/17.
 */
public interface ServiceCheck {
    Stack<Character> validateExpression(Input expression);
    boolean checkExpression(Input expression);
}

