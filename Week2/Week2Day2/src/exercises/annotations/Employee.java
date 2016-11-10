package exercises.annotations;

/**
 * Created by joschinc on 11/10/16.
 */
public class Employee {
    private int id;
    private String name;

    public  Employee(){
        this.id = 0;
        this.name = "Default name";
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    @Deprecated
    public void printEmployee(){
        System.out.println("ID: " + this.getId() + " Name: "  + this.getName() );
    }

}
