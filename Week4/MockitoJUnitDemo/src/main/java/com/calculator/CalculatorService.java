package com.calculator;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/25/16.
 */
public interface CalculatorService {
    BigDecimal add(BigDecimal a, BigDecimal b);

    BigDecimal substract(BigDecimal a, BigDecimal b);

    BigDecimal remainder(BigDecimal a, BigDecimal b);

    BigDecimal multiply(BigDecimal a, BigDecimal b);

    BigDecimal division(BigDecimal a, BigDecimal b);



}
