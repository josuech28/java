package exercises.generics.minmax;

/**
 * Created by joschinc on 11/14/16.
 */
public class MinMax<Min,Max> {
    private Min min;
    private Max max;

    public MinMax(Min min, Max max) {
        this.min = min;
        this.max = max;
    }

    public Min getMin() {
        return min;
    }

    public void setMin(Min min) {
        this.min = min;
    }

    public Max getMax() {
        return max;
    }

    public void setMax(Max max) {
        this.max = max;
    }
}
