package com.test.constructor.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by joschinc on 11/22/16.
 */
public class QuestionTest {
    public static void main(String[] args) {
        String xmlFile = "applicationContext.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(xmlFile);

        Question question1 = (Question)context.getBean("questionBean");
        System.out.println(question1.toString());
    }
}
