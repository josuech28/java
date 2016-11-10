package exercises.enums.directions;

import java.util.ArrayList;

/**
 * Created by joschinc on 11/10/16.
 */
public class DirectionList {
    private Directions directions;
    private ArrayList<Enum> listDirections;

    public DirectionList(){
        this.listDirections = new ArrayList<Enum>();
    }

    public void getDirections(){
        for(Directions direction: Directions.values()){
            System.out.println("Direction: " + direction);
            listDirections.add(direction);
        }
    }

    public void printListDirection(){
        for(Enum direction: listDirections){
            System.out.println("Direction: " + direction);
        }
    }
}
