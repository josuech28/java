package excercise.animal;

/**
 * Created by joschinc on 11/1/16.
 */
public abstract class Animal {

    protected String name;
    protected String picture;
    protected String food;
    protected String hunger;
    protected String boundary;

    public Animal(String name, String picture, String food, String hunger, String boundary){
        this.name = name;
        this.picture = picture;
        this.food = food;
        this.hunger = hunger;
        this.boundary = boundary;
    }

    public void speak(){
        System.out.println("I am a Animal speaking");
    }
    public void eat(){
        System.out.println("I am a Animal eating");
    }
    public void sleep(){
        System.out.println("I am a Animal sleeping");
    }
    public abstract void roam();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", food='" + food + '\'' +
                ", hunger='" + hunger + '\'' +
                ", boundary='" + boundary + '\'' +
                '}';
    }
}
