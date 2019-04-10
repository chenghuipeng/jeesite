package com.feipeng.design.model16;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午6:58
 */
public class CareTaker {


    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }


}












