package excercise.animal;

/**
 * Created by joschinc on 11/1/16.
 */
public class Deer extends GroupRoamer {
    public Deer(String name, String picture, String food, String hunger, String boundary) {
        super(name, picture, food, hunger, boundary);
    }
    @Override
    public void speak(){
        System.out.println("I am a Deer speaking");
    }

    @Override
    public void  eat(){
        System.out.println("I am a Deer eating");
    }
}
