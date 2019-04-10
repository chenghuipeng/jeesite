package com.feipeng.design.ObserverPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午7:34
 */


public class HexObserver extends Observer {


    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }




}
