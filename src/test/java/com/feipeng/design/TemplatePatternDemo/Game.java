package com.feipeng.design.Model21;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午8:46
 */
public abstract class Game {


    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();


    //template method...
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }


}
