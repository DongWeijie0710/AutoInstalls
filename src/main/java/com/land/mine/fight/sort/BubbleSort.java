package com.land.mine.fight.sort;

/**
 * @task: 冒泡排序
 * @discrption: 稳定
 * @author: dongweijie
 * @date: 2019/10/21
 * @version: 1.0.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {323, 1, 3243, 32, 5, 342, 256};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(array);
    }

}
