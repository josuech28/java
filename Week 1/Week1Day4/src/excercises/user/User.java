package excercises.user;

/**
 * Created by joschinc on 11/7/16.
 */
public class User {



    private String name;
    private final int id;
    private int password;

    public User(String name, int id, int password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public User() {
        this.name = "";
        this.id = 0;
        this.password = 0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User:" + this.getId() +  " " + this.getName() + " " + this.getPassword();
    }
}
