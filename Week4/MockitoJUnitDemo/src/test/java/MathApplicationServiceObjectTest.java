import com.calculator.CalculatorService;
import com.calculator.MathApplication;
import com.calculator.MathApplicationServiceObject;
import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import static org.mockito.BDDMockito.*;

import java.math.BigDecimal;

import static org.mockito.Mockito.*;

/**
 * Created by joschinc on 11/25/16.
 */

// JUnit init test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationServiceObjectTest {
    private MathApplicationServiceObject mathApplication;
    private CalculatorService calculatorService;

    @Before
    public void setUp(){
        mathApplication = new MathApplicationServiceObject();
        Calculator calculator = new Calculator();
        //With Mock Object
        //calculatorService = mock(CalculatorService.class);

        // Using  Spy
        calculatorService = spy(calculator);
        mathApplication.setCalculatorService(calculatorService);
    }

    @Test
    public void addTest() {
        BigDecimal parameterA = new BigDecimal("15");
        BigDecimal parameterB = new BigDecimal("10");
        BigDecimal result = new BigDecimal("25");
        //Behavior
        when(calculatorService.add(parameterA,parameterB)).thenReturn(result);

        //test
        Assert.assertEquals(mathApplication.add(parameterA,parameterB),result);

        //Verify
        verify(calculatorService).add(parameterA,parameterB);

    }

    @Test
    public void operationTest(){
        BigDecimal parameterA = new BigDecimal("15");
        BigDecimal parameterB = new BigDecimal("10");
        BigDecimal result = new BigDecimal("150");
        BigDecimal resultAdd = new BigDecimal("25");
        //Behavior
        when(calculatorService.multiply(parameterA,parameterB)).thenReturn(result);

        when(calculatorService.add(parameterA,parameterB)).thenReturn(resultAdd);

        // Test
        Assert.assertEquals(mathApplication.multiply(parameterA,parameterB),result);
        Assert.assertEquals(mathApplication.add(parameterA,parameterB),resultAdd);

        // Verify single mock
        InOrder order = inOrder(calculatorService);

        //following will make sure that multiply is first called then add is called.
        //So need to put first multiply and then add
        order.verify(calculatorService).multiply(parameterA,parameterB);
        order.verify(calculatorService).add(parameterA,parameterB);
    }

    // Call Backs
    @Test
    public void callBackTest(){
        BigDecimal parameterA = new BigDecimal("15");
        BigDecimal parameterB = new BigDecimal("10");
        final BigDecimal result = new BigDecimal("5");
        when(calculatorService.remainder(parameterA,parameterB)).thenAnswer(new Answer<BigDecimal>() {

            public BigDecimal answer(InvocationOnMock invocation) throws Throwable {
                //get the arguments passed to mock
                Object[] args = invocation.getArguments();

                //get the mock
                Object mock = invocation.getMock();

                //return the result
                return result;
            }
        });
    }
    // Behaviior Drive Development
    public void givenTest(){
        BigDecimal parameterA = new BigDecimal("15");
        BigDecimal parameterB = new BigDecimal("10");
        final BigDecimal result = new BigDecimal("5");
        given(calculatorService.add(parameterA,parameterB)).willReturn(result);

        BigDecimal resultOperation = mathApplication.add(parameterA,parameterB);
        Assert.assertEquals(resultOperation,result);

    }
    // Spy
    class Calculator implements CalculatorService{
        public BigDecimal add(BigDecimal a, BigDecimal b) {
            return a.add(b);
        }

        public BigDecimal substract(BigDecimal a, BigDecimal b) {
            return a.subtract(b);
        }

        public BigDecimal remainder(BigDecimal a, BigDecimal b) {
            return a.remainder(b);
        }

        public BigDecimal multiply(BigDecimal a, BigDecimal b) {
            return a.multiply(b);
        }

        public BigDecimal division(BigDecimal a, BigDecimal b) throws RuntimeException{
            if(b.compareTo(BigDecimal.ZERO) == 0){
                throw  new RuntimeException("Division by zero is not defined");
            } else {
                return a.divide(b);
            }
        }
    }

}
