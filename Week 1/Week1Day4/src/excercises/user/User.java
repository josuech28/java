package excercises.user;

/**
 * Created by joschinc on 11/7/16.
 */
public class User {

    private String name;
    private final int id;
    private String password;

    public User(int id,String name, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
    public User(int id , String password) {
        this.id = id;
        this.password = password;
    }

    public User() {
        this.name = "";
        this.id = 0;
        this.password = "";
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User:" + this.getId() +  " " + this.getName() + " " + this.getPassword();
    }
}
