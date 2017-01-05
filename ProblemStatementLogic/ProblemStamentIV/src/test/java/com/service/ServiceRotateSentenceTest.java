package com.service;

import com.model.Sentence;
import com.model.SentenceRotated;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by joschinc on 1/5/17.
 */
public class ServiceRotateSentenceTest {
    @BeforeClass
    public static void setUp(){
        service = new ServiceRotateSentenceImpl();
        sentence = "abcdefghijkl";
    }

    @Test
    public void sentenceRotateTest(){
        int numberRotation = 5;
        String result = "fghijklabcde";
        Sentence createSentence = new Sentence(sentence,numberRotation);
        SentenceRotated rotateSentence = service.rotateSentence(createSentence);
        Assert.assertEquals("Fail",rotateSentence.getResult(),result);
    }

    @Test
    public void sentenceRotateInverseTest(){
        int numberRotation = -5;
        String result = "hijklabcdefg";
        Sentence createSentence = new Sentence(sentence,numberRotation);
        SentenceRotated rotateSentence = service.rotateSentence(createSentence);
        Assert.assertEquals("Fail",rotateSentence.getResult(),result);
    }
    private static  ServiceRotateSentence service;
    private static String sentence;
}
