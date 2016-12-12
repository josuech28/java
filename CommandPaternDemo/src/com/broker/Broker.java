package com.broker;

import com.order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joschinc on 12/12/16.
 */
public class Broker {
    private List<Order> orderList;

    public Broker(){
        this.orderList = new ArrayList<Order>();
    }

    public boolean takeOrder(Order order){
        return orderList.add(order);
    }

    public void placeOrders(){
        for(Order order: orderList){
            order.execute();
        }
        orderList.clear();
    }
}
