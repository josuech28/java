package com.Company;

import com.Employee.Employee;
import com.crud.CompanyOperation;

import java.util.List;

/**
 * Created by joschinc on 11/25/16.
 */
public class Company implements CompanyOperation {
    private final int idCompany;
    private String name;
    private List<Employee> employees;

    public Company(int idCompany, String name, List<Employee> employees) {
        this.idCompany = idCompany;
        this.name = name;
        this.employees = employees;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private String printEmployee(){
        String result = "";
        for(Employee employee: employees){
            result += employee.printEmployee();
        }
        return result;
    }

    public void printCompany(){
        System.out.println("Company: \n ID: "+ this.getIdCompany() + "\n Name: " + this.getName() + "\n Employees:" + printEmployee());
    }

    public boolean addEmployee(Employee employee) {
        return this.getEmployees().add(employee);
    }

    public boolean deleteEmployee(Employee employee) {
        return this.getEmployees().remove(employee);
    }
}
