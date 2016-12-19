package com.shoppingcart;

import com.market.Product;

import java.math.BigDecimal;

/**
 * Created by joschinc on 12/5/16.
 */
public final class ShoppingCartDetailImpl implements ShoppingCartDetail {
    private final BigDecimal quantity;
    private final BigDecimal amount;
    private final Product product;


    public ShoppingCartDetailImpl(BigDecimal quantity, Product product, BigDecimal amount) {
        this.quantity = quantity;
        this.product = product;
        this.amount = amount;
    }

    public BigDecimal getQuantity() {
        return this.quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        return "ShoppingCartDetailImpl{" +
                "quantity=" + quantity +
                ", amount=" + amount +
                ", product=" + product +
                '}';
    }
}
