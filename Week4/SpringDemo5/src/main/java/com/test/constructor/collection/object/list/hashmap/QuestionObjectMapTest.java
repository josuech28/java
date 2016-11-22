package com.test.constructor.collection.object.list.hashmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by joschinc on 11/22/16.
 */
public class QuestionObjectMapTest {
    public static void main(String[] args) {
        String xmlFile = "applicationContext.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(xmlFile);

        QuestionObjectMap question = (QuestionObjectMap)context.getBean("questionObjectMap");
        System.out.println(question.toString());
    }
}
