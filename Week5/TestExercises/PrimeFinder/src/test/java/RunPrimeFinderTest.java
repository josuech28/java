import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by joschinc on 11/30/16.
 */
public class RunPrimeFinderTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PrimeFinderTest.class);
        for (Failure failure:  result.getFailures()){
            System.out.println("Error in: " + failure);
        }
        System.out.println("Status: " + result.wasSuccessful());
    }
}
