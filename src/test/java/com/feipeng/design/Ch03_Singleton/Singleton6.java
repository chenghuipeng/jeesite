package com.feipeng.design.Ch03_Singleton;

/**
 *  @author: feipeng@dianjia.io
 *  @Date: 2019/4/28 下午5:40
 *  @Description:
 *
 *  静态内部类法
 *  那么，有没有一种延时加载，并且能保证线程安全的简单写法呢？
 *  我们可以把Singleton实例放到一个静态内部类中，
 *  这样就避免了静态实例在Singleton类加载的时候就创建对象，
    并且由于静态内部类只会被加载一次，所以这种写法也是线程安全的：
 */

/********
 线程安全
 延迟加载
 序列化与反序列化安全
 */

public enum Singleton6 {
    INSTANCE;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
