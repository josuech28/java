package com.model;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/16/16.
 */
public interface Operation {
    public BigDecimal add(BigDecimal a, BigDecimal b);

    public BigDecimal subtract(BigDecimal a, BigDecimal b);

    public BigDecimal multiply(BigDecimal a, BigDecimal b);

    public BigDecimal divide (BigDecimal a, BigDecimal b);

    public BigDecimal module(BigDecimal a, BigDecimal b);
}
