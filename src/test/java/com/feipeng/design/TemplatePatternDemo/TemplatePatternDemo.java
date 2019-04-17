package com.feipeng.design.TemplatePatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 *
 * 在模板模式中，抽象类公开了定义的方法/模板来执行它的方法。
 * 它的子类可以根据需要重写方法实现，
 * 但调用的方式与抽象类定义的方式相同。
 * 此模式属于行为模式类别。
 * @Date:Create：in 2019/4/10 下午8:45
 *
 */



public class TemplatePatternDemo {

    public static void main(String[] args) {


        Game game = new Cricket();

        game.play();
        System.out.println();
        game = new Football();
        game.play();




    }








}
