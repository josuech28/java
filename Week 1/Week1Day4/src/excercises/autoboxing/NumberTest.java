package excercises.autoboxing;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by joschinc on 11/4/16.
 */
public class NumberTest {
    private ArrayList<Number> numbers;

    public NumberTest(){
        this.numbers = new ArrayList<Number>();
    }

    public boolean addNumber(Number number){
        return numbers.add(number);
    }

    public void sortArray(){
        Collections.sort(numbers);
    }

    public void print(){
        for(Number num : numbers){
            System.out.println(num.toString());
        }
    }


}
