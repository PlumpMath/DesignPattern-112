package com.blue.dp15.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order: orderList){
            order.execute();
        }
        orderList.clear();
    }
}
