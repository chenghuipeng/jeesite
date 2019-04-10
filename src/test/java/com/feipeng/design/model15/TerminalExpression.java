package com.feipeng.design.model15;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午5:45
 */

public class TerminalExpression implements Expression{


    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return  true;
        }
        return false;
    }




}
