package exercises.enums.game28;

/**
 * Created by joschinc on 11/11/16.
 */
public enum TypeCard {
    HEART, SPADE, CLUB, DIAMOND;


    public String toString(TypeCard tp) {
        return tp.name();
    }
}
