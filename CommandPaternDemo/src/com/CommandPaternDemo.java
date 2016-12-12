package com;

import com.broker.Broker;
import com.broker.BrokerApplyOrder;
import com.broker.BrokerTakeOrder;
import com.stock.BuyStock;
import com.stock.SellStock;
import com.stock.Stock;

import java.math.BigDecimal;

/**
 * Created by joschinc on 12/12/16.
 */
public class CommandPaternDemo {
    public static void main(String[] args) {
        String name = "GOOGL";
        BigDecimal quantity = new BigDecimal("70.00");

        Stock stock = new Stock(name,quantity);
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        BrokerTakeOrder takeOrderBuy = new BrokerTakeOrder(broker,buyStock);
        BrokerTakeOrder takeOrderSell = new BrokerTakeOrder(broker,sellStock);
        BrokerApplyOrder applyOrder = new BrokerApplyOrder(broker);
        
        takeOrderBuy.execute();
        takeOrderSell.execute();
        applyOrder.execute();

    }
}
