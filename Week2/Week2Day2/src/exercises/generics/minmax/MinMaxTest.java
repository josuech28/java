package exercises.generics.minmax;

/**
 * Created by joschinc on 11/14/16.
 */
public class MinMaxTest {
    Integer arrayInt[] = new Integer[]{10,2,4,40,11,23,56};


    public Integer getMin(){
        int min = arrayInt[0];
        for(int i = 0; i < arrayInt.length; i++){
            if(i < min){
                min = arrayInt[i];
            }
        }
        return min;
    }

    public Integer getMax(){
        int max = arrayInt[0];
        try {

            for (int i = 0; i < arrayInt.length; i++) {
                if (i > max) {
                    max = arrayInt[i];
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return max;
    }

    public static <T extends Comparable<T> > T getMin2(T[] elements){
        T min = elements[0];
        for (T element : elements) {
            if(min.compareTo(element) > 0 ) {
                min = element;
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> T getMax2(T[] elements){
        T max = elements[0];
        for (T element : elements) {
            if(max.compareTo(element) < 0 ) {
                max = element;
            }
        }
        return max;
    }

    public  static void main(String[] args){
        MinMaxTest minMaxTest = new MinMaxTest();

        MinMax<Integer,Integer> minMax = new MinMax<Integer, Integer>(minMaxTest.getMin(),minMaxTest.getMax());

        System.out.println("Min: " + minMax.getMin());
        System.out.println("Max: " + minMax.getMax());

        String arrayString[] = new String[]{"Hello","Goal","Run","Next"};
        Float arrayFloat[] = new Float[]{1.4F,1.6F,0.3F,56.8F,40.6F};

        System.out.println("Max: " + MinMaxTest.<String>getMax2(arrayString));
        System.out.println("Min: " + MinMaxTest.getMin2(arrayFloat));
    }
}

