package excercise.bicyclecontract;

/**
 * Created by joschinc on 11/1/16.
 */
public abstract class Bicycle {


    private int velocity;


    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public abstract void applyBreaks(int decrement);

    public abstract void speedup(int increment);
}
