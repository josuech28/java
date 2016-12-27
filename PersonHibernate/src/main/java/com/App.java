package com;

import com.dao.DAO;
import com.dao.PersonDAO;
import com.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by joschinc on 12/26/16.
 */
public class App {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        ApplicationContext context =
                new FileSystemXmlApplicationContext("spring.xml");

        DAO<Person> personDAO = context.getBean(PersonDAO.class);


        //student = (StudentDaoImpl)context.getBean("studentDAO");

        Person person = new Person(1,"Josue","CR");
        personDAO.save(person);

        System.out.println("Person::"+person);

        List<Person> list = personDAO.list();

        for(Person p : list){
            System.out.println("Person List::"+p);
        }
        //close resources
        //context.close();
    }
}
