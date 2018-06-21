package com.land.mine.fight.thred;

/**
 * @task: 测试停止线程方法
 * @discrption: interrupted及isInterrupted
 * @author: dongweijie
 * @date: 2018/6/20
 * @version: 1.0.0
 */
public class InterruptThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500; i++) {
            System.out.println("i=" + (i + 1));
        }
    }

    public static void main(String[] args) {
        try {
            InterruptThread thread = new InterruptThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
//            Thread.currentThread().interrupt();
            //interrupted清除中断状态
//            System.out.println("是否停止1？=" + thread.interrupted());
//            System.out.println("是否停止2？=" + thread.interrupted());
            System.out.println("是否停止1？=" + thread.isInterrupted());
            System.out.println("是否停止2？=" + thread.isInterrupted());
        } catch (InterruptedException e) {

        }

    }

}
