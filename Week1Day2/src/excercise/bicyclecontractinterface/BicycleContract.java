package excercise.bicyclecontractinterface;

/**
 * Created by joschinc on 11/2/16.
 */
public interface BicycleContract {

    public abstract void applyBreaks(int decrement);

    public abstract void speedup(int increment);

    public abstract void changeYear(int newYear);
}

