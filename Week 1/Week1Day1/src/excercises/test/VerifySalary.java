package excercises.test;

/**
 * Created by joschinc on 10/31/16.
 */
public class VerifySalary {

    public VerifySalary(){

    }

    public boolean restrictSalary(double salary){
        boolean flag = false;
        if(salary > 0 && salary <= 10000){
            flag = true;
        }
        return flag;
    }

    public boolean restrictIncrement(float increment){
        boolean flag = false;
        if(increment > 0 && increment <= 100.0){
            flag = true;
        }
        return flag;
    }
}
