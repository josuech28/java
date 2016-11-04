package excercises.circle;
import static java.lang.Math.*;
/**
 * Created by joschinc on 11/4/16.
 */
public class Circle {
    private final int  radius;

    public Circle(){
        this.radius = 0;
    }

    public int getRadius() {
        return this.radius;
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2 * PI * this.getRadius();
    }
    public double getArea(){
        return PI * this.getRadius() * this.getRadius();
    }

    @Override
    public String toString() {
        return "Circle Details \n Radius: " + this.getRadius() + "\n Area: " + this.getArea() + "\n Perimeter: " + this.getPerimeter();
    }
}
