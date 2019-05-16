package com.feipeng.currentThread;

/********
 * TODO 类实现描述 
 * @Company 杭州木瓜科技有限公司
 * @className: AsyncWorker.java
 * @author  feipeng@dianjia.io
 * @date 2019年5月16日 下午5:43:24
 */

public abstract class AsyncWorker2 {
    private Object  value;           //the running result
    private boolean finished = false;

    private static class ThreadVar {
        private Thread thread;

        ThreadVar(Thread t) {
            thread = t;
        }

        synchronized Thread get() {
            return thread;
        }

        synchronized void clear() {
            thread = null;
        }
    }

    private ThreadVar threadVar;

    /**
     * 返回当前线程运行结果。
     */
    protected synchronized Object getValue() {
        return value;
    }

    /**
     * 设置当前线程运行结果
     */
    private synchronized void setValue(Object x) {
        value = x;
    }

    /**
     * 调用都创建计算逻辑，将运算结果返回
     */
    public abstract Object construct();

    public void finished() {
        finished = true;
    }

    public boolean isFinished() {
        return finished;
    }

    public void interrupt() {
        Thread t = threadVar.get();
        if (t != null) {
            t.interrupt();
        }
        threadVar.clear();
    }

    public void stop() {
        Thread t = threadVar.get();
        if (t != null) {
            t.stop();
        }
        threadVar.clear();
    }

    /**
     * 返回 construct方法运行结果。
     */
    public Object get() {
        while (true) {
            Thread t = threadVar.get();
            if (t == null) {
                return getValue();
            }
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
    }
}