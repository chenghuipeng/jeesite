package com.feipeng.design.model17;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: 飞蓬
 * @Description:
 *
 *观察者模式在对象之间存在一对多关系时使用，例如，如果一个对象被修改，它的依赖对象将被自动通知。 观察者模式属于行为模式类别。
 *
 * @Date:Create：in 2019/4/10 下午7:19
 */
public class Subject {




    private int state;
    private List<Observer> observers = Lists.newArrayList();


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }








}










