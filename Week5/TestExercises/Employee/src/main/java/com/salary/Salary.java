package com.salary;

import com.employee.Employee;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/28/16.
 */
public class Salary {
    public BigDecimal increaseSalary(Employee employee, BigDecimal increment){

        if(increment.compareTo(BigDecimal.ZERO) == 1){
            employee.setSalary(employee.getSalary().add(increment));
        }
        return employee.getSalary();
    }
}
