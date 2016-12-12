package com.stock;

import com.order.Order;

/**
 * Created by joschinc on 12/12/16.
 */
public class SellStock implements Order{
    private final Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
