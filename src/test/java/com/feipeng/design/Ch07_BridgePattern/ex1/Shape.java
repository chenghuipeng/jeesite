package com.feipeng.design.Ch07_BridgePattern.ex1;


/*******
 * 维度2
 *
 * 关键业务
 *
 */
public abstract class Shape {


    //关联
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI){
        this.drawAPI=drawAPI;
    }
    public abstract void draw();



}
