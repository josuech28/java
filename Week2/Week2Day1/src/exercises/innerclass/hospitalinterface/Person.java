package exercises.innerclass.hospitalinterface;

/**
 * Created by joschinc on 11/8/16.
 */
public class Person   {

    private final int id;
    private String name;
    private HealthStatus healthStatus;

    public Person(int id, String name, HealthStatus healthStatus) {
        this.id = id;
        this.name = name;
        this.healthStatus = healthStatus;
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

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }
}
