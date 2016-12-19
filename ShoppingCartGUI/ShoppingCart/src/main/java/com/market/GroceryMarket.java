package com.market;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by joschinc on 12/14/16.
 */
public interface GroceryMarket {
    ArrayList<String> getListCodeProduct(Map<String,Product> groceryMarket);
}
