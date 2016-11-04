package excercises.employee;

/**
 * Created by joschinc on 10/31/16.
 */
public class VerifyBirthYear {

    private final int TIME_TO_LEFT = 58;
    private final int CURRENT_YEAR = 2016;

    public VerifyBirthYear(){

    }

    public boolean checkBirthYear(int number){
        boolean flag = false;
        if(number > 0 && number < CURRENT_YEAR){
            flag = true;
        }
        return flag;
    }

    public int differentYear(int currentTime, int yearBirthday){
        return currentTime - yearBirthday;
    }

    public int timeToLeft(int currentTime, int yearBirthday){
        int differentTime = differentYear(currentTime,yearBirthday);
        int result = TIME_TO_LEFT - differentTime;
        if(result > 0){
            return result;
        } else {
            return -1;
        }
    }
}
