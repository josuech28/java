import com.sun.corba.se.impl.interceptors.PICurrent;
import com.sun.imageio.plugins.common.BogusColorSpace;
import excercises.exception.*;
import excercises.exception.Object;
import excercises.fruits.Bowl;
import excercises.fruits.BowlSort;
import excercises.fruits.Fruit;
import excercises.hashmap.Employee;
import excercises.employee.*;
import excercises.hashmap.EmployeeTest;
import excercises.hashmap.EmployeeTestLinkedMap;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/2/16.
 */
public class Week1Day3 {

    public static void main(String[] args) throws Exception {
       /*
           Excercise 1 Sort ArrayList

        Fruit f1 = new Fruit("Banana");
        Fruit f2 = new Fruit("Apple");
        Fruit f3 = new Fruit("Orange");
        Fruit f4 = new Fruit("Albaricoque");

        Bowl fruits = new Bowl();
        fruits.addFruit(f1);
        fruits.addFruit(f2);
        fruits.addFruit(f3);
        fruits.addFruit(f4);
        fruits.addFruit(f4);
        fruits.printFruits();
        fruits.sort();
        fruits.printFruits();
        fruits.printByIterator();

        fruits.addFruitL(f1);
        fruits.addFruitL(f2);
        fruits.addFruitL(f3);
        fruits.addFruitL(f4);
        fruits.addFruitL(f4);
        fruits.printFruitsL();

        System.out.println("Set...");
        fruits.addFruitS(f1);
        fruits.addFruitS(f2);
        fruits.addFruitS(f3);
        fruits.addFruitS(f4);
        fruits.printFruitsT();
        fruits.addFruitS(f4);
        System.out.println("Set again...");
        fruits.printFruitsT();
        fruits.sizeT();

        BowlSort bs = new BowlSort();
        bs.addFruit(f1);
        bs.addFruit(f2);
        bs.addFruit(f3);
        bs.addFruit(f4);
        System.out.println("Tree SET");
        bs.printFruit();

        */
       /*
            Excercise hashMap

        EmployeeTest employees = new EmployeeTest();
        EmployeeTestLinkedMap employeeOrder = new EmployeeTestLinkedMap();
        Employee e1 = new Employee(4,"Josue");
        Employee e2 = new Employee(3,"Alejandro");
        Employee e3 = new Employee(2,"Issac");
        Employee e4 = new Employee(1,"Maikol");
        employees.addEmployee(e1.getId(),e1.getName());
        employees.addEmployee(e2.getId(),e2.getName());
        employees.addEmployee(e3.getId(),e3.getName());
        employees.addEmployee(e4.getId(),e4.getName());

        employeeOrder.addEmployee(e1);
        employeeOrder.addEmployee(e2);
        employeeOrder.addEmployee(e3);
        employeeOrder.addEmployee(e4);



        employees.printEmployeeID();
        employees.printEmployeeID();
        //employees.clearEmployee();
        employees.printEmployeeName();
        employees.printEmployee();
        System.out.println("-------------");
        employeeOrder.printEmployee();

         */
       /*
            Exception

        BigDecimal interest = new BigDecimal("100");
        BigDecimal rate = new BigDecimal("2");
        BigDecimal time = new BigDecimal("50");
        Principal p = new Principal(interest,rate,time);
        p.getPrincipal();

        SquareRoot sq = new SquareRoot(-1);
        sq.getSquareRoot(4);

         Pizza pizza1 = new Pizza(4);
        try {
            pizza1.bakePizza(pizza1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Object a = new Object(5);
        ObjectNull b = new ObjectNull();
        b.waitMethod();

        */

        /*
            Employee - Department
        */
        BigDecimal salarySapien = new BigDecimal("2000");
        EmployeeD e1 = new EmployeeD(1,"Josue Chinchilla", salarySapien);
        EmployeeD e2 = new EmployeeD(2,"Oscar  Cartin", salarySapien);
        EmployeeD e3 = new EmployeeD(3,"Leonardo  Chacon", salarySapien);
        EmployeeD e4 = new EmployeeD(4,"Shashank",salarySapien);
        EmployeeD e5 = new EmployeeD(5,"Daniel QA",salarySapien);

        Department sapiens = new Department("01-Sapiens");
        sapiens.addEmployee(e1);
        sapiens.addEmployee(e2);
        sapiens.addEmployee(e3);
        sapiens.addEmployee(e4);
        sapiens.addEmployee(e5);

        BigDecimal salaryRazor = new BigDecimal("1000");
        EmployeeD e6 = new EmployeeD(1,"Victor Casanova", salaryRazor);
        EmployeeD e7 = new EmployeeD(2,"Roberto Gomez", salaryRazor);
        EmployeeD e8 = new EmployeeD(3,"Javier  Hernandez", salaryRazor);
        EmployeeD e9 = new EmployeeD(4,"Origi Levatan",salaryRazor);
        EmployeeD e10 = new EmployeeD(5,"Lusiana Andrade",salaryRazor);

        Department razor = new Department("02-Razor");
        razor.addEmployee(e6);
        razor.addEmployee(e7);
        razor.addEmployee(e8);
        razor.addEmployee(e9);
        razor.addEmployee(e10);

        BigDecimal salaryStudio = new BigDecimal("1500");
        EmployeeD e11 = new EmployeeD(1,"Victor Montero", salaryStudio);
        EmployeeD e12 = new EmployeeD(2,"Jose Pablo Granados", salaryStudio);
        EmployeeD e13 = new EmployeeD(3,"Maikol Zumbado", salaryStudio);
        EmployeeD e14 = new EmployeeD(4,"Marvin Solano ",salaryStudio);
        EmployeeD e15 = new EmployeeD(5,"Carlos Benavidez",salaryStudio);

        Department studio = new Department("03-Studio");
        studio.addEmployee(e11);
        studio.addEmployee(e12);
        studio.addEmployee(e13);
        studio.addEmployee(e14);
        studio.addEmployee(e15);

        excercises.employee.EmployeeTest test = new excercises.employee.EmployeeTest();
        test.addDepartment(sapiens);
        test.addDepartment(razor);
        test.addDepartment(studio);
        System.out.println(test.printDepartment());









    }
}
