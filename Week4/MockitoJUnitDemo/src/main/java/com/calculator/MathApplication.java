package com.calculator;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/25/16.
 */
public class MathApplication implements CalculatorService  {

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
