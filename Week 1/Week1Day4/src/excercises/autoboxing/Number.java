package excercises.autoboxing;

/**
 * Created by joschinc on 11/4/16.
 */
public final class Number implements Comparable<Number> {
    private final int num;

    public Number(int num){
        this.num = num;
    }

    @Override
    public int compareTo(Number o) {
        return Integer.compare(num, o.num);
    }

    @Override
    public String toString() {
        return "Number: " + this.num;
    }
}
