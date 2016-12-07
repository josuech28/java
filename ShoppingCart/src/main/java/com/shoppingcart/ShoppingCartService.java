package com.shoppingcart;

import com.market.Product;

import java.math.BigDecimal;

/**
 * Created by joschinc on 12/5/16.
 */
public interface ShoppingCartService {
    ShoppingCartDetail getShoppingCartDetailWithAmount(BigDecimal quantity,
             Product product);
    BigDecimal calculateAmount(BigDecimal quantity, Product product);
}
