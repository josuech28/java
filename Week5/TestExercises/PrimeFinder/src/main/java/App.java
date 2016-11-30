import com.exercise.PrimeFinder;
import com.exercise.PrimeFinderImpl;

/**
 * Created by joschinc on 11/29/16.
 */
public class App {
    public static void main(String[] args) {
        PrimeFinder pf = new PrimeFinderImpl();

        long number = 1234433444555551123L;
        boolean result = pf.findPrime(number);
        System.out.println("Result: "+ result);
    }
}
