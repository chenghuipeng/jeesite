package com.feipeng.design.FacadePattern;

public class FacadePatternDemo {

    /*******
     * 门面模式(或外观模式)隐藏系统的复杂性，并为客户端提供一个客户端可以访问系统的接口。
     * 这种类型的设计模式属于结构模式，因为此模式为现有系统添加了一个接口以隐藏其复杂性。
     * 门面模式涉及一个类，它提供客户端所需的简化方法和委托调用现有系统类的方法。
     *
     * @param args
     */

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
