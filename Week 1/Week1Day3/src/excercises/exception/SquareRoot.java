package excercises.exception;

/**
 * Created by joschinc on 11/3/16.
 */
public class SquareRoot {
    private final int number;

    public SquareRoot(int number) {
        this.number = number;
    }

    public double getSquareRoot(int number) throws ArithmeticException{
        if(number < 0){
            throw  new ArithmeticException("Square from negative number is not supported");
        } else {
            System.out.println(Math.sqrt(number));
            return Math.sqrt(number);
        }
    }
}
