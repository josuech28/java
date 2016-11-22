package com.test.constructor.collection.hashmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by joschinc on 11/22/16.
 */
public class QuestionHashMapTest {
    public static void main(String[] args) {
        String  xmlFile = "applicationContext.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(xmlFile);

        QuestionHashMap question1 = (QuestionHashMap)context.getBean("questionMapBean");
        System.out.println(question1.toString());
    }
}
