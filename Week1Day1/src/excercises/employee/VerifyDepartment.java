package excercises.employee;

/**
 * Created by joschinc on 10/31/16.
 */
public class VerifyDepartment {

    public VerifyDepartment(){

    }

    public boolean checkDepartment(String nameDepartment){
        if(nameDepartment == null || nameDepartment.isEmpty()){
            return false;

        } else {

            return true;
        }
    }
}
