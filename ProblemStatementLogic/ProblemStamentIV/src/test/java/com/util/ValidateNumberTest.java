package com.util;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by joschinc on 1/5/17.
 */
public class ValidateNumberTest {
    @BeforeClass
    public static void setUp(){
        util = new ValidateNumber();
    }

    @Test
    public void isNumericTest(){
        String text = "5";
        boolean result = true;
        Assert.assertEquals("FAIL",util.isNumeric(text),result);
    }

    @Test
    public void isNumericnNegativeNumberTest(){
        String text = "-5";
        boolean result = true;
        Assert.assertEquals("FAIL",util.isNumeric(text),result);
    }

    @Test
    public void isNumericFailTest(){
        String text = "/5a";
        boolean result = false;
        Assert.assertEquals("FAIL",util.isNumeric(text),result);
    }


    private static ValidateNumber util;
}
