import com.calculator.CalculatorService;
import com.calculator.MathApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.mockito.Mockito.*;

/**
 * Created by joschinc on 11/25/16.
 */
// JUnit init test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

    // Inject and create mock object
    // @Inject...
    @Mock
    MathApplication mathApplication = new MathApplication();

    // Create a mock  object to be inject
    @Mock
    CalculatorService calculatorService;

    @Test
    public void addTest(){
        BigDecimal parameterA = new BigDecimal("15");
        BigDecimal parameterB = new BigDecimal("10");
        BigDecimal result = new BigDecimal("25");

        // Behavior
        when(mathApplication.add(parameterA,parameterB)).thenReturn(result);

        //Test
        Assert.assertEquals(mathApplication.add(parameterA,parameterB),result);

        //Verify parameters are okay
        verify(mathApplication).add(parameterA,parameterB);
    }

    @Test
    public void substractTest(){
        BigDecimal parameterA = new BigDecimal("15");
        BigDecimal parameterB = new BigDecimal("10");
        BigDecimal result = new BigDecimal("5");

        // Behavior
        when(mathApplication.substract(parameterA,parameterB)).thenReturn(result);

        Assert.assertEquals(mathApplication.substract(parameterA,parameterB),result);

        //Verify and check if add function is called N times
        verify(mathApplication, times(1)).substract(parameterA,parameterB);


        // Never call this method with this parameters
        verify(mathApplication, never()).multiply(parameterA,parameterB);
    }

    @Test
    public void multiply(){
        BigDecimal parameterA = new BigDecimal("15");
        BigDecimal parameterB = new BigDecimal("10");
        BigDecimal result = new BigDecimal("150");

        // Behavior
        when(mathApplication.multiply(parameterA,parameterB)).thenReturn(result);

        //Test
        Assert.assertEquals(mathApplication.multiply(parameterA,parameterB),result);
        Assert.assertEquals(mathApplication.multiply(parameterA,parameterB),result);

        //atLeast (int min) − expects min calls.
        //atLeastOnce () − expects at least one call.
        //atMost (int max) − expects max calls.

        verify(mathApplication, atLeast(1)).multiply(parameterA,parameterB);
        verify(mathApplication, atLeastOnce()).multiply(parameterA,parameterB);
        verify(mathApplication, atMost(2)).multiply(parameterA,parameterB);
    }

    //Handling Exceptions
    @Test(expected = RuntimeException.class)
    public void divideTest(){
        BigDecimal parameterA = new BigDecimal("150");
        BigDecimal parameterB = new BigDecimal("0");
        BigDecimal result = new BigDecimal("150");

        // Exception
        doThrow(new RuntimeException("Division by zero is not defined")).when(mathApplication.division(parameterA,parameterB));

        Assert.assertEquals(mathApplication.division(parameterA,parameterB),new RuntimeException("Division by zero is not defined"));
    }

    //Time Out
    @Test
    public  void timeOutTest(){
        BigDecimal parameterA = new BigDecimal("150");
        BigDecimal parameterB = new BigDecimal("2");
        BigDecimal result = new BigDecimal("300");
        BigDecimal resultSubs = new BigDecimal("148");

        when(mathApplication.multiply(parameterA,parameterB)).thenReturn(result);
        when(mathApplication.substract(parameterA,parameterB)).thenReturn(resultSubs);

        Assert.assertEquals(mathApplication.multiply(parameterA,parameterB),result);
        Assert.assertEquals(mathApplication.substract(parameterA,parameterB),resultSubs);

        verify(mathApplication, timeout(100)).multiply(parameterA,parameterB);
        verify(mathApplication, timeout(100)).substract(parameterA,parameterB);
    }


}
