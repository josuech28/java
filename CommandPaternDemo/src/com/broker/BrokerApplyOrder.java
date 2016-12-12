package com.broker;

import com.order.Order;

/**
 * Created by joschinc on 12/12/16.
 */
public class BrokerApplyOrder implements Order {
    private  final Broker broker;

    public BrokerApplyOrder(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void execute() {
        broker.placeOrders();
    }
}
