package com.stock;

import java.math.BigDecimal;

/**
 * Created by joschinc on 12/12/16.
 */
public class Stock {
    private final String name;
    private final BigDecimal quantity;

    public Stock(String name, BigDecimal quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void sell(){
        System.out.println("STOCK " + this.getName() + " QUANTITY " + this.getQuantity() + " SOLD");
    }
    public void buy(){
        System.out.println("STOCK " + this.getName() + " QUANTITY " + this.getQuantity() + " BOUGHT");
    }
}
