package excercises.test;

/**
 * Created by joschinc on 11/1/16.
 */
public class ValidateField {

    public ValidateField(){

    }

    public boolean validateName(String name) {
        boolean result = true;
        if (name.isEmpty() || name.equals(null)) {
            result = false;
        }
        return result;
    }
}
