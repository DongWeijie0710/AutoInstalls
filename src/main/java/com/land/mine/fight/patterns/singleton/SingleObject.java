package com.land.mine.fight.patterns.singleton;

/**
 * @task: 饿汉式 建议使用
 * @discrption:
 * @author: dongweijie
 * @date: 2019/10/12
 * @version: 1.0.0
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    //使构造函数不可见
    private SingleObject() {

    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello 易烊千玺!");
    }
}
