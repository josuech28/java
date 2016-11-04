package excercise.animal;

/**
 * Created by joschinc on 11/1/16.
 */
public abstract class GroupRoamer extends Animal {

    public GroupRoamer(String name, String picture, String food, String hunger, String boundary) {
        super(name, picture, food, hunger, boundary);
    }

    @Override
    public void roam(){
        System.out.println("I am a Group Roamer");
    }
}
