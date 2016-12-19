package com.market;

import java.util.*;

/**
 * Created by joschinc on 12/14/16.
 */
public class GroceryMarketImpl implements GroceryMarket {
    public ArrayList<String> getListCodeProduct(Map<String, Product> groceryMarket) {
        ArrayList<String> codeProduct = new ArrayList<String>();
        Set<String> keys = groceryMarket.keySet();
        for(String value: keys){
            codeProduct.add(value);
        }
        return codeProduct;
    }
}
