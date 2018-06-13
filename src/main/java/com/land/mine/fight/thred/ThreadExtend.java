package com.land.mine.fight.thred;

/**
 * @task:
 * @discrption:
 * @author: dongweijie
 * @date: 2018/6/12
 * @version: 1.0.0
 */
public class ThreadExtend extends Thread {

    private String name;

    ThreadExtend(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        ThreadExtend mTh1 = new ThreadExtend("A");
        ThreadExtend mTh2 = new ThreadExtend("B");
        mTh1.start();
        mTh2.start();

    }
}
