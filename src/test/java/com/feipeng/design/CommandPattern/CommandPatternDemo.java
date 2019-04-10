package com.feipeng.design.CommandPattern;

import org.apache.xmlbeans.impl.schema.StscChecker;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 上午11:15
 */

/***
 *
 * 命令模式是数据驱动设计模式，属于行为模式类别。
 * 请求作为命令包装在一个对象下，并传递给调用器对象。
 * 调用者对象查找可以处理此命令的适当对象，并将命令传递到执行命令的相应对象。
 *
 */
public class CommandPatternDemo {

    //利用多态实现
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);
        Broker broker  = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();


    }





}
