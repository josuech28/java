package shoppingcart;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.FileNotFoundException;

/**
 * Created by joschinc on 12/5/16.
 */
public class ShoppingCartServiceTestRun {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ShoppingCartServiceTest.class);

        for(Failure failure : result.getFailures()){
            System.out.println("Error in:" + failure.toString());
        }

        System.out.println("STATUS " + result.wasSuccessful());
    }
}
