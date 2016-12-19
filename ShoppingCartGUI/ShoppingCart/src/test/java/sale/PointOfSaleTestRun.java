package sale;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by joschinc on 12/5/16.
 */
public class PointOfSaleTestRun {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PointOfSaleTest.class);
        for(Failure failure: result.getFailures()){
            System.out.println("Error in: " + failure.toString());
        }
        System.out.println("STATUS " + result.wasSuccessful());
    }
}
