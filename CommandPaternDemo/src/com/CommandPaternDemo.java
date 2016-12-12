package com;

import com.broker.Broker;
import com.broker.BrokerApplyOrder;
import com.broker.BrokerTakeOrder;
import com.execute.Execute;
import com.order.Order;
import com.stock.BuyStock;
import com.stock.SellStock;
import com.stock.Stock;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by joschinc on 12/12/16.
 */
public class CommandPaternDemo {
    public static void main(String[] args) {
        String name = "GOOGL";
        BigDecimal quantity = new BigDecimal("70.00");

        Broker broker = new Broker();
        Stock stock = new Stock(name,quantity);

        Order buyStock = new BuyStock(stock);
        Order sellStock = new SellStock(stock);

        Order takeOrderBuy = new BrokerTakeOrder(broker,buyStock);
        Order takeOrderSell = new BrokerTakeOrder(broker,sellStock);
        Order applyOrder = new BrokerApplyOrder(broker);

        List<Order> orderList = new ArrayList<Order>();

        orderList.add(takeOrderBuy);
        orderList.add(takeOrderSell);
        orderList.add(applyOrder);

        Execute execute = new Execute(orderList);
        execute.execute();
    }
}
