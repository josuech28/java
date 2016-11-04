package excercises.employee;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by joschinc on 11/4/16.
 */
public class EmployeeTest {

    private ArrayList<Employee> employees;

    public EmployeeTest(){
        this.employees = new ArrayList<Employee>();
    }

    public boolean addEmployee(Employee employeee){
        return employees.add(employeee);
    }

    // Print using iterator

    public void printEmployeeIterator(){
        Iterator<Employee> it = employees.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    // Using a enhanced for

    public void printEmployee(){
        for(Employee employee: employees){
            System.out.println(employee.toString());
        }
    }

    // With out enhanced for

     public void printEmployeeTraditional(){
         for(int i = 0; i < employees.size(); i++){
             System.out.println(employees.get(i).toString());
         }
     }

}
