package com.feipeng.currentThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/********
 * 再如一个多个运行任务的例子：
 * TODO 类实现描述 
 * @Company 杭州木瓜科技有限公司
 * @className: MyAsyncExample.java
 * @author  feipeng@dianjia.io
 * @date 2019年5月16日 下午4:44:08
 */
public class MyAsyncExample implements Callable<String> {
    private int num;

    public MyAsyncExample(int aInt) {
        this.num = aInt;
    }

    @Override
    public String call() throws Exception {
        boolean resultOk = false;
        if (num == 0) {
            resultOk = true;
        } else if (num == 1) {
            while (true) { //infinite loop
                System.out.println("looping....");
                Thread.sleep(3000);
            }
        } else {
            //任务3 抛出异常
            throw new Exception("Callable terminated with Exception!");
        }
        if (resultOk) {
            return "Task done.";
        } else {
            return "Task failed";
        }
    }

    public static void main(String[] args) {
        //定义几个任务
        MyAsyncExample call1 = new MyAsyncExample(0);
        MyAsyncExample call2 = new MyAsyncExample(1);
        MyAsyncExample call3 = new MyAsyncExample(2);
        //初始任务执行工具。
        ExecutorService es = Executors.newFixedThreadPool(3);
        //执行任务，任务启动时返回了一个Future对象，
        Future<String> future1 = es.submit(call1);
        Future future2 = es.submit(call2);
        Future future3 = es.submit(call3);
        try {
            //任务1正常执行完毕，future1.get()会返回线程的值
            System.out.println(future1.get());
            //任务2进行一个死循环，调用future2.cancel(true)来中止此线程。
            Thread.sleep(000);
            System.out.println("Thread 2 terminated? :" + future2.cancel(true));
            //任务3抛出异常，调用future3.get()时会引起异常的抛出
            System.out.println(future3.get());
        } catch (ExecutionException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
