package com.market;

import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by joschinc on 12/5/16.
 */
public final class ProductImpl implements Product {

    private final String code;
    private final BigDecimal price;
    private final Promotion promotion;

    public ProductImpl(String code, BigDecimal price, Promotion promotion) {
        this.code = code;
        this.price = price;
        this.promotion = promotion;
    }

    public String getCode() {
        return code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public ArrayList<String> getListCodeProduct(Map<String,Product> groceryMarket){
        ArrayList<String> codeProduct = new ArrayList<String>();
        Set<String> keys = groceryMarket.keySet();
        for(String value: keys){
            codeProduct.add(value);
        }
        return codeProduct;
    }

    @Override
    public String toString() {
        return "ProductImpl{" +
                "code='" + code + '\'' +
                ", price=" + price + '\'' +
                ", Promotion= " + promotion.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductImpl product = (ProductImpl) o;

        if (!getCode().equals(product.getCode())) return false;
        if (!getPrice().equals(product.getPrice())) return false;
        return getPromotion() != null ? getPromotion().equals(product.getPromotion()) : product.getPromotion() == null;

    }

    @Override
    public int hashCode() {
        int result = getCode().hashCode();
        result = 31 * result + getPrice().hashCode();
        result = 31 * result + (getPromotion() != null ? getPromotion().hashCode() : 0);
        return result;
    }
}
