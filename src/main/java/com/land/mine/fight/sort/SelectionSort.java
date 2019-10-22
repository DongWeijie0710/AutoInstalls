package com.land.mine.fight.sort;

/**
 * @task: 选择排序
 * @discrption: 不稳定
 * @author: dongweijie
 * @date: 2019/10/21
 * @version: 1.0.0
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {34, 5, 32, 54, 23, 15};
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.print(array);
    }
}
