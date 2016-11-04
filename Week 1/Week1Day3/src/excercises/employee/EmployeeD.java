package excercises.employee;

import sun.tools.asm.TryData;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/3/16.
 */
public  class EmployeeD {

    private final int employeeId;
    private String name;
    private BigDecimal salary;

    public EmployeeD(){
        this.employeeId = 0;
        this.name = "";
        this.salary = new BigDecimal("0");
    }

    public EmployeeD(int employeeId, String name, BigDecimal salary){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
    public int getEmployeeId() {
        return employeeId;
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

    public void setSalary(BigDecimal salary) throws ArithmeticException{
        try {
            if (salary.compareTo(BigDecimal.ZERO) == 1) {
                this.salary = salary;

            } else {
                throw new ArithmeticException("Value can not be 0 OR negative");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public String toString(){
        return "ID: " + this.employeeId + "\n Name: " + this.name + "\n Salary: " + this.salary  + "\n";
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        excercises.employee.EmployeeD employee = (excercises.employee.EmployeeD) o;

        if (employeeId != employee.employeeId) return false;
        return name.equals(employee.name);

    }
}
