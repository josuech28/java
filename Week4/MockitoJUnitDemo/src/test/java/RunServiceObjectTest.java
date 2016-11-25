import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by joschinc on 11/25/16.
 */
public class RunServiceObjectTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MathApplicationServiceObjectTest.class);
        for(Failure failure: result.getFailures()){
            System.out.println("Error In:" + failure.toString());
        }

        System.out.println("Result: " + result.wasSuccessful());
    }
}
