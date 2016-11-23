package com.operation;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/23/16.
 */
public class PortafolioOperation {

    public BigDecimal getMarketValue(BigDecimal stockService, int value){
        BigDecimal result = new BigDecimal("0");
        BigDecimal valueB = new BigDecimal(value);
        result =  stockService.multiply(valueB);
        return  result;
    }
}
