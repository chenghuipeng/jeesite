package com.feipeng.design.CommandPattern;

import org.aspectj.weaver.ast.Or;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 上午11:17
 */
public class SellStock implements Order {


    private  Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }


}
