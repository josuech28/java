package com.market;

import java.math.BigDecimal;

/**
 * Created by joschinc on 12/5/16.
 */
public interface Product {
    String getCode();
    BigDecimal getPrice();
    Promotion getPromotion();

}
