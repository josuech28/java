package com.Employee;

import com.address.Address;
import com.com.validator.ValidatorFinancialEmployee;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/25/16.
 */
public class FinacialEmployee implements Employee, Comparable<FinacialEmployee> {

    private final int idEmployee;
    private String name;
    private BigDecimal salary;
    private Address address;

    public FinacialEmployee(int idEmployee, String name, BigDecimal salary, Address address) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String printEmployee() {
        String result = " Employee:\n " +
                "ID: " + this.getIdEmployee() + "\n" +
                        "Name: " + this.getName() + "\n" +
                        "Salary: " + this.getSalary() + "\n" +
                        "Address:" + this.address.toString();
        return result;
    }

    public BigDecimal increaseSalary(BigDecimal increment) {
        ValidatorFinancialEmployee validator = new ValidatorFinancialEmployee();
        if(validator.increaseSalary(increment) > 0){
            this.setSalary(this.getSalary().add(increment));
        }
        return getSalary();
    }

    public int compareTo(FinacialEmployee o) {

        int compareID = ((FinacialEmployee) o).getIdEmployee();

        //ascending order
        return this.idEmployee - compareID;
    }
}
