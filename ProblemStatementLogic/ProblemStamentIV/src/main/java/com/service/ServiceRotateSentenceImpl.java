package com.service;

import com.model.Sentence;
import com.model.SentenceRotated;
import sun.jvm.hotspot.utilities.ReversePtrs;

/**
 * Created by joschinc on 1/4/17.
 */
public class ServiceRotateSentenceImpl implements ServiceRotateSentence {
    public SentenceRotated rotateSentence(Sentence sentenceConvert) {
        int rotateTimes = sentenceConvert.getRotatedTimes();
        String sentence = sentenceConvert.getSentence();
        String result = "";
        //Rotate anti-clockwise
        if(rotateTimes < 0) {
            int positiveRotateTime = convertToPositiveNumber(rotateTimes);
            int index = positiveRotateTime % sentence.length();
            result = sentence.substring(sentence.length() - index,sentence.length()) + sentence.substring(0, sentence.length() - index);

        } else {
            int index = rotateTimes % sentence.length();
            result = sentence.substring(index) + sentence.substring(0, index);
        }
        return new SentenceRotated(result,sentenceConvert);
    }
    private int convertToPositiveNumber(int number){
        return Math.abs(number);
    }
}
