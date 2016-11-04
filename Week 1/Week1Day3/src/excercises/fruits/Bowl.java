package excercises.fruits;

import java.sql.ResultSet;
import java.util.*;

/**
 * Created by joschinci on 11/2/16.
 */
public class Bowl {
    // Test with different collections
    private ArrayList<Fruit> fruits;
    private LinkedList<Fruit> fruitsL;
    private Set<Fruit> fruitSet;
    public Bowl(){
        this.fruits = new ArrayList<Fruit>();
        this.fruitsL = new LinkedList<Fruit>();
        this.fruitSet = new HashSet<Fruit>();
    }

    public boolean addFruit(Fruit fruit){
        return fruits.add(fruit);
    }
    public boolean addFruitL(Fruit fruit){
        return fruitsL.add(fruit);
    }
    public boolean addFruitS(Fruit fruit){
        return fruitSet.add(fruit);
    }
    //Ver jerarquia de collecciones
    //Y para que sirve un iterador, y trate de ver si lo definen como un patron de disenno
    //como se implementa el forEach en java
    public void printFruits() {
        for(Fruit fruit: fruits){
            System.out.println(fruit.toString());
        }
    }

    public void printFruitsL() {
        for(Fruit fruit: fruitsL){
            System.out.println(fruit.toString());
        }
    }

    public void printFruitsT() {
        for(Fruit fruit: fruitSet){
            System.out.println(fruit.toString());
        }
    }
    public int sizeT(){
        System.out.println(fruitSet.size());
        return fruitSet.size();
    }


    public void sort(){
        Collections.sort(fruits, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    public void printByIterator(){
        Iterator<Fruit> it = fruits.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }
    }
}
// Exampple of study
class Persona implements Iterable<Persona>{

    @Override
    public Iterator<Persona> iterator() {
        return new Iterator<Persona>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Persona next() {
                return new Persona();
            }

            @Override
            public void remove() {

            }
        };
    }
}
