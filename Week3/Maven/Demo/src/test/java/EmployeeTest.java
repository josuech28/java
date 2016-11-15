import org.junit.Assert;
import org.junit.Test;

/**
 * Created by joschinc on 11/15/16.
 */
public class EmployeeTest {

    private String message = "Josue";
    private Employee employee = new Employee("Josue",115400450);

    @Test
    public void  name() throws Exception {
         Assert.assertEquals(message,employee.getName());
    }
}
