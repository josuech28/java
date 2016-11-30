import com.exercise.PrimeFinderImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

/**
 * Created by joschinc on 11/29/16.
 */
public class PrimeFinderTest {
    @BeforeClass
    public static void setUp(){
        primeFinder = new PrimeFinderImpl();
    }

    @Test(expected = ArithmeticException.class)
    public void findPrimeNegativeValueTest(){
        long number = -1234433444555551123L;
        boolean result = false;
        assertEquals("FAIL",primeFinder.findPrime(number),result);
    }
    @Test
    public void findPrimeTest(){
        long number = 7753;
        boolean result =  true;
        assertEquals("FAIL",primeFinder.findPrime(number),result);
    }
    @Test(timeout = 100)
    public void findPrimeTimeOutTest(){
        long number = 1234433444555551123L;
        boolean result = false;
        assertEquals("FAIL",primeFinder.findPrime(number),result);
    }

    // How to test private method?
    @Test
    public void isPrimeTest() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException{
            long number = 7753;
            /*
            Method[] method1 = PrimeFinderImpl.class.getDeclaredMethods();
            System.out.println(Arrays.toString(method1));
                */
            Method method = PrimeFinderImpl.class.getDeclaredMethod("isPrime", long.class);


            method.setAccessible(true);
            Boolean output = (Boolean) method.invoke(primeFinder, number);
            assertTrue(output);
    }

    @Test
    public void findSquareRootTest(){
        int number = 25;
        int result = 5;
        assertEquals("Fail:",primeFinder.findSquareRoot(number),result);
    }

    @Test(expected = ArithmeticException.class)
    public void findSquareRootNegativeNumberTest(){
        int number = -25;
        assertEquals("Fail in",primeFinder.findSquareRoot(number), new ArithmeticException("Do not accept negative values"));
    }


    private static PrimeFinderImpl primeFinder;
}
