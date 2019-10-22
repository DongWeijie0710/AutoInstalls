package com.land.mine.fight.thread;

/**
 * @task: 测试守护线程
 * @discrption:
 * @author: dongweijie
 * @date: 2018/6/22
 * @version: 1.0.0
 */
public class DaemonThread extends Thread{

    private int i =0;
    @Override
    public void run(){
        try {

            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {

            DaemonThread thread = new DaemonThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            //守护线程本身作为线程在跑，当线程sleep时也就是没有线程在跑，此时守护线程推出，即不再打印
            System.out.println("我离开thread对象也不再打印了");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
