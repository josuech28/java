package exercises.cloning;

import java.util.ArrayList;

/**
 * Created by joschinc on 11/8/16.
 */
public class FruitBasket implements Cloneable {

    private ArrayList<Fruit> fruits;

    public FruitBasket(){
        this.fruits = new ArrayList<Fruit>();
    }

    public boolean addFruit(Fruit fruit){
        return fruits.add(fruit);
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        String listFruit = "";
        for(Fruit f: fruits){
           listFruit+=  f.toString();
        }
        return listFruit;
    }

    @Override
    public FruitBasket clone() throws CloneNotSupportedException {
        FruitBasket fb = (FruitBasket) super.clone();
        fb.setFruits((ArrayList<Fruit>) ((ArrayList<Fruit>) getFruits()).clone());
        return fb;
    }


}
