package exercise.EmployeeBonusCalculator;

/**
 * Created by joschinc on 11/1/16.
 */
public class RegularEmployee extends Employee {
    public RegularEmployee(int id, String name, double salary){
        super(id,name,salary);
    }
    @Override
    public double bonusPay() {

        double increment = this.getSalary() * (15.0 / 100.0);
        this.setSalary(this.getSalary() + increment);
        return this.getSalary();
    }
}
