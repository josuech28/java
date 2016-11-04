package excercises.varargs;

/**
 * Created by joschinc on 11/4/16.
 */
public class HardCoded {

    public int average(int... numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        System.out.println("Average of number is " + sum / numbers.length);
        return sum / numbers.length;
    }
}
