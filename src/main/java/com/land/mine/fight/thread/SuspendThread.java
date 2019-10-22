package com.land.mine.fight.thread;

/**
 * @task: 测试暂停和恢复线程
 * @discrption:
 * @author: dongweijie
 * @date: 2018/6/22
 * @version: 1.0.0
 */
public class SuspendThread extends Thread {

    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
            //运行到println方法内部停止，同步锁未被释放，所以不打印main end了
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        try {
            //测试suspend和resume
//            SuspendThread thread = new SuspendThread();
//            thread.start();
//            Thread.sleep(1000);
//            thread.suspend();
//            System.out.println("A="+System.currentTimeMillis()+" i="+thread.getI());
//            Thread.sleep(5000);
//            System.out.println("A="+System.currentTimeMillis()+" i="+thread.getI());
//
//            thread.resume();
//            Thread.sleep(5000);
//            thread.suspend();
//            System.out.println("B="+System.currentTimeMillis()+" i="+thread.getI());

            //测试suspend和resume的独占情况
            SuspendThread suspendThread = new SuspendThread();
            suspendThread.start();
            Thread.sleep(1000);
            suspendThread.suspend();
            System.out.println("main end");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
