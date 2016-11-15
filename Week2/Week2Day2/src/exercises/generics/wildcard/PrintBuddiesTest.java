package exercises.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joschinc on 11/14/16.
 */
public class PrintBuddiesTest {

    public static void printBuddiesTest(List <? extends Employee> employee){
        for(Employee e: employee){
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Josue"));
        employees.add(new Employee("Oscar"));
        employees.add(new Employee("Rogelio"));

        List<Manager> manager = new ArrayList<Manager>();
        manager.add(new Manager("Josue", "Sapiens"));
        manager.add(new Manager("Oscar","Prodigious"));
        manager.add(new Manager("Ricardo", "BAC"));
        PrintBuddiesTest.printBuddiesTest(employees);
        PrintBuddiesTest.printBuddiesTest(manager);
    }
}
