package com.feipeng.design.StrategyPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午8:06
 */
public class OperationSubstract implements Strategy {


    @Override
    public int doOperation(int num1, int num2) {
        if (num1<num2){
            return num2-num1;
        }
        return  num1-num2;
    }



}
