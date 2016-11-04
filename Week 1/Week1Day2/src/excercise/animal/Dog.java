package excercise.animal;

/**
 * Created by joschinc on 11/1/16.
 */
public class Dog extends GroupRoamer {
    public Dog(String name, String picture, String food, String hunger, String boundary) {
        super(name, picture, food, hunger, boundary);
    }

    @Override
    public void speak(){
        System.out.println("I am a Dog speaking");
    }

    @Override
    public void  eat(){
        System.out.println("I am a Dog eating");
    }

    public void play(){
        System.out.println("I am a Dog playing");
    }
}
