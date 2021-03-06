package com.feipeng.design.BridgePattern;

import org.junit.Test;




/******
 *
 桥接模式将定义与其实现分离。 它是一种结构模式。桥接（Bridge）模式涉及充当桥接的接口。
 桥接使得具体类与接口实现者类无关。这两种类型的类可以改变但不会影响对方。
 当需要将抽象与其实现去耦合时使用桥接解耦（分离），使得两者可以独立地变化。
 这种类型的设计模式属于结构模式，因为此模式通过在它们之间提供桥接结构来将实现类和抽象类解耦（分离）。

 这种模式涉及一个接口，作为一个桥梁，使得具体类的功能独立于接口实现类。
 两种类型的类可以在结构上改变而不彼此影响。

 通过以下示例展示了桥接（Bridge）模式的使用，实现使用相同的抽象类方法但不同的网桥实现器类来绘制不同颜色的圆形。

 假设有一个DrawAPI接口作为一个桥梁实现者，具体类RedCircle，GreenCircle实现这个DrawAPI接口。
 Shape是一个抽象类，将使用DrawAPI的对象。 BridgePatternDemo这是一个演示类，将使用Shape类来绘制不同彩色的圆形。
 *
 *
 */



public class BridgePatternDemo {


    @Test
    public void Test1() {

        Shape c1 = new Circle(new GreenCircle(), 10, 10, 100);
        Shape c2 = new Circle(new RedCircle(), 10, 10, 100);
        c1.draw();
        c2.draw();

    }
}
