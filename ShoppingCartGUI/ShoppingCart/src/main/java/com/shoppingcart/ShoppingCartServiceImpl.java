package com.shoppingcart;

import com.market.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by joschinc on 12/5/16.
 */
public class ShoppingCartServiceImpl implements ShoppingCartService {

    public ShoppingCartDetail getShoppingCartDetailWithAmount(BigDecimal quantity, Product product) {
        BigDecimal amount = calculateAmount(quantity,product);
        return new ShoppingCartDetailImpl(quantity, product, amount);
    }


    public BigDecimal calculateAmount(BigDecimal quantity, Product product) throws ArithmeticException{
        BigDecimal amount =  BigDecimal.ZERO;
        if(quantity.compareTo(BigDecimal.ONE) == -1){
            throw new ArithmeticException("Invalid quantity, need to be positive value");
        } else {
            if (!productHasPromotion(product) || quantityLessItemPromotion(quantity, product)) {
                amount = getAmountWithOutPromotion(quantity, product);
            } else {
                amount = getAmountWithPromotion(quantity, product);
            }
            return amount;
        }
    }

    private BigDecimal getAmountWithOutPromotion(BigDecimal quantity, Product product) {
        return getSimpleAmount(product.getPrice(), quantity);
    }

    private BigDecimal getAmountWithPromotion(BigDecimal quantity, Product product){
        return getPriceRestItem(quantity,product).add(getPricePromotionItem(quantity,product));
    }
    private BigDecimal getPriceRestItem(BigDecimal quantity,Product product){
        return getNumberRestItem(quantity,getProductPromotionItemNumber(product)).multiply(product.getPrice());
    }
    private BigDecimal getPricePromotionItem(BigDecimal quantity,Product product){
        return getNumberPromotion(quantity,getProductPromotionItemNumber(product)).multiply(getProductPromotionPrice(product));
    }
    private BigDecimal getNumberPromotion(BigDecimal quantity, BigDecimal numberItem) throws ArithmeticException {
        if(numberItem.compareTo(BigDecimal.ZERO) == 0){
            throw new ArithmeticException("Division by zero is not defined");
        } else {
            BigDecimal numberPromotion = quantity.divide(numberItem, 10, RoundingMode.HALF_UP);
            long value = numberPromotion.longValue();
            return new BigDecimal(value);
        }
    }
    private BigDecimal getNumberRestItem(BigDecimal quantity, BigDecimal numberItem){
        if(numberItem.compareTo(BigDecimal.ZERO) == 1){
            return quantity.remainder(numberItem);
        }
        return quantity;

    }

    private boolean productHasPromotion(Product product){
        return product.getPromotion().getNumberItem() > 0;
    }
    private BigDecimal getSimpleAmount(BigDecimal quantity, BigDecimal unitPrice ){
        return quantity.multiply(unitPrice);
    }
    private BigDecimal getProductPromotionPrice(Product product){
        return product.getPromotion().getPrice();
    }
    private BigDecimal getProductPromotionItemNumber(Product product){
        return new BigDecimal(product.getPromotion().getNumberItem());
    }
    private boolean quantityLessItemPromotion(BigDecimal quantity, Product product){
        return quantity.compareTo(getProductPromotionItemNumber(product)) == -1;
    }
}
