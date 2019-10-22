package com.land.mine.fight.thread;

/**
 * @task: 多个对象多个锁
 * @discrption:
 * @author: dongweijie
 * @date: 2018/6/22
 * @version: 1.0.0
 */
public class HasSelfPrivateNumThread extends Thread {

    private int num = 0;

    synchronized public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set is over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("a set is over");
            }

            System.out.println(username+"num="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
