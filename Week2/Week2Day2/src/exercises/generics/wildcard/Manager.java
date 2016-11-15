package exercises.generics.wildcard;

/**
 * Created by joschinc on 11/14/16.
 */
public class Manager extends Employee {
    private String team;

    public Manager(String name, String team) {
        super(name);
        this.team = team;
    }

    public Manager(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return super.toString() +  " Manager{" +
                "team='" + team + '\'' +
                '}';
    }
}
