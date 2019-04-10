package com.feipeng.design.MediatorPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 *
 * 中介者模式(Mediator Pattern）用于减少多个对象或类之间的通信复杂性。
 * 此模式提供了一个中介类，它通常处理不同类之间的所有通信，
 * 并支持通过松散耦合来维护代码。中介者模式属于行为模式类别。
 *
 * @Date:Create：in 2019/4/10 下午1:26
 */

public class MediatorPatternDemo {


    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");



    }






}
