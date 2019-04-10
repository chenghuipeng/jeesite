package com.feipeng.design.MementoPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 *
 * 备忘录模式(Memento Pattern)用来恢复一个对象的状态到以前的状态。 备忘录模式下属于行为模式的类别。

 *
 * @Date:Create：in 2019/4/10 下午6:58
 */
public class MementoPatternDemo {


    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }




}
