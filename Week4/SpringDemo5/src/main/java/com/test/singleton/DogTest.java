package com.test.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by joschinc on 11/22/16.
 */
public class DogTest {
    public static void main(String[] args) {
        String xmlFile = "applicationContext.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(xmlFile);

        Dog d1 = (Dog)context.getBean("singletonDogBean");
        d1.setName("Rufo");

        Dog d2 = (Dog)context.getBean("singletonDogBean");
        d2.getName();
        d2.eat();
        d2.run();
        d2.sleep();
    }
}
