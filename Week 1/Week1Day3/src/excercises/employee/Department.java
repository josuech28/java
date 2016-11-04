package excercises.employee;

import excercises.hashmap.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by joschinc on 11/3/16.
 */
public class Department {



    private String idDepartment;
    private Set<EmployeeD> employees;

    public Department(){
        this.idDepartment = "DEPT-0";
        this.employees = new HashSet<EmployeeD>();

    }
    public Department(String idDepartment) {
        this.idDepartment = idDepartment;
        this.employees = new HashSet<EmployeeD>();
    }

    public String getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    public Set<EmployeeD> getEmployees() {
        return employees;
    }

    public String printEmployee(){
        String employeeContent = "";
        for(EmployeeD e: employees){

            employeeContent += e.toString();
        }
        return employeeContent;
    }

    @Override
    public String toString() {
        return "ID Department:" + this.idDepartment + "\n List of Employees \n" + printEmployee();
    }

    public void setEmployees(Set<EmployeeD> employees) {
        this.employees = employees;
    }

    public boolean addEmployee(EmployeeD e1){
        return employees.add(e1);
    }


}
