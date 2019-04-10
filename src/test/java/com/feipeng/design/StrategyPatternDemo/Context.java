package com.feipeng.design.StrategyPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午8:05
 */
public class Context {


    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    public int executeStrategy(int n1,int n2){
        return strategy.doOperation(n1, n2);
    }







}
