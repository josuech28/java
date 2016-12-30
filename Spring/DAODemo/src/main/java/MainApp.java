/**
 * Created by joschinc on 12/16/16.
 */
import java.util.List;

import com.dao.DAO;
import com.dao.StudentDaoImpl;
import com.model.Student;
import com.view.PrincipalView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        /*
        ApplicationContext context =
                new FileSystemXmlApplicationContext("applicationContext.xml");

        DAO studentDAO =
                (StudentDaoImpl)context.getBean("studentDAO");

        System.out.println("------Records Creation--------" );

        Student student1 = new Student(23,"Josue",studentDAO.getNumberRecord() + 1);
        studentDAO.create(student1);
        studentDAO.create(new Student(30,"Leonardo",studentDAO.getNumberRecord() + 1));
        studentDAO.create(new Student(44,"Oscar",studentDAO.getNumberRecord() + 1));

        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentDAO.list();
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----" );
        studentDAO.update(student1);

        System.out.println("----Listing Record with ID = 2 -----" );
        Student student = studentDAO.get(2);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
        System.out.println(student1.toString());
        */
        PrincipalView view = new PrincipalView();
        view.start();
    }
}
