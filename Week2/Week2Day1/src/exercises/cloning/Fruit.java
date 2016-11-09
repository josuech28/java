package exercises.cloning;

/**
 * Created by joschinc on 11/8/16.
 */
public class Fruit implements Cloneable {

    private String name;
    private String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit: " + this.getName() + " Color: " + this.getColor() + "\n";
    }

    @Override
    public  Fruit clone() throws CloneNotSupportedException {
        Fruit fruit = (Fruit) super.clone();
        return fruit;
    }
}
