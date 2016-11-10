package exercises.enums.directions;

/**
 * Created by joschinc on 11/10/16.
 */
public class User {
    private String directionOne;
    private String directionTwo;

    public User(String d1, String d2) {
        this.directionOne = d1;
        this.directionTwo = d2;
    }
    public User(){
        this.directionOne = "DEFAULT-DIRECTION-ONE";
        this.directionTwo = "DEFAULT-DIRECTION-TWO";
    }

    public String getDirectionOne() {
        return directionOne;
    }

    public void setDirectionOne(String directionOne) {
        this.directionOne = directionOne;
    }

    public String getDirectionTwo() {
        return directionTwo;
    }

    public void setDirectionTwo(String directionTwo) {
        this.directionTwo = directionTwo;
    }

    @Override
    public String toString() {
        return "User Directions: \n Direction ONE: " + this.getDirectionOne() + "\n Direction TWO:" + this.getDirectionTwo();
    }
}
