package com.util;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;
/**
 * Created by joschinc on 1/5/17.
 */
public class RemoveEmptyCharacterTest {
    @BeforeClass
    public static void setUp(){
        util = new RemoveEmptyCharacter();
    }

    @Test
    public void removeEmptyCharacterTest(){
        String text = "h e l l o";
        String result = "hello";
        Assert.assertEquals("FAIL",util.removeWhiteCharacter(text),result);
    }
    private static RemoveEmptyCharacter util;
}
