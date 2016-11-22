package com.test.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by joschinc on 11/22/16.
 */
public class CatTest {
    public static void main(String[] args) {
        String xmlFile = "applicationContext.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(xmlFile);

        Cat c1 = (Cat)context.getBean("prototypeCatBean");
        c1.setName("Panfila");
        c1.miau();
        c1.eat();

        Cat c2 = (Cat)context.getBean("prototypeCatBean");
        c2.eat();
        c2.sleep(); // Null name becouse is new instance ;)



    }
}
