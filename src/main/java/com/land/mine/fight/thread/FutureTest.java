package com.land.mine.fight.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @task:
 * @discrption:
 * @author: dongweijie
 * @date: 2019/10/21
 * @version: 1.0.0
 */
public class FutureTest {

    public static class Task implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println("易烊千玺aaa");
            return "易烊千玺ddd";
        }
    }

    public static void main(String[] args) throws Exception {
        List<Future<String>> futures = new ArrayList<Future<String>>();
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            futures.add(es.submit(new Task()));
        }
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
    }
}
