package com.feipeng.design.FlyweightPattern;
/*********
 *
 *
 *
 *享元模式(Flyweight Pattern)主要用于减少创建的对象数量，并减少内存占用并提高性能。 这种类型的设计模式属于结构模式，因为该模式提供了减少对象计数的方法，从而改善应用的对象结构。
 享元模式(Flyweight Pattern)尝试通过存储已经存在的类似对象以重用，并在找不到匹配的对象时创建新对象。我们将通过绘制不同位置的20个圆圈来演示这种模式，但是这里只创建5个对象。只有5种颜色可用，因此color属性用于检查已经存在的Circle对象。原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/design_pattern/flyweight_pattern.html
 *
 *
 *
 *
 */


public class FlyweightPatternDemo {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();


        }
    }


    private static  String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }













}








