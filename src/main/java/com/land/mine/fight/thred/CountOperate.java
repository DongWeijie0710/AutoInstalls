package com.land.mine.fight.thred;

/**
 * @task:
 * @discrption:
 * @author: dongweijie
 * @date: 2018/6/19
 * @version: 1.0.0
 */
public class CountOperate extends Thread {
    public CountOperate(){
        System.out.println("CountOperate-begin");
        System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName());
        System.out.println("this.getName():"+this.getName());
        System.out.println("CountOperate-end");
    }

    @Override
    public void run(){
        System.out.println("run-begin");
        System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName());
        System.out.println("this.getName():"+this.getName());
        System.out.println("run-end");
    }


    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread();
        t1.setName("Yee");
        t1.start();

    }
}
