import com.model.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/16/16.
 */
public class CalculatorTest {

    //private Calculator
    private  Calculator calculator = new Calculator();
    private BigDecimal value1 = new BigDecimal("2400");
    private  BigDecimal value2 = new BigDecimal("1200");

    double b = 5;

    @Test
    public void sum(){
        Assert.assertEquals(calculator.add(value1,value2),new BigDecimal("3600"));
    }

    @Test
    public void divide(){
        Assert.assertEquals(calculator.divide(value1,value2), new BigDecimal("2"));
    }

    @Test
    public void substract(){
        Assert.assertEquals(calculator.subtract(value1,value2), new BigDecimal("1200"));
    }

    @Test
    public void multiply(){
        Assert.assertEquals(calculator.multiply(value1,value2), new BigDecimal("2880000"));
    }

    @Test
    public void remainder(){
        Assert.assertEquals(calculator.module(value1,value2), new BigDecimal("0"));
    }
}
