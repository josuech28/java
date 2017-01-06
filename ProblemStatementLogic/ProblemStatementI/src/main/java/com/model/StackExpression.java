package com.model;

import java.util.Stack;

/**
 * Created by joschinc on 1/5/17.
 */
public class StackExpression {
    private final Stack<Character> stackExpression;

    public StackExpression() {
        this.stackExpression = new Stack<Character>();
    }
    public void push(char input){
        stackExpression.push(input);
    }
    public char pop(){
        char input = stackExpression.pop();
        return input;
    }
    public char peek(){
        char lastElement = stackExpression.peek();
        return lastElement;
    }
    public boolean isEmpty(){
        return stackExpression.isEmpty();
    }
    public Stack<Character> getStackExpression(){
        return this.stackExpression;
    }
}
