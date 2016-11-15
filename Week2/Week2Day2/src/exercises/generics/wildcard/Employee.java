package exercises.generics.wildcard;

/**
 * Created by joschinc on 11/14/16.
 */
public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
