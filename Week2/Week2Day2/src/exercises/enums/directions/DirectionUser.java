package exercises.enums.directions;

/**
 * Created by joschinc on 11/10/16.
 */
public class DirectionUser {
    private User user;
    private Directions directionsOne;
    private Directions directionsTwo;

    public DirectionUser(){
        this.user = new User();
    }

    private void getEnum(User user) {
        try {
            this.directionsOne = Directions.valueOf(toUpperCase(user.getDirectionOne()));
            this.directionsTwo = Directions.valueOf((toUpperCase(user.getDirectionTwo())));
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public boolean sameDirection(User user){
        boolean equals = false;
        getEnum(user);
        if(this.getDirectionsOne() == this.getDirectionsTwo()){
            System.out.println("Directions are the same..." + this.getDirectionsOne() + " == " + this.getDirectionsTwo());
            equals =  true;
        }
        return equals;
    }

    private String toUpperCase(String text){
        return text.toUpperCase();
    }

    public Directions getDirectionsOne() {
        return directionsOne;
    }

    public Directions getDirectionsTwo() {
        return directionsTwo;
    }
    public void setUser(User user){
        this.user = user;
    }

    @Override
    public String toString() {
        return "----Details----" + user.toString() + "\n Direction ONE " + this.getDirectionsOne() + "\n Direction TWO " + this.getDirectionsTwo();
    }
}

