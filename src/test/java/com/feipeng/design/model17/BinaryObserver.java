package com.feipeng.design.model17;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午7:34
 */

public class BinaryObserver extends Observer{


    public BinaryObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }


}
