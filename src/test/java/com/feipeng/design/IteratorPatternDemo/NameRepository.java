package com.feipeng.design.IteratorPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 上午11:49
 */
public class NameRepository implements Container{

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


    private class NameIterator implements Iterator{
        int index ;//default 0
        @Override
        public boolean hasNext() {
            if(index<names.length){
                return  true;
            }
            return false;
        }
        @Override
        public Object Next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }







}
