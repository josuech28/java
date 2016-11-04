/**
 * Created by joschinc on 10/31/16.
 */

import java.util.Scanner;
import excercises.temperature.*;
import excercises.employee.*;
import excercises.test.*;
;

public class Week1Day1 {

    public static void main(String[] args){


        // Employee Exercise 2
        EmployeeTest employeeTest1 = new EmployeeTest(115400450,"Josue Chinchilla","Sapiens");
        employeeTest1.addAddress("Costa Rica", "San Jose", "Desamparados",235687);
        //employeeTest1.printEmployee();

        EmployeeTest employeeTest2 = new EmployeeTest(915800750,"Esteban Brenes ","Sapiens");
        employeeTest2.addAddress("Costa Rica", "Heredia", "Belen",135567);
        //employeeTest2.printEmployee();

        employeeTest2 = employeeTest1;
        employeeTest2.printEmployee();

        employeeTest1 = employeeTest2;
        employeeTest1.printEmployee();

        // Increase salary
        employeeTest1.increaseSalary(employeeTest1.getSalary(),50.0F); // Option 1 with salary
        employeeTest1.increaseSalary(employeeTest1,50.0F); // Option 2 with Object

        //Temperature
        Temperature t1 = new Temperature();
        int arrayTemperature[] = t1.getTemperature();
        Scanner in = new Scanner(System.in);
        for(int i =0; i < 15; i++){
            int number;
            System.out.print("Enter a temprerature(" + (i + 1) + "): ");
            number = in.nextInt();
            arrayTemperature[i] = number;
        }
        t1.getAverageTemperature(arrayTemperature);
        t1.getHighestTemperature(arrayTemperature);
    }
}
