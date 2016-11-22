package com.test.constructor.collection.object.list.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by joschinc on 11/22/16.
 */
public class QuestionObjectListTest {
    public static void main(String[] args) {
        String xmlFile = "applicationContext.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(xmlFile);

        QuestionObjectList question1 = (QuestionObjectList)context.getBean("questionObjectListBean");
        System.out.println(question1.toString());

        

    }
}
