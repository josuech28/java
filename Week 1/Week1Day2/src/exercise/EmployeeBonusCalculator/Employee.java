package exercise.EmployeeBonusCalculator;

/**
 * Created by joschinc on 11/1/16.
 */
public abstract class Employee {

    protected int employeeId;
    protected   String name;
    protected double salary;

    public Employee(){
        this.employeeId = 0;
        this.name = "";
        this.salary = 0.0;
    }

    public Employee(int employeeId, String name, double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double bonusPay();

    @Override
    public String toString(){
        return "ID: " + this.employeeId + "\n Name: " + this.name + "\n Salary: " + this.salary;
    }
}
