package com.feipeng.design.Ch03_Singleton;

/**
 *  @author: feipeng@dianjia.io
 *  @Date: 2019/4/28 下午5:40
 *  @Description:
 *  懒汉模式
 *
 *  考虑线程安全的写法
    这种写法考虑了线程安全，
    将对singleton的null判断以及new的部分使用synchronized进行加锁。
    同时，对singleton对象使用volatile关键字进行限制，保证其对所有线程的可见性，
    并且禁止对其进行指令重排序优化。如此即可从语义上保证这种单例模式写法是线程安全的。
    注意，这里说的是语义上，实际使用中还是存在小坑的，会在后文写到。
 *
 *
 */

public class Singleton3 {

    private static volatile Singleton3 singleton = null;
    private  Singleton3 (){}

    public static Singleton3 getSingleton() {
        synchronized (Singleton3.class){
            if (singleton == null) {
                singleton = new Singleton3();
            }
        }
        return singleton;
    }
}
