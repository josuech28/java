package com.sale;

import com.market.Product;
import com.shoppingcart.ShoppingCartDetail;
import com.shoppingcart.ShoppingCartService;
import com.shoppingcart.ShoppingCartServiceImpl;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by joschinc on 12/5/16.
 */

public class PointOfSaleImpl implements PointOfSale {
    private final Map<String, ShoppingCartDetail> detailList;
    private Map<String, Product> items;
    private final ShoppingCartService service;

    public PointOfSaleImpl(){
        this.detailList = new ConcurrentHashMap<String, ShoppingCartDetail>();
        this.items = new ConcurrentHashMap<String, Product>();
        this.service = new ShoppingCartServiceImpl();
    }

    public void scan(String codeProduct)  {
        try{
            if(detailList.containsKey(codeProduct)){
                ShoppingCartDetail shoppingCartDetail = detailList.get(codeProduct);
                BigDecimal newQuantity = shoppingCartDetail.getQuantity().add(new BigDecimal("1"));

                detailList.put(codeProduct,service.getShoppingCartDetailWithAmount(newQuantity,shoppingCartDetail.getProduct()));
            }
            /* New Detail Line*/
            else {
                Product addProduct =  getProduct(codeProduct);
                if(addProduct != null) {
                    ShoppingCartDetail newDetail =  service.getShoppingCartDetailWithAmount(new BigDecimal("1"), addProduct);
                    detailList.put(addProduct.getCode(),newDetail);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    private Product getProduct(String codeProduct) {
        try{
            if(items.containsKey(codeProduct)) {
                return items.get(codeProduct);
            } else {
                System.out.println("Product: " + codeProduct +
                        " is not in the grocery market...");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public void setPricing(Map<String,Product> items) {
        this.setItems(items);
    }

    public BigDecimal calculateTotal() {
        BigDecimal result = BigDecimal.ZERO;
        Collection<ShoppingCartDetail> values = detailList.values();
        for(ShoppingCartDetail shoppingCartDetail: values){
            result = result.add(shoppingCartDetail.getAmount());
        }
        return result;
    }

    public void setItems(Map<String, Product> items) {
        this.items = items;
    }

    public Map<String, ShoppingCartDetail> getDetailList(){
        return this.detailList;
    }
    @Override
    public String toString() {
        return "PointOfSaleImpl{" +
                "detailList=" + detailList.toString() +
                '}';
    }

}
