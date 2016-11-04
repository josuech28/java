package excercises.fruits;


import java.util.Set;
import java.util.TreeSet;

/**
 * Created by joschinc on 11/2/16.
 */
public class BowlSort {
    private Set<Fruit> fruits;

    public BowlSort(){
        this.fruits = new TreeSet<Fruit>();
    }

    public boolean addFruit(Fruit fruit){
        return fruits.add(fruit);
    }

    public void printFruit(){
        for(Fruit fruit: fruits){
            System.out.println(fruit.toString());
        }
    }
}
