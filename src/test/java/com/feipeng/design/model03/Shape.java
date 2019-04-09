package com.feipeng.design.model03;


/*********
 *
 * 原型模式指在创建重复对象的同时保持性能。
 * 这种类型的设计模式属于创建模式，因为此模式提供了创建对象的最佳方法之一。
 * 这个模式涉及实现一个原型接口，它只创建当前对象的克隆。有时直接创建对象时使用这种模式是昂贵的。
 * 例如，在昂贵的数据库操作之后创建对象。因此我们可以缓存对象，在下一个请求时返回其克隆，
 * 并在需要时更新数据库，从而减少数据库调用。
 *
 */

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}