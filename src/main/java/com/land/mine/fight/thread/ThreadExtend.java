package com.land.mine.fight.thread;

/**
 * @task:
 * @discrption:
 * @author: dongweijie
 * @date: 2018/6/12
 * @version: 1.0.0
 */
public class ThreadExtend extends Thread {

    private int count = 5;

    private String name;

    public ThreadExtend(String name) {
        super();
        this.setName(name);
    }

    public void run() {
        super.run();
//        while (count > 0) {
            count--;
            try {
                sleep(1000);
            }catch (Exception e){

            }
            System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
//        }


    }


    public static void main(String[] args) {
        ThreadExtend mTh1 = new ThreadExtend("A");
        ThreadExtend mTh2 = new ThreadExtend("B");
        ThreadExtend mTh3 = new ThreadExtend("C");
        mTh1.start();
        mTh2.start();
        mTh3.start();

    }
}
