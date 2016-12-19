package com.market;

import java.math.BigDecimal;

/**
 * Created by joschinc on 12/5/16.
 */
public final class PromotionImpl implements Promotion {

    private final int numberItem;
    private final BigDecimal price;

    public PromotionImpl(int numberItem, BigDecimal price) {
        this.numberItem = numberItem;
        this.price = price;
    }

    public int getNumberItem() {
        return this.numberItem;
    }

    public BigDecimal getPrice() {
        return this.price;
    }


    @Override
    public String toString() {
        return "Promotion{" +
                "numberItem=" + numberItem +
                ", price=" + price +
                '}';
    }
}
