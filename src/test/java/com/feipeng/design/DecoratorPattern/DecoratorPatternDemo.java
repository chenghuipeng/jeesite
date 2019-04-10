package com.feipeng.design.DecoratorPattern;

public class DecoratorPatternDemo {

    /*************
     *
     * 装饰器模式允许用户向现有对象添加新功能而不改变其结构。
     *
     * 这种类型的设计模式属于结构模式，因为此模式充当现有类的包装器。
     * 此模式创建一个装饰器类，它包装原始类并提供附加功能，保持类方法签名完整。
     * 我们通过以下示例展示装饰器模式的使用，其中我们将用一些颜色装饰形状而不改变形状类。
     * @param args
     */

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }

}







