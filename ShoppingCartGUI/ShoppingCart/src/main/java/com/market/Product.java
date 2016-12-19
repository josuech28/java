package com.market;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by joschinc on 12/5/16.
 */
public interface Product {
    String getCode();
    BigDecimal getPrice();
    Promotion getPromotion();
    ArrayList<String> getListCodeProduct(Map<String,Product> groceryMarket);

}
