package com.land.mine.fight.thread;

/**
 * @task: 测试线程优先级
 * @discrption:
 * @author: dongweijie
 * @date: 2018/6/22
 * @version: 1.0.0
 */
public class PriorityThread extends Thread {

    private int count = 0;

    private int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }

    public static void main(String[] args) {
        try {

            PriorityThread thread1 = new PriorityThread();
            thread1.setPriority(Thread.NORM_PRIORITY - 3);
            thread1.start();
            PriorityThread thread2 = new PriorityThread();
            thread2.setPriority(Thread.NORM_PRIORITY + 3);
            thread2.start();
            Thread.sleep(20000);
            thread1.stop();
            thread2.stop();
            System.out.println("thread1=" + thread1.getCount());
            System.out.println("thread2=" + thread2.getCount());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
