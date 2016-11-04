/**
 * Created by joschinc on 11/1/16.
 */
import excercise.animal.Animal;
import excercise.animal.Dog;
import excercise.bicyclecontract.Bicycle;
import excercise.bicyclecontract.MountainBicycle;
import excercise.bicyclecontract.RaicingTest;
import excercise.bicyclecontract.RoadBicycle;
import excercise.financialinstrument.*;
import excercise.taxtest.TaxTest;
import excercise.workerpersonemployee.EmployeeInterface;
import exercise.EmployeeBonusCalculator.*;
import exercise.EmployeeBonusCalculator.Employee;
import exercise.EmployeeBonusCalculator.RegularEmployee;

import java.math.BigDecimal;
import java.util.Date;


public class Week1Day2 {

    public static void main(String[] args){

        // Employee
        /*
        Employee e1 = new RegularEmployee(1,"Josue", 1200.0);
        Employee e2 = new ContractorEmployee(2,"Oscar",2500);
        System.out.println(e1.bonusPay());
        System.out.println(e2.bonusPay());

        // Taxs
        TaxTest t1 = new TaxTest(1200,"CR", 5);
        TaxTest t2 = new TaxTest(2200,"USA");
        System.out.println(t1.toString());
        System.out.println(t2.toString());

        //Animals
        Dog rufo = new Dog("Rufo","2","3","4","5");
        rufo.eat();
        rufo.play();
        rufo.speak();
        rufo.sleep();
        rufo.roam();
        rufo.toString();

        // Bicycle
        int startV = 15;
        Bicycle b1 = new MountainBicycle();
        Bicycle b2 = new MountainBicycle();

        Bicycle b3 = new RoadBicycle();
        Bicycle b4 = new RoadBicycle();

        b1.speedup(startV);
        b2.speedup(startV+5);

        b3.speedup(startV);
        b4.speedup(startV+10);

        RaicingTest rt = new RaicingTest();
        rt.addBicycle(b1);
        rt.addBicycle(b2);
        rt.addBicycle(b3);
        rt.addBicycle(b4);

        rt.getSpeeds();

        // Financial Instrummentes
        BigDecimal b = new BigDecimal("100");
        double intereset = 5.0;
        InterestBearingBond f1 = new InterestBearingBond(b);
        f1.addInterest(intereset);

        ZeroCouponBond f2 = new ZeroCouponBond(b);
        f2.addInterest(10.0);

        VanillaStock f3 = new VanillaStock(b);

        InterestBearingBond f4 = new InterestBearingBond(b);
        f4.addInterest(intereset);

        FinancialInstrumentTest ft = new FinancialInstrumentTest();
        ft.addIntrument(f1);
        ft.addIntrument(f2);
        ft.addIntrument(f3);
        ft.addIntrument(f4);


        System.out.println(ft.getInterest());
         */

        // Work - Employeee - Person
        BigDecimal bd = new BigDecimal("1200");
        Date dt = new Date();
        EmployeeInterface emp1 = new EmployeeInterface("Josue Chinchillla",23,bd,dt);
        System.out.println(emp1.getAge());
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
        System.out.println(emp1.getJoiningDate());
        System.out.println(emp1.toString());
        System.out.println(emp1.hashCode());

    }
}
