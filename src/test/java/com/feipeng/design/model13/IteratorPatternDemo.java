package com.feipeng.design.model13;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: 飞蓬
 * @Description:
 *
    迭代器模式是Java和.Net编程环境中非常常用的设计模式。
    此模式用于以顺序方式访问集合对象的元素，而不需要知道其底层表示。
    迭代器模式属于行为模式类别。
 *
 * @Date:Create：in 2019/4/10 上午11:41
 */
public class IteratorPatternDemo {


    public static void main(String[] args) {

        List  list = Lists.newArrayList();
        list.iterator();

        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator();iterator.hasNext();) {
            String name = (String)iterator.Next();
            System.out.println("Name: "+iterator.Next());
        }

    }


}





