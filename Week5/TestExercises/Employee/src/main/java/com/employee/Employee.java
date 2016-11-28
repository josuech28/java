package com.employee;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/28/16.
 */
public class Employee {
    private final int idEmployee;
    private String name;
    private BigDecimal salary;
    private String department;
    private String address;


    public Employee(int idEmployee, String name, BigDecimal salary, String department, String address) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.salary = salary;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (getIdEmployee() != employee.getIdEmployee()) return false;
        if (!getName().equals(employee.getName())) return false;
        if (!getSalary().equals(employee.getSalary())) return false;
        if (!getDepartment().equals(employee.getDepartment())) return false;
        return getAddress().equals(employee.getAddress());

    }

    @Override
    public int hashCode() {
        int result = getIdEmployee();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getSalary().hashCode();
        result = 31 * result + getDepartment().hashCode();
        result = 31 * result + getAddress().hashCode();
        return result;
    }
}
