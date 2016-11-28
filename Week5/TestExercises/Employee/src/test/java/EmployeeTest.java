import com.employee.Employee;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/28/16.
 */
public class EmployeeTest { // Only to fail
    private static Employee employee1;
    private static Employee employee2;
    private static Employee employee3;

    @BeforeClass
    public static void setUp(){
        employee1 = new Employee(1,"Josue Chinchilla", new BigDecimal("1200"),"Sapien","Sj - CR");
        employee2 = new Employee(2,"Josue Chinchilla", new BigDecimal("1200"),"Sapien","Sj - CR");
        employee3 = null;
    }


    @Test
    public void equalFailTest(){
        // Test that objects are not equals fail but no error
        assertTrue("Not equals",employee1.equals(employee2));
    }

    @Test
    public void equalFailError(){
        System.out.println(employee3.toString()); // this is error nullPointer Exception
        assertNotNull("Object fail because is null",employee3);
    }
}
