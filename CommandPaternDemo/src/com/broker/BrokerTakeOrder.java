package com.broker;

import com.order.Order;

/**
 * Created by joschinc on 12/12/16.
 */
public class BrokerTakeOrder implements Order {
    private final Broker broker;
    private final Order order;

    public BrokerTakeOrder(Broker broker, Order order){
        this.broker = broker;
        this.order = order;
    }

    @Override
    public void execute() {
        broker.takeOrder(order);
    }
}
