import com.Company.Company;
import com.Employee.Employee;
import com.Employee.FinacialEmployee;
import com.address.Address;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by joschinc on 11/25/16.
 */
public class BestPracticesDemo {
    public static void main(String[] args) {

        Address address1 = new Address("CR","San Jose","Desamparados");
        Address address2 = new Address("India","Banglok","Central");

        BigDecimal salary1 = new BigDecimal("1200");
        Employee employee1 = new FinacialEmployee(1,"Josue Chinchilla", salary1,address1);

        BigDecimal salary2 = new BigDecimal("8000");
        Employee employee2 = new FinacialEmployee(2,"Shasshank S.",salary2,address2);

        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(employee1);
        employeesList.add(employee2);
        Company company = new Company(1,"SAPIENS",employeesList);

        company.printCompany();

    }
}
