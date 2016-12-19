package com.shoppingcart;

import com.market.Product;

import java.math.BigDecimal;

/**
 * Created by joschinc on 12/5/16.
 */
public interface ShoppingCartDetail {
    BigDecimal getQuantity();
    Product getProduct();
    BigDecimal getAmount();
}
