package com.calculator;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/25/16.
 */
public class MathApplicationServiceObject implements CalculatorService {

    private CalculatorService calculatorService;

    public void setCalculatorService(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    public BigDecimal add(BigDecimal a, BigDecimal b) {
        return calculatorService.add(a,b);
    }

    public BigDecimal substract(BigDecimal a, BigDecimal b) {
        return calculatorService.substract(a,b);
    }

    public BigDecimal remainder(BigDecimal a, BigDecimal b) {
        return calculatorService.remainder(a,b);
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return calculatorService.multiply(a,b);
    }

    public BigDecimal division(BigDecimal a, BigDecimal b) {
        return calculatorService.division(a,b);
    }
}
