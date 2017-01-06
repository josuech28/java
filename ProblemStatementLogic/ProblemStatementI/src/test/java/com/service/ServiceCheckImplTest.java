package com.service;

import com.model.Input;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by joschinc on 1/5/17.
 */
public class ServiceCheckImplTest {
    @BeforeClass
    public static void setUp(){
        service = new ServiceCheckImpl();
    }

    @Test
    public void checkExpressionSampleTest(){
        String expression = "{“,”}”,”(“,”)”,”[“,”]";
        Input input = new Input(expression);
        boolean resultExpected = true;
        Assert.assertEquals("Fail", service.checkExpression(input),resultExpected);
    }
    @Test
    public void checkExpressionSampleFailTest(){
        String expression = "[(])";
        Input input = new Input(expression);
        boolean resultExpected = false;
        Assert.assertEquals("Fail", service.checkExpression(input),resultExpected);
    }
    @Test
    public void checkExpressionInput1Test(){
        String expression = "[({()})]";
        Input input = new Input(expression);
        boolean resultExpected = true;
        Assert.assertEquals("Fail", service.checkExpression(input),resultExpected);
    }
    @Test
    public void checkExpressionInput2Test(){
        String expression = "()()";
        Input input = new Input(expression);
        boolean resultExpected = true;
        Assert.assertEquals("Fail", service.checkExpression(input),resultExpected);
    }
    @Test
    public void checkExpressionInput3Test(){
        String expression = "[(]";
        Input input = new Input(expression);
        boolean resultExpected = false;
        Assert.assertEquals("Fail", service.checkExpression(input),resultExpected);
    }
    @Test
    public void checkExpressionInput4Test(){
        String expression = "{(}())";
        Input input = new Input(expression);
        boolean resultExpected = false;
        Assert.assertEquals("Fail", service.checkExpression(input),resultExpected);
    }
    private static ServiceCheck service;
}
