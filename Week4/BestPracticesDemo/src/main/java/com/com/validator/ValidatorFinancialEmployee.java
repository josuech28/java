package com.com.validator;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/25/16.
 */
public class ValidatorFinancialEmployee {

    public int increaseSalary(BigDecimal increment){
        return increment.compareTo(BigDecimal.ZERO);

    }
}
