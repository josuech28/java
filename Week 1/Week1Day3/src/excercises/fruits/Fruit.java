package excercises.fruits;

/**
 * Created by joschinc on 11/2/16.
 */
public class Fruit implements Comparable<Fruit> {
    private final String name;

    public Fruit(){
        this.name = "";
    }

    public Fruit(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return "I am a " + this.name;
    }

    @Override
    public int compareTo(Fruit o) {
        return name.compareTo(o.getName());
    }
}
