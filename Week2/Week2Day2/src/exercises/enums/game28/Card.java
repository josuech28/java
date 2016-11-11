package exercises.enums.game28;

/**
 * Created by joschinc on 11/11/16.
 */
public enum Card {
    DEUCE(0), TREE(0), FOUR(0), FIVE(0), SIX(0), SEVEN(0), EIGHT(0), NINE(2), TEN(1), JACK(3), QUEEN(0), KING(0), ACE(1);

    private  int point;

    private Card(int point){
        this.point = point;
    }

    public int getPoint(){
        return this.point;
    }

    public String toString(Card c) {
        return c.name() + " Points: " + c.getPoint() ;
    }
}
