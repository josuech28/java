package com.sale;

import com.market.Product;
import com.market.ProductImpl;
import com.shoppingcart.ShoppingCartDetail;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by joschinc on 12/5/16.
 */
public interface PointOfSale {
    void scan(String codeProduct);
    void setPricing(Map<String,Product> items);
    BigDecimal calculateTotal();
    Map<String, ShoppingCartDetail> getDetailList();
}
