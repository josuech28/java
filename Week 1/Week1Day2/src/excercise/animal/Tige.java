package excercise.animal;

/**
 * Created by joschinc on 11/1/16.
 */
public class Tige extends SinglerRoamer {
    public Tige(String name, String picture, String food, String hunger, String boundary) {
        super(name, picture, food, hunger, boundary);
    }
    @Override
    public void speak(){
        System.out.println("I am a Tige speaking");
    }

    @Override
    public void  eat(){
        System.out.println("I am a Tige eating");
    }

}
