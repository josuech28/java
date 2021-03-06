package excercise.bicyclecontract;

/**
 * Created by joschinc on 11/1/16.
 */
public class MountainBicycle extends Bicycle {

    @Override
    public void applyBreaks(int decrement) {
        this.setVelocity(this.getVelocity() - decrement);
    }

    @Override
    public void speedup(int increment) {
        this.setVelocity(this.getVelocity() + increment);

    }
}
