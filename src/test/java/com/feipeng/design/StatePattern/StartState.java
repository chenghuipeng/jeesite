package com.feipeng.design.StatePattern;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午8:38
 */
public class StartState implements State {





    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }


    public String toString(){
        return "Start State";
    }






}
