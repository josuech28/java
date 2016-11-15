package exercises.generics.middle;

/**
 * Created by joschinc on 11/14/16.
 */
public class Middle {

    public static <T> T getMiddle(T[] elements){
        System.out.println("Middle element:" + elements[elements.length/2]);
        return elements[elements.length/2];
    }
}
