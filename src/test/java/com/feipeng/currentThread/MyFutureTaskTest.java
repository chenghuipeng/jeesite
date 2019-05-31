package com.feipeng.currentThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import org.junit.Test;

public class MyFutureTaskTest {

    @Test
    public void name() {
        //设置线程数量。
        int k = Runtime.getRuntime().availableProcessors();
        System.out.println(k);

    }

    @Test
    public void test2() {

        ExecutorService executorService = Executors.newCachedThreadPool();
        FutureTask<String> futureTask = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(3 * 1000);
                    //异步 返回值
                    return "Hello Welcome!";
                } catch (Exception e) {
                    throw new Exception("Callable terminated with Exception!"); // call方法可以抛出异常
                }
            }
        });
        Future future = executorService.submit(futureTask, "111111");
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        // executorService.execute(futureTask);
        long t = System.currentTimeMillis();
        try {
            String result = futureTask.get();
            //String result = futureTask.get(3000, TimeUnit.MILLISECONDS);
            System.err
                .println("result is " + result + ", time is " + (System.currentTimeMillis() - t));
        } catch (InterruptedException e) {
            e.printStackTrace();
            futureTask.cancel(true);
            System.err.println("Interrupte time is " + (System.currentTimeMillis() - t));
        } catch (ExecutionException e) {
            futureTask.cancel(true);
            System.err.println("Throw Exception time is " + (System.currentTimeMillis() - t));
        }
        //        catch (TimeoutException e) {
        //            futureTask.cancel(true);
        //            System.err.println("Timeout time is " + (System.currentTimeMillis() - t));
        //        } 
        //        
        finally {
            executorService.shutdown();
        }
    }

}
