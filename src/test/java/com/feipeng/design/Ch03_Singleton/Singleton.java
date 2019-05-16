package com.feipeng.design.Ch03_Singleton;

/**
 * @Author: 飞蓬
 * @Description:
 *
 *     懒汉模式的方法
 *
 *    单线程模式
 *    这种写法是最简单的，由私有构造器和一个公有静态工厂方法构成，在工厂方法中对singleton进行null判断，
 *    如果是null就new一个出来，最后返回singleton对象。这种方法可以实现延时加载，
 *    但是有一个致命弱点：线程不安全。如果有两条线程同时调用getSingleton()方法，就有很大可能导致重复创建对象。
 *
 * @Date:Create：in 2019/4/28 下午5:29
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }
}
