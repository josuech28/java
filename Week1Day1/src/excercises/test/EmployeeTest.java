package excercises.test;

import excercises.address.*;

/**
 * Created by joschinc on 10/31/16.
 */
public class EmployeeTest {

    private int idEmployee;
    private String name;
    private String proyect;
    private Address addressEmployee;
    private double salary;
    private VerifySalary checkSalary;
    private ValidateField checkField;

    public EmployeeTest(){
        this.idEmployee = 0;
        this.name = "";
        this.proyect = "";
        this.salary = 0.0;
        this.addressEmployee = new Address();
        this.checkSalary = new VerifySalary();
        this.checkField = new ValidateField();
    }

    public EmployeeTest(int idEmployee, String name, String proyect){
        this.idEmployee = idEmployee;
        this.name = name;
        this.proyect = proyect;
        this.salary = 1200;
        this.addressEmployee = new Address();
        this.checkSalary = new VerifySalary();
        this.checkField = new ValidateField();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(checkSalary.restrictSalary(salary)) {
            this.salary = salary;
        }
    }

    public void setName(String name){
        if(checkField.validateName(name)){
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void addAddress(String country, String city, String street, int zipCode){
        this.addressEmployee.setCountry(country);
        this.addressEmployee.setCity(city);
        this.addressEmployee.setStreet(street);
        this.addressEmployee.setZipCode(zipCode);
    }

    public void printEmployee(){
        System.out.println("ID: " + this.idEmployee);
        System.out.println("Name: " + this.name);
        System.out.println("Proyect: " + this.proyect);
        System.out.println("Salary: " + this.salary);
        System.out.println("Address Information");
        this.addressEmployee.printAddress();
    }
    public boolean increaseSalary(double salary, float incrementPorcent){
        if(checkSalary.restrictSalary(salary) && checkSalary.restrictIncrement(incrementPorcent)){
            double increment = salary  * (incrementPorcent / 100);
            this.setSalary(getSalary() + increment);
            System.out.println("New Salary:" + this.getSalary());
            return true;
        } else {
            return false;
        }
    }

    public boolean increaseSalary(EmployeeTest e1, float incrementPorcent){
        if(checkSalary.restrictSalary(e1.getSalary()) && checkSalary.restrictIncrement(incrementPorcent)){
            double increment = e1.getSalary()  * (incrementPorcent / 100);
            e1.setSalary(e1.getSalary() + increment);
            System.out.println("New Salary:" + e1.getSalary());
            return true;
        } else {
            return false;
        }
    }
}
