package com;

import com.market.Product;
import com.market.ProductImpl;
import com.market.Promotion;
import com.market.PromotionImpl;
import com.sale.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joschinc on 12/5/16.
 */
public class App {
    public static void main(String[] args) {
        Map<String , Product> groceryMarket = new HashMap<String, Product>();
        Promotion promotionP0 = new PromotionImpl(0, new BigDecimal("0"));
        Promotion promotionP1 = new PromotionImpl(3, new BigDecimal("3"));
        Promotion promotionP2 = new PromotionImpl(6, new BigDecimal("5"));


        ProductImpl p1 = new ProductImpl("A-1", new BigDecimal("1.25"),promotionP1);
        ProductImpl p2 = new ProductImpl("3-Q", new BigDecimal("4.25"),promotionP0);
        ProductImpl p3 = new ProductImpl("45k11", new BigDecimal("1"),promotionP2);
        ProductImpl p4 = new ProductImpl("X1", new BigDecimal("0.75"),promotionP0);

        groceryMarket.put(p1.getCode(),p1);
        groceryMarket.put(p2.getCode(),p2);
        groceryMarket.put(p3.getCode(),p3);
        groceryMarket.put(p4.getCode(),p4);

        PointOfSale terminal = new PointOfSaleImpl();
        terminal.setPricing(groceryMarket);
        terminal.scan("A-1");
        terminal.scan("3-Q");
        terminal.scan("45k11");
        terminal.scan("X1");
        terminal.scan("A-1");
        terminal.scan("3-Q");
        terminal.scan("A-1");
        BigDecimal result = terminal.calculateTotal();
        System.out.println("Total: " + result);

    }
}
