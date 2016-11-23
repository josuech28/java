package com.stock;

import java.math.BigDecimal;

/**
 * Created by joschinc on 11/23/16.
 */
public interface StockService {
    public BigDecimal getPrice(Stock stock);
}
