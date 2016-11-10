package exercises.annotations.worker;

/**
 * Created by joschinc on 11/10/16.
 */
public class Worker {

    private final int id;
    private String name;

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() + " Name: " + this.getName();
    }
}
