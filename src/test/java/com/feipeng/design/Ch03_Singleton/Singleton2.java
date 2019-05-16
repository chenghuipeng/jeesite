package com.feipeng.design.Ch03_Singleton;

/**
 *  @author: feipeng@dianjia.io
 *  @Date: 2019/4/28 下午5:40
 *  @Description:
 *
 *顾名思义，饿汉法就是在第一次引用该类的时候就创建对象实例，而不管实际是否需要创建。代码如下：

 *
 */

public class Singleton2 {

    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getSingleton() {
        return singleton2;
    }

}
