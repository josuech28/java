package com.model;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/16/16.
 */
public class Calculator implements Operation {
    public BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public BigDecimal divide(BigDecimal a, BigDecimal b) throws ArithmeticException {
        return a.divide(b);
    }

    public BigDecimal module(BigDecimal a, BigDecimal b) {
        return a.remainder(b);
    }
}
