package excercises.department;

import excercises.employee.Employee;

import java.util.HashSet;
import java.util.Set;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by joschinc on 11/3/16.
 */
public class Department {

    private int idDepartement;
    private String name;
    private Set<Employee> employees;

    public Department(){
        this.idDepartement = 0;
        this.name = "DEPT-0";
        this.employees = new HashSet<Employee>();

    }
    public Department(int id,String idDepartment) {
        this.idDepartement = id;
        this.name = idDepartment;
        this.employees = new HashSet<Employee>();
    }

    public String getName() {
        return name;
    }

    public void SetName(String idDepartment) {
        this.name = idDepartment;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public String printEmployee(){
        String employeeContent = "";
        for(Employee e: employees){

            employeeContent += e.toString();
        }
        return employeeContent;
    }

    @Override
    public String toString() {
        return "ID Department:" + this.idDepartement + "Name:" + this.name + "\n List of Employees \n" + printEmployee();
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public boolean addEmployee(Employee e1){
        return employees.add(e1);
    }

    public int getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }

}
