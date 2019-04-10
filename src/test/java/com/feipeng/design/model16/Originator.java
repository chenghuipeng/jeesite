package com.feipeng.design.model16;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午6:58
 */
public class Originator {


    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }




}
