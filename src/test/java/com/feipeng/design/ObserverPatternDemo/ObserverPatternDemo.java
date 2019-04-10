package com.feipeng.design.ObserverPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 *
 *观察者模式在对象之间存在一对多关系时使用，例如，如果一个对象被修改，它的依赖对象将被自动通知。 观察者模式属于行为模式类别。
 *
 * @Date:Create：in 2019/4/10 下午7:19
 */
public class ObserverPatternDemo {


    public static void main(String[] args) {


        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println();
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

    }


}






