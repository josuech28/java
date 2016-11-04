package excercise.workerpersonemployee;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by joschinc on 11/2/16.
 */
public final  class EmployeeInterface implements Person, Worker {
    private final String name;
    private final int age;
    private final BigDecimal salary;
    private final Date joinDate;

    public EmployeeInterface(String name, int age, BigDecimal salary, Date joinDate){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.joinDate = joinDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public Date getJoiningDate() {
        return joinDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
