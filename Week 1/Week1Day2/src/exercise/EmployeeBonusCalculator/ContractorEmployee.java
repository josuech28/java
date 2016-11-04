package exercise.EmployeeBonusCalculator;

/**
 * Created by joschinc on 11/1/16.
 */
public class ContractorEmployee extends Employee {

    public  ContractorEmployee(int id, String name,double salary){
        super(id,name,salary);
    }
    private final double BONUS = 5000;

    @Override
    public double bonusPay(){
        this.setSalary(this.getSalary() + BONUS);
        return this.getSalary();
    }
}
