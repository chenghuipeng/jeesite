package com.feipeng.design.CommandPattern;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: 飞蓬
 * @Description: 创建命令调用程序类。
 * @Date:Create：in 2019/4/10 上午11:27
 */

public class Broker {

    private List<Order> orders = Lists.newArrayList();
    public void takeOrder(Order order){
        orders.add(order);
    }

    public void placeOrders(){
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }


}









