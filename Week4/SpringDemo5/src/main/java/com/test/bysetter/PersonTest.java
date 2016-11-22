package com.test.bysetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by joschinc on 11/22/16.
 */
public class PersonTest {
    public static void main(String[] args) {
        String xmlFile = "applicationContext.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(xmlFile);

        Person p1 = (Person)context.getBean("personBean");
        System.out.println(p1.toString());
    }
}
