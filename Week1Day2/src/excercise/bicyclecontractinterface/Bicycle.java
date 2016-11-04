package excercise.bicyclecontractinterface;

/**
 * Created by joschinc on 11/2/16.
 */
public class Bicycle implements BicycleContract {
    @Override
    public void applyBreaks(int decrement) {
        System.out.println("ApplyBreaks with " + decrement);
    }

    @Override
    public void speedup(int increment) {
        System.out.println("SpeedUp with " + increment);
    }

    @Override
    public void changeYear(int newYear) {
        System.out.println("NEW year " + newYear);
    }
}
