import com.employee.Employee;
import com.salary.Salary;
import org.junit.BeforeClass;
import org.junit.Test;
import static  org.junit.Assert.*;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/28/16.
 */
public class SalaryTest {

    @BeforeClass
    public static void setUp(){
          salary = new Salary();

          employee = new Employee(1,"Josue Chinchilla", new BigDecimal("1200"),"Sapien","Sj - CR");
    }

    @Test
    public void increaseSalaryTest(){
        BigDecimal increment = new BigDecimal("600");
        BigDecimal result = salary.increaseSalary(employee,increment);
        BigDecimal expect = new BigDecimal("1800");
        assertEquals("FAIL",expect,result);
    }

    @Test
    public void increaseSalaryNegativeTest(){
        BigDecimal increment = new BigDecimal("-600");
        BigDecimal result = salary.increaseSalary(employee,increment);
        BigDecimal expect = new BigDecimal("1200"); // Do not increment if value is negative
        assertEquals("FAIL",expect,result);
    }

    private static Employee employee;
    private static Salary salary;
}
