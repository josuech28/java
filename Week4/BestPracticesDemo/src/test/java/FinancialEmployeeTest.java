import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.Employee.Employee;
import com.Employee.FinacialEmployee;
import com.address.Address;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/25/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class FinancialEmployeeTest {
    private FinacialEmployee finacialEmployee;
    private BigDecimal salary1;
    private Address address1;
    @Before
    public void setUp(){
        salary1  = new BigDecimal("1200");
        address1 = new Address("CR","San Jose","Desamparados");
        finacialEmployee = new FinacialEmployee(1,"Josue Chinchilla", salary1,address1);
        finacialEmployee  = mock(FinacialEmployee.class);
    }

    @Test
    public void increaseSalaryTest(){
        BigDecimal increment = new BigDecimal("400");
        BigDecimal result = new BigDecimal("1600");
        when(finacialEmployee.increaseSalary(increment)).thenReturn(result);

        Assert.assertEquals(finacialEmployee.increaseSalary(increment),result);
    }

}
