package exercises.enums.game28;

import java.util.*;

/**
 * Created by joschinc on 11/11/16.
 */
public class RankTest {
    private final Map<TypeCard,Set<Card>> cards = new EnumMap<TypeCard,Set<Card>>(TypeCard.class);

    public RankTest() {
        cards.put(TypeCard.CLUB, EnumSet.allOf(Card.class));
        cards.put(TypeCard.DIAMOND, EnumSet.allOf(Card.class));
        cards.put(TypeCard.HEART, EnumSet.allOf(Card.class));
        cards.put(TypeCard.SPADE, EnumSet.allOf(Card.class));
    }

    public int getPoints(){
        int points = 0;
        Set<Map.Entry<TypeCard,Set<Card>>> keySet = cards.entrySet();
        for(Map.Entry<TypeCard,Set<Card>> card: keySet){
            Iterator<Card> it = card.getValue().iterator();
            while(it.hasNext()) {
                points += it.next().getPoint();
            }
        }
        return points;
    }

    public void printValue(){
        Set<Map.Entry<TypeCard,Set<Card>>> keySet = cards.entrySet();
        for(Map.Entry<TypeCard,Set<Card>> card: keySet){
            Iterator<Card> it = card.getValue().iterator();
            while(it.hasNext()) {
                System.out.println(card.getKey().toString() + " " + it.next().toString());
            }
        }


    }
}
