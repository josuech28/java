package com.execute;

import com.broker.Broker;
import com.order.Order;
import com.stock.Stock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joschinc on 12/12/16.
 */
public class Execute implements Order {


    private List<Order> orderList;


    public Execute(List<Order> orderList){
        this.orderList = orderList;
    }

    public boolean addOrden(Order order){
        return orderList.add(order);
    }

    @Override
    public void execute() {
        for (Order order: orderList){
            order.execute();
        }
    }
}
